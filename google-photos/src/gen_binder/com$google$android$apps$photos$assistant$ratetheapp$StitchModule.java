// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import dyw;
import java.util.HashMap;
import olm;
import olv;

public final class Q
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(3);
            a.put(dyw.a, Integer.valueOf(0));
            a.put(dyw.b, Integer.valueOf(1));
            a.put(dyw.c, Integer.valueOf(2));
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
            dyw.a(context, olm);
            return;

        case 1: // '\001'
            dyw.a(olm);
            return;

        case 2: // '\002'
            dyw.b(olm);
            break;
        }
    }

    public Q()
    {
    }
}
