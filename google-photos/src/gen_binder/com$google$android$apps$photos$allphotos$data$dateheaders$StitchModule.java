// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dqh;
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
            a.put(dqh.a, Integer.valueOf(0));
            a.put(dqh.b, Integer.valueOf(1));
            a.put(dqh.c, Integer.valueOf(2));
            a.put(dqh.d, Integer.valueOf(3));
            a.put(dqh.e, Integer.valueOf(4));
            a.put(dqh.f, Integer.valueOf(5));
            a.put(dqh.g, Integer.valueOf(6));
            a.put(dqh.h, Integer.valueOf(7));
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
            dqh.a(olm);
            return;

        case 1: // '\001'
            dqh.b(olm);
            return;

        case 2: // '\002'
            dqh.a(context, olm);
            return;

        case 3: // '\003'
            dqh.c(olm);
            return;

        case 4: // '\004'
            dqh.b(context, olm);
            return;

        case 5: // '\005'
            dqh.c(context, olm);
            return;

        case 6: // '\006'
            dqh.d(olm);
            return;

        case 7: // '\007'
            dqh.d(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
