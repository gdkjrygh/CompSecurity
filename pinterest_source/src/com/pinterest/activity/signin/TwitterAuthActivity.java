// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.content.Intent;
import android.net.Uri;
import com.pinterest.kit.utils.WebViewUtils;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.oauth.OAuthService;

// Referenced classes of package com.pinterest.activity.signin:
//            WebAuthActivity

public class TwitterAuthActivity extends WebAuthActivity
{

    public TwitterAuthActivity()
    {
    }

    protected OAuthService getService()
    {
        return (new ServiceBuilder()).provider(org/scribe/builder/api/TwitterApi).apiKey("Zr6TVkMT2KhKIZwERTB8IQ").apiSecret("WYmVb7f0a1JOUVpMBJaG699SlL6xu8hAyX83gNCGQ0").callback("oauth://twitter").build();
    }

    protected void init()
    {
        super.init();
        WebViewUtils.clearCookies(_webview);
    }

    protected void onAuthSuccess(final Uri uri)
    {
        (new Thread(new _cls1())).start();
    }

    private class _cls1
        implements Runnable
    {

        final TwitterAuthActivity this$0;
        final Intent val$result;
        final Uri val$uri;

        public void run()
        {
            Object obj = uri.getQueryParameter("oauth_verifier");
            if (StringUtils.isEmpty(((CharSequence) (obj))))
            {
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        setResult(0, null);
                        hideWaitDialog();
                        finish();
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                runOnUiThread(new _cls1());
                return;
            }
            class _cls2
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    showWaitDialog();
                }

                _cls2()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            runOnUiThread(new _cls2());
            class _cls4
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    setResult(-1, result);
                    hideWaitDialog();
                    finish();
                }

                _cls4()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            class _cls3
                implements Runnable
            {

                final _cls1 this$1;

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
                    this$1 = _cls1.this;
                    super();
                }
            }

            try
            {
                obj = _service.getAccessToken(_requestToken, new Verifier(((String) (obj))));
                Object obj1 = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/account/verify_credentials.json");
                _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
                obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
                result.putExtra("com.pinterest.EXTRA_TOKEN", ((Token) (obj)).getToken());
                result.putExtra("com.pinterest.EXTRA_SECRET", ((Token) (obj)).getSecret());
                result.putExtra("com.pinterest.EXTRA_ID", ((PinterestJsonObject) (obj1)).a("id", ""));
                result.putExtra("com.pinterest.EXTRA_USER_NAME", ((PinterestJsonObject) (obj1)).a("screen_name", ""));
                result.putExtra("com.pinterest.EXTRA_NAME", ((PinterestJsonObject) (obj1)).a("name", ""));
            }
            catch (Exception exception)
            {
                runOnUiThread(new _cls3());
            }
            runOnUiThread(new _cls4());
        }

        _cls1()
        {
            this$0 = TwitterAuthActivity.this;
            uri = uri1;
            result = intent;
            super();
        }
    }

}
