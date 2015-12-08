// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import fcw;
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
            a = new HashMap(13);
            a.put(fcw.a, Integer.valueOf(0));
            a.put(fcw.b, Integer.valueOf(1));
            a.put(fcw.c, Integer.valueOf(2));
            a.put(fcw.d, Integer.valueOf(3));
            a.put(fcw.e, Integer.valueOf(4));
            a.put(fcw.f, Integer.valueOf(5));
            a.put(fcw.g, Integer.valueOf(6));
            a.put(fcw.h, Integer.valueOf(7));
            a.put(fcw.i, Integer.valueOf(8));
            a.put(fcw.j, Integer.valueOf(9));
            a.put(fcw.k, Integer.valueOf(10));
            a.put(fcw.l, Integer.valueOf(11));
            a.put(fcw.m, Integer.valueOf(12));
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
            fcw.a(context, olm);
            return;

        case 1: // '\001'
            fcw.a(olm);
            return;

        case 2: // '\002'
            fcw.b(olm);
            return;

        case 3: // '\003'
            fcw.b(context, olm);
            return;

        case 4: // '\004'
            fcw.c(olm);
            return;

        case 5: // '\005'
            fcw.c(context, olm);
            return;

        case 6: // '\006'
            fcw.d(context, olm);
            return;

        case 7: // '\007'
            fcw.e(context, olm);
            return;

        case 8: // '\b'
            fcw.f(context, olm);
            return;

        case 9: // '\t'
            fcw.g(context, olm);
            return;

        case 10: // '\n'
            fcw.d(olm);
            return;

        case 11: // '\013'
            fcw.e(olm);
            return;

        case 12: // '\f'
            fcw.h(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
