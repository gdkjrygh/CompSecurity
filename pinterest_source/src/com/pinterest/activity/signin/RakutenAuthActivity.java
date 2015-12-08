// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.content.Intent;
import android.net.Uri;
import com.pinterest.activity.signin.api.RakutenApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

// Referenced classes of package com.pinterest.activity.signin:
//            WebAuthActivity

public class RakutenAuthActivity extends WebAuthActivity
{

    public RakutenAuthActivity()
    {
    }

    protected OAuthService getService()
    {
        return (new ServiceBuilder()).provider(com/pinterest/activity/signin/api/RakutenApi).apiKey("pinterest").apiSecret("i6UHWChXFhPOloTCtkC7fQHoBBAsy0AIDSPCxIhC").scope("idinfo_read_openid,memberinfo_read_basic,memberinfo_read_name,memberinfo_read_mail,90days@Access,90days@Refresh").callback("http://www.pinterest.com/android_app_oauth/rakuten").build();
    }

    protected void onAuthSuccess(final Uri uri)
    {
        (new Thread(new _cls1())).start();
    }

    private class _cls1
        implements Runnable
    {

        final RakutenAuthActivity this$0;
        final Intent val$result;
        final Uri val$uri;

        public void run()
        {
            Object obj = uri.getQueryParameter("code");
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
                        Application.showToast(0x7f070353);
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
                result.putExtra("com.pinterest.EXTRA_TOKEN", ((Token) (obj)).getToken());
                result.putExtra("com.pinterest.EXTRA_SECRET", ((Token) (obj)).getSecret());
                Object obj1 = new PinterestJsonObject(((Token) (obj)).getRawResponse());
                result.putExtra("com.pinterest.EXTRA_REFRESH_TOKEN", ((PinterestJsonObject) (obj1)).a("refresh_token", ""));
                obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetBasicInfo/20110601");
                _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
                obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
                result.putExtra("com.pinterest.EXTRA_GENDER", ((PinterestJsonObject) (obj1)).a("sex", -1));
                result.putExtra("com.pinterest.EXTRA_BIRTHDAY", ((PinterestJsonObject) (obj1)).a("birthday", ""));
                obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetName/20110601");
                _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
                obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
                result.putExtra("com.pinterest.EXTRA_USER_NAME", ((PinterestJsonObject) (obj1)).a("nickName", ""));
                result.putExtra("com.pinterest.EXTRA_FIRST_NAME", ((PinterestJsonObject) (obj1)).a("firstName", ""));
                result.putExtra("com.pinterest.EXTRA_LAST_NAME", ((PinterestJsonObject) (obj1)).a("lastName", ""));
                obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/IdInformation/GetOpenID/20110601");
                _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
                obj1 = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
                result.putExtra("com.pinterest.EXTRA_ID", ((PinterestJsonObject) (obj1)).a("openId", ""));
                obj1 = new OAuthRequest(Verb.GET, "https://app.rakuten.co.jp/engine/api/MemberInformation/GetMail/20110601");
                _service.signRequest(((Token) (obj)), ((OAuthRequest) (obj1)));
                obj = new PinterestJsonObject(((OAuthRequest) (obj1)).send().getBody());
                result.putExtra("com.pinterest.EXTRA_EMAIL", ((PinterestJsonObject) (obj)).a("emailAddress", ""));
            }
            catch (Exception exception)
            {
                runOnUiThread(new _cls3());
            }
            runOnUiThread(new _cls4());
        }

        _cls1()
        {
            this$0 = RakutenAuthActivity.this;
            uri = uri1;
            result = intent;
            super();
        }
    }

}
