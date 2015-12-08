// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.roidapp.baselib.c.c;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.d;
import java.lang.ref.WeakReference;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.auth.AccessToken;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterVerifyActivity

final class h extends c
    implements android.content.DialogInterface.OnCancelListener
{

    ProgressDialog a;
    private WeakReference b;

    private h(TwitterVerifyActivity twitterverifyactivity)
    {
        b = new WeakReference(twitterverifyactivity);
    }

    h(TwitterVerifyActivity twitterverifyactivity, byte byte0)
    {
        this(twitterverifyactivity);
    }

    private TwitterVerifyActivity a()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return (TwitterVerifyActivity)b.get();
        }
    }

    private transient AccessToken a(AccessToken aaccesstoken[])
    {
        if (a() == null)
        {
            return null;
        }
        try
        {
            Twitter twitter = TwitterVerifyActivity.a();
            twitter.setOAuthAccessToken(aaccesstoken[0]);
            twitter.getAccountSettings();
        }
        // Misplaced declaration of an exception variable
        catch (AccessToken aaccesstoken[])
        {
            aaccesstoken.printStackTrace();
            publishProgress(new TwitterException[] {
                aaccesstoken
            });
            return null;
        }
        aaccesstoken = aaccesstoken[0];
        return aaccesstoken;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((AccessToken[])aobj);
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        cancel(true);
        dialoginterface = a();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = a();
        if (obj != null && !((TwitterVerifyActivity) (obj)).isFinishing() && a != null && a.isShowing())
        {
            a.dismiss();
        }
        if (obj != null)
        {
            TwitterVerifyActivity.a(((TwitterVerifyActivity) (obj)));
        }
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
        TwitterVerifyActivity twitterverifyactivity = a();
        if (twitterverifyactivity == null)
        {
            return;
        } else
        {
            a = d.a(twitterverifyactivity, twitterverifyactivity.getString(at.R));
            a.setCanceledOnTouchOutside(false);
            a.setOnCancelListener(this);
            a.show();
            return;
        }
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (TwitterException[])aobj;
        if (aobj != null)
        {
            TwitterVerifyActivity twitterverifyactivity = a();
            if (twitterverifyactivity != null)
            {
                TwitterVerifyActivity.a(twitterverifyactivity, ((TwitterException) (aobj[0])).getMessage());
            }
        }
    }
}
