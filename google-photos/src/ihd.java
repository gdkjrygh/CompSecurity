// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ihd
    implements ds
{

    private static final int e;
    hpr a;
    String b;
    String c;
    qfz d;
    private final hhn f;
    private final int g;
    private final ihi h;
    private final boolean i;

    public ihd(Context context, int l, ihi ihi1, boolean flag)
    {
        g = l;
        h = ihi1;
        i = flag;
        f = (hhn)olm.a(context, hhn);
    }

    private qfe[] a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ihp ihp1 = (ihp)iterator.next();
            if (ihp1.a())
            {
                qfe qfe1 = new qfe();
                qfe1.a = f.a(g, ihp1.a);
                qfe1.b = Boolean.valueOf(ihp1.a());
                arraylist.add(qfe1);
            }
        } while (true);
        return (qfe[])arraylist.toArray(new qfe[list.size()]);
    }

    public final void a(hpr hpr)
    {
        a = hpr;
    }

    public final void a(qlw qlw)
    {
        qlw = (qrc)qlw;
        if (qlw != null)
        {
            c = ((qrc) (qlw)).b;
            b = ((qrc) (qlw)).c;
            d = ((qrc) (qlw)).d;
        }
    }

    public final qlr f()
    {
        return qrc.a;
    }

    public final int g()
    {
        return e;
    }

    public final qlr g_()
    {
        return qra.a;
    }

    public final boolean j()
    {
        return d != null;
    }

    public final boolean k()
    {
        return a != null;
    }

    public final String k_()
    {
        return "CreateEnvelopeOp";
    }

    public final qlw l_()
    {
        qra qra1;
        qdn qdn1;
        Object obj = null;
        qra1 = new qra();
        qdn1 = new qdn();
        ihi ihi1 = h;
        if (!TextUtils.isEmpty(null))
        {
            obj = new qqh();
            qqg qqg1 = new qqg();
            qqg1.b = null;
            qqg1.a = 0;
            obj.a = (new qqg[] {
                qqg1
            });
        }
        qdn1.e = ((qqh) (obj));
        ihe.a[h.a.ordinal()];
        JVM INSTR tableswitch 1 3: default 76
    //                   1 169
    //                   2 279
    //                   3 323;
           goto _L1 _L2 _L3 _L4
_L1:
        obj = String.valueOf(h.a);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 26)).append("Unexpected envelope type: ").append(((String) (obj))).toString());
_L2:
        qdn1.a = 1;
        qdn1.b = new qef();
        qdn1.b.a = f.a(g, h.b);
_L6:
        qra1.b = qdn1;
        qra1.c = new qrb();
        qra1.c.a = Boolean.valueOf(h.d);
        qra1.c.b = Boolean.valueOf(i);
        if (h.a == ihj.a)
        {
            qra1.d = b.h();
        }
        return qra1;
_L3:
        qdn1.a = 3;
        qdn1.d = new qeh();
        qdn1.d.a = f.a(g, h.b);
        continue; /* Loop/switch isn't completed */
_L4:
        qdn1.a = 2;
        List list = h.c;
        ArrayList arraylist = new ArrayList(list.size());
        qeg qeg1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(qeg1))
        {
            ihp ihp1 = (ihp)iterator.next();
            qeg1 = new qeg();
            qeg1.a = f.a(g, ihp1.a);
        }

        qdn1.c = (qeg[])arraylist.toArray(new qeg[list.size()]);
        qdn1.f = a(h.c);
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        e = qmb.b(qrc.a.b);
    }
}
