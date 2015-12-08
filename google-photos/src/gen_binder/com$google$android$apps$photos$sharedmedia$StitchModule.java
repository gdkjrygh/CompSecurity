// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import iko;
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
            a.put(iko.a, Integer.valueOf(0));
            a.put(iko.b, Integer.valueOf(1));
            a.put(iko.c, Integer.valueOf(2));
            a.put(iko.d, Integer.valueOf(3));
            a.put(iko.e, Integer.valueOf(4));
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
            iko.a(context, olm);
            return;

        case 1: // '\001'
            iko.b(context, olm);
            return;

        case 2: // '\002'
            iko.c(context, olm);
            return;

        case 3: // '\003'
            iko.d(context, olm);
            return;

        case 4: // '\004'
            iko.a(olm);
            break;
        }
    }

    public ()
    {
    }
}
