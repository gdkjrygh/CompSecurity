// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class bsa extends bmb
{

    final crx a;
    public final bsg b;
    final brr e;
    public final bto f = new bsb(this, this, bsi);
    public bsz g;
    private final bsf h;
    private final cag i;
    private final btb j;
    private final bnk k;
    private final Executor l;
    private final mmr m;
    private final bsj n = new bsh(this);
    private final mti o = new bsc(this);
    private final btc p = new bsd(this);

    public bsa(bmb bmb1, cag cag1, Context context, crx crx1, Executor executor, bsf bsf1, brr brr1, 
            bsg bsg1)
    {
        super(bmb1);
        new bse(this, this, new bxg[] {
            bxg.c
        });
        i = (cag)b.a(cag1, "backgroundTaskManager", null);
        k = bni.a(crx1);
        a = (crx)b.a(crx1, "posterStore", null);
        l = (Executor)b.a(executor, "posterExecutor", null);
        h = (bsf)b.a(bsf1, "display", null);
        e = (brr)b.a(brr1, "spinnerController", null);
        b = (bsg)b.a(bsg1, "listener", null);
        m = (mmr)olm.a(context, mmr);
        j = bsz.a(k, cag1, m.d());
    }

    static coa a(Map map, cnq cnq1)
    {
        map = (cnz)map.get(cnq1.e);
        if (map == null || map.b().e == coj.b)
        {
            return null;
        }
        long l1;
        if (cnq1.d == cnt.e)
        {
            l1 = (cnq1.f.b + cnq1.f.c) / 2L;
        } else
        {
            l1 = cnq1.f.b;
        }
        return new coa((cqk)map, l1);
    }

    static void a(bsa bsa1, bsi bsi1)
    {
        bsa1.c();
        bsi1.a(bsa1.n);
        bsa1.a(bsi1);
        bsa1.b();
        bsa1.a(bsi1.a(), bsi1.b());
    }

    static void b(bsa bsa1, bsi bsi1)
    {
        bsa1.c();
        bsi1.a(null);
    }

    public final void C_()
    {
        c();
        i.b(o);
        if (d())
        {
            bsz bsz1 = g;
            bsz1.c = 3;
            bsz1.b.b();
        }
        g = null;
        super.C_();
    }

    void a(int i1, int j1)
    {
        boolean flag = false;
        if (!d()) goto _L2; else goto _L1
_L1:
        i1 = ((flag) ? 1 : 0);
        if (g.c == 2)
        {
            i1 = 1;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        bsz bsz1 = g;
        if (bsz1.c == 2) goto _L6; else goto _L5
_L5:
        Log.w(bsz.a, "trying to resume, but was not paused.");
_L4:
        return;
_L6:
        bsz1.c = 1;
        bsz1.a();
        bsz1.b.a();
        return;
_L2:
        Object obj = c.c.e;
        List list;
        ArrayList arraylist;
        ArrayList arraylist1;
        int k1;
        if (obj != null)
        {
            list = Collections.unmodifiableList(((cqf) (obj)).b);
        } else
        {
            list = Collections.emptyList();
        }
        if (obj != null)
        {
            obj = Collections.unmodifiableMap(((cqf) (obj)).a);
        } else
        {
            obj = Collections.emptyMap();
        }
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        k1 = 0;
        while (k1 < list.size()) 
        {
            cnq cnq1 = (cnq)list.get(k1);
            coa coa1 = a(((Map) (obj)), cnq1);
            if (coa1 == null)
            {
                continue;
            }
            boolean flag1;
            if (a.a(coa1, i1, j1) != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                arraylist.add(cnq1);
                arraylist1.add(coa1);
            }
            k1++;
        }
        if (arraylist.size() > 0)
        {
            g = j.a(arraylist, arraylist1, i1, j1);
            g.b = p;
            bsz bsz2 = g;
            if (bsz2.c != 1)
            {
                bsz2.c = 1;
                bsz2.a();
                return;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    void a(bsi bsi1)
    {
        Object obj1 = c.c.e;
        Object obj;
        if (obj1 != null)
        {
            obj = Collections.unmodifiableList(((cqf) (obj1)).b);
        } else
        {
            obj = Collections.emptyList();
        }
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((cqf) (obj1)).a);
        } else
        {
            obj1 = Collections.emptyMap();
        }
        bsi1.a(a, l, ((List) (obj)), ((Map) (obj1)));
        if (c.j())
        {
            obj = c;
            c.a(((bww) (obj)).j(), "canUndo");
            bsi1.a(((bww) (obj)).c.y);
        }
    }

    void b()
    {
        h.u();
    }

    public boolean d()
    {
        if (g != null)
        {
            boolean flag;
            if (g.c == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void e()
    {
        super.e();
        i.a(o);
    }
}
