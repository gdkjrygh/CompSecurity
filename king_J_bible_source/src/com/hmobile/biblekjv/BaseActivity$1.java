// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;
import me.grantland.twitter.Tweeter;
import me.grantland.twitter.TwitterError;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class ShareDelegate
    implements me.grantland.twitter.istener
{

    final BaseActivity this$0;
    private final com.hmobile.model.ikeShareDelegate val$delegate;
    private final String val$share_text;

    public void onCancel()
    {
        android.app.lder lder = new android.app.lder(BaseActivity.this);
        lder.setTitle("Canceled").setMessage("Twitter Login Canceled").setPositiveButton("Ok", null);
        lder.create().show();
    }

    public void onComplete(String s, String s1)
    {
        android.content.es.Editor editor = PreferenceManager.getDefaultSharedPreferences(BaseActivity.this).edit();
        editor.putString("accessKey", s);
        editor.putString("accessSecret", s1);
        editor.commit();
        tweet = new Tweeter(s, s1, CONSUMER_KEY, CONSUMER_SECRET);
        try
        {
            tweet.upload(val$share_text, false, new me.grantland.twitter.Tweeter.TwitterUploadDelegate() {

                final BaseActivity._cls1 this$1;
                private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;

                public void UploadFailed()
                {
                    if (delegate != null)
                    {
                        delegate.Failed();
                    }
                    hideProgress();
                    Toast.makeText(getApplicationContext(), "error occured please try again.", 1).show();
                }

                public void UploadSuccessFully()
                {
                    if (delegate != null)
                    {
                        delegate.SuccessFully();
                    }
                    hideProgress();
                    Toast toast = Toast.makeText(getApplicationContext(), "Twitter share successfully.", 1);
                    toast.setGravity(81, 0, screenHeight / 2);
                    toast.show();
                }

            
            {
                this$1 = BaseActivity._cls1.this;
                delegate = likesharedelegate;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            hideProgress();
        }
        s.printStackTrace();
    }

    public void onError(TwitterError twittererror)
    {
        android.app.lder lder = new android.app.lder(BaseActivity.this);
        lder.setTitle("Error").setMessage(twittererror.getMessage()).setPositiveButton("Ok", null);
        lder.create().show();
    }


    ShareDelegate()
    {
        this$0 = final_baseactivity;
        val$share_text = s;
        val$delegate = com.hmobile.model.ikeShareDelegate.this;
        super();
    }
}
