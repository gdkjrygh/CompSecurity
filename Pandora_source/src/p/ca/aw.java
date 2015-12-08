// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.p;
import java.util.HashMap;
import p.cp.d;
import p.df.a;

// Referenced classes of package p.ca:
//            j, au

public class aw extends p.ca.j
    implements au
{
    static class a extends BroadcastReceiver
    {

        au a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if (context.equals(PandoraIntent.a("add_music_seed_success")) || context.equals(PandoraIntent.a("reload_backstage_page")))
            {
                a.F().clearCache(false);
                a.F().reload();
            }
        }

        public a(au au1)
        {
            a = au1;
        }
    }

    public class b extends j.a
    {

        final aw a;

        protected HashMap a(String s1)
        {
            aw.f(s1);
            return null;
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            p.ca.aw.a(a, webview);
        }

        public b(BaseFragmentActivity basefragmentactivity, aw aw2, WebView webview)
        {
            a = aw.this;
            super(aw.this, basefragmentactivity, aw2, webview);
        }
    }


    private com.pandora.android.tablet.TabletHome.e a;
    private BroadcastReceiver s;

    public aw()
    {
        a = null;
        s = null;
    }

    public static void a(BroadcastReceiver broadcastreceiver)
    {
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("add_music_seed_success");
        pandoraintentfilter.a("reload_backstage_page");
        com.pandora.android.provider.b.a.C().a(broadcastreceiver, pandoraintentfilter);
    }

    public static void a(au au1, Bundle bundle)
    {
        WebView webview = au1.F();
        if (webview != null)
        {
            webview.saveState(bundle);
        }
        bundle.putSerializable("third_pane_type", au1.E());
    }

    public static void a(au au1, WebView webview)
    {
        if (au1.E() != null)
        {
            a(au1, webview, au1.a(webview));
        }
    }

    public static void a(au au1, WebView webview, Bundle bundle)
    {
        if (bundle != null && !bundle.isEmpty())
        {
            p.df.a.c("TabletWebFragment", (new StringBuilder()).append("restoring webview: ").append(bundle).toString());
            webview.restoreState(bundle);
            if (au1 instanceof aw)
            {
                ((aw)au1).a((com.pandora.android.tablet.TabletHome.e)bundle.getSerializable("third_pane_type"));
            }
            a(au1, webview, au1.a(webview));
        }
    }

    public static void a(au au1, WebView webview, com.pandora.android.view.HeaderLayout.a a1)
    {
        if (a1 == null)
        {
            if (webview.canGoBack())
            {
                webview = com.pandora.android.view.HeaderLayout.a.b;
            } else
            {
                webview = com.pandora.android.view.HeaderLayout.a.a;
            }
        } else
        {
            webview = a1;
        }
        au1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c).a(webview).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(au1.f()).a();
        com.pandora.android.provider.b.a.e().a(au1);
    }

    public static void f(String s1)
    {
        if (com.pandora.android.data.n.a.h.name().equals(s1))
        {
            s1 = new Bundle();
            s1.putBoolean("intent_find_people_show_empty_state", true);
            com.pandora.android.provider.b.a.C().a(TabletHome.a(p.k, s1));
        } else
        if (com.pandora.android.data.n.a.c.name().equals(s1))
        {
            com.pandora.android.provider.b.a.C().a(TabletHome.a(p.t, new Bundle()));
            return;
        }
    }

    public com.pandora.android.tablet.TabletHome.e E()
    {
        return a;
    }

    public WebView F()
    {
        return super.B();
    }

    public com.pandora.android.view.HeaderLayout.a a(WebView webview)
    {
        return null;
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new b(basefragmentactivity, this, webview);
    }

    public void a(com.pandora.android.tablet.TabletHome.e e1)
    {
        a = e1;
    }

    public boolean d(String s1)
    {
        return n != null && n.equals(s1);
    }

    public void e(String s1)
    {
        n = s1;
        b(n, true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        s = new a(this);
        a(s);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        try
        {
            com.pandora.android.provider.b.a.C().a(s);
        }
        catch (Exception exception)
        {
            p.df.a.b("TabletWebFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        a(this, bundle);
        super.onSaveInstanceState(bundle);
    }
}
