// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class iht extends nzc
{

    qhf a;
    Map b;
    List c;
    private final int d;
    private final String e;
    private final ifj r;
    private final noz s;

    public iht(Context context, int i, String s1)
    {
        super(context, (new nyh()).a(context, i).a(), "readsharedcollections", new pcr(), new pcs());
        d = i;
        e = s1;
        r = (ifj)olm.a(context, ifj);
        s = noz.a(context, "ReadsharedCollections", new String[0]);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcr)qlw;
        qlw.a = new qhe();
        qia qia1 = new qia();
        ((pcr) (qlw)).a.a = qia1;
        qia1.a = 1;
        ((pcr) (qlw)).a.b = b.h();
        ((pcr) (qlw)).a.b.g = b.k();
        ((pcr) (qlw)).a.c = b.i();
        ((pcr) (qlw)).a.e = Integer.valueOf(50);
        ((pcr) (qlw)).a.d = e;
        if (r.a(d))
        {
            ((pcr) (qlw)).a.b.a.j = new qcf();
            qia1.b = new qib[1];
            qia1.b[0] = new qib();
            qia1.b[0].a = 1;
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (pcs)qlw;
        if (qlw != null)
        {
            a = ((pcs) (qlw)).a;
            qlw = new HashMap();
            qgg aqgg[] = a.c;
            int j = aqgg.length;
            for (int i = 0; i < j; i++)
            {
                qgg qgg1 = aqgg[i];
                qlw.put(qgg1.b.a, qgg1);
            }

            b = Collections.unmodifiableMap(qlw);
            c = Arrays.asList(a.d);
        }
    }
}
