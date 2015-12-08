// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.sso;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.sso.bakery.Cookie;
import com.spotify.mobile.android.util.logging.Logger;
import dms;
import dmz;
import eda;
import edb;
import edd;
import flu;
import flv;
import flw;
import flx;
import flz;
import fma;
import fmb;
import fmc;
import gqs;
import gqv;
import gro;
import grq;
import grr;
import grt;
import grv;
import java.io.IOException;
import java.net.HttpCookie;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.mobile.android.sso:
//            AuthorizationResponse, AuthorizationRequest

public class AuthorizationActivity extends Activity
    implements eda
{

    private fmb a;
    private ProgressDialog b;
    private boolean c;
    private boolean d;
    private flw e;
    private edb f;
    private gro g;
    private gqs h;
    private flu i;

    public AuthorizationActivity()
    {
    }

    static flu a(AuthorizationActivity authorizationactivity)
    {
        return authorizationactivity.i;
    }

    static String a(String s)
    {
        s = s.toLowerCase(Locale.getDefault());
        if (s.contains("invalid app identifier"))
        {
            return "INVALID_APP_ID";
        }
        if (s.contains("invalid_request"))
        {
            return "INVALID_REQUEST";
        }
        if (s.contains("invalid_client"))
        {
            return "INVALID_CLIENT";
        } else
        {
            return "AUTHENTICATION_SERVICE_UNKNOWN_ERROR";
        }
    }

    private void a()
    {
        setResult(0);
        finish();
    }

    private void a(Bundle bundle)
    {
        setResult(-1, a.a(bundle));
        finish();
    }

    public static void a(AuthorizationActivity authorizationactivity, String s)
    {
        authorizationactivity.b(s);
    }

    public static void a(AuthorizationActivity authorizationactivity, HttpCookie httpcookie)
    {
        WebView webview = (WebView)authorizationactivity.findViewById(0x7f1102cd);
        WebSettings websettings = webview.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setSaveFormData(false);
        websettings.setSavePassword(false);
        webview.setWebViewClient(authorizationactivity. new WebViewClient(webview) {

            private WebView a;
            private AuthorizationActivity b;

            public final void onPageFinished(WebView webview1, String s)
            {
                super.onPageFinished(webview1, s);
                a.setVisibility(0);
                if (AuthorizationActivity.c(b))
                {
                    AuthorizationActivity.d(b).dismiss();
                }
            }

            public final void onPageStarted(WebView webview1, String s, Bitmap bitmap)
            {
                super.onPageStarted(webview1, s, bitmap);
                if (AuthorizationActivity.c(b))
                {
                    AuthorizationActivity.d(b).show();
                }
            }

            public final void onReceivedError(WebView webview1, int j, String s, String s1)
            {
                super.onReceivedError(webview1, j, s, s1);
                Logger.c("%s, code: %s, failing url: %s", new Object[] {
                    s, Integer.valueOf(j), s1
                });
                AuthorizationActivity.a(b, "AUTHENTICATION_SERVICE_UNAVAILABLE");
            }

            public final boolean shouldOverrideUrlLoading(WebView webview1, String s)
            {
                webview1 = Uri.parse(s);
                if (s.startsWith(((AuthorizationRequest) (AuthorizationActivity.e(b))).a))
                {
                    b.a(flx.a(webview1));
                    return true;
                }
                if (webview1.getAuthority().matches("accounts.spotify.com"))
                {
                    return false;
                } else
                {
                    webview1 = new Intent("android.intent.action.VIEW", webview1);
                    b.startActivity(webview1);
                    return true;
                }
            }

            
            {
                b = AuthorizationActivity.this;
                a = webview;
                super();
            }
        });
        CookieManager.getInstance().setCookie(httpcookie.getDomain(), httpcookie.toString());
        webview.loadUrl(authorizationactivity.e.a().toString());
    }

    static void b(AuthorizationActivity authorizationactivity)
    {
        authorizationactivity.a();
    }

    static void b(AuthorizationActivity authorizationactivity, HttpCookie httpcookie)
    {
        String s = authorizationactivity.e.a().toString();
        authorizationactivity.g = ((dms)dmz.a(dms)).a;
        authorizationactivity.h = authorizationactivity.g.a((new grr()).a(s).a("Accept", "application/json").a("Cookie", httpcookie.toString()).b());
        authorizationactivity.h.a(authorizationactivity. new gqv(httpcookie) {

            private HttpCookie a;
            private AuthorizationActivity b;

            public final void a(grq grq, IOException ioexception)
            {
                AuthorizationActivity.a(b).obtainMessage(2, "AUTHENTICATION_SERVICE_UNKNOWN_ERROR").sendToTarget();
            }

            public final void a(grt grt1)
            {
                String s1 = grt1.e().f();
                grt1.e().close();
                if (grt1.b() || grt1.g())
                {
                    Object obj = "";
                    if (grt1.g())
                    {
                        grt1 = grt1.a("Location", "");
                    } else
                    {
                        try
                        {
                            grt1 = (new JSONObject(s1)).optString("redirect", "");
                        }
                        // Misplaced declaration of an exception variable
                        catch (grt grt1)
                        {
                            grt1 = ((grt) (obj));
                        }
                    }
                    grt1 = flx.a(Uri.parse(grt1));
                    obj = ((AuthorizationResponse) (grt1)).a;
                    if (obj == AuthorizationResponse.Type.b || obj == AuthorizationResponse.Type.a || obj == AuthorizationResponse.Type.c)
                    {
                        AuthorizationActivity.a(b).obtainMessage(0, grt1).sendToTarget();
                        return;
                    } else
                    {
                        AuthorizationActivity.a(b).obtainMessage(1, a).sendToTarget();
                        return;
                    }
                } else
                {
                    AuthorizationActivity.a(b).obtainMessage(2, AuthorizationActivity.a(s1)).sendToTarget();
                    return;
                }
            }

            
            {
                b = AuthorizationActivity.this;
                a = httpcookie;
                super();
            }
        });
    }

    private void b(String s)
    {
        Logger.c(s, new Object[0]);
        setResult(-2, a.a(s));
        finish();
    }

    static boolean c(AuthorizationActivity authorizationactivity)
    {
        return authorizationactivity.c;
    }

    static ProgressDialog d(AuthorizationActivity authorizationactivity)
    {
        return authorizationactivity.b;
    }

    static flw e(AuthorizationActivity authorizationactivity)
    {
        return authorizationactivity.e;
    }

    public final void a(SessionState sessionstate)
    {
label0:
        {
            if (!d && !sessionstate.f)
            {
                d = true;
                if (!sessionstate.e)
                {
                    break label0;
                }
                sessionstate = new flz(this);
                fma fma1 = new fma(sessionstate) {

                    private flz a;
                    private AuthorizationActivity b;

                    public final void a(Throwable throwable)
                    {
                        Logger.b(throwable, "Bakery request failed", new Object[0]);
                        AuthorizationActivity.a(b, "INTERNAL_ERROR");
                        a.a.destroy();
                    }

                    public final void a(HttpCookie httpcookie)
                    {
                        a.a.destroy();
                        AuthorizationActivity.b(b, httpcookie);
                    }

            
            {
                b = AuthorizationActivity.this;
                a = flz1;
                super();
            }
                };
                Request request = new Request("GET", "hm://bakery/accountscookie");
                if (!((flz) (sessionstate)).a.resolve(request, new flz._cls1(((flz) (sessionstate)).b, com/spotify/mobile/android/sso/bakery/Cookie, fma1)))
                {
                    fma1.a(new Throwable("Sending request to bakery failed"));
                }
            }
            return;
        }
        Logger.c("User not logged in", new Object[0]);
        b("NOT_LOGGED_IN");
    }

    public final void a(flx flx)
    {
        final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[AuthorizationResponse.Type.values().length];
                try
                {
                    a[AuthorizationResponse.Type.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AuthorizationResponse.Type.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AuthorizationResponse.Type.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5.a[((AuthorizationResponse) (flx)).a.ordinal()])
        {
        default:
            b("INVALID_RESPONSE");
            return;

        case 1: // '\001'
            a(a.a(((AuthorizationResponse) (flx)).c, ((AuthorizationResponse) (flx)).e));
            return;

        case 2: // '\002'
            a(a.b(((AuthorizationResponse) (flx)).b));
            return;

        case 3: // '\003'
            b(((AuthorizationResponse) (flx)).d);
            break;
        }
    }

    public void onAttachedToWindow()
    {
        c = true;
        super.onAttachedToWindow();
    }

    public void onBackPressed()
    {
        a();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i = new flu(this);
        dmz.a(edd);
        f = edd.a(this);
        f.a(this);
        Intent intent = getIntent();
        if (intent.getIntExtra("VERSION", 0) == 1)
        {
            bundle = new fmc();
        } else
        {
            bundle = null;
        }
        a = bundle;
        if (a == null)
        {
            Logger.c("INVALID_VERSION", new Object[0]);
            bundle = new Intent();
            bundle.putExtra("VERSION", "INVALID_VERSION");
            setResult(-2, bundle);
            finish();
            return;
        }
        String s;
        String s1;
        AuthorizationRequest.ResponseType responsetype;
        try
        {
            dmz.a(flv);
            bundle = flv.a(this, getCallingActivity());
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            b("CLIENT_VERIFICATION_FAILED");
            return;
        }
        s = a.a(intent);
        s1 = a.b(intent);
        responsetype = a.c(intent);
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || responsetype == null)
        {
            Logger.c("Invalid request parameters", new Object[0]);
            b("INVALID_REQUEST");
            return;
        } else
        {
            e = new flw(s, responsetype, s1, bundle, a.d(intent));
            setContentView(0x7f03002f);
            b = new ProgressDialog(this);
            b.setMessage(getString(0x7f0803e1));
            b.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                private AuthorizationActivity a;

                public final void onCancel(DialogInterface dialoginterface)
                {
                    AuthorizationActivity.b(a);
                }

            
            {
                a = AuthorizationActivity.this;
                super();
            }
            });
            b.show();
            return;
        }
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            b.dismiss();
        }
        super.onDestroy();
    }

    public void onDetachedFromWindow()
    {
        c = false;
        super.onDetachedFromWindow();
    }

    protected void onStart()
    {
        super.onStart();
        f.a();
    }

    protected void onStop()
    {
        super.onStop();
        f.b();
    }
}
