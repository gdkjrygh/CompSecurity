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
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ShareCompat

public static class ivity
{

    private static final String TAG = "IntentReader";
    private Activity mActivity;
    private ComponentName mCallingActivity;
    private String mCallingPackage;
    private Intent mIntent;
    private ArrayList mStreams;

    public static ivity from(Activity activity)
    {
        return new <init>(activity);
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
        catch (android.content.pm.ndException ndexception)
        {
            Log.e("IntentReader", "Could not retrieve icon for calling activity", ndexception);
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
        catch (android.content.pm.ndException ndexception)
        {
            Log.e("IntentReader", "Could not retrieve icon for calling application", ndexception);
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
        catch (android.content.pm.ndException ndexception)
        {
            Log.e("IntentReader", "Could not retrieve label for calling application", ndexception);
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
                    return ShareCompat.access$000().escapeHtml(charsequence);
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

    private ception(Activity activity)
    {
        mActivity = activity;
        mIntent = activity.getIntent();
        mCallingPackage = ShareCompat.getCallingPackage(activity);
        mCallingActivity = ShareCompat.getCallingActivity(activity);
    }
}
