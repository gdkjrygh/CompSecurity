// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class dkm
    implements dkl
{

    private final dku a;
    private final dkw b;
    private final dma c;
    private final doa d;
    private final dnb e;
    private final dkx f;
    private final dnl g;
    private final dlo h;
    private final dom i;
    private final dlz j;
    private final dko k;
    private final dlw l;
    private final Set m;

    dkm(dku dku, dkw dkw1, dma dma1, doa doa1, dnb dnb1, dkx dkx1, dnl dnl1, 
            dlo dlo1, dom dom1, dlz dlz1, dko dko1, dlw dlw1)
    {
        HashSet hashset = new HashSet();
        a = dku;
        hashset.addAll(dkv.a);
        b = dkw1;
        hashset.addAll(dkw.a);
        c = dma1;
        hashset.addAll(dma.a);
        d = doa1;
        hashset.addAll(Collections.emptySet());
        e = dnb1;
        hashset.addAll(dnb.a);
        f = dkx1;
        hashset.addAll(dkx.a);
        g = dnl1;
        hashset.addAll(dnl.a);
        h = dlo1;
        hashset.addAll(dlo.a);
        i = dom1;
        hashset.addAll(dom.a);
        j = dlz1;
        hashset.addAll(dlz.a);
        k = dko1;
        hashset.addAll(dru.a());
        l = dlw1;
        hashset.addAll(dlw.a);
        m = Collections.unmodifiableSet(hashset);
    }

    public final ekf a(int i1, Object obj)
    {
        Cursor cursor = (Cursor)obj;
        fmn fmn1 = new fmn();
        obj = (eev)dkv.a(cursor);
        int j1 = ((eev) (obj)).b();
        boolean flag = ((eev) (obj)).a();
        fmn1.a = j1;
        fmn1.b = flag;
        Object obj1 = (gfn)dkw.a(cursor);
        flag = ((gfn) (obj1)).g();
        obj = ((gfn) (obj1)).h();
        obj1 = ((gfn) (obj1)).i();
        fmn1.c = flag;
        fmn1.d = ((pye) (obj));
        fmn1.e = ((String) (obj1));
        obj = (elt)c.a(i1, cursor);
        float f1;
        float f2;
        long l1;
        boolean flag1;
        if (obj != null)
        {
            obj = ((elt) (obj)).e();
        } else
        {
            obj = null;
        }
        fmn1.f = ((gap) (obj));
        fmn1.g = ((ely)doa.c()).f();
        fmn1.h = ((hdv)dnb.a(cursor)).m();
        obj1 = (eft)dkx.a(cursor);
        obj = ((eft) (obj1)).d();
        obj1 = ((eft) (obj1)).c();
        fmn1.i = ((String) (obj));
        fmn1.j = ((euu) (obj1));
        obj = (gej)dnl.a(cursor);
        flag = ((gej) (obj)).n();
        flag1 = ((gej) (obj)).o();
        fmn1.k = flag;
        fmn1.l = flag1;
        fmn1.m = ((gtg)h.a(cursor)).j();
        l1 = ((jdv)i.a(cursor)).p();
        fmn1.n = true;
        fmn1.o = l1;
        obj = (gaf)dlz.a(cursor);
        if (obj != null)
        {
            i1 = ((gaf) (obj)).k();
            int k1 = ((gaf) (obj)).l();
            fmn1.p = true;
            fmn1.q = i1;
            fmn1.r = k1;
        }
        obj = (gax)k.a(cursor);
        if (obj != null)
        {
            fmn1.s = ((gax) (obj)).q();
        }
        obj = (jgi)dlw.a(cursor);
        f1 = ((jgi) (obj)).r();
        f2 = ((jgi) (obj)).s();
        fmn1.t = true;
        fmn1.u = f1;
        fmn1.v = f2;
        return new fml(fmn1);
    }

    public final Set a()
    {
        return m;
    }

    public final Class b()
    {
        return fml;
    }
}
