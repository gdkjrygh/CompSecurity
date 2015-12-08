// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.ads.c;
import com.pandora.android.provider.b;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.s;
import org.json.JSONObject;
import p.cp.d;
import p.df.a;

// Referenced classes of package p.ca:
//            s, y

public class d extends d
{

    final p.ca.s a;
    private p.ca.s b;

    protected void a(JSONObject jsonobject)
    {
        boolean flag;
        flag = true;
        super.a(jsonobject);
        String s1;
        p.ca.s s2;
        s1 = jsonobject.optString("numFollowed");
        if (s.a(s1))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        s2 = a;
        if (Integer.parseInt(s1) <= 0)
        {
            flag = false;
        }
        s.g(s2, flag);
        a.i.d();
        s.n(a);
_L7:
        Exception exception;
        try
        {
            s1 = jsonobject.optString("hasResults");
            if (!s.a(s1) && !Boolean.valueOf(Boolean.parseBoolean(s1)).booleanValue())
            {
                s1 = String.format("'%s'", new Object[] {
                    s.i(a).getSearchText()
                });
                p.ca.s.a(a, false, s1);
            }
        }
        catch (Exception exception1)
        {
            p.df.a.c("FindPeopleFragment", "hasResults", exception1);
        }
        s1 = jsonobject.optString("showLoadingIndicator");
        if (s.a(s1)) goto _L2; else goto _L1
_L1:
        if (!Boolean.valueOf(Boolean.parseBoolean(s1)).booleanValue()) goto _L4; else goto _L3
_L3:
        s.j();
_L2:
        jsonobject = jsonobject.optString("category");
        if (s.a(jsonobject))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
        exception;
        p.df.a.c("FindPeopleFragment", "numFollowed", exception);
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            s.k();
        }
        catch (Exception exception2)
        {
            p.df.a.c("FindPeopleFragment", "showLoadingIndicator", exception2);
        }
        if (true) goto _L2; else goto _L5
_L5:
        a.a = "social".equalsIgnoreCase(jsonobject);
        if (a.getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)a.getActivity()).d(false);
        }
        g();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean a()
    {
        return true;
    }

    protected void g()
    {
        if (!((KeyguardManager)m().getSystemService("keyguard")).inKeyguardRestrictedInputMode() && (b.getActivity() instanceof BaseAdFragmentActivity))
        {
            String s1 = c.e(a.l_());
            ((BaseAdFragmentActivity)b.getActivity()).a(s1, true);
        }
    }

    public void onPageFinished(WebView webview, String s1)
    {
        super.onPageFinished(webview, s1);
        if (s.u())
        {
            s1 = (new p.bz.<init>()).a(com.pandora.android.view.erLayout.d.c);
            if (!s.j(a))
            {
                webview = com.pandora.android.view.erLayout.a.a;
            } else
            {
                webview = com.pandora.android.view.erLayout.a.b;
            }
            webview = s1.a(webview).a(com.pandora.android.view.erLayout.b.c).b(com.pandora.android.view.erLayout.a.e).a(a.e()).a();
            b.a.e().a(webview);
        }
        if (!p.ca.s.c(a))
        {
            p.ca.s.d(a);
        }
        if (s.k(a))
        {
            p.ca.s.d(a, false);
            s.l(a);
            s.e(a);
        }
        if (s.m(a))
        {
            s.i(a).b();
        }
        s.f(a, true);
    }

    public ebkit.WebView(p.ca.s s1, Activity activity, p.ca.s s2, boolean flag, WebView webview)
    {
        a = s1;
        super(activity, webview);
        b = s2;
        d(flag);
    }
}
