// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import ehm;
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
            a.put(ehm.a, Integer.valueOf(0));
            a.put(ehm.b, Integer.valueOf(1));
            a.put(ehm.c, Integer.valueOf(2));
            a.put(ehm.d, Integer.valueOf(3));
            a.put(ehm.e, Integer.valueOf(4));
            a.put(ehm.f, Integer.valueOf(5));
            a.put(ehm.g, Integer.valueOf(6));
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
            ehm.a(olm);
            return;

        case 1: // '\001'
            ehm.a(context, olm);
            return;

        case 2: // '\002'
            ehm.b(olm);
            return;

        case 3: // '\003'
            ehm.c(olm);
            return;

        case 4: // '\004'
            ehm.d(olm);
            return;

        case 5: // '\005'
            ehm.e(olm);
            return;

        case 6: // '\006'
            ehm.f(olm);
            break;
        }
    }

    public ()
    {
    }
}
