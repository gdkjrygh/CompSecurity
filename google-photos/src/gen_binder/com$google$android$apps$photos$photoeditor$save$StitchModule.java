// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import gwj;
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
            a.put(gwj.a, Integer.valueOf(0));
            a.put(gwj.b, Integer.valueOf(1));
            a.put(gwj.c, Integer.valueOf(2));
            a.put(gwj.d, Integer.valueOf(3));
            a.put(gwj.e, Integer.valueOf(4));
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
            gwj.a(context, olm);
            return;

        case 1: // '\001'
            gwj.b(context, olm);
            return;

        case 2: // '\002'
            gwj.c(context, olm);
            return;

        case 3: // '\003'
            gwj.d(context, olm);
            return;

        case 4: // '\004'
            gwj.e(context, olm);
            break;
        }
    }

    public ()
    {
    }
}
