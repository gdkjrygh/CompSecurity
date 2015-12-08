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

class areDelegate
    implements me.grantland.twitter.loadDelegate
{

    final enHeight this$1;
    private final com.hmobile.model.eShareDelegate val$delegate;

    public void UploadFailed()
    {
        if (val$delegate != null)
        {
            val$delegate.Failed();
        }
        hideProgress();
        Toast.makeText(getApplicationContext(), "error occured please try again.", 1).show();
    }

    public void UploadSuccessFully()
    {
        if (val$delegate != null)
        {
            val$delegate.SuccessFully();
        }
        hideProgress();
        Toast toast = Toast.makeText(getApplicationContext(), "Twitter share successfully.", 1);
        toast.setGravity(81, 0, screenHeight / 2);
        toast.show();
    }

    areDelegate()
    {
        this$1 = final_aredelegate;
        val$delegate = com.hmobile.model.eShareDelegate.this;
        super();
    }

    // Unreferenced inner class com/hmobile/biblekjv/BaseActivity$1

/* anonymous class */
    class BaseActivity._cls1
        implements me.grantland.twitter.Twitter.DialogListener
    {

        final BaseActivity this$0;
        private final com.hmobile.model.LikeShareInfo.LikeShareDelegate val$delegate;
        private final String val$share_text;

        public void onCancel()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(BaseActivity.this);
            builder.setTitle("Canceled").setMessage("Twitter Login Canceled").setPositiveButton("Ok", null);
            builder.create().show();
        }

        public void onComplete(String s, String s1)
        {
            android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(BaseActivity.this).edit();
            editor.putString("accessKey", s);
            editor.putString("accessSecret", s1);
            editor.commit();
            tweet = new Tweeter(s, s1, CONSUMER_KEY, CONSUMER_SECRET);
            try
            {
                tweet.upload(share_text, false, delegate. new BaseActivity._cls1._cls1());
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
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(BaseActivity.this);
            builder.setTitle("Error").setMessage(twittererror.getMessage()).setPositiveButton("Ok", null);
            builder.create().show();
        }


            
            {
                this$0 = final_baseactivity;
                share_text = s;
                delegate = com.hmobile.model.LikeShareInfo.LikeShareDelegate.this;
                super();
            }
    }

}
