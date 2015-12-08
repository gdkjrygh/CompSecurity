// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.moviemaker.ui.ActionBarShadow;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public class byh
    implements bsi
{

    private static final msm A;
    private static final msm B;
    private static final String x = byh.getSimpleName();
    private static final bsj y = (bsj)ddz.a(bsj);
    private static final msm z;
    private final bsa C;
    private final byu D;
    private final noj E;
    private final mmr F;
    private Rect G;
    private cnq H;
    private RectF I;
    private crx J;
    private Executor K;
    public final Context a;
    public final byf b;
    public bsj c;
    public ViewGroup d;
    public daw e;
    public LinearLayout f;
    public ImageButton g;
    public ImageButton h;
    public ImageButton i;
    public ImageButton j;
    public ImageButton k;
    public das l;
    public ViewGroup m;
    public ActionBarShadow n;
    public int o;
    public mml p;
    public del q;
    public final den r = new byi(this);
    public final dcr s = new bym(this);
    public final dcp t = new byn(this);
    public final dcm u = new byo(this);
    public dcf v;
    public dck w;

    public byh(Context context, ViewGroup viewgroup, bsa bsa1, byf byf1, byu byu1)
    {
        c = y;
        o = -1;
        v = new byp(this);
        w = new byq(this);
        a = context;
        m = viewgroup;
        C = bsa1;
        b = byf1;
        D = byu1;
        E = (noj)olm.a(context, noj);
        F = (mmr)olm.a(context, mmr);
    }

    static das a(byh byh1)
    {
        return byh1.l;
    }

    static void a(View view, boolean flag)
    {
        view.setTag(b.fP, Boolean.valueOf(flag));
    }

    static void a(byh byh1, int i1)
    {
        das das1;
        das1 = byh1.l;
        b.a(i1, "position", 0, das1.getCount() - 1);
        boolean flag;
        if (das1.a(i1) && ((cnq)das1.a.get(das1.c(i1))).d == cnt.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !ddy.i.a())
        {
            byh1.i.setVisibility(8);
        } else
        {
            byh1.i.setVisibility(0);
        }
        das1 = byh1.l;
        if (!das1.a(i1) && !das1.b(i1))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        b.a(i1, "position", 0, das1.getCount() - 1);
        if (das.d(das1.getItemId(i1))) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L5:
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        i1 = 1;
_L7:
        int j1;
        if (i1 != 0)
        {
            byh1.j.setEnabled(true);
            return;
        } else
        {
            byh1.j.setEnabled(false);
            return;
        }
_L2:
        if (das1.a.size() == 1)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        j1 = das1.c(i1);
        i1 = 0;
_L6:
        if (i1 >= das1.a.size()) goto _L4; else goto _L3
_L3:
        if (i1 == j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        cnt cnt1 = ((cnq)das1.a.get(i1)).d;
        if (cnt1 != cnt.a && cnt1 != cnt.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = 0;
          goto _L5
        i1++;
          goto _L6
_L4:
        i1 = 1;
          goto _L5
        i1 = 0;
          goto _L7
    }

    static void a(byh byh1, int i1, int j1)
    {
        i1 = byh1.l.c(i1);
        j1 = byh1.l.c(j1);
        byh1.c.a(i1, j1);
    }

    static void a(byh byh1, long al[])
    {
        SparseArray sparsearray = new SparseArray(al.length);
        int j1 = al.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            long l1 = al[i1];
            int k1 = byh1.l.a(l1);
            das das1;
            if (k1 >= 0)
            {
                if (byh1.l.a(k1))
                {
                    sparsearray.append(byh1.l.c(k1), byh1.l.d(k1));
                } else
                if (byh1.l.b(k1))
                {
                    das1 = byh1.l;
                }
            }
            i1++;
        }
        byh1.l.a(sparsearray);
        if (sparsearray.size() > 0)
        {
            byh1.c.a(sparsearray);
        }
    }

    static boolean a(View view)
    {
        view = (Boolean)view.getTag(b.fP);
        return view == null || view.booleanValue();
    }

    static void b(byh byh1)
    {
        byh1.c();
    }

    static ActionBarShadow c(byh byh1)
    {
        return byh1.n;
    }

    static daw d(byh byh1)
    {
        return byh1.e;
    }

    static msm d()
    {
        return A;
    }

    static byf e(byh byh1)
    {
        return byh1.b;
    }

    static msm e()
    {
        return B;
    }

    static LinearLayout f(byh byh1)
    {
        return byh1.f;
    }

    static msm f()
    {
        return z;
    }

    static bsj g(byh byh1)
    {
        return byh1.c;
    }

    static byu h(byh byh1)
    {
        return byh1.D;
    }

    static Context i(byh byh1)
    {
        return byh1.a;
    }

    static mmr j(byh byh1)
    {
        return byh1.F;
    }

    static noj k(byh byh1)
    {
        return byh1.E;
    }

    static del l(byh byh1)
    {
        return byh1.q;
    }

    static crx m(byh byh1)
    {
        return byh1.J;
    }

    static mml n(byh byh1)
    {
        return byh1.p;
    }

    static Executor o(byh byh1)
    {
        return byh1.K;
    }

    static cnq p(byh byh1)
    {
        return null;
    }

    static RectF q(byh byh1)
    {
        return null;
    }

    static Rect r(byh byh1)
    {
        return null;
    }

    static void s(byh byh1)
    {
        byh1.H = null;
        byh1.G = null;
        byh1.I = null;
    }

    public final int a()
    {
        while (e == null || e.b()) 
        {
            return 0;
        }
        return e.getLayoutParams().width;
    }

    public final void a(int i1)
    {
        l.e(i1 + 1);
    }

    public final void a(bsj bsj1)
    {
        bsj bsj2 = bsj1;
        if (bsj1 == null)
        {
            bsj2 = y;
        }
        c = bsj2;
    }

    public final void a(cnq cnq1, csb csb)
    {
        long l1 = l.getItemId(l.b(cnq1));
        cnq1 = (dco)e.a(dco);
        cnq1.d = true;
        ((dco) (cnq1)).e.put(Long.valueOf(l1), csb);
        ((dco) (cnq1)).a.c();
    }

    public final void a(crd crd1)
    {
        das das1 = l;
        crd1.a(das1.a);
        das1.a();
    }

    public final void a(crx crx, Executor executor, List list, Map map)
    {
        J = crx;
        K = executor;
        crx = l;
        crx.b = (Map)b.a(map, "displayables", null);
        ((das) (crx)).a.clear();
        int j1 = list.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            executor = (cnq)list.get(i1);
            if (((cnq) (executor)).d != cnt.d)
            {
                ((das) (crx)).a.add(executor);
            }
        }

        crx.a();
        if (b.a == 0.0F) goto _L2; else goto _L1
_L1:
        crx = (dco)e.a(dco);
        crx.c = b.a;
        crx.b = 1;
        ((dco) (crx)).a.c();
_L4:
        if (b.b != -1L)
        {
            crx = (dcj)e.a(dcj);
            long l1 = b.b;
            if (l1 != -1L)
            {
                crx.c = l1;
                crx.d = true;
            }
        }
        b.a = 0.0F;
        return;
_L2:
        if (b.c == 0)
        {
            ((dco)e.a(dco)).a(l.b(c.f()));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(boolean flag)
    {
        Object obj = b;
        obj.a = 0.0F;
        obj.b = -1L;
        obj.c = 0;
        obj.d = false;
        c();
        if (flag)
        {
            c.e();
        } else
        {
            c.d();
        }
        obj = C;
        if (((bsa) (obj)).d())
        {
            bsz bsz1 = ((bsa) (obj)).g;
            bsz1.c = 2;
            bsz1.b.b();
        }
        ((bsa) (obj)).b.a(flag);
        C.f.d(this);
        D.a();
        m.removeView(d);
    }

    public final int b()
    {
        while (e == null || !e.b()) 
        {
            return 0;
        }
        return e.getLayoutParams().height;
    }

    public void c()
    {
        c.c();
        l.e(-1);
        das das1 = l;
    }

    static 
    {
        z = new msm(pwp.Q);
        A = new msm(pwp.R);
        B = new msm(pwp.S);
    }
}
