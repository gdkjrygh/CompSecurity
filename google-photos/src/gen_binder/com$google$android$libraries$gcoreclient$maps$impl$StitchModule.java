// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import mei;
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
            a.put(mei.a, Integer.valueOf(0));
            a.put(mei.b, Integer.valueOf(1));
            a.put(mei.c, Integer.valueOf(2));
            a.put(mei.d, Integer.valueOf(3));
            a.put(mei.e, Integer.valueOf(4));
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
            mei.a(olm);
            return;

        case 1: // '\001'
            mei.b(olm);
            return;

        case 2: // '\002'
            mei.c(olm);
            return;

        case 3: // '\003'
            mei.d(olm);
            return;

        case 4: // '\004'
            mei.e(olm);
            break;
        }
    }

    public ()
    {
    }
}
