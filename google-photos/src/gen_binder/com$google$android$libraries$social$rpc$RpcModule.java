// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import java.util.HashMap;
import nyj;
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
            a.put(nyj.a, Integer.valueOf(0));
            a.put(nyj.b, Integer.valueOf(1));
            a.put(nyj.c, Integer.valueOf(2));
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
            nyj.a(context, olm);
            return;

        case 1: // '\001'
            nyj.b(context, olm);
            return;

        case 2: // '\002'
            nyj.a(olm);
            break;
        }
    }

    public ()
    {
    }
}
