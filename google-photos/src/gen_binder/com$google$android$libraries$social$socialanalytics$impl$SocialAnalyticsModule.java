// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import ode;
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
            a = new HashMap(4);
            a.put(ode.a, Integer.valueOf(0));
            a.put(ode.b, Integer.valueOf(1));
            a.put(ode.c, Integer.valueOf(2));
            a.put(ode.d, Integer.valueOf(3));
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
            ode.a(context, olm);
            return;

        case 1: // '\001'
            ode.b(context, olm);
            return;

        case 2: // '\002'
            ode.c(context, olm);
            return;

        case 3: // '\003'
            ode.a(olm);
            break;
        }
    }

    public ()
    {
    }
}
