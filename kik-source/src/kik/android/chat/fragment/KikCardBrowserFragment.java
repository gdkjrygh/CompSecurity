// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.kik.android.a;
import com.kik.cards.KikCardsWebViewFragment;
import com.kik.cards.util.b;
import com.kik.cards.web.aq;
import com.kik.cards.web.bd;
import com.kik.cards.web.bf;
import com.kik.cards.web.kik.KikMessageParcelable;
import com.kik.g.f;
import com.kik.g.i;
import kik.android.chat.activity.k;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            bk, bl, bm, bn, 
//            KikChatFragment, bp, bo, ProgressDialogFragment

public class KikCardBrowserFragment extends KikCardsWebViewFragment
{
    public static final class a extends com.kik.cards.web.CardsWebViewFragment.a
    {

        public a()
        {
        }
    }


    private static final org.c.b B = c.a("KikCardBrowserFragment");
    static Message y = null;
    private KikMessageParcelable A;
    private a C;
    private boolean D;
    private ProgressDialogFragment E;
    private i F;
    private i G;
    private i H;
    private i I;
    protected com.kik.android.a x;
    private f z;

    public KikCardBrowserFragment()
    {
        z = new f();
        C = new a();
        F = new bk(this);
        G = new bl(this);
        H = new bm(this);
        I = new bn(this);
    }

    static ProgressDialogFragment a(KikCardBrowserFragment kikcardbrowserfragment, ProgressDialogFragment progressdialogfragment)
    {
        kikcardbrowserfragment.E = progressdialogfragment;
        return progressdialogfragment;
    }

    static void a(KikCardBrowserFragment kikcardbrowserfragment)
    {
        kikcardbrowserfragment.s();
    }

    static ProgressDialogFragment b(KikCardBrowserFragment kikcardbrowserfragment)
    {
        return kikcardbrowserfragment.E;
    }

    public final boolean B()
    {
        return true;
    }

    protected final void L()
    {
        J();
        a(((org.json.JSONObject) (null)));
        if (kik.android.chat.fragment.KikChatFragment.b())
        {
            kik.android.chat.fragment.KikChatFragment.c();
            com.kik.android.a.f f1 = x.b("Media Tray Card Closed").a("Index", KikChatFragment.d());
            boolean flag;
            if (getResources().getConfiguration().orientation == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1.a("Is Landscape", flag).a("Card URL", kik.android.chat.fragment.KikChatFragment.f()).a("Reason", "Closed").b();
        }
    }

    public final void Q()
    {
        b(new bp(this));
    }

    public final void a(boolean flag)
    {
        if (e())
        {
            j().postInvalidate();
        }
        super.a(flag);
    }

    protected final void e(String s)
    {
        x.b("Browser Screen Opened").a("Reason", "Navigation").a("URL", s).a("Domain", bf.i(s)).a("Depth", k.e()).b();
        a((new a()).a(s).b(com.kik.cards.util.b.b(s)).c(g()));
    }

    public final void f(String s)
    {
        b(new bo(this, s));
    }

    public void onCreate(Bundle bundle)
    {
        C.a(getArguments());
        V().a(this);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        bundle = (RelativeLayout)View.inflate(getActivity(), 0x7f030021, null);
        if (layoutinflater != null && layoutinflater.getParent() != null && (layoutinflater.getParent() instanceof ViewGroup))
        {
            ((ViewGroup)layoutinflater.getParent()).removeView(layoutinflater);
        }
        bundle.addView(layoutinflater, 0);
        layoutinflater = getArguments();
        if (layoutinflater != null)
        {
            A = (KikMessageParcelable)layoutinflater.getParcelable("CardLauncher.EXTRA_KIK_MESSAGE");
        }
        layoutinflater = getArguments();
        if (layoutinflater != null)
        {
            viewgroup = layoutinflater.getString("CardsWebViewFragment.EXTRA_URL_KEY");
            if (viewgroup != null && viewgroup != null)
            {
                if (viewgroup.startsWith("card:"))
                {
                    layoutinflater = (new StringBuilder("http:")).append(viewgroup.substring(5)).toString();
                } else
                {
                    layoutinflater = viewgroup;
                    if (viewgroup.startsWith("cards:"))
                    {
                        layoutinflater = (new StringBuilder("https:")).append(viewgroup.substring(6)).toString();
                    }
                }
                if (!layoutinflater.startsWith("http://") && !layoutinflater.startsWith("https://") && layoutinflater.indexOf(":") != 0)
                {
                    layoutinflater = new Intent("android.intent.action.VIEW", Uri.parse(layoutinflater));
                    try
                    {
                        startActivity(layoutinflater);
                    }
                    // Misplaced declaration of an exception variable
                    catch (LayoutInflater layoutinflater) { }
                }
            }
        }
        z.a();
        z.a(l(), F);
        z.a(m(), G);
        z.a(j().t(), H);
        z.a(j().u(), I);
        if (A != null)
        {
            a(A);
            A = null;
        }
        layoutinflater = y;
        y = null;
        if (layoutinflater != null)
        {
            ((android.webkit.WebView.WebViewTransport)((Message) (layoutinflater)).obj).setWebView(j());
            layoutinflater.sendToTarget();
        }
        return bundle;
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDestroyView()
    {
        z.a();
        super.onDestroyView();
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (D)
        {
            E.show(getFragmentManager(), "Loading Spinner");
            D = false;
        }
    }

    public final boolean v()
    {
        k();
        return true;
    }

    protected final volatile com.kik.cards.web.CardsWebViewFragment.a x()
    {
        return C;
    }

}
