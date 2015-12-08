// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.wallet.rest.containers.SocialFollowResponse;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class ActivitySocialFollow extends BaseActivityWithoutSlider
{
    private class BackgroundTask extends AsyncTask
    {

        private static final int TYPE_FOLLOW = 2;
        private static final int TYPE_LOGIN = 1;
        private int mType;
        final ActivitySocialFollow this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Integer[])aobj);
        }

        protected transient Void doInBackground(Integer ainteger[])
        {
            Logger.debug("ActivitySocialFollow", "doInBackground() START");
            if (ainteger != null && ainteger.length > 0)
            {
                mType = ainteger[0].intValue();
            }
            ainteger = null;
            mType;
            JVM INSTR tableswitch 1 2: default 56
        //                       1 58
        //                       2 195;
               goto _L1 _L2 _L3
_L1:
            return null;
_L2:
            ConfigurationBuilder configurationbuilder = new ConfigurationBuilder();
            ainteger = configurationbuilder;
_L4:
            ainteger.setOAuthConsumerKey(getResources().getString(0x7f080524));
            ainteger.setOAuthConsumerSecret(getResources().getString(0x7f080525));
            ainteger = ainteger.build();
            mTwitter = (new TwitterFactory(ainteger)).getInstance();
            Exception exception;
            try
            {
                mRequestToken = mTwitter.getOAuthRequestToken("http://www.kohls.com");
            }
            // Misplaced declaration of an exception variable
            catch (Integer ainteger[])
            {
                isError = true;
                Logger.error("ActivitySocialFollow", ainteger.getMessage(), ainteger);
            }
            Logger.debug("ActivitySocialFollow", "doInBackground() END");
            continue; /* Loop/switch isn't completed */
            exception;
            Logger.error("ActivitySocialFollow", exception.getMessage(), exception);
              goto _L4
_L3:
            mAccessToken = mTwitter.getOAuthAccessToken(mRequestToken, mVerifier);
            mUser = mTwitter.createFriendship("kohls", true);
            if (mUser != null)
            {
                Logger.debug("ActivitySocialFollow", "User has successfully followed");
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                Logger.debug("ActivitySocialFollow", "User did NOT follow");
            }
            // Misplaced declaration of an exception variable
            catch (Integer ainteger[])
            {
                isError = true;
                Logger.error("ActivitySocialFollow", ainteger.getMessage(), ainteger);
            }
            if (true) goto _L1; else goto _L5
_L5:
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            Logger.debug("ActivitySocialFollow", "onPostExecute() START");
            mType;
            JVM INSTR tableswitch 1 2: default 32
        //                       1 40
        //                       2 136;
               goto _L1 _L2 _L3
_L1:
            Logger.debug("ActivitySocialFollow", "onPostExecute() END");
            return;
_L2:
            if (mRequestToken != null && mRequestToken.getAuthenticationURL() != null)
            {
                mWebView.loadUrl(mRequestToken.getAuthenticationURL());
            } else
            {
                Logger.debug("ActivitySocialFollow", "Failed to get Request Toke, DEBUG it.");
                void1 = getString(0x7f0801fe);
                if (void1 != null)
                {
                    ToastUtility.showCustomToastBottom(void1);
                }
        /* block-local class not found */
        class _cls1 {}

                mHandler.postDelayed(new _cls1(), 3000L);
            }
            continue; /* Loop/switch isn't completed */
_L3:
            void1 = null;
            if (mUser == null || mSocialFollowResponse == null)
            {
                break; /* Loop/switch isn't completed */
            }
            void1 = getString(0x7f0804f6);
_L6:
            if (void1 == null);
            if (true) goto _L1; else goto _L4
_L4:
            if (!isError) goto _L6; else goto _L5
_L5:
            void1 = getString(0x7f0801fe);
              goto _L6
        }

        private BackgroundTask()
        {
            this$0 = ActivitySocialFollow.this;
            super();
            mType = 0;
        }

    }


    public static final int DELAY_FOR_MSG = 3000;
    private static final String EVENT_FOLLOW_TWITTER = "Twitter_Follow";
    public static final String INTENT_EXTRA_LAUNCH_MODE = "LaunchMode";
    public static final String INTENT_EXTRA_SOCIAL_URL = "SocialUrl";
    public static final int LAUNCH_MODE_TWITTER = 1;
    private static final String LOG_TAG = "ActivitySocialFollow";
    private final String IEXTRA_OAUTH_VERIFIER = "oauth_verifier";
    private final String TWITTER_CALLBACK_URL = "http://www.kohls.com";
    private final String TWITTER_HANDLE = "kohls";
    private boolean isError;
    private AccessToken mAccessToken;
    private Handler mHandler;
    private int mLaunchMode;
    private RequestToken mRequestToken;
    private SocialFollowResponse mSocialFollowResponse;
    private Twitter mTwitter;
    private User mUser;
    private String mVerifier;
    private WebChromeClient mWebChromeClient;
    private WebView mWebView;
    private WebViewClient mWebViewClient;

    public ActivitySocialFollow()
    {
        mWebView = null;
        mRequestToken = null;
        mAccessToken = null;
        mTwitter = null;
        mVerifier = null;
        mUser = null;
        mSocialFollowResponse = null;
        isError = false;
        mHandler = null;
        mLaunchMode = -1;
        mWebChromeClient = new WebChromeClient() {

            final ActivitySocialFollow this$0;

            public void onProgressChanged(WebView webview, int i)
            {
                super.onProgressChanged(webview, i);
                if (i >= 100)
                {
                    findViewById(0x7f0d0100).setVisibility(0);
                    findViewById(0x7f0d00ff).setVisibility(8);
                }
            }

            
            {
                this$0 = ActivitySocialFollow.this;
                super();
            }
        };
        mWebViewClient = new WebViewClient() {

            final ActivitySocialFollow this$0;

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (mLaunchMode == 1 && s.contains("http://www.kohls.com"))
                {
                    webview = Uri.parse(s);
                    mVerifier = webview.getQueryParameter("oauth_verifier");
                    (new BackgroundTask()).executeOnExecutor(BackgroundTask.THREAD_POOL_EXECUTOR, new Integer[] {
                        Integer.valueOf(2)
                    });
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = ActivitySocialFollow.this;
                super();
            }
        };
    }

    protected int getLayoutId()
    {
        return 0x7f03001c;
    }

    protected void initializeViews(Bundle bundle)
    {
        Logger.debug("ActivitySocialFollow", "initializeViews() START");
        mHandler = new Handler();
        bundle = getIntent().getStringExtra("SocialUrl");
        mLaunchMode = getIntent().getIntExtra("LaunchMode", 0);
        mWebView = (WebView)findViewById(0x7f0d0100);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.setWebChromeClient(mWebChromeClient);
        mWebView.setWebViewClient(mWebViewClient);
        mLaunchMode;
        JVM INSTR tableswitch 1 1: default 120
    //                   1 140;
           goto _L1 _L2
_L1:
        if (bundle != null)
        {
            mWebView.loadUrl(bundle);
        } else
        {
            Logger.debug("ActivitySocialFollow", "Social url is null, DEBUG it.");
        }
_L4:
        Logger.debug("ActivitySocialFollow", "initializeViews() END");
        return;
_L2:
        (new BackgroundTask()).executeOnExecutor(BackgroundTask.THREAD_POOL_EXECUTOR, new Integer[] {
            Integer.valueOf(1)
        });
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onDestroy()
    {
        if (mWebView != null)
        {
            mWebView.destroy();
        }
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        if (mWebView != null)
        {
            mWebView.onPause();
        }
    }

    public void onResume()
    {
        super.onResume();
        if (mWebView != null)
        {
            mWebView.onResume();
        }
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarForSocial(getString(0x7f08012f));
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }





/*
    static String access$202(ActivitySocialFollow activitysocialfollow, String s)
    {
        activitysocialfollow.mVerifier = s;
        return s;
    }

*/



/*
    static Twitter access$302(ActivitySocialFollow activitysocialfollow, Twitter twitter)
    {
        activitysocialfollow.mTwitter = twitter;
        return twitter;
    }

*/



/*
    static RequestToken access$402(ActivitySocialFollow activitysocialfollow, RequestToken requesttoken)
    {
        activitysocialfollow.mRequestToken = requesttoken;
        return requesttoken;
    }

*/



/*
    static boolean access$502(ActivitySocialFollow activitysocialfollow, boolean flag)
    {
        activitysocialfollow.isError = flag;
        return flag;
    }

*/


/*
    static AccessToken access$602(ActivitySocialFollow activitysocialfollow, AccessToken accesstoken)
    {
        activitysocialfollow.mAccessToken = accesstoken;
        return accesstoken;
    }

*/



/*
    static User access$702(ActivitySocialFollow activitysocialfollow, User user)
    {
        activitysocialfollow.mUser = user;
        return user;
    }

*/


}
