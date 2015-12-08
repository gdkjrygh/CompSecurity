// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import lwt;
import olm;
import olv;

public final class Y
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(6);
            a.put(lwt.a, Integer.valueOf(0));
            a.put(lwt.b, Integer.valueOf(1));
            a.put(lwt.c, Integer.valueOf(2));
            a.put(lwt.d, Integer.valueOf(3));
            a.put(lwt.e, Integer.valueOf(4));
            a.put(lwt.f, Integer.valueOf(5));
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
            lwt.a(olm);
            return;

        case 1: // '\001'
            lwt.b(olm);
            return;

        case 2: // '\002'
            lwt.c(olm);
            return;

        case 3: // '\003'
            lwt.d(olm);
            return;

        case 4: // '\004'
            lwt.e(olm);
            return;

        case 5: // '\005'
            lwt.f(olm);
            break;
        }
    }

    public Y()
    {
    }
}
