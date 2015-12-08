// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ShareCompatICS, ShareCompatJB

public class ShareCompat
{
    public static class IntentBuilder
    {

        private Activity mActivity;
        private ArrayList mBccAddresses;
        private ArrayList mCcAddresses;
        private CharSequence mChooserTitle;
        private Intent mIntent;
        private ArrayList mStreams;
        private ArrayList mToAddresses;

        private void combineArrayExtra(String s, ArrayList arraylist)
        {
            String as[] = mIntent.getStringArrayExtra(s);
            String as1[];
            int i;
            if (as != null)
            {
                i = as.length;
            } else
            {
                i = 0;
            }
            as1 = new String[arraylist.size() + i];
            arraylist.toArray(as1);
            if (as != null)
            {
                System.arraycopy(as, 0, as1, arraylist.size(), i);
            }
            mIntent.putExtra(s, as1);
        }

        private void combineArrayExtra(String s, String as[])
        {
            Intent intent = getIntent();
            String as1[] = intent.getStringArrayExtra(s);
            String as2[];
            int i;
            if (as1 != null)
            {
                i = as1.length;
            } else
            {
                i = 0;
            }
            as2 = new String[as.length + i];
            if (as1 != null)
            {
                System.arraycopy(as1, 0, as2, 0, i);
            }
            System.arraycopy(as, 0, as2, i, as.length);
            intent.putExtra(s, as2);
        }

        public static IntentBuilder from(Activity activity)
        {
            return new IntentBuilder(activity);
        }

        public IntentBuilder addEmailBcc(String s)
        {
            if (mBccAddresses == null)
            {
                mBccAddresses = new ArrayList();
            }
            mBccAddresses.add(s);
            return this;
        }

        public IntentBuilder addEmailBcc(String as[])
        {
            combineArrayExtra("android.intent.extra.BCC", as);
            return this;
        }

        public IntentBuilder addEmailCc(String s)
        {
            if (mCcAddresses == null)
            {
                mCcAddresses = new ArrayList();
            }
            mCcAddresses.add(s);
            return this;
        }

        public IntentBuilder addEmailCc(String as[])
        {
            combineArrayExtra("android.intent.extra.CC", as);
            return this;
        }

        public IntentBuilder addEmailTo(String s)
        {
            if (mToAddresses == null)
            {
                mToAddresses = new ArrayList();
            }
            mToAddresses.add(s);
            return this;
        }

        public IntentBuilder addEmailTo(String as[])
        {
            combineArrayExtra("android.intent.extra.EMAIL", as);
            return this;
        }

        public IntentBuilder addStream(Uri uri)
        {
            Uri uri1 = (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri1 == null)
            {
                return setStream(uri);
            }
            if (mStreams == null)
            {
                mStreams = new ArrayList();
            }
            if (uri1 != null)
            {
                mIntent.removeExtra("android.intent.extra.STREAM");
                mStreams.add(uri1);
            }
            mStreams.add(uri);
            return this;
        }

        public Intent createChooserIntent()
        {
            return Intent.createChooser(getIntent(), mChooserTitle);
        }

        Activity getActivity()
        {
            return mActivity;
        }

        public Intent getIntent()
        {
            boolean flag = true;
            if (mToAddresses != null)
            {
                combineArrayExtra("android.intent.extra.EMAIL", mToAddresses);
                mToAddresses = null;
            }
            if (mCcAddresses != null)
            {
                combineArrayExtra("android.intent.extra.CC", mCcAddresses);
                mCcAddresses = null;
            }
            if (mBccAddresses != null)
            {
                combineArrayExtra("android.intent.extra.BCC", mBccAddresses);
                mBccAddresses = null;
            }
            boolean flag1;
            if (mStreams == null || mStreams.size() <= 1)
            {
                flag = false;
            }
            flag1 = mIntent.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (!flag && flag1)
            {
                mIntent.setAction("android.intent.action.SEND");
                if (mStreams != null && !mStreams.isEmpty())
                {
                    mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)mStreams.get(0));
                } else
                {
                    mIntent.removeExtra("android.intent.extra.STREAM");
                }
                mStreams = null;
            }
            if (flag && !flag1)
            {
                mIntent.setAction("android.intent.action.SEND_MULTIPLE");
                if (mStreams != null && !mStreams.isEmpty())
                {
                    mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", mStreams);
                } else
                {
                    mIntent.removeExtra("android.intent.extra.STREAM");
                }
            }
            return mIntent;
        }

        public IntentBuilder setChooserTitle(int i)
        {
            return setChooserTitle(mActivity.getText(i));
        }

        public IntentBuilder setChooserTitle(CharSequence charsequence)
        {
            mChooserTitle = charsequence;
            return this;
        }

        public IntentBuilder setEmailBcc(String as[])
        {
            mIntent.putExtra("android.intent.extra.BCC", as);
            return this;
        }

        public IntentBuilder setEmailCc(String as[])
        {
            mIntent.putExtra("android.intent.extra.CC", as);
            return this;
        }

        public IntentBuilder setEmailTo(String as[])
        {
            if (mToAddresses != null)
            {
                mToAddresses = null;
            }
            mIntent.putExtra("android.intent.extra.EMAIL", as);
            return this;
        }

        public IntentBuilder setHtmlText(String s)
        {
            mIntent.putExtra("android.intent.extra.HTML_TEXT", s);
            if (!mIntent.hasExtra("android.intent.extra.TEXT"))
            {
                setText(Html.fromHtml(s));
            }
            return this;
        }

        public IntentBuilder setStream(Uri uri)
        {
            if (!mIntent.getAction().equals("android.intent.action.SEND"))
            {
                mIntent.setAction("android.intent.action.SEND");
            }
            mStreams = null;
            mIntent.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        public IntentBuilder setSubject(String s)
        {
            mIntent.putExtra("android.intent.extra.SUBJECT", s);
            return this;
        }

        public IntentBuilder setText(CharSequence charsequence)
        {
            mIntent.putExtra("android.intent.extra.TEXT", charsequence);
            return this;
        }

        public IntentBuilder setType(String s)
        {
            mIntent.setType(s);
            return this;
        }

        public void startChooser()
        {
            mActivity.startActivity(createChooserIntent());
        }

        private IntentBuilder(Activity activity)
        {
            mActivity = activity;
            mIntent = (new Intent()).setAction("android.intent.action.SEND");
            mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
            mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
            mIntent.addFlags(0x80000);
        }
    }

    public static class IntentReader
    {

        private static final String TAG = "IntentReader";
        private Activity mActivity;
        private ComponentName mCallingActivity;
        private String mCallingPackage;
        private Intent mIntent;
        private ArrayList mStreams;

        public static IntentReader from(Activity activity)
        {
            return new IntentReader(activity);
        }

        public ComponentName getCallingActivity()
        {
            return mCallingActivity;
        }

        public Drawable getCallingActivityIcon()
        {
            if (mCallingActivity == null)
            {
                return null;
            }
            Object obj = mActivity.getPackageManager();
            try
            {
                obj = ((PackageManager) (obj)).getActivityIcon(mCallingActivity);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.e("IntentReader", "Could not retrieve icon for calling activity", namenotfoundexception);
                return null;
            }
            return ((Drawable) (obj));
        }

        public Drawable getCallingApplicationIcon()
        {
            if (mCallingPackage == null)
            {
                return null;
            }
            Object obj = mActivity.getPackageManager();
            try
            {
                obj = ((PackageManager) (obj)).getApplicationIcon(mCallingPackage);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.e("IntentReader", "Could not retrieve icon for calling application", namenotfoundexception);
                return null;
            }
            return ((Drawable) (obj));
        }

        public CharSequence getCallingApplicationLabel()
        {
            if (mCallingPackage == null)
            {
                return null;
            }
            Object obj = mActivity.getPackageManager();
            try
            {
                obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(mCallingPackage, 0));
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                Log.e("IntentReader", "Could not retrieve label for calling application", namenotfoundexception);
                return null;
            }
            return ((CharSequence) (obj));
        }

        public String getCallingPackage()
        {
            return mCallingPackage;
        }

        public String[] getEmailBcc()
        {
            return mIntent.getStringArrayExtra("android.intent.extra.BCC");
        }

        public String[] getEmailCc()
        {
            return mIntent.getStringArrayExtra("android.intent.extra.CC");
        }

        public String[] getEmailTo()
        {
            return mIntent.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        public String getHtmlText()
        {
            String s1 = mIntent.getStringExtra("android.intent.extra.HTML_TEXT");
            String s = s1;
            if (mIntent == null)
            {
                CharSequence charsequence = getText();
                if (charsequence instanceof Spanned)
                {
                    s = Html.toHtml((Spanned)charsequence);
                } else
                {
                    s = s1;
                    if (charsequence != null)
                    {
                        return ShareCompat.IMPL.escapeHtml(charsequence);
                    }
                }
            }
            return s;
        }

        public Uri getStream()
        {
            return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
        }

        public Uri getStream(int i)
        {
            if (mStreams == null && isMultipleShare())
            {
                mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (mStreams != null)
            {
                return (Uri)mStreams.get(i);
            }
            if (i == 0)
            {
                return (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
            } else
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Stream items available: ").append(getStreamCount()).append(" index requested: ").append(i).toString());
            }
        }

        public int getStreamCount()
        {
            if (mStreams == null && isMultipleShare())
            {
                mStreams = mIntent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (mStreams != null)
            {
                return mStreams.size();
            }
            return !mIntent.hasExtra("android.intent.extra.STREAM") ? 0 : 1;
        }

        public String getSubject()
        {
            return mIntent.getStringExtra("android.intent.extra.SUBJECT");
        }

        public CharSequence getText()
        {
            return mIntent.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        public String getType()
        {
            return mIntent.getType();
        }

        public boolean isMultipleShare()
        {
            return "android.intent.action.SEND_MULTIPLE".equals(mIntent.getAction());
        }

        public boolean isShareIntent()
        {
            String s = mIntent.getAction();
            return "android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s);
        }

        public boolean isSingleShare()
        {
            return "android.intent.action.SEND".equals(mIntent.getAction());
        }

        private IntentReader(Activity activity)
        {
            mActivity = activity;
            mIntent = activity.getIntent();
            mCallingPackage = ShareCompat.getCallingPackage(activity);
            mCallingActivity = ShareCompat.getCallingActivity(activity);
        }
    }

    static interface ShareCompatImpl
    {

        public abstract void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder);

        public abstract String escapeHtml(CharSequence charsequence);
    }

    static class ShareCompatImplBase
        implements ShareCompatImpl
    {

        private static void withinStyle(StringBuilder stringbuilder, CharSequence charsequence, int i, int j)
        {
            while (i < j) 
            {
                char c = charsequence.charAt(i);
                if (c == '<')
                {
                    stringbuilder.append("&lt;");
                } else
                if (c == '>')
                {
                    stringbuilder.append("&gt;");
                } else
                if (c == '&')
                {
                    stringbuilder.append("&amp;");
                } else
                if (c > '~' || c < ' ')
                {
                    stringbuilder.append((new StringBuilder()).append("&#").append(c).append(";").toString());
                } else
                if (c == ' ')
                {
                    for (; i + 1 < j && charsequence.charAt(i + 1) == ' '; i++)
                    {
                        stringbuilder.append("&nbsp;");
                    }

                    stringbuilder.append(' ');
                } else
                {
                    stringbuilder.append(c);
                }
                i++;
            }
        }

        public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
        {
            menuitem.setIntent(intentbuilder.createChooserIntent());
        }

        public String escapeHtml(CharSequence charsequence)
        {
            StringBuilder stringbuilder = new StringBuilder();
            withinStyle(stringbuilder, charsequence, 0, charsequence.length());
            return stringbuilder.toString();
        }

        ShareCompatImplBase()
        {
        }
    }

    static class ShareCompatImplICS extends ShareCompatImplBase
    {

        public void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
        {
            ShareCompatICS.configureMenuItem(menuitem, intentbuilder.getActivity(), intentbuilder.getIntent());
            if (shouldAddChooserIntent(menuitem))
            {
                menuitem.setIntent(intentbuilder.createChooserIntent());
            }
        }

        boolean shouldAddChooserIntent(MenuItem menuitem)
        {
            return !menuitem.hasSubMenu();
        }

        ShareCompatImplICS()
        {
        }
    }

    static class ShareCompatImplJB extends ShareCompatImplICS
    {

        public String escapeHtml(CharSequence charsequence)
        {
            return ShareCompatJB.escapeHtml(charsequence);
        }

        boolean shouldAddChooserIntent(MenuItem menuitem)
        {
            return false;
        }

        ShareCompatImplJB()
        {
        }
    }


    public static final String EXTRA_CALLING_ACTIVITY = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    public static final String EXTRA_CALLING_PACKAGE = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
    private static ShareCompatImpl IMPL;

    public ShareCompat()
    {
    }

    public static void configureMenuItem(Menu menu, int i, IntentBuilder intentbuilder)
    {
        menu = menu.findItem(i);
        if (menu == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Could not find menu item with id ").append(i).append(" in the supplied menu").toString());
        } else
        {
            configureMenuItem(((MenuItem) (menu)), intentbuilder);
            return;
        }
    }

    public static void configureMenuItem(MenuItem menuitem, IntentBuilder intentbuilder)
    {
        IMPL.configureMenuItem(menuitem, intentbuilder);
    }

    public static ComponentName getCallingActivity(Activity activity)
    {
        ComponentName componentname1 = activity.getCallingActivity();
        ComponentName componentname = componentname1;
        if (componentname1 == null)
        {
            componentname = (ComponentName)activity.getIntent().getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY");
        }
        return componentname;
    }

    public static String getCallingPackage(Activity activity)
    {
        String s1 = activity.getCallingPackage();
        String s = s1;
        if (s1 == null)
        {
            s = activity.getIntent().getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
        }
        return s;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new ShareCompatImplJB();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new ShareCompatImplICS();
        } else
        {
            IMPL = new ShareCompatImplBase();
        }
    }

}
