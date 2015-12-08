// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.j;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.Response;
import com.facebook.model.GraphUser;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.ads.c;
import com.pandora.android.data.d;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.p;
import com.pandora.radio.data.af;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package p.ca:
//            l, y

public class s extends l
{
    public class a extends p.cp.d
    {

        final s a;
        private s b;

        protected void a(JSONObject jsonobject)
        {
            boolean flag;
            flag = true;
            super.a(jsonobject);
            String s1;
            s s2;
            s1 = jsonobject.optString("numFollowed");
            if (com.pandora.android.util.s.a(s1))
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
                if (!com.pandora.android.util.s.a(s1) && !Boolean.valueOf(Boolean.parseBoolean(s1)).booleanValue())
                {
                    s1 = String.format("'%s'", new Object[] {
                        s.i(a).getSearchText()
                    });
                    s.a(a, false, s1);
                }
            }
            catch (Exception exception1)
            {
                p.df.a.c("FindPeopleFragment", "hasResults", exception1);
            }
            s1 = jsonobject.optString("showLoadingIndicator");
            if (com.pandora.android.util.s.a(s1)) goto _L2; else goto _L1
_L1:
            if (!Boolean.valueOf(Boolean.parseBoolean(s1)).booleanValue()) goto _L4; else goto _L3
_L3:
            com.pandora.android.util.s.j();
_L2:
            jsonobject = jsonobject.optString("category");
            if (com.pandora.android.util.s.a(jsonobject))
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
                com.pandora.android.util.s.k();
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
                String s1 = com.pandora.android.ads.c.e(a.l_());
                ((BaseAdFragmentActivity)b.getActivity()).a(s1, true);
            }
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            if (com.pandora.android.util.s.u())
            {
                s1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c);
                if (!p.ca.s.j(a))
                {
                    webview = com.pandora.android.view.HeaderLayout.a.a;
                } else
                {
                    webview = com.pandora.android.view.HeaderLayout.a.b;
                }
                webview = s1.a(webview).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(a.e()).a();
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

        public a(Activity activity, s s2, boolean flag, WebView webview)
        {
            a = s.this;
            super(activity, webview);
            b = s2;
            d(flag);
        }
    }


    private com.pandora.android.util.SearchBox.a A;
    public boolean a;
    Runnable b;
    private View c;
    private boolean d;
    private boolean e;
    private SearchBox f;
    private View g;
    private View h;
    private View j;
    private WebView k;
    private a l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private TextView q;
    private View r;
    private boolean s;
    private boolean t;
    private boolean u;
    private Handler v;
    private boolean w;
    private p.bx.b.b x;
    private android.view.View.OnClickListener y;
    private TextWatcher z;

    public s()
    {
        e = false;
        t = true;
        w = false;
        x = new p.bx.b.b() {

            final s a;

            private void a(boolean flag)
            {
                s.a(a, flag);
                if (flag && p.ca.s.b(a))
                {
                    if (!p.ca.s.c(a))
                    {
                        p.ca.s.d(a);
                    } else
                    {
                        s.e(a);
                    }
                }
                s.a(a, a.b);
                p.ca.s.b(a, false);
            }

            public void a()
            {
                a(true);
            }

            public void b()
            {
                a(false);
            }

            public void c()
            {
                a(false);
            }

            
            {
                a = s.this;
                super();
            }
        };
        b = new Runnable() {

            final s a;

            public void run()
            {
                s.f(a);
            }

            
            {
                a = s.this;
                super();
            }
        };
        y = new android.view.View.OnClickListener() {

            final s a;

            public void onClick(View view)
            {
                p.bx.d.a().a(s.g(a), a.getActivity());
            }

            
            {
                a = s.this;
                super();
            }
        };
        A = new com.pandora.android.util.SearchBox.a() {

            final s a;

            public void a(String s1)
            {
                if (!s.h(a))
                {
                    p.ca.s.c(a, true);
                } else
                {
                    s.a(a, s1);
                    if (!com.pandora.android.util.s.a(s1))
                    {
                        s.i(a).d();
                        return;
                    }
                }
            }

            
            {
                a = s.this;
                super();
            }
        };
    }

    static View a(s s1)
    {
        return s1.c;
    }

    public static s a(boolean flag)
    {
        s s1 = new s();
        Bundle bundle = new Bundle();
        bundle.putBoolean("intent_find_people_show_empty_state", flag);
        s1.setArguments(bundle);
        return s1;
    }

    private void a(Bundle bundle)
    {
        if (com.pandora.android.util.s.u() && bundle != null)
        {
            boolean flag = bundle.getBoolean("findpeople.show_empty_state", false);
            if (flag)
            {
                d = flag;
            }
        }
    }

    private void a(Runnable runnable)
    {
        if (v != null)
        {
            v.post(runnable);
        }
    }

    static void a(s s1, Runnable runnable)
    {
        s1.a(runnable);
    }

    static void a(s s1, String s2)
    {
        s1.c(s2);
    }

    static void a(s s1, boolean flag, String s2)
    {
        s1.a(flag, s2);
    }

    private void a(boolean flag, String s1)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        byte byte0;
        if (r.getVisibility() == 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (flag)
        {
            flag1 = false;
        }
        if (byte0 == flag1)
        {
            return;
        }
        View view = r;
        byte0 = flag2;
        if (flag)
        {
            byte0 = 8;
        }
        view.setVisibility(byte0);
        q.setText(s1);
    }

    static boolean a(s s1, boolean flag)
    {
        s1.u = flag;
        return flag;
    }

    private void b(String s1)
    {
        s1 = String.format("loadFacebookFriends(%s);", new Object[] {
            com.pandora.android.util.s.d(s1)
        });
        l.a(k, s1);
    }

    static void b(s s1, String s2)
    {
        s1.b(s2);
    }

    static boolean b(s s1)
    {
        return s1.t;
    }

    static boolean b(s s1, boolean flag)
    {
        s1.t = flag;
        return flag;
    }

    private void c(String s1)
    {
        s1 = String.format("search(\"%s\");", new Object[] {
            com.pandora.android.util.s.d(s1)
        });
        l.a(k, s1);
    }

    static boolean c(s s1)
    {
        return s1.p;
    }

    static boolean c(s s1, boolean flag)
    {
        s1.m = flag;
        return flag;
    }

    static void d(s s1)
    {
        s1.l();
    }

    static boolean d(s s1, boolean flag)
    {
        s1.s = flag;
        return flag;
    }

    static void e(s s1)
    {
        s1.m();
    }

    static boolean e(s s1, boolean flag)
    {
        s1.d = flag;
        return flag;
    }

    static void f(s s1)
    {
        s1.j();
    }

    static boolean f(s s1, boolean flag)
    {
        s1.o = flag;
        return flag;
    }

    static p.bx.b.b g(s s1)
    {
        return s1.x;
    }

    static boolean g(s s1, boolean flag)
    {
        s1.e = flag;
        return flag;
    }

    private void h()
    {
        String s1;
        if (u)
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        s1 = String.format("setSearchFacebook(\"%s\");", new Object[] {
            s1
        });
        l.a(k, s1);
    }

    static boolean h(s s1)
    {
        return s1.o;
    }

    static SearchBox i(s s1)
    {
        return s1.f;
    }

    private void j()
    {
        byte byte0 = 8;
        if (d)
        {
            h.setVisibility(0);
            j.setVisibility(8);
        } else
        {
            h.setVisibility(8);
            j.setVisibility(0);
            k.setVisibility(0);
            View view = g;
            if (!u)
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
        o();
    }

    static boolean j(s s1)
    {
        return s1.e;
    }

    private void k()
    {
        Object obj = b.a.d();
        if (obj != null)
        {
            obj = String.format("%scontent/mobile/find_people.vm?pat=%s", new Object[] {
                d.g, com.pandora.android.util.s.b(((af) (obj)).b())
            });
            k.loadUrl(((String) (obj)));
        }
    }

    static boolean k(s s1)
    {
        return s1.n;
    }

    private void l()
    {
        if (u && !p)
        {
            h();
            m();
            p = true;
        }
    }

    static void l(s s1)
    {
        s1.h();
    }

    private void m()
    {
        p.bx.b b1 = p.bx.d.a();
        if (!u)
        {
            b1.a(x, getActivity());
        } else
        if (!s)
        {
            b1.a(new com.facebook.Request.GraphUserListCallback() {

                final s a;

                public void onCompleted(List list, Response response)
                {
                    response = response.getError();
                    if (response != null)
                    {
                        p.ca.s.d(a, false);
                        p.df.a.a("FindPeopleFragment", (new StringBuilder()).append("FindPeopleFragment.callback.onComplete() --> Failed to load Facebook Friends : ").append(response.getErrorMessage()).toString());
                        return;
                    }
                    p.df.a.a("FindPeopleFragment", "FindPeopleFragment.callback.onComplete() --> Faebook friends loaded successfully");
                    response = new JSONObject();
                    for (list = list.iterator(); list.hasNext();)
                    {
                        GraphUser graphuser = (GraphUser)list.next();
                        try
                        {
                            response.put(graphuser.getId(), graphuser.getName());
                        }
                        catch (JSONException jsonexception)
                        {
                            p.df.a.a("FindPeopleFragment", "FindPeopleFragment.callback.onComplete() : ", jsonexception);
                        }
                    }

                    list = response.toString();
                    if (!com.pandora.android.util.s.a(list))
                    {
                        p.ca.s.b(a, list);
                        s.e(a, false);
                    }
                    p.ca.s.d(a, true);
                    s.a(a, a.b);
                }

            
            {
                a = s.this;
                super();
            }
            });
            return;
        }
    }

    static boolean m(s s1)
    {
        return s1.m;
    }

    private void n()
    {
        k.clearHistory();
        WebSettings websettings = k.getSettings();
        websettings.setCacheMode(2);
        websettings.setSupportZoom(false);
        websettings.setBuiltInZoomControls(false);
        l = a(getActivity(), this, false, k);
    }

    static void n(s s1)
    {
        s1.o();
    }

    private void o()
    {
        p.bz.i.a a1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.c);
        Object obj;
        if (p())
        {
            obj = com.pandora.android.view.HeaderLayout.a.a;
        } else
        {
            obj = com.pandora.android.view.HeaderLayout.a.b;
        }
        obj = a1.a(((com.pandora.android.view.HeaderLayout.a) (obj))).a(com.pandora.android.view.HeaderLayout.b.c).b(com.pandora.android.view.HeaderLayout.a.e).a(e()).a();
        b.a.e().a(obj);
    }

    static boolean o(s s1)
    {
        return s1.s;
    }

    private boolean p()
    {
        return !e && (!u || s);
    }

    protected a a(Activity activity, s s1, boolean flag, WebView webview)
    {
        return new a(activity, s1, flag, webview);
    }

    public boolean a()
    {
        return !d && !w;
    }

    public void b(boolean flag)
    {
label0:
        {
            if (f != null)
            {
                if (!flag)
                {
                    break label0;
                }
                f.setVisibility(0);
            }
            return;
        }
        f.setVisibility(8);
    }

    public void c(boolean flag)
    {
        w = flag;
        if (getActivity() instanceof BaseAdFragmentActivity)
        {
            ((BaseAdFragmentActivity)getActivity()).H();
        }
    }

    public boolean c()
    {
        if (!com.pandora.android.util.s.u() || p())
        {
            return false;
        } else
        {
            b.a.C().a(TabletHome.a(p.j, null));
            return false;
        }
    }

    public CharSequence d()
    {
        return e();
    }

    public String e()
    {
        if (d)
        {
            return "";
        } else
        {
            return getString(0x7f080198);
        }
    }

    protected void f()
    {
        if (z == null)
        {
            z = new TextWatcher() {

                final s a;

                public void afterTextChanged(Editable editable)
                {
                    if (TextUtils.isEmpty(editable.toString()) && !p.ca.s.j(a) && !s.o(a))
                    {
                        s.e(a, true);
                        s.f(a);
                    }
                }

                public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                    p.ca.s.c(a, false);
                    s.e(a, false);
                    s.f(a);
                }

                public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                    s.a(a, true, "");
                }

            
            {
                a = s.this;
                super();
            }
            };
            f.a(z);
        }
    }

    public boolean g()
    {
        return e;
    }

    public int l_()
    {
        if (a)
        {
            return 5;
        } else
        {
            return super.l_();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getArguments().getBoolean("intent_find_people_show_empty_state");
        a(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        v = new Handler();
        c = layoutinflater.inflate(0x7f040055, viewgroup, false);
        ((Button)c.findViewById(0x7f100173)).setOnClickListener(y);
        f = (SearchBox)c.findViewById(0x7f100170);
        f.a(0x7f080197, A);
        r = c.findViewById(0x7f100178);
        q = (TextView)c.findViewById(0x7f100179);
        g = c.findViewById(0x7f100175);
        h = c.findViewById(0x7f100171);
        j = c.findViewById(0x7f100174);
        k = (WebView)c.findViewById(0x7f10017a);
        n();
        k();
        c.findViewById(0x7f100176).setOnClickListener(y);
        layoutinflater = p.bx.d.a();
        layoutinflater.a(x);
        u = layoutinflater.c();
        boolean flag;
        if (u && t)
        {
            if (!p)
            {
                l();
            } else
            {
                m();
            }
        }
        if (u && p)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n = flag;
        j();
        c.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final s a;

            public void onGlobalLayout()
            {
                if (s.a(a).getRootView().getHeight() - s.a(a).getHeight() > s.a(a).getHeight() / 3)
                {
                    a.c(true);
                    return;
                } else
                {
                    a.c(false);
                    return;
                }
            }

            
            {
                a = s.this;
                super();
            }
        });
        return c;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        p.bx.d.a().b(x);
        f.b(z);
        f.setSearchListener(null);
        v.removeCallbacksAndMessages(null);
        v = null;
    }

    public void onPause()
    {
        super.onPause();
        if (f != null)
        {
            f.d();
        }
    }

    public void onResume()
    {
        super.onResume();
        f();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("findpeople.show_empty_state", d);
        super.onSaveInstanceState(bundle);
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.j;
    }
}
