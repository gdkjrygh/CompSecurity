// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.lang.reflect.Field;
import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            ci, j, crocodile

final class aj
    implements Runnable
{

    final Object a;
    final int b;
    final String c;
    final crocodile d;

    aj(crocodile crocodile, Object obj, int i, String s)
    {
        d = crocodile;
        a = obj;
        b = i;
        c = s;
        super();
    }

    public final void run()
    {
        try
        {
            int i = a.getClass().getDeclaredFields()[0].getInt(a);
            if (i != b && c.split("\\.").length < 2)
            {
                ci.b().d.a("flurry", c, Integer.valueOf(i), new JSONObject());
            }
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }
}
