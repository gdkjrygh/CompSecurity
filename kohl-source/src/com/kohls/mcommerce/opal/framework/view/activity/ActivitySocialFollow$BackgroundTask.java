// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Handler;
import android.webkit.WebView;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.Logger;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            ActivitySocialFollow

private class <init> extends AsyncTask
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
    //                   1 58
    //                   2 195;
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
        ActivitySocialFollow.access$302(ActivitySocialFollow.this, (new TwitterFactory(ainteger)).getInstance());
        Exception exception;
        try
        {
            ActivitySocialFollow.access$402(ActivitySocialFollow.this, ActivitySocialFollow.access$300(ActivitySocialFollow.this).getOAuthRequestToken("http://www.kohls.com"));
        }
        // Misplaced declaration of an exception variable
        catch (Integer ainteger[])
        {
            ActivitySocialFollow.access$502(ActivitySocialFollow.this, true);
            Logger.error("ActivitySocialFollow", ainteger.getMessage(), ainteger);
        }
        Logger.debug("ActivitySocialFollow", "doInBackground() END");
        continue; /* Loop/switch isn't completed */
        exception;
        Logger.error("ActivitySocialFollow", exception.getMessage(), exception);
          goto _L4
_L3:
        ActivitySocialFollow.access$602(ActivitySocialFollow.this, ActivitySocialFollow.access$300(ActivitySocialFollow.this).getOAuthAccessToken(ActivitySocialFollow.access$400(ActivitySocialFollow.this), ActivitySocialFollow.access$200(ActivitySocialFollow.this)));
        ActivitySocialFollow.access$702(ActivitySocialFollow.this, ActivitySocialFollow.access$300(ActivitySocialFollow.this).createFriendship("kohls", true));
        if (ActivitySocialFollow.access$700(ActivitySocialFollow.this) != null)
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
            ActivitySocialFollow.access$502(ActivitySocialFollow.this, true);
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
    //                   1 40
    //                   2 136;
           goto _L1 _L2 _L3
_L1:
        Logger.debug("ActivitySocialFollow", "onPostExecute() END");
        return;
_L2:
        if (ActivitySocialFollow.access$400(ActivitySocialFollow.this) != null && ActivitySocialFollow.access$400(ActivitySocialFollow.this).getAuthenticationURL() != null)
        {
            ActivitySocialFollow.access$800(ActivitySocialFollow.this).loadUrl(ActivitySocialFollow.access$400(ActivitySocialFollow.this).getAuthenticationURL());
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

            ActivitySocialFollow.access$900(ActivitySocialFollow.this).postDelayed(new _cls1(), 3000L);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        void1 = null;
        if (ActivitySocialFollow.access$700(ActivitySocialFollow.this) == null || ActivitySocialFollow.access$1000(ActivitySocialFollow.this) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        void1 = getString(0x7f0804f6);
_L6:
        if (void1 == null);
        if (true) goto _L1; else goto _L4
_L4:
        if (!ActivitySocialFollow.access$500(ActivitySocialFollow.this)) goto _L6; else goto _L5
_L5:
        void1 = getString(0x7f0801fe);
          goto _L6
    }

    private _cls1()
    {
        this$0 = ActivitySocialFollow.this;
        super();
        mType = 0;
    }

    mType(mType mtype)
    {
        this();
    }
}
