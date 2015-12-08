// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import eji;
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
            a = new HashMap(9);
            a.put(eji.a, Integer.valueOf(0));
            a.put(eji.b, Integer.valueOf(1));
            a.put(eji.c, Integer.valueOf(2));
            a.put(eji.d, Integer.valueOf(3));
            a.put(eji.e, Integer.valueOf(4));
            a.put(eji.f, Integer.valueOf(5));
            a.put(eji.g, Integer.valueOf(6));
            a.put(eji.h, Integer.valueOf(7));
            a.put(eji.i, Integer.valueOf(8));
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
            eji.a(olm);
            return;

        case 1: // '\001'
            eji.a(context, olm);
            return;

        case 2: // '\002'
            eji.b(context, olm);
            return;

        case 3: // '\003'
            eji.c(context, olm);
            return;

        case 4: // '\004'
            eji.b(olm);
            return;

        case 5: // '\005'
            eji.d(context, olm);
            return;

        case 6: // '\006'
            eji.e(context, olm);
            return;

        case 7: // '\007'
            eji.f(context, olm);
            return;

        case 8: // '\b'
            eji.g(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
