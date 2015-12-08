// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gcn;
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
            a = new HashMap(11);
            a.put(gcn.a, Integer.valueOf(0));
            a.put(gcn.b, Integer.valueOf(1));
            a.put(gcn.c, Integer.valueOf(2));
            a.put(gcn.d, Integer.valueOf(3));
            a.put(gcn.e, Integer.valueOf(4));
            a.put(gcn.f, Integer.valueOf(5));
            a.put(gcn.g, Integer.valueOf(6));
            a.put(gcn.h, Integer.valueOf(7));
            a.put(gcn.i, Integer.valueOf(8));
            a.put(gcn.j, Integer.valueOf(9));
            a.put(gcn.k, Integer.valueOf(10));
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
            gcn.a(context, olm);
            return;

        case 1: // '\001'
            gcn.b(context, olm);
            return;

        case 2: // '\002'
            gcn.c(context, olm);
            return;

        case 3: // '\003'
            gcn.d(context, olm);
            return;

        case 4: // '\004'
            gcn.e(context, olm);
            return;

        case 5: // '\005'
            gcn.a(olm);
            return;

        case 6: // '\006'
            gcn.f(context, olm);
            return;

        case 7: // '\007'
            gcn.b(olm);
            return;

        case 8: // '\b'
            gcn.c(olm);
            return;

        case 9: // '\t'
            gcn.g(context, olm);
            return;

        case 10: // '\n'
            gcn.d(olm);
            break;
        }
    }

    public ()
    {
    }
}
