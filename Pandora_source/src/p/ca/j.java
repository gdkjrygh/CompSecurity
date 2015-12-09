// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.AddCommentLayout;
import com.pandora.android.util.h;
import com.pandora.android.util.s;
import com.pandora.radio.data.af;
import java.util.HashMap;
import org.json.JSONObject;
import p.cb.f;
import p.cp.d;
import p.cw.c;
import p.df.a;
import p.dg.i;

// Referenced classes of package p.ca:
//            ac, x, y, au, 
//            aw, s, a, r, 
//            q

public class j extends ac
    implements com.pandora.android.util.AddCommentLayout.a, x
{
    public class a extends ac.c
    {

        protected j b;
        final j c;

        protected HashMap a(String s1)
        {
label0:
            {
                if (b.g())
                {
                    if (com.pandora.android.data.n.a.h.name().equals(s1))
                    {
                        s1 = p.ca.s.a(true);
                    } else
                    if (com.pandora.android.data.n.a.c.name().equals(s1))
                    {
                        s1 = new f();
                    } else
                    {
                        s1 = null;
                    }
                    if (s1 != null)
                    {
                        if (!(b instanceof p.ca.a))
                        {
                            break label0;
                        }
                        android.support.v4.app.Fragment fragment = b.getParentFragment();
                        if (fragment instanceof r)
                        {
                            ((r)fragment).a(s1);
                        }
                    }
                }
                return null;
            }
            b.d.a(s1);
            return null;
        }

        protected void a(String s1, String s2, String s3)
        {
            if (com.pandora.android.util.s.a(s1))
            {
                return;
            } else
            {
                p.ca.j.a(c, s1, s2, s3);
                return;
            }
        }

        protected void a(String s1, String s2, String s3, String s4, String s5)
        {
            char c1;
            if (s2.equalsIgnoreCase("editProfile"))
            {
                c1 = '\u051E';
            } else
            if (s2.equalsIgnoreCase("editStation"))
            {
                c1 = '\u07C2';
            } else
            {
                throw new IllegalArgumentException("openModelPage unexpected 'type' parameter");
            }
            s2 = (new StringBuilder()).append(s1);
            if (s1.contains("?"))
            {
                s1 = "&pat=";
            } else
            {
                s1 = "?pat=";
            }
            s1 = s2.append(s1).append(com.pandora.android.util.s.b(b.a.d().b())).toString();
            if (com.pandora.android.util.s.u())
            {
                TabletHome.a(c.getActivity(), s1, true, null, c1, s5, s3);
                return;
            } else
            {
                s1 = p.ca.q.a(s1, true, null, p.ca.q.a, c1, s5, s3);
                b.d.a(s1);
                return;
            }
        }

        protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
        {
            p.ca.j.a(b, s1, s3, s4, s5, s6);
        }

        protected void a(JSONObject jsonobject)
        {
            super.a(jsonobject);
            jsonobject = jsonobject.optString("category");
            if (com.pandora.android.util.s.a(jsonobject))
            {
                return;
            }
            c.e = "social".equalsIgnoreCase(jsonobject);
            if (c.getActivity() instanceof BaseAdFragmentActivity)
            {
                ((BaseAdFragmentActivity)c.getActivity()).d(false);
            }
            g();
        }

        protected boolean a()
        {
            return true;
        }

        protected void b()
        {
            FragmentActivity fragmentactivity = b.getActivity();
            if (!com.pandora.android.util.s.u())
            {
                c.d.b();
                com.pandora.android.util.s.a(fragmentactivity, fragmentactivity.getString(0x7f0800ba));
            }
        }

        protected void g()
        {
            if (!((KeyguardManager)m().getSystemService("keyguard")).inKeyguardRestrictedInputMode() && (b.getActivity() instanceof BaseAdFragmentActivity))
            {
                String s1 = com.pandora.android.ads.c.e(c.l_());
                ((BaseAdFragmentActivity)b.getActivity()).a(s1, true);
            }
        }

        protected void h()
        {
            p.bx.d.a().a(null, b.getActivity());
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            c.d.d();
            if (!b.g() && !com.pandora.android.util.s.u()) goto _L2; else goto _L1
_L1:
            if (b.c)
            {
                b.C();
                b.c = false;
            }
            if (!p.ca.j.a(b).b()) goto _L4; else goto _L3
_L3:
            if (!webview.canGoBack()) goto _L6; else goto _L5
_L5:
            p.ca.j.a(b).b(false);
_L4:
            com.pandora.android.util.af.a().a(c.v());
_L2:
            return;
_L6:
            p.ca.j.a(b).b(true);
            if (b.getActivity() instanceof BaseAdFragmentActivity)
            {
                ((BaseAdFragmentActivity)b.getActivity()).H();
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

        public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
        {
            super.onPageStarted(webview, s1, bitmap);
            b.a.b().f().b();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s1)
        {
            c.g.c();
            return super.shouldOverrideUrlLoading(webview, s1);
        }

        public a(BaseFragmentActivity basefragmentactivity, j j2, WebView webview)
        {
            c = j.this;
            super(j.this, basefragmentactivity, j.this.q, webview);
            b = j2;
        }
    }


    private boolean a;
    protected String b;
    protected boolean c;
    protected y d;
    public boolean e;
    protected boolean f;
    protected AddCommentLayout g;
    protected ac.a h;
    private Handler s;
    private h t;
    private a u;

    public j()
    {
        h = new ac.a() {

            final j a;

            public void a(String s1)
            {
                a.b = s1;
                a.d.c();
                boolean flag = com.pandora.android.activity.a.a(s1);
                a.a(flag);
            }

            
            {
                a = j.this;
                super();
            }
        };
        d = new y();
        s = new Handler();
    }

    protected static Bundle a(String s1, boolean flag)
    {
        String s2 = null;
        if (!flag)
        {
            s2 = p.cp.b.a(s1, b.a.d().j());
            p.df.a.a("BackstageWebFragment", (new StringBuilder()).append("PandoraUrlsUtil makeWebViewArgsCommon --> ").append(s2).toString());
        }
        p.df.a.a("BackstageWebFragment", (new StringBuilder()).append("page:").append(s1).append(" url:").append(s2).toString());
        return a(s2, true, -1, true);
    }

    public static Bundle a(String s1, boolean flag, int k, boolean flag1)
    {
        Bundle bundle = new Bundle(3);
        bundle.putString("intent_uri", s1);
        bundle.putBoolean("intent_disable_webview_cache", flag);
        bundle.putInt("intent_color", k);
        bundle.putBoolean("intent_can_show_ad", flag1);
        return bundle;
    }

    static h a(j j1)
    {
        return j1.t;
    }

    public static j a(String s1, boolean flag, int k, boolean flag1, boolean flag2)
    {
        s1 = b(s1, flag, k, flag1, flag2);
        j j1 = new j();
        j1.setArguments(s1);
        return j1;
    }

    private void a(String s1, String s2, String s3)
    {
        g.setCommentButtonListener(this);
        g.a(s1, s2, s3);
    }

    private void a(String s1, String s2, String s3, String s4, String s5)
    {
        p.df.a.a("BackstageWebFragment", (new StringBuilder()).append("BackstageTabWebFragment.openBackstage url:").append(s1).append(" title:").append(s2).append(" type:").append(s4).toString());
        b = s2;
        d.c();
        b(p.cp.b.a(s1), true);
        a = false;
    }

    static void a(j j1, String s1, String s2, String s3)
    {
        j1.a(s1, s2, s3);
    }

    static void a(j j1, String s1, String s2, String s3, String s4, String s5)
    {
        j1.a(s1, s2, s3, s4, s5);
    }

    public static Bundle b(String s1, boolean flag, int k, boolean flag1, boolean flag2)
    {
        s1 = a(s1, flag, k, flag1);
        s1.putBoolean("suppressAdsTemporarily", flag2);
        return s1;
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        u = new a(basefragmentactivity, this, webview);
        return u;
    }

    protected d a(boolean flag, int k, boolean flag1)
    {
        a(h);
        return super.a(flag, k, flag1);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            t = new h(bundle.getBoolean("intent_can_show_ad", true), bundle.getBoolean("suppressAdsTemporarily", false));
        }
    }

    protected void a(Runnable runnable, long l)
    {
        s.postDelayed(runnable, l);
    }

    public void a(String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("text", com.pandora.android.util.s.d(s1));
        l.a(B(), s2, hashmap);
    }

    public void a(boolean flag)
    {
        com.pandora.android.activity.a.a(flag, g);
    }

    public void a(boolean flag, boolean flag1)
    {
        f = flag;
        if (flag)
        {
            com.pandora.android.util.af.a().a(v());
        }
        com.pandora.android.view.PandoraWebView pandorawebview = B();
        if (pandorawebview != null && !flag)
        {
            if (p() && !a)
            {
                pandorawebview.stopLoading();
                a = true;
            }
            pandorawebview.destroyDrawingCache();
        }
    }

    public boolean a()
    {
        if (t == null)
        {
            return false;
        } else
        {
            return t.a();
        }
    }

    protected boolean a(WebView webview, Bundle bundle)
    {
        if ((this instanceof au) && webview != null)
        {
            p.ca.aw.a((au)this, webview, bundle);
            webview = webview.copyBackForwardList();
            return webview != null && webview.getSize() > 0;
        } else
        {
            return super.a(webview, bundle);
        }
    }

    public void b(Bundle bundle)
    {
        a(bundle);
        c = true;
        t();
        a = false;
    }

    public void b(boolean flag)
    {
        if (!flag)
        {
            s();
        }
        g.c();
    }

    public boolean c()
    {
        g.c();
        if (w())
        {
            if (t.b())
            {
                t.b(true);
            }
            if (u != null)
            {
                u.s();
            }
            return u();
        } else
        {
            return false;
        }
    }

    public CharSequence d()
    {
        return f();
    }

    public String f()
    {
        return b;
    }

    protected boolean g()
    {
        while (com.pandora.android.util.a.a(p.dj.b.a.i) || d.e() == this) 
        {
            return true;
        }
        return false;
    }

    public void h()
    {
        g.c();
    }

    public boolean i()
    {
        return w();
    }

    public int l_()
    {
        if (e)
        {
            return 5;
        } else
        {
            return HomeTabsActivity.r();
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d.a(activity);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (f)
        {
            com.pandora.android.util.af.a().a(v());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = super.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater = layoutinflater.inflate(0x7f04002b, viewgroup, false);
        ((FrameLayout)layoutinflater.findViewById(0x7f1000e5)).addView(bundle);
        g = (AddCommentLayout)layoutinflater.findViewById(0x7f1000e8);
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        d.a();
    }

    public void onHiddenChanged(boolean flag)
    {
        super.onHiddenChanged(flag);
        if (!flag)
        {
            b(((Bundle) (null)));
        }
    }

    public void onPause()
    {
        super.onPause();
        g.c();
    }

    public void onStop()
    {
        b.a.b().f().b();
        com.pandora.android.view.PandoraWebView pandorawebview = B();
        if (pandorawebview != null)
        {
            pandorawebview.destroyDrawingCache();
        }
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        g.setForceKeyboard(true);
        g.setHideOnClick(true);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.aa;
    }
}
