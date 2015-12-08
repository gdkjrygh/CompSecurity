// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            w, ac, z, af

final class a
    implements Runnable
{

    final String a;
    final w b;

    public final void run()
    {
        Object obj = b.h.d();
        if (!((z) (obj)).s() || ((af) (obj)).i)
        {
            b.a(6, "Persisted config not initialized . Not logging error/warn.");
            return;
        }
        a a1 = ((z) (obj)).b;
        Object obj1 = a;
        a1.e.e();
        if (a1.b() == 0L)
        {
            a1.a();
        }
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        long l = z.a(a1.e).getLong(a1.b, 0L);
        if (l <= 0L)
        {
            obj1 = z.a(a1.e).edit();
            ((android.content.edPreferences.Editor) (obj1)).putString(a1.c, ((String) (obj)));
            ((android.content.edPreferences.Editor) (obj1)).putLong(a1.b, 1L);
            ((android.content.edPreferences.Editor) (obj1)).apply();
            return;
        }
        boolean flag;
        if ((UUID.randomUUID().getLeastSignificantBits() & 0x7fffffffffffffffL) < 0x7fffffffffffffffL / (l + 1L))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = z.a(a1.e).edit();
        if (flag)
        {
            ((android.content.edPreferences.Editor) (obj1)).putString(a1.c, ((String) (obj)));
        }
        ((android.content.edPreferences.Editor) (obj1)).putLong(a1.b, l + 1L);
        ((android.content.edPreferences.Editor) (obj1)).apply();
    }

    (w w1, String s)
    {
        b = w1;
        a = s;
        super();
    }
}
