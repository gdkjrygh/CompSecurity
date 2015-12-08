// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gjv;
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
            a.put(gjv.a, Integer.valueOf(0));
            a.put(gjv.b, Integer.valueOf(1));
            a.put(gjv.c, Integer.valueOf(2));
            a.put(gjv.d, Integer.valueOf(3));
            a.put(gjv.e, Integer.valueOf(4));
            a.put(gjv.f, Integer.valueOf(5));
            a.put(gjv.g, Integer.valueOf(6));
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
            gjv.a(context, olm);
            return;

        case 1: // '\001'
            gjv.b(context, olm);
            return;

        case 2: // '\002'
            gjv.c(context, olm);
            return;

        case 3: // '\003'
            gjv.d(context, olm);
            return;

        case 4: // '\004'
            gjv.a(olm);
            return;

        case 5: // '\005'
            gjv.b(olm);
            return;

        case 6: // '\006'
            gjv.e(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
