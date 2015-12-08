// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import fwa;
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
            a = new HashMap(6);
            a.put(fwa.a, Integer.valueOf(0));
            a.put(fwa.b, Integer.valueOf(1));
            a.put(fwa.c, Integer.valueOf(2));
            a.put(fwa.d, Integer.valueOf(3));
            a.put(fwa.e, Integer.valueOf(4));
            a.put(fwa.f, Integer.valueOf(5));
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
            fwa.a(context, olm);
            return;

        case 1: // '\001'
            fwa.b(context, olm);
            return;

        case 2: // '\002'
            fwa.c(context, olm);
            return;

        case 3: // '\003'
            fwa.d(context, olm);
            return;

        case 4: // '\004'
            fwa.e(context, olm);
            return;

        case 5: // '\005'
            fwa.f(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
