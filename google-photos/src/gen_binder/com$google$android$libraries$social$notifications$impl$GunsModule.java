// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import nrp;
import olm;
import olv;

public final class 
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(23);
            a.put(nrp.a, Integer.valueOf(0));
            a.put(nrp.b, Integer.valueOf(1));
            a.put(nrp.c, Integer.valueOf(2));
            a.put(nrp.d, Integer.valueOf(3));
            a.put(nrp.e, Integer.valueOf(4));
            a.put(nrp.f, Integer.valueOf(5));
            a.put(nrp.g, Integer.valueOf(6));
            a.put(nrp.h, Integer.valueOf(7));
            a.put(nrp.i, Integer.valueOf(8));
            a.put(nrp.j, Integer.valueOf(9));
            a.put(nrp.k, Integer.valueOf(10));
            a.put(nrp.l, Integer.valueOf(11));
            a.put(nrp.m, Integer.valueOf(12));
            a.put(nrp.n, Integer.valueOf(13));
            a.put(nrp.o, Integer.valueOf(14));
            a.put(nrp.p, Integer.valueOf(15));
            a.put(nrp.q, Integer.valueOf(16));
            a.put(nrp.r, Integer.valueOf(17));
            a.put(nrp.s, Integer.valueOf(18));
            a.put(nrp.t, Integer.valueOf(19));
            a.put(nrp.u, Integer.valueOf(20));
            a.put(nrp.v, Integer.valueOf(21));
            a.put(nrp.w, Integer.valueOf(22));
        }
        class1 = (Integer)a.get(class1.getName());
        if (class1 == null)
        {
            return;
        }
        switch (class1.intValue())
        {
        default:
            return;

        case 0: // '\0'
            nrp.a(context, olm);
            return;

        case 1: // '\001'
            nrp.b(context, olm);
            return;

        case 2: // '\002'
            nrp.a(olm);
            return;

        case 3: // '\003'
            nrp.c(context, olm);
            return;

        case 4: // '\004'
            nrp.d(context, olm);
            return;

        case 5: // '\005'
            nrp.e(context, olm);
            return;

        case 6: // '\006'
            nrp.f(context, olm);
            return;

        case 7: // '\007'
            nrp.g(context, olm);
            return;

        case 8: // '\b'
            nrp.h(context, olm);
            return;

        case 9: // '\t'
            nrp.i(context, olm);
            return;

        case 10: // '\n'
            nrp.b(olm);
            return;

        case 11: // '\013'
            nrp.j(context, olm);
            return;

        case 12: // '\f'
            nrp.k(context, olm);
            return;

        case 13: // '\r'
            nrp.l(context, olm);
            return;

        case 14: // '\016'
            nrp.m(context, olm);
            return;

        case 15: // '\017'
            nrp.c(olm);
            return;

        case 16: // '\020'
            nrp.n(context, olm);
            return;

        case 17: // '\021'
            nrp.o(context, olm);
            return;

        case 18: // '\022'
            nrp.p(context, olm);
            return;

        case 19: // '\023'
            nrp.q(context, olm);
            return;

        case 20: // '\024'
            nrp.r(context, olm);
            return;

        case 21: // '\025'
            nrp.s(context, olm);
            return;

        case 22: // '\026'
            nrp.t(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
