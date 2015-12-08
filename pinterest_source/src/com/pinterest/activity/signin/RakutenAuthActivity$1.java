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
//            RakutenAuthActivity

class val.result
    implements Runnable
{

    final RakutenAuthActivity this$0;
    final Intent val$result;
    final Uri val$uri;

    public void run()
    {
        Object obj = val$uri.getQueryParameter("code");
        if (StringUtils.isEmpty(((CharSequence) (obj))))
        {
            class _cls1
                implements Runnable
            {

                final RakutenAuthActivity._cls1 this$1;

                public void run()
                {
                    setResult(0, null);
                    hideWaitDialog();
                    finish();
                }

            _cls1()
            {
                this$1 = RakutenAuthActivity._cls1.this;
                super();
            }
            }

            runOnUiThread(new _cls1());
            return;
        }
        class _cls2
            implements Runnable
        {

            final RakutenAuthActivity._cls1 this$1;

            public void run()
            {
                showWaitDialog();
            }

            _cls2()
            {
                this$1 = RakutenAuthActivity._cls1.this;
                super();
            }
        }

        runOnUiThread(new _cls2());
        class _cls4
            implements Runnable
        {

            final RakutenAuthActivity._cls1 this$1;

            public void run()
            {
                setResult(-1, result);
                hideWaitDialog();
                finish();
            }

            _cls4()
            {
                this$1 = RakutenAuthActivity._cls1.this;
                super();
            }
        }

        class _cls3
            implements Runnable
        {

            final RakutenAuthActivity._cls1 this$1;

            public void run()
            {
                if (!NetworkUtils.getInstance().hasInternet())
                {
                    Application.showToast(0x7f07039b);
                } else
                {
                    Application.showToast(0x7f070353);
                }
                finish();
            }

            _cls3()
            {
                this$1 = RakutenAuthActivity._cls1.this;
                super();
            }
        }

        try
        {
            obj = _service.getAccessToken(_requestToken, new Verifier(((String) (obj))));
            val$result.putExtra("com.pinterest.EXTRA_TOKEN", ((Token) (obj)).getToken());
            val$result.putExtra("com.pinterest.EXTRA_SECRET", ((Token) (obj)).getSecret());
            Object obj1 = new PinterestJsonObject(((Token) (obj)).getRawResponse());
            val$result.putExtra("com.pinterest.EXTRA_REFRESH_TOKEN", ((PinterestJsonObject) (obj1)).a("refresh_token", ""));
            obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetBasicInfo/20110601");
            _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
            obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
            val$result.putExtra("com.pinterest.EXTRA_GENDER", ((PinterestJsonObject) (obj1)).a("sex", -1));
            val$result.putExtra("com.pinterest.EXTRA_BIRTHDAY", ((PinterestJsonObject) (obj1)).a("birthday", ""));
            obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetName/20110601");
            _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
            obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
            val$result.putExtra("com.pinterest.EXTRA_USER_NAME", ((PinterestJsonObject) (obj1)).a("nickName", ""));
            val$result.putExtra("com.pinterest.EXTRA_FIRST_NAME", ((PinterestJsonObject) (obj1)).a("firstName", ""));
            val$result.putExtra("com.pinterest.EXTRA_LAST_NAME", ((PinterestJsonObject) (obj1)).a("lastName", ""));
            obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/IdInformation/GetOpenID/20110601");
            _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
            obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
            val$result.putExtra("com.pinterest.EXTRA_ID", ((PinterestJsonObject) (obj1)).a("openId", ""));
            obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetMail/20110601");
            _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
            obj = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
            val$result.putExtra("com.pinterest.EXTRA_EMAIL", ((PinterestJsonObject) (obj)).a("emailAddress", ""));
        }
        catch (Exception exception)
        {
            runOnUiThread(new _cls3());
        }
        runOnUiThread(new _cls4());
    }

    _cls3()
    {
        this$0 = final_rakutenauthactivity;
        val$uri = uri1;
        val$result = Intent.this;
        super();
    }
}
