// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gbl;
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
            a = new HashMap(8);
            a.put(gbl.a, Integer.valueOf(0));
            a.put(gbl.b, Integer.valueOf(1));
            a.put(gbl.c, Integer.valueOf(2));
            a.put(gbl.d, Integer.valueOf(3));
            a.put(gbl.e, Integer.valueOf(4));
            a.put(gbl.f, Integer.valueOf(5));
            a.put(gbl.g, Integer.valueOf(6));
            a.put(gbl.h, Integer.valueOf(7));
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
            gbl.a(olm);
            return;

        case 1: // '\001'
            gbl.a(context, olm);
            return;

        case 2: // '\002'
            gbl.b(olm);
            return;

        case 3: // '\003'
            gbl.b(context, olm);
            return;

        case 4: // '\004'
            gbl.c(context, olm);
            return;

        case 5: // '\005'
            gbl.d(context, olm);
            return;

        case 6: // '\006'
            gbl.e(context, olm);
            return;

        case 7: // '\007'
            gbl.f(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
