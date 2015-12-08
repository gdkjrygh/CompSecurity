// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mff;
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
            a = new HashMap(3);
            a.put(mff.a, Integer.valueOf(0));
            a.put(mff.b, Integer.valueOf(1));
            a.put(mff.c, Integer.valueOf(2));
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
            mff.a(olm);
            return;

        case 1: // '\001'
            mff.b(olm);
            return;

        case 2: // '\002'
            mff.c(olm);
            break;
        }
    }

    public ()
    {
    }
}
