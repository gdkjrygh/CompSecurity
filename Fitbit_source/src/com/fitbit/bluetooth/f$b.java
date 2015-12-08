// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.bluetooth:
//            f

public static class a
{
    private static class a
    {

        int a;
        int b;
        long c;

        private a()
        {
        }

        a(f._cls1 _pcls1)
        {
            this();
        }
    }


    private final Map a = new HashMap();

    public float a(UUID uuid, TimeUnit timeunit)
    {
        uuid = (a)a.get(uuid);
        if (uuid == null)
        {
            return (0.0F / 0.0F);
        } else
        {
            return ((1.0F * (float)((a) (uuid)).a) / (float)((a) (uuid)).b) * (float)TimeUnit.MILLISECONDS.convert(1L, timeunit);
        }
    }

    public void a(UUID uuid, int i, long l)
    {
        a a1 = (a)a.get(uuid);
        if (a1 == null)
        {
            a1 = new a(null);
            a1.c = l;
            a1.a = i;
            a.put(uuid, a1);
            return;
        } else
        {
            a1.a = a1.a + i;
            a1.b = (int)((long)a1.b + (l - a1.c));
            a1.c = l;
            return;
        }
    }

    public a()
    {
    }
}
