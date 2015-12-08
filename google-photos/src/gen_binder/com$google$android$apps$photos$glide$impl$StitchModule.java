// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import fmd;
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
            a = new HashMap(7);
            a.put(fmd.a, Integer.valueOf(0));
            a.put(fmd.b, Integer.valueOf(1));
            a.put(fmd.c, Integer.valueOf(2));
            a.put(fmd.d, Integer.valueOf(3));
            a.put(fmd.e, Integer.valueOf(4));
            a.put(fmd.f, Integer.valueOf(5));
            a.put(fmd.g, Integer.valueOf(6));
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
            fmd.a(olm);
            return;

        case 1: // '\001'
            fmd.a(context, olm);
            return;

        case 2: // '\002'
            fmd.b(context, olm);
            return;

        case 3: // '\003'
            fmd.c(context, olm);
            return;

        case 4: // '\004'
            fmd.b(olm);
            return;

        case 5: // '\005'
            fmd.c(olm);
            return;

        case 6: // '\006'
            fmd.d(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
