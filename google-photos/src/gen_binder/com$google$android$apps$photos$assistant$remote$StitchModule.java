// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dzs;
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
            a = new HashMap(12);
            a.put(dzs.a, Integer.valueOf(0));
            a.put(dzs.b, Integer.valueOf(1));
            a.put(dzs.c, Integer.valueOf(2));
            a.put(dzs.d, Integer.valueOf(3));
            a.put(dzs.e, Integer.valueOf(4));
            a.put(dzs.f, Integer.valueOf(5));
            a.put(dzs.g, Integer.valueOf(6));
            a.put(dzs.h, Integer.valueOf(7));
            a.put(dzs.i, Integer.valueOf(8));
            a.put(dzs.j, Integer.valueOf(9));
            a.put(dzs.k, Integer.valueOf(10));
            a.put(dzs.l, Integer.valueOf(11));
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
            dzs.a(olm);
            return;

        case 1: // '\001'
            dzs.a(context, olm);
            return;

        case 2: // '\002'
            dzs.b(context, olm);
            return;

        case 3: // '\003'
            dzs.c(context, olm);
            return;

        case 4: // '\004'
            dzs.b(olm);
            return;

        case 5: // '\005'
            dzs.c(olm);
            return;

        case 6: // '\006'
            dzs.d(context, olm);
            return;

        case 7: // '\007'
            dzs.d(olm);
            return;

        case 8: // '\b'
            dzs.e(olm);
            return;

        case 9: // '\t'
            dzs.e(context, olm);
            return;

        case 10: // '\n'
            dzs.f(context, olm);
            return;

        case 11: // '\013'
            dzs.f(olm);
            break;
        }
    }

    public ()
    {
    }
}
