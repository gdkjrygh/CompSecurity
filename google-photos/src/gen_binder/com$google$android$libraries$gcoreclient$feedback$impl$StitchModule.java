// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mbq;
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
            a = new HashMap(4);
            a.put(mbq.a, Integer.valueOf(0));
            a.put(mbq.b, Integer.valueOf(1));
            a.put(mbq.c, Integer.valueOf(2));
            a.put(mbq.d, Integer.valueOf(3));
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
            mbq.a(olm);
            return;

        case 1: // '\001'
            mbq.b(olm);
            return;

        case 2: // '\002'
            mbq.c(olm);
            return;

        case 3: // '\003'
            mbq.d(olm);
            break;
        }
    }

    public ()
    {
    }
}
