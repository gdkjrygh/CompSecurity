// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import hol;
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
            a = new HashMap(5);
            a.put(hol.a, Integer.valueOf(0));
            a.put(hol.b, Integer.valueOf(1));
            a.put(hol.c, Integer.valueOf(2));
            a.put(hol.d, Integer.valueOf(3));
            a.put(hol.e, Integer.valueOf(4));
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
            hol.a(context, olm);
            return;

        case 1: // '\001'
            hol.a(olm);
            return;

        case 2: // '\002'
            hol.b(olm);
            return;

        case 3: // '\003'
            hol.c(olm);
            return;

        case 4: // '\004'
            hol.d(olm);
            break;
        }
    }

    public ()
    {
    }
}
