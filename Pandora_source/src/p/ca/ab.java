// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.android.view.PandoraWebView;
import p.cp.b;
import p.cp.d;
import p.dd.bp;
import p.df.a;

// Referenced classes of package p.ca:
//            j

public class ab extends p.ca.j
{
    public class a extends j.a
    {

        final ab a;

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            if (s.u())
            {
                if (a.b == null)
                {
                    a.b = a.f();
                }
                webview = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(com.pandora.android.view.HeaderLayout.a.b).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(a.b).a();
                com.pandora.android.provider.b.a.e().a(webview);
            }
        }

        public a(BaseFragmentActivity basefragmentactivity, ab ab2, WebView webview)
        {
            a = ab.this;
            super(ab.this, basefragmentactivity, ab2, webview);
        }
    }


    private BroadcastReceiver a;

    public ab()
    {
        a = new BroadcastReceiver() {

            final ab a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (PandoraIntent.a("complimentary_p1_trial_started").equals(context) || PandoraIntent.a("iap_benefit_expired").equals(context))
                {
                    p.ca.ab.a(a);
                }
            }

            
            {
                a = ab.this;
                super();
            }
        };
    }

    private void E()
    {
        String s1 = b.e();
        if (!s1.equals(n))
        {
            c = true;
            B().loadUrl(s1);
        }
    }

    public static p.ca.j a(String s1, boolean flag, int i)
    {
        s1 = a(s1, flag, i, false);
        ab ab1 = new ab();
        ab1.setArguments(s1);
        return ab1;
    }

    static void a(ab ab1)
    {
        ab1.E();
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        a(h);
        return new a(basefragmentactivity, this, webview);
    }

    public boolean c()
    {
        if (s.u())
        {
            Intent intent = TabletHome.a(p.r, null);
            com.pandora.android.provider.b.a.C().a(intent);
            return true;
        } else
        {
            return super.c();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new PandoraIntentFilter();
        bundle.a("complimentary_p1_trial_started");
        bundle.a("iap_benefit_expired");
        com.pandora.android.provider.b.a.C().a(a, bundle);
    }

    public void onDestroyView()
    {
        try
        {
            com.pandora.android.provider.b.a.C().a(a);
        }
        catch (Exception exception)
        {
            p.df.a.c("PandoraOneSettingsTabWebFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        super.onDestroyView();
    }

    public void onUserStateChange(bp bp)
    {
        E();
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.F;
    }
}
