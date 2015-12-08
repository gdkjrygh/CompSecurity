// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mrl;
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
            a.put(mrl.a, Integer.valueOf(0));
            a.put(mrl.b, Integer.valueOf(1));
            a.put(mrl.c, Integer.valueOf(2));
            a.put(mrl.d, Integer.valueOf(3));
            a.put(mrl.e, Integer.valueOf(4));
            a.put(mrl.f, Integer.valueOf(5));
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
            mrl.a(context, olm);
            return;

        case 1: // '\001'
            mrl.b(context, olm);
            return;

        case 2: // '\002'
            mrl.c(context, olm);
            return;

        case 3: // '\003'
            mrl.d(context, olm);
            return;

        case 4: // '\004'
            mrl.e(context, olm);
            return;

        case 5: // '\005'
            mrl.a(olm);
            break;
        }
    }

    public ()
    {
    }
}
