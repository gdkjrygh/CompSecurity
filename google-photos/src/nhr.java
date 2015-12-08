// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class nhr
    implements mmu, ngc
{

    final SparseArray a;
    private final Context b;
    private final List c;
    private final Object d;
    private final muz e;
    private final moo f;
    private final mmv g;
    private final nxv h;
    private final ngz i;
    private final ExecutorService j;
    private mnh k;
    private List l;
    private ngn m;

    public nhr(Context context)
    {
        this(context, Executors.newCachedThreadPool(new nhs()));
    }

    private nhr(Context context, ExecutorService executorservice)
    {
        c = new ArrayList();
        a = new SparseArray();
        d = new Object();
        b = context;
        j = executorservice;
        e = (muz)olm.a(context, muz);
        k = (mnh)olm.a(context, mnh);
        f = (moo)olm.a(context, moo);
        g = (mmv)olm.a(context, mmv);
        h = (nxv)olm.a(context, nxv);
        l = olm.c(context, ngo);
        m = (ngn)olm.b(context, ngn);
        i = (ngz)olm.a(context, ngz);
    }

    static IOException a(nhr nhr1, nxx nxx1)
    {
        nhr1 = nxx1.n;
        if (nhr1 != null)
        {
            return new IOException("Rpc failed", nhr1);
        }
        if (nxx1.l())
        {
            int i1 = nxx1.l;
            return new IOException((new StringBuilder(32)).append("RPC failed with code ").append(i1).toString());
        } else
        {
            return null;
        }
    }

    static mmv a(nhr nhr1)
    {
        return nhr1.g;
    }

    static void a(nhr nhr1, int i1)
    {
        nhr1.f(i1);
    }

    private boolean a(int i1, nge nge1)
    {
        mmx mmx1;
        long l1;
        if (i1 != -1)
        {
            mmx1 = g.a(i1);
            l1 = mmx1.a("LoginManager.last_updated", 0L);
            break MISSING_BLOCK_LABEL_27;
        }
        do
        {
            return true;
        } while (!mmx1.c("logged_out") && (d(i1) || !nge1.a && e.a() - l1 >= nge1.b));
        return false;
    }

    static boolean a(mmz mmz1, List list)
    {
        boolean flag2 = mmz1.c("logged_in");
        boolean flag1;
        if (list != null)
        {
            list = list.iterator();
            boolean flag = true;
            do
            {
                flag1 = flag;
                if (!list.hasNext())
                {
                    break;
                }
                ngi ngi1 = (ngi)list.next();
                if (flag && ngi1.a(mmz1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (true);
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            return false;
        }
        if (!flag2)
        {
            if (mmz1.c("logged_out") && !mmz1.c("has_irrecoverable_error"))
            {
                mmz1.c();
            }
            mmz1.c("logged_in", true).c("logged_out", false);
        }
        return true;
    }

    static nge b()
    {
        ngf ngf1 = new ngf();
        ngf1.a = true;
        ngf1.b = 0L;
        ngf1.c = false;
        return ngf1.a();
    }

    static nxv b(nhr nhr1)
    {
        return nhr1.h;
    }


// JavaClassFileOutputException: Prev chain is broken

    static void b(nhr nhr1, int i1)
    {
        nhr1.e(i1);
    }

    static muz c(nhr nhr1)
    {
        return nhr1.e;
    }

    private void c(List list)
    {
        boolean flag;
        boolean flag1;
        int i1;
        i1 = 0;
        flag1 = false;
        flag = false;
_L6:
        if (i1 >= 3) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList(list.size());
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(new nht(this, (nhu)iterator.next()))) { }
        j.invokeAll(arraylist);
        flag = flag1;
        flag1 = true;
_L5:
        if (!flag1) goto _L4; else goto _L3
_L3:
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        Log.w("LoginManager", "End account updates interrupted", interruptedexception);
        boolean flag2 = true;
        flag1 = flag;
        flag = flag2;
          goto _L5
_L4:
        int j1 = i1 + 1;
        i1 = ((flag1) ? 1 : 0);
        flag1 = flag;
        flag = i1;
        i1 = j1;
          goto _L6
_L2:
        if (!flag1) goto _L3; else goto _L7
_L7:
        Thread.currentThread().interrupt();
        return;
          goto _L5
    }

    static ngz d(nhr nhr1)
    {
        return nhr1.i;
    }

    private boolean d(int i1)
    {
        mmx mmx1;
        if (i1 != -1)
        {
            if (TextUtils.equals(i.a(), (mmx1 = g.a(i1)).b("LoginManager.build_version")))
            {
                return false;
            }
        }
        return true;
    }

    static ngn e(nhr nhr1)
    {
        return nhr1.m;
    }

    private void e(int i1)
    {
        List list = olm.c(b, ngs);
        int k1 = list.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ((ngs)list.get(j1)).a(i1);
        }

    }

    static SparseArray f(nhr nhr1)
    {
        return nhr1.a;
    }

    private void f(int i1)
    {
        if (!g.d(i1) && g.e(i1))
        {
            return;
        }
        Object obj = g.a(i1);
        if (!((mmx) (obj)).c("is_managed_account"))
        {
            obj = ((mmx) (obj)).b("account_name");
            List list = g.a();
            int k1 = list.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                Integer integer = (Integer)list.get(j1);
                mmx mmx1 = g.a(integer.intValue());
                if (mmx1.a() && mmx1.c("is_managed_account") && mmx1.b("account_name").equals(obj))
                {
                    f(integer.intValue());
                }
            }

        }
        g.b(i1).c("logged_out", true).c("logged_in", false).d();
        e(i1);
    }

    final List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Class class1;
        for (list = list.iterator(); list.hasNext(); arraylist.add((ngi)olm.a(b, class1)))
        {
            class1 = (Class)list.next();
        }

        return arraylist;
    }

    final ngw a(String s, String s1, ngg ngg1, boolean flag)
    {
        ngw ngw1 = new ngw();
        try
        {
            s = k.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ngw1.e = Collections.singletonList(s);
            return ngw1;
        }
        if (s != null)
        {
            s = new nhu(this, s, s1, ngg1, false);
            b(Collections.singletonList(s));
            ngw1.a = true;
            s.a(ngw1);
        }
        return ngw1;
    }

    public final void a(int i1)
    {
    }

    public final void a(ay ay, int i1)
    {
        ay = nhk.a(ay);
        nho nho1 = new nho("logout", i1, ((nhk) (ay)).a);
        ((nhk) (ay)).b.a(nho1);
    }

    public final void a(ay ay, ngg ngg1, String s)
    {
        ay = nhk.a(ay);
        if (((nhk) (ay)).h)
        {
            ay.a(true);
            ((nhk) (ay)).a.a(((nhk) (ay)).c, ((nhk) (ay)).d, -1);
        }
        ay.h = true;
        ay.c = ngg1;
        ay.d = s;
        ay.e = null;
        ay.f = null;
        ay.g = -1;
        ay.s();
    }

    public final void a(ngd ngd1)
    {
        c.add(ngd1);
    }

    public final void a(nge nge1)
    {
        b(nge1);
    }

    void a(ngg ngg1, String s, int i1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ngd)iterator.next()).a(ngg1, s, i1)) { }
    }

    final boolean a()
    {
        nge nge1 = b();
        Object obj = new HashSet();
        mne amne[];
        int k1;
        try
        {
            amne = k.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("LoginManager", 6))
            {
                Log.e("LoginManager", "Failed to obtain device accounts when checking if accounts are ready for login", ((Throwable) (obj)));
            }
            return false;
        }
        k1 = amne.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s = amne[i1].a;
            ((Set) (obj)).add(s);
            if (a(g.a(s), nge1))
            {
                return false;
            }
        }

        for (Iterator iterator = g.a().iterator(); iterator.hasNext();)
        {
            int j1 = ((Integer)iterator.next()).intValue();
            if (!((Set) (obj)).contains(g.a(j1).b("account_name")))
            {
                return false;
            }
        }

        return true;
    }

    public final boolean a(ngg ngg1, int i1)
    {
        for (boolean flag = ngg1.d; !g.c(i1) || b(ngg1, i1) != null || flag && !g.a(i1).c("logged_in");)
        {
            return false;
        }

        return true;
    }

    final ngi b(ngg ngg1, int i1)
    {
        ArrayList arraylist = new ArrayList();
        mmx mmx1 = g.a(i1);
        if (m != null)
        {
            mmx1.b("account_name");
        }
        arraylist.addAll(ngg1.u);
        for (ngg1 = a(arraylist).iterator(); ngg1.hasNext();)
        {
            ngi ngi1 = (ngi)ngg1.next();
            if (!ngi1.a(mmx1))
            {
                return ngi1;
            }
        }

        return null;
    }

    ngw b(nge nge1)
    {
        f.a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        mne amne[];
        int j1;
        b.v();
        amne = k.a();
        obj1 = new ArrayList(amne.length);
        j1 = amne.length;
        int i1 = 0;
_L2:
        mne mne1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        mne1 = amne[i1];
        String s = mne1.a;
        if (a(g.a(s), nge1))
        {
            ((List) (obj1)).add(new nhu(this, mne1, null, null, nge1.c));
        }
        break MISSING_BLOCK_LABEL_174;
        nge1 = new ngw();
        b(((List) (obj1)));
        nge1.a = true;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((nhu)((Iterator) (obj1)).next()).a(nge1)) { }
        break MISSING_BLOCK_LABEL_170;
        nge1;
        obj;
        JVM INSTR monitorexit ;
        throw nge1;
        obj;
        JVM INSTR monitorexit ;
        return nge1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void b(int i1)
    {
        c(i1);
    }

    public final void b(ngd ngd1)
    {
        c.remove(ngd1);
    }

    public final void c(int i1)
    {
        if (!g.d(i1))
        {
            return;
        }
        synchronized (d)
        {
            f(i1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
