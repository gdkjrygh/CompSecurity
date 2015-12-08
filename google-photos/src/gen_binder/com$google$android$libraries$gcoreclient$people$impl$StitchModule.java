// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mhd;
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
            a = new HashMap(13);
            a.put(mhd.a, Integer.valueOf(0));
            a.put(mhd.b, Integer.valueOf(1));
            a.put(mhd.c, Integer.valueOf(2));
            a.put(mhd.d, Integer.valueOf(3));
            a.put(mhd.e, Integer.valueOf(4));
            a.put(mhd.f, Integer.valueOf(5));
            a.put(mhd.g, Integer.valueOf(6));
            a.put(mhd.h, Integer.valueOf(7));
            a.put(mhd.i, Integer.valueOf(8));
            a.put(mhd.j, Integer.valueOf(9));
            a.put(mhd.k, Integer.valueOf(10));
            a.put(mhd.l, Integer.valueOf(11));
            a.put(mhd.m, Integer.valueOf(12));
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
            mhd.a(context, olm);
            return;

        case 1: // '\001'
            mhd.a(olm);
            return;

        case 2: // '\002'
            mhd.b(context, olm);
            return;

        case 3: // '\003'
            mhd.b(olm);
            return;

        case 4: // '\004'
            mhd.c(olm);
            return;

        case 5: // '\005'
            mhd.d(olm);
            return;

        case 6: // '\006'
            mhd.e(olm);
            return;

        case 7: // '\007'
            mhd.f(olm);
            return;

        case 8: // '\b'
            mhd.g(olm);
            return;

        case 9: // '\t'
            mhd.h(olm);
            return;

        case 10: // '\n'
            mhd.i(olm);
            return;

        case 11: // '\013'
            mhd.c(context, olm);
            return;

        case 12: // '\f'
            mhd.j(olm);
            break;
        }
    }

    public ()
    {
    }
}
