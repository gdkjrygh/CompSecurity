// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.content.Intent;
import android.net.Uri;
import com.pinterest.network.json.PinterestJsonObject;
import org.apache.commons.lang3.StringUtils;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

// Referenced classes of package com.pinterest.activity.signin:
//            TwitterAuthActivity

class val.result
    implements Runnable
{

    final TwitterAuthActivity this$0;
    final Intent val$result;
    final Uri val$uri;

    public void run()
    {
        Object obj = val$uri.getQueryParameter("oauth_verifier");
        if (StringUtils.isEmpty(((CharSequence) (obj))))
        {
            class _cls1
                implements Runnable
            {

                final TwitterAuthActivity._cls1 this$1;

                public void run()
                {
                    setResult(0, null);
                    hideWaitDialog();
                    finish();
                }

            _cls1()
            {
                this$1 = TwitterAuthActivity._cls1.this;
                super();
            }
            }

            runOnUiThread(new _cls1());
            return;
        }
        class _cls2
            implements Runnable
        {

            final TwitterAuthActivity._cls1 this$1;

            public void run()
            {
                showWaitDialog();
            }

            _cls2()
            {
                this$1 = TwitterAuthActivity._cls1.this;
                super();
            }
        }

        runOnUiThread(new _cls2());
        class _cls4
            implements Runnable
        {

            final TwitterAuthActivity._cls1 this$1;

            public void run()
            {
                setResult(-1, result);
                hideWaitDialog();
                finish();
            }

            _cls4()
            {
                this$1 = TwitterAuthActivity._cls1.this;
                super();
            }
        }

        class _cls3
            implements Runnable
        {

            final TwitterAuthActivity._cls1 this$1;

            public void run()
            {
                if (!NetworkUtils.getInstance().hasInternet())
                {
                    Application.showToast(0x7f07039b);
                } else
                {
                    Application.showToast(0x7f070355);
                }
                finish();
            }

            _cls3()
            {
                this$1 = TwitterAuthActivity._cls1.this;
                super();
            }
        }

        try
        {
            obj = _service.getAccessToken(_requestToken, new Verifier(((String) (obj))));
            Object obj1 = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/account/verify_credentials.json");
            _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
            obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
            val$result.putExtra("com.pinterest.EXTRA_TOKEN", ((Token) (obj)).getToken());
            val$result.putExtra("com.pinterest.EXTRA_SECRET", ((Token) (obj)).getSecret());
            val$result.putExtra("com.pinterest.EXTRA_ID", ((PinterestJsonObject) (obj1)).a("id", ""));
            val$result.putExtra("com.pinterest.EXTRA_USER_NAME", ((PinterestJsonObject) (obj1)).a("screen_name", ""));
            val$result.putExtra("com.pinterest.EXTRA_NAME", ((PinterestJsonObject) (obj1)).a("name", ""));
        }
        catch (Exception exception)
        {
            runOnUiThread(new _cls3());
        }
        runOnUiThread(new _cls4());
    }

    _cls3()
    {
        this$0 = final_twitterauthactivity;
        val$uri = uri1;
        val$result = Intent.this;
        super();
    }
}
