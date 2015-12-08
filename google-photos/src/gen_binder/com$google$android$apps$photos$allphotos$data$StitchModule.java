// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dof;
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
            a.put(dof.a, Integer.valueOf(0));
            a.put(dof.b, Integer.valueOf(1));
            a.put(dof.c, Integer.valueOf(2));
            a.put(dof.d, Integer.valueOf(3));
            a.put(dof.e, Integer.valueOf(4));
            a.put(dof.f, Integer.valueOf(5));
            a.put(dof.g, Integer.valueOf(6));
            a.put(dof.h, Integer.valueOf(7));
            a.put(dof.i, Integer.valueOf(8));
            a.put(dof.j, Integer.valueOf(9));
            a.put(dof.k, Integer.valueOf(10));
            a.put(dof.l, Integer.valueOf(11));
            a.put(dof.m, Integer.valueOf(12));
            a.put(dof.n, Integer.valueOf(13));
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
            dof.a(context, olm);
            return;

        case 1: // '\001'
            dof.a(olm);
            return;

        case 2: // '\002'
            dof.b(context, olm);
            return;

        case 3: // '\003'
            dof.c(context, olm);
            return;

        case 4: // '\004'
            dof.d(context, olm);
            return;

        case 5: // '\005'
            dof.b(olm);
            return;

        case 6: // '\006'
            dof.e(context, olm);
            return;

        case 7: // '\007'
            dof.f(context, olm);
            return;

        case 8: // '\b'
            dof.g(context, olm);
            return;

        case 9: // '\t'
            dof.h(context, olm);
            return;

        case 10: // '\n'
            dof.i(context, olm);
            return;

        case 11: // '\013'
            dof.j(context, olm);
            return;

        case 12: // '\f'
            dof.k(context, olm);
            return;

        case 13: // '\r'
            dof.c(olm);
            break;
        }
    }

    public ()
    {
    }
}
