// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.spotlets.share.client.ShareViewClient;
import com.spotify.mobile.android.spotlets.share.oauth.model.OAuthInfo;
import com.spotify.mobile.android.util.Assertion;
import java.io.UnsupportedEncodingException;

public class fht extends fhi
{

    protected com.spotify.mobile.android.spotlets.share.model.Network.Type Z;
    protected ggc aa;
    ProgressBar ab;
    private OAuthInfo ac;
    private ShareViewClient ad;
    private fhv ae;
    private fhw af;
    private fhu ag;
    private WebView ah;

    public fht()
    {
    }

    private void G()
    {
        ab.setVisibility(0);
    }

    private void H()
    {
        if (k() == null)
        {
            return;
        } else
        {
            ggc.b(k(), Z.mName);
            dismiss();
            return;
        }
    }

    public static fht a(com.spotify.mobile.android.spotlets.share.model.Network.Type type)
    {
        Assertion.a(type);
        Assertion.a(type.b());
        Bundle bundle = new Bundle();
        bundle.putString("network_type", type.toString());
        type = new fht();
        type.f(bundle);
        return type;
    }

    static void a(fht fht1)
    {
        fht1.H();
    }

    public final void B()
    {
        super.B();
        ad.a();
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Assertion.a(g());
        bundle = g().getString("network_type");
        Assertion.a(bundle);
        Z = com.spotify.mobile.android.spotlets.share.model.Network.Type.valueOf(bundle);
        Assertion.a(Z);
        ac = Z.b();
        Assertion.a(ac);
        ad = new ShareViewClient(k());
        ae = new fhv() {

            private fht a;

            public final void a()
            {
                ggc ggc1 = a.aa;
                ggc.b(a.k(), a.Z.mName);
                a.dismiss();
            }

            public final void a(fhy fhy1)
            {
                a.a(fhy1);
            }

            
            {
                a = fht.this;
                super();
            }
        };
        af = new fhw() {

            private fht a;

            public final void a(String s)
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(s));
                a.a(intent);
                a.dismiss();
            }

            
            {
                a = fht.this;
                super();
            }
        };
        ag = new fhu(ac, ae, af) {

            private fht a;

            public final void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                a.ab.setVisibility(4);
            }

            
            {
                a = fht.this;
                super(oauthinfo, fhv, fhw);
            }
        };
        dmz.a(fht, ggc, new ggc());
        aa = (ggc)dmz.a(fht, ggc);
    }

    protected final void a(fhy fhy1)
    {
        if (fhy1 != null && fhy1.a())
        {
            Object obj = F();
            com.spotify.mobile.android.spotlets.share.model.Network.Type type = Z;
            Object obj1 = new fhr();
            obj1.a = Z.a();
            obj1.b = fhy1.a;
            obj1.c = fhy1.b;
            fhy1 = new com.spotify.mobile.android.spotlets.share.model.Connect.RequestV2(((fhr) (obj1)).a, ((fhr) (obj1)).b, ((fhr) (obj1)).c);
            obj1 = ((fhn) (obj)).Y;
            obj = ((fhn) (obj)).a(type);
            ((ShareViewClient) (obj1)).b().resolve(ShareViewClient.a(type, fhy1), ((com.spotify.cosmos.android.Resolver.CallbackReceiver) (obj)));
            dismiss();
            return;
        } else
        {
            H();
            return;
        }
    }

    protected final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            G();
            ah.loadUrl(s);
            return;
        } else
        {
            H();
            return;
        }
    }

    public final Dialog c(Bundle bundle)
    {
        super.c(bundle);
        bundle = k().getLayoutInflater().inflate(0x7f030092, null);
        ab = (ProgressBar)bundle.findViewById(0x7f1103a1);
        ah = (WebView)bundle.findViewById(0x7f1103a0);
        ah.getSettings().setJavaScriptEnabled(true);
        ah.setWebViewClient(ag);
        G();
        ShareViewClient shareviewclient = ad;
        com.spotify.mobile.android.spotlets.share.model.Network.Type type = Z;
        com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver = new com.spotify.cosmos.android.Resolver.CallbackReceiver(new Handler()) {

            private fht a;

            protected final void onError(Throwable throwable)
            {
                fht.a(a);
            }

            protected final void onResolved(Response response)
            {
                try
                {
                    a.a(new String(response.getBody(), "UTF-8"));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    throw new AssertionError();
                }
            }

            
            {
                a = fht.this;
                super(handler);
            }
        };
        shareviewclient.b().resolve(RequestBuilder.get(ShareViewClient.a(com.spotify.mobile.android.spotlets.share.client.ShareViewClient.Path.a, com.spotify.mobile.android.spotlets.share.client.ShareViewClient.Version.b, new String[] {
            type.a(), "http://localhost"
        })).build(), callbackreceiver);
        Assertion.a(bundle);
        bundle = (new dfj(k(), 0x7f0b017f)).a(bundle).b();
        ((android.widget.LinearLayout.LayoutParams)bundle.findViewById(0x7f11032d).getLayoutParams()).setMargins(0, 0, 0, 0);
        return bundle;
    }
}
