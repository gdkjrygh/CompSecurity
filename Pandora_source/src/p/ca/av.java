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
import java.util.HashMap;
import p.cp.d;
import p.df.a;

// Referenced classes of package p.ca:
//            ad, au, aw

public class av extends ad
    implements au
{
    public class a extends j.a
    {

        final av a;

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

        public a(BaseFragmentActivity basefragmentactivity, av av2, WebView webview)
        {
            a = av.this;
            super(av.this, basefragmentactivity, av2, webview);
        }
    }


    private BroadcastReceiver s;

    public av()
    {
        s = null;
    }

    public static av c(Bundle bundle)
    {
        av av1 = new av();
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = a.a(false);
        }
        av1.setArguments(bundle1);
        return av1;
    }

    public com.pandora.android.tablet.TabletHome.e E()
    {
        return com.pandora.android.tablet.TabletHome.e.b;
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
        return new a(basefragmentactivity, this, webview);
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
            p.df.a.c("TabletProfileFragment", (new StringBuilder()).append("exception during onDestroy- ").append(exception.getMessage()).toString());
        }
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        p.ca.aw.a(this, bundle);
        super.onSaveInstanceState(bundle);
    }
}
