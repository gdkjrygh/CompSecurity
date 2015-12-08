// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mdl;
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
            a = new HashMap(10);
            a.put(mdl.a, Integer.valueOf(0));
            a.put(mdl.b, Integer.valueOf(1));
            a.put(mdl.c, Integer.valueOf(2));
            a.put(mdl.d, Integer.valueOf(3));
            a.put(mdl.e, Integer.valueOf(4));
            a.put(mdl.f, Integer.valueOf(5));
            a.put(mdl.g, Integer.valueOf(6));
            a.put(mdl.h, Integer.valueOf(7));
            a.put(mdl.i, Integer.valueOf(8));
            a.put(mdl.j, Integer.valueOf(9));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            mdl.a(olm);
            return;

        case 1: // '\001'
            mdl.b(olm);
            return;

        case 2: // '\002'
            mdl.c(olm);
            return;

        case 3: // '\003'
            mdl.d(olm);
            return;

        case 4: // '\004'
            mdl.e(olm);
            return;

        case 5: // '\005'
            mdl.f(olm);
            return;

        case 6: // '\006'
            mdl.g(olm);
            return;

        case 7: // '\007'
            mdl.h(olm);
            return;

        case 8: // '\b'
            mdl.i(olm);
            return;

        case 9: // '\t'
            mdl.j(olm);
            break;
        }
    }

    public ()
    {
    }
}
