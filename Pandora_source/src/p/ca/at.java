// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import java.util.HashMap;
import p.cp.d;
import p.df.a;

// Referenced classes of package p.ca:
//            a, au, aw

public class at extends p.ca.a
    implements au
{
    public class a extends a.a
    {

        final at e;

        protected HashMap a(String s1)
        {
            if (com.pandora.android.data.n.a.h.name().equals(s1))
            {
                s1 = new Bundle();
                s1.putBoolean("intent_find_people_show_empty_state", true);
                b.a.C().a(TabletHome.d(s1));
            } else
            {
                aw.f(s1);
            }
            return null;
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            p.ca.aw.a(e, webview, e.a(webview));
        }

        public a(BaseFragmentActivity basefragmentactivity, at at2, WebView webview)
        {
            e = at.this;
            super(at.this, basefragmentactivity, at2, webview);
        }
    }


    private BroadcastReceiver s;
    private boolean t;
    private com.pandora.android.view.HeaderLayout.a u;

    public at()
    {
        s = null;
        t = false;
    }

    public static at c(Bundle bundle)
    {
        at at1 = new at();
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = a.a(false);
        }
        at1.setArguments(bundle1);
        return at1;
    }

    public com.pandora.android.tablet.TabletHome.e E()
    {
        return com.pandora.android.tablet.TabletHome.e.a;
    }

    public WebView F()
    {
        return super.B();
    }

    public com.pandora.android.view.HeaderLayout.a a(WebView webview)
    {
        if (t)
        {
            t = false;
            u = com.pandora.android.view.HeaderLayout.a.d;
            return u;
        }
        if (webview.canGoBack())
        {
            webview = com.pandora.android.view.HeaderLayout.a.b;
        } else
        {
            webview = com.pandora.android.view.HeaderLayout.a.d;
        }
        u = webview;
        return u;
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new a(basefragmentactivity, this, webview);
    }

    public void d(String s1)
    {
        t = true;
        n = s1;
        b(n, true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        s = new aw.a(this);
        p.ca.aw.a(s);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        try
        {
            b.a.C().a(s);
        }
        catch (Exception exception)
        {
            p.df.a.c("TabletActivityFeedFragment", "exception during onDestroy ", exception);
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        p.ca.aw.a(this, bundle);
    }

    public boolean w()
    {
        if (u != null)
        {
            return u == com.pandora.android.view.HeaderLayout.a.b;
        } else
        {
            return super.w();
        }
    }
}
