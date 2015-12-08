// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import bhw;
import java.util.HashMap;
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
            a = new HashMap(15);
            a.put(bhw.a, Integer.valueOf(0));
            a.put(bhw.b, Integer.valueOf(1));
            a.put(bhw.c, Integer.valueOf(2));
            a.put(bhw.d, Integer.valueOf(3));
            a.put(bhw.e, Integer.valueOf(4));
            a.put(bhw.f, Integer.valueOf(5));
            a.put(bhw.g, Integer.valueOf(6));
            a.put(bhw.h, Integer.valueOf(7));
            a.put(bhw.i, Integer.valueOf(8));
            a.put(bhw.j, Integer.valueOf(9));
            a.put(bhw.k, Integer.valueOf(10));
            a.put(bhw.l, Integer.valueOf(11));
            a.put(bhw.m, Integer.valueOf(12));
            a.put(bhw.n, Integer.valueOf(13));
            a.put(bhw.o, Integer.valueOf(14));
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
            bhw.a(context, olm);
            return;

        case 1: // '\001'
            bhw.b(context, olm);
            return;

        case 2: // '\002'
            bhw.c(context, olm);
            return;

        case 3: // '\003'
            bhw.d(context, olm);
            return;

        case 4: // '\004'
            bhw.e(context, olm);
            return;

        case 5: // '\005'
            bhw.f(context, olm);
            return;

        case 6: // '\006'
            bhw.g(context, olm);
            return;

        case 7: // '\007'
            bhw.h(context, olm);
            return;

        case 8: // '\b'
            bhw.i(context, olm);
            return;

        case 9: // '\t'
            bhw.j(context, olm);
            return;

        case 10: // '\n'
            bhw.k(context, olm);
            return;

        case 11: // '\013'
            bhw.l(context, olm);
            return;

        case 12: // '\f'
            bhw.m(context, olm);
            return;

        case 13: // '\r'
            bhw.n(context, olm);
            return;

        case 14: // '\016'
            bhw.o(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
