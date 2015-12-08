// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import nhb;
import olm;
import olv;

public final class Q
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(7);
            a.put(nhb.a, Integer.valueOf(0));
            a.put(nhb.b, Integer.valueOf(1));
            a.put(nhb.c, Integer.valueOf(2));
            a.put(nhb.d, Integer.valueOf(3));
            a.put(nhb.e, Integer.valueOf(4));
            a.put(nhb.f, Integer.valueOf(5));
            a.put(nhb.g, Integer.valueOf(6));
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
            nhb.a(context, olm);
            return;

        case 1: // '\001'
            nhb.b(context, olm);
            return;

        case 2: // '\002'
            nhb.c(context, olm);
            return;

        case 3: // '\003'
            nhb.d(context, olm);
            return;

        case 4: // '\004'
            nhb.e(context, olm);
            return;

        case 5: // '\005'
            nhb.f(context, olm);
            return;

        case 6: // '\006'
            nhb.g(context, olm);
            break;
        }
    }

    public Q()
    {
    }
}
