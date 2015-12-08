// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import eup;
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
            a = new HashMap(14);
            a.put(eup.a, Integer.valueOf(0));
            a.put(eup.b, Integer.valueOf(1));
            a.put(eup.c, Integer.valueOf(2));
            a.put(eup.d, Integer.valueOf(3));
            a.put(eup.e, Integer.valueOf(4));
            a.put(eup.f, Integer.valueOf(5));
            a.put(eup.g, Integer.valueOf(6));
            a.put(eup.h, Integer.valueOf(7));
            a.put(eup.i, Integer.valueOf(8));
            a.put(eup.j, Integer.valueOf(9));
            a.put(eup.k, Integer.valueOf(10));
            a.put(eup.l, Integer.valueOf(11));
            a.put(eup.m, Integer.valueOf(12));
            a.put(eup.n, Integer.valueOf(13));
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
            eup.a(context, olm);
            return;

        case 1: // '\001'
            eup.b(context, olm);
            return;

        case 2: // '\002'
            eup.c(context, olm);
            return;

        case 3: // '\003'
            eup.d(context, olm);
            return;

        case 4: // '\004'
            eup.e(context, olm);
            return;

        case 5: // '\005'
            eup.f(context, olm);
            return;

        case 6: // '\006'
            eup.g(context, olm);
            return;

        case 7: // '\007'
            eup.a(olm);
            return;

        case 8: // '\b'
            eup.h(context, olm);
            return;

        case 9: // '\t'
            eup.i(context, olm);
            return;

        case 10: // '\n'
            eup.j(context, olm);
            return;

        case 11: // '\013'
            eup.k(context, olm);
            return;

        case 12: // '\f'
            eup.l(context, olm);
            return;

        case 13: // '\r'
            eup.m(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
