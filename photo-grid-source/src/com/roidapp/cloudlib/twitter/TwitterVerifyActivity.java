// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import java.io.File;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.media.ImageUpload;
import twitter4j.media.ImageUploadFactory;
import twitter4j.media.MediaProvider;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            a, TwitterLoginActivity, h

public class TwitterVerifyActivity extends Activity
{

    public TwitterVerifyActivity()
    {
    }

    public static Twitter a()
    {
        Twitter twitter = (new TwitterFactory((new ConfigurationBuilder()).setOAuthConsumerKey(a.f).setOAuthConsumerSecret(a.g).setUseSSL(true).build())).getInstance();
        Log.i("TwitterVerifyActivity", (new StringBuilder("getTwitter:")).append(a.f).append(":").append(a.g).toString());
        return twitter;
    }

    public static void a(Context context, String s, String s1)
    {
        twitter4j.conf.Configuration configuration = (new ConfigurationBuilder()).setUseSSL(true).setOAuthConsumerKey(a.f).setOAuthConsumerSecret(a.g).setOAuthAccessToken(com.roidapp.cloudlib.common.a.q(context)).setMediaProvider("twitter").setOAuthAccessTokenSecret(com.roidapp.cloudlib.common.a.r(context)).build();
        context = s1;
        if (s1 != null)
        {
            context = s1;
            if (s1.length() > 117)
            {
                context = s1.substring(0, 117);
            }
        }
        (new ImageUploadFactory(configuration)).getInstance(MediaProvider.TWITTER).upload(new File(s), context);
    }

    static void a(TwitterVerifyActivity twitterverifyactivity)
    {
        twitterverifyactivity.setResult(-1);
        twitterverifyactivity.finish();
    }

    static void a(TwitterVerifyActivity twitterverifyactivity, String s)
    {
        twitterverifyactivity.a(s);
    }

    private void a(String s)
    {
        if ("No authentication challenges found".equals(s) || "Received authentication challenge is null".equals(s))
        {
            Toast.makeText(this, at.aZ, 0).show();
        }
        startActivityForResult(new Intent(this, com/roidapp/cloudlib/twitter/TwitterLoginActivity), 0);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 0)
        {
            if (j == -1)
            {
                setResult(-1);
            } else
            {
                setResult(0);
            }
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new RelativeLayout(this);
        bundle.setBackgroundColor(-1);
        setContentView(bundle);
        try
        {
            bundle = new AccessToken(com.roidapp.cloudlib.common.a.q(this), com.roidapp.cloudlib.common.a.r(this));
            (new h(this, (byte)0)).execute(new AccessToken[] {
                bundle
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            a(bundle.getMessage());
        }
    }
}
