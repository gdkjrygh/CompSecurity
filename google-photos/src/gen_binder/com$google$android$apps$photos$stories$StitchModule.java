// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import iox;
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
            a.put(iox.a, Integer.valueOf(0));
            a.put(iox.b, Integer.valueOf(1));
            a.put(iox.c, Integer.valueOf(2));
            a.put(iox.d, Integer.valueOf(3));
            a.put(iox.e, Integer.valueOf(4));
            a.put(iox.f, Integer.valueOf(5));
            a.put(iox.g, Integer.valueOf(6));
            a.put(iox.h, Integer.valueOf(7));
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
            iox.a(olm);
            return;

        case 1: // '\001'
            iox.a(context, olm);
            return;

        case 2: // '\002'
            iox.b(olm);
            return;

        case 3: // '\003'
            iox.c(olm);
            return;

        case 4: // '\004'
            iox.b(context, olm);
            return;

        case 5: // '\005'
            iox.c(context, olm);
            return;

        case 6: // '\006'
            iox.d(olm);
            return;

        case 7: // '\007'
            iox.d(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
