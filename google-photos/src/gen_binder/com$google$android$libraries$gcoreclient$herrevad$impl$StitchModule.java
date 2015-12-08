// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mcz;
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
            a = new HashMap(6);
            a.put(mcz.a, Integer.valueOf(0));
            a.put(mcz.b, Integer.valueOf(1));
            a.put(mcz.c, Integer.valueOf(2));
            a.put(mcz.d, Integer.valueOf(3));
            a.put(mcz.e, Integer.valueOf(4));
            a.put(mcz.f, Integer.valueOf(5));
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
            mcz.a(olm);
            return;

        case 1: // '\001'
            mcz.b(olm);
            return;

        case 2: // '\002'
            mcz.c(olm);
            return;

        case 3: // '\003'
            mcz.d(olm);
            return;

        case 4: // '\004'
            mcz.e(olm);
            return;

        case 5: // '\005'
            mcz.f(olm);
            break;
        }
    }

    public ()
    {
    }
}
