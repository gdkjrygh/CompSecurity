// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class efd
    implements mmt, omb, opl, opp, opr, ops, opt, opu, opv
{

    private boolean A;
    private Runnable B;
    private Runnable C;
    public Set a;
    public eey b;
    public Map c;
    private final noz d;
    private final ar e;
    private Set f;
    private efh g;
    private mhf h;
    private Context i;
    private muz j;
    private mmr k;
    private mtj l;
    private mhh m;
    private mhe n;
    private String o;
    private mwx p;
    private mwz q;
    private mwz r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private long x;
    private egg y;
    private egh z;

    efd(ar ar1, opd opd1)
    {
        g = new efh(this);
        h = new efl(this);
        w = false;
        B = new efe(this);
        C = new eff(this);
        e = ar1;
        f = new HashSet();
        a = new HashSet();
        d = noz.a(ar1, 2, "ABStatusManager", new String[0]);
        opd1.a(this);
    }

    static long a(efd efd1, long l1)
    {
        efd1.x = l1;
        return l1;
    }

    static mhe a(efd efd1)
    {
        return efd1.n;
    }

    static mwz a(efd efd1, mwz mwz)
    {
        efd1.r = null;
        return null;
    }

    private void a(long l1)
    {
        if (g())
        {
            if (!A)
            {
                e.n_().b(b.kZ, null, new efk(this));
                A = true;
            }
        } else
        if (!u && t)
        {
            p.a(q);
            q = p.a(B, l1);
            return;
        }
    }

    static boolean a(efd efd1, boolean flag)
    {
        efd1.u = flag;
        return flag;
    }

    static boolean b(efd efd1)
    {
        return efd1.u;
    }

    static boolean b(efd efd1, boolean flag)
    {
        efd1.v = false;
        return false;
    }

    static String c(efd efd1)
    {
        return efd1.o;
    }

    static efh d(efd efd1)
    {
        return efd1.g;
    }

    private void d()
    {
        mmx mmx1 = k.g();
        if (mmx1.c("is_managed_account"))
        {
            o = null;
        } else
        {
            o = mmx1.b("account_name");
        }
        n = m.a(i, o, h);
        e();
    }

    static mmr e(efd efd1)
    {
        return efd1.k;
    }

    private void e()
    {
        if (s && n != null)
        {
            n.a();
        }
    }

    static mtj f(efd efd1)
    {
        return efd1.l;
    }

    private void f()
    {
        if (n != null)
        {
            i();
            p.a(r);
            n.b();
        }
    }

    static noz g(efd efd1)
    {
        return efd1.d;
    }

    private boolean g()
    {
        return z != null && z.a();
    }

    static long h(efd efd1)
    {
        return efd1.x;
    }

    private void h()
    {
        if (r == null)
        {
            v = true;
            r = p.a(C, 5000L);
        }
    }

    private void i()
    {
        if (A)
        {
            e.n_().a(b.kZ);
            A = false;
        }
        p.a(q);
    }

    static void i(efd efd1)
    {
        efd1.a(0L);
    }

    static boolean j(efd efd1)
    {
        return efd1.v;
    }

    static void k(efd efd1)
    {
        efd1.h();
    }

    static Context l(efd efd1)
    {
        return efd1.i;
    }

    public final void V_()
    {
        s = false;
        f();
    }

    public final void X_()
    {
        s = true;
        e();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        i = context;
        k = (mmr)olm1.a(mmr);
        k.a(this);
        m = (mhh)olm1.a(mhh);
        p = (mwx)olm1.a(mwx);
        j = (muz)olm1.a(muz);
        l = (mtj)olm1.a(mtj);
        z = (egh)olm.b(context, egh);
        if (z != null)
        {
            y = (egg)olm1.a(egg);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("auto_backup_status"))
            {
                efi efi1 = (efi)bundle.getParcelable("auto_backup_status");
                b = efi.a(efi1);
                c = efi.b(efi1);
            }
            v = bundle.getBoolean("update_auto_backup_state", false);
        } else
        {
            b = (new efa()).a();
            c = new HashMap();
        }
        if (k.e())
        {
            d();
        }
    }

    final void a(eey eey1)
    {
        boolean flag1;
        flag1 = true;
        if (w)
        {
            long l1;
            if (eey1.a != efb.c)
            {
                l1 = 1000L;
            } else
            {
                l1 = 200L;
            }
            a(l1);
        }
        if (!eey1.equals(b)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = b;
        b = eey1;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((efp)iterator.next()).a(eey1)) { }
        h();
        efb efb2 = ((eey) (obj)).a;
        efb efb1 = eey1.a;
        if (efb2 != efb1)
        {
            for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((efm)iterator1.next()).a()) { }
        }
        obj = ((eey) (obj)).d;
        eey1 = eey1.d;
        if (!TextUtils.equals(((CharSequence) (obj)), eey1))
        {
            boolean flag;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (TextUtils.isEmpty(eey1))
            {
                flag1 = false;
            }
            if (flag && efb1 != efb.f)
            {
                c.put(obj, Long.valueOf(j.b()));
                for (eey1 = a.iterator(); eey1.hasNext(); ((efm)eey1.next()).b()) { }
            }
            if (flag1)
            {
                eey1 = a.iterator();
                while (eey1.hasNext()) 
                {
                    ((efm)eey1.next()).d();
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(efp efp1)
    {
        f.add(efp1);
    }

    public final void a(boolean flag)
    {
        if (n != null && n.c()) goto _L2; else goto _L1
_L1:
        w = flag;
_L4:
        return;
_L2:
        if (!w)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        i();
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        w = flag;
        a(0L);
        return;
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i1, int j1)
    {
        if (flag)
        {
            if (mms1 == mms.c)
            {
                f();
                n = null;
                o = null;
            }
            if (mms2 == mms.c)
            {
                d();
                return;
            }
        }
    }

    public final void al_()
    {
        t = true;
        a(0L);
    }

    public final void am_()
    {
        t = false;
        i();
    }

    public final void b(efp efp1)
    {
        f.remove(efp1);
    }

    public final void c()
    {
        if (!g() && n != null)
        {
            n.a(new mhg(i));
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("auto_backup_status", new efi(b, c));
        bundle.putBoolean("update_auto_backup_state", v);
    }
}
