// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import myt;
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
            a.put(myt.a, Integer.valueOf(0));
            a.put(myt.b, Integer.valueOf(1));
            a.put(myt.c, Integer.valueOf(2));
            a.put(myt.d, Integer.valueOf(3));
            a.put(myt.e, Integer.valueOf(4));
            a.put(myt.f, Integer.valueOf(5));
            a.put(myt.g, Integer.valueOf(6));
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
            myt.a(olm);
            return;

        case 1: // '\001'
            myt.a(context, olm);
            return;

        case 2: // '\002'
            myt.b(context, olm);
            return;

        case 3: // '\003'
            myt.c(context, olm);
            return;

        case 4: // '\004'
            myt.d(context, olm);
            return;

        case 5: // '\005'
            myt.b(olm);
            return;

        case 6: // '\006'
            myt.c(olm);
            break;
        }
    }

    public ()
    {
    }
}
