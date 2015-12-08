// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

// Referenced classes of package com.hmobile.twitter:
//            TwDialog, DialogError, TwitterError

class this._cls1
    implements Runnable
{

    final iss this$1;

    public void run()
    {
        TwDialog.access$2(_fld0).dismiss();
        dismiss();
    }

    l.url()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/hmobile/twitter/TwDialog$2

/* anonymous class */
    class TwDialog._cls2 extends Thread
    {

        final TwDialog this$0;
        private final String val$url;

        public void run()
        {
            Object obj = Uri.parse(url).getQueryParameter("oauth_verifier");
            Bundle bundle = new Bundle();
            try
            {
                TwDialog.access$5(TwDialog.this).retrieveAccessToken(TwDialog.access$6(TwDialog.this), ((String) (obj)));
                bundle.putString("access_token", TwDialog.access$6(TwDialog.this).getToken());
                bundle.putString("secret_token", TwDialog.access$6(TwDialog.this).getTokenSecret());
                TwDialog.access$1(TwDialog.this).onComplete(bundle);
            }
            catch (OAuthMessageSignerException oauthmessagesignerexception)
            {
                TwDialog.access$1(TwDialog.this).onError(new DialogError(oauthmessagesignerexception.getMessage(), -1, ((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                TwDialog.access$1(TwDialog.this).onTwitterError(new TwitterError(((OAuthNotAuthorizedException) (obj)).getMessage()));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                TwDialog.access$1(TwDialog.this).onTwitterError(new TwitterError(((OAuthExpectationFailedException) (obj)).getMessage()));
            }
            catch (OAuthCommunicationException oauthcommunicationexception)
            {
                TwDialog.access$1(TwDialog.this).onError(new DialogError(oauthcommunicationexception.getMessage(), -1, ((String) (obj))));
            }
            TwDialog.access$9(TwDialog.this).post(new TwDialog._cls2._cls1());
        }


            
            {
                this$0 = final_twdialog;
                url = String.this;
                super();
            }
    }

}
