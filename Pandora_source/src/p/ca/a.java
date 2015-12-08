// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Application;
import android.os.Bundle;
import android.webkit.WebView;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.f;
import com.pandora.android.provider.b;
import com.pandora.android.util.af;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import java.lang.ref.WeakReference;
import p.cp.d;

// Referenced classes of package p.ca:
//            j, y, r

public class p.ca.a extends j
{
    public class a extends j.a
    {

        final p.ca.a a;
        private final WeakReference e;

        protected void a(String s1, String s2, String s3, String s4, String s5, String s6)
        {
            super.a(s1, s2, s3, s4, s5, s6);
            s1 = a.getParentFragment();
            if (s1 instanceof r)
            {
                ((r)s1).a(false);
            }
        }

        public void doUpdateVisitedHistory(WebView webview, String s1, boolean flag)
        {
            p.ca.a a1 = (p.ca.a)e.get();
            if (a1 != null && !a1.n.equals(s1))
            {
                a1.d.b(com.pandora.android.data.a.i.b);
            }
            super.doUpdateVisitedHistory(webview, s1, flag);
        }

        protected void g()
        {
            if (b.g())
            {
                b.a(new Runnable(this) {

                    final a a;

                    public void run()
                    {
                        if (a.b.getActivity() instanceof BaseAdFragmentActivity)
                        {
                            ((BaseAdFragmentActivity)a.b.getActivity()).a("tabs_backstage_load", true);
                        }
                    }

            
            {
                a = a1;
                super();
            }
                }, 1000L);
            }
        }

        public void onPageFinished(WebView webview, String s1)
        {
            super.onPageFinished(webview, s1);
            webview = (p.ca.a)e.get();
            if (webview != null)
            {
                boolean flag = webview.g();
                if (!flag || webview.w())
                {
                    ((p.ca.a) (webview)).d.b(com.pandora.android.data.a.i.b);
                    return;
                }
                if (flag)
                {
                    s1 = a.getParentFragment();
                    if ((s1 instanceof r) && ((r)s1).f())
                    {
                        ((p.ca.a) (webview)).d.a(com.pandora.android.data.a.i.b);
                        return;
                    } else
                    {
                        ((p.ca.a) (webview)).d.b(com.pandora.android.data.a.i.b);
                        return;
                    }
                }
            }
        }

        public a(BaseFragmentActivity basefragmentactivity, p.ca.a a2, WebView webview)
        {
            a = p.ca.a.this;
            super(p.ca.a.this, basefragmentactivity, a2, webview);
            e = new WeakReference(a2);
        }
    }


    protected static final com.pandora.android.activity.f.a a = new com.pandora.android.activity.f.a() {

        public Bundle a(boolean flag)
        {
            return j.a("newsfeed", flag);
        }

    };

    public p.ca.a()
    {
    }

    public static f j_()
    {
        return new f("following", b.a.h().getString(0x7f08026f), p/ca/a, a, null);
    }

    protected d a(BaseFragmentActivity basefragmentactivity, WebView webview)
    {
        return new a(basefragmentactivity, this, webview);
    }

    public void a(boolean flag, boolean flag1)
    {
        super.a(flag, flag1);
        if (flag)
        {
            b(null);
            return;
        } else
        {
            d.b(com.pandora.android.data.a.i.b);
            return;
        }
    }

    public boolean c()
    {
        boolean flag = super.c();
        if (!w())
        {
            android.support.v4.app.Fragment fragment = getParentFragment();
            if (fragment instanceof r)
            {
                ((r)fragment).a(true);
            }
        }
        return flag;
    }

    public CharSequence d()
    {
        return f();
    }

    public String f()
    {
        if (w())
        {
            return super.f();
        } else
        {
            return getString(0x7f08026e);
        }
    }

    protected boolean g()
    {
        x x;
        if (!com.pandora.android.util.a.a(p.dj.b.a.i))
        {
            if ((x = d.e()) != this && x != getParentFragment())
            {
                return false;
            }
        }
        return true;
    }

    public com.pandora.android.util.af.c v()
    {
        if (!s.a(b))
        {
            if (b.equalsIgnoreCase("station details"))
            {
                return af.a(p.j, "station");
            } else
            {
                return af.a(p.j, b);
            }
        } else
        {
            return com.pandora.android.util.af.c.aa;
        }
    }

}
