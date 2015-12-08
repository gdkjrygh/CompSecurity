// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ShareCompat

public static class mIntent
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

    public static getIntent from(Activity activity)
    {
        return new <init>(activity);
    }

    public <init> addEmailBcc(String s)
    {
        if (mBccAddresses == null)
        {
            mBccAddresses = new ArrayList();
        }
        mBccAddresses.add(s);
        return this;
    }

    public mBccAddresses addEmailBcc(String as[])
    {
        combineArrayExtra("android.intent.extra.BCC", as);
        return this;
    }

    public combineArrayExtra addEmailCc(String s)
    {
        if (mCcAddresses == null)
        {
            mCcAddresses = new ArrayList();
        }
        mCcAddresses.add(s);
        return this;
    }

    public mCcAddresses addEmailCc(String as[])
    {
        combineArrayExtra("android.intent.extra.CC", as);
        return this;
    }

    public combineArrayExtra addEmailTo(String s)
    {
        if (mToAddresses == null)
        {
            mToAddresses = new ArrayList();
        }
        mToAddresses.add(s);
        return this;
    }

    public mToAddresses addEmailTo(String as[])
    {
        combineArrayExtra("android.intent.extra.EMAIL", as);
        return this;
    }

    public combineArrayExtra addStream(Uri uri)
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

    public mIntent setChooserTitle(int i)
    {
        return setChooserTitle(mActivity.getText(i));
    }

    public mActivity setChooserTitle(CharSequence charsequence)
    {
        mChooserTitle = charsequence;
        return this;
    }

    public mChooserTitle setEmailBcc(String as[])
    {
        mIntent.putExtra("android.intent.extra.BCC", as);
        return this;
    }

    public mIntent setEmailCc(String as[])
    {
        mIntent.putExtra("android.intent.extra.CC", as);
        return this;
    }

    public mIntent setEmailTo(String as[])
    {
        if (mToAddresses != null)
        {
            mToAddresses = null;
        }
        mIntent.putExtra("android.intent.extra.EMAIL", as);
        return this;
    }

    public mIntent setHtmlText(String s)
    {
        mIntent.putExtra("android.intent.extra.HTML_TEXT", s);
        if (!mIntent.hasExtra("android.intent.extra.TEXT"))
        {
            setText(Html.fromHtml(s));
        }
        return this;
    }

    public setText setStream(Uri uri)
    {
        if (!mIntent.getAction().equals("android.intent.action.SEND"))
        {
            mIntent.setAction("android.intent.action.SEND");
        }
        mStreams = null;
        mIntent.putExtra("android.intent.extra.STREAM", uri);
        return this;
    }

    public mIntent setSubject(String s)
    {
        mIntent.putExtra("android.intent.extra.SUBJECT", s);
        return this;
    }

    public mIntent setText(CharSequence charsequence)
    {
        mIntent.putExtra("android.intent.extra.TEXT", charsequence);
        return this;
    }

    public mIntent setType(String s)
    {
        mIntent.setType(s);
        return this;
    }

    public void startChooser()
    {
        mActivity.startActivity(createChooserIntent());
    }

    private (Activity activity)
    {
        mActivity = activity;
        mIntent = (new Intent()).setAction("android.intent.action.SEND");
        mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        mIntent.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", activity.getComponentName());
        mIntent.addFlags(0x80000);
    }
}
