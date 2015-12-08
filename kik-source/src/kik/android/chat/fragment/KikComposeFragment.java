// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kik.g.p;
import com.kik.sdkutils.d;
import kik.a.d.a.a;
import kik.a.d.k;
import kik.a.e.r;
import kik.android.f.a.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment, ja, jd, jb, 
//            jc

public class KikComposeFragment extends KikDefaultContactsListFragment
{
    public static final class a extends KikContactsListFragment.a
    {

        static boolean a(a a1)
        {
            return a1.f("isShare").booleanValue();
        }

        static boolean b(a a1)
        {
            return a1.f("isShare").booleanValue();
        }

        public final a a()
        {
            a("isShare", true);
            return this;
        }

        public a()
        {
        }
    }


    private boolean U;
    private boolean V;
    private View W;
    private kik.a.d.a.a X;
    private long Y;
    private String Z;
    private boolean a;
    private final a aa = new a();

    public KikComposeFragment()
    {
        a = false;
        U = false;
        V = false;
    }

    static void a(KikComposeFragment kikcomposefragment, Bundle bundle)
    {
        kikcomposefragment.c(bundle);
    }

    private void c(Bundle bundle)
    {
        if (bundle != null)
        {
            c(bundle.getString("chatContactJID"));
        }
    }

    protected final int K()
    {
        return !a ? 0x7f09029d : 0x7f09030a;
    }

    protected final String a()
    {
        return null;
    }

    protected final void a(k k1)
    {
label0:
        {
            if (k1 != null)
            {
                if (!k1.m() && k1.p())
                {
                    break label0;
                }
                byte byte0 = 1;
                if (a)
                {
                    byte0 = 2;
                }
                a(k1, byte0).a(new ja(this));
            }
            return;
        }
        c(k1.b());
    }

    protected final void a_(String s, String s1)
    {
        c(s);
    }

    protected final void b(Bundle bundle)
    {
        if (bundle != null)
        {
            L = bundle.getBoolean("find", false);
        }
    }

    protected final void b(k k1)
    {
        H.b(k1.a()).a(com.kik.sdkutils.d.a(getView(), new jd(this)));
    }

    protected final String c()
    {
        return getString(0x7f090106);
    }

    protected final boolean d()
    {
        return false;
    }

    protected final void e()
    {
        super.e();
        if (a)
        {
            KikAddContactFragment.b b1 = new KikAddContactFragment.b();
            b1.b(2).a(T()).a(aa.h());
            a(b1).a(new jb(this));
            return;
        } else
        {
            KikAddContactFragment.b b2 = new KikAddContactFragment.b();
            b2.a(T()).a(aa.h());
            b2.a();
            S();
            a(b2).a(new jc(this));
            return;
        }
    }

    protected final String f()
    {
        if (!a)
        {
            return getString(0x7f0902ab);
        } else
        {
            return null;
        }
    }

    protected final boolean g()
    {
        return a;
    }

    protected final boolean i()
    {
        return true;
    }

    protected final boolean j()
    {
        return false;
    }

    protected final boolean n()
    {
        return !a && !U;
    }

    protected final boolean o()
    {
        return !a && !U;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        if (l == 1559 && i1 == -1 && intent.hasExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"))
        {
            c(intent.getBundleExtra("SimpleFragmentWrapperActivity.EXTRA_FRAGMENT_RESULT"));
            return;
        } else
        {
            S();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aa.a(getArguments());
        a = kik.android.chat.fragment.a.a(aa);
        U = a.b(aa);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        W = super.onCreateView(layoutinflater, viewgroup, bundle);
        b(getArguments());
        X = kik.android.f.a.f.a().e();
        Y = kik.android.f.a.f.a().g();
        Z = kik.android.f.a.f.a().h();
        return W;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (U && !V)
        {
            kik.android.f.a.f.a().a(X, Y);
            kik.android.f.a.f.a().c(Z);
        }
    }

    public final boolean v()
    {
        V = true;
        return super.v();
    }
}
