// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.b;

import com.google.android.apps.gsa.shared.exception.GenericGsaError;
import com.google.android.apps.gsa.shared.util.a.l;
import com.google.android.apps.gsa.shared.util.b;
import com.google.android.apps.gsa.shared.util.debug.c;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.gsa.shared.b:
//            b, f, c, e

public final class a
{

    private static final long a;
    private static final long b;
    private static volatile a c;
    private final a.a d;
    private final a.a e;
    private final b f;
    private final e g;

    static long a()
    {
        return b;
    }

    public static void a(int i)
    {
        Object obj = new GenericGsaError(29, 0xe0003);
        a a1 = c;
        if (a1 == null)
        {
            obj = new com.google.android.apps.gsa.shared.b.b(((com.google.android.apps.gsa.shared.exception.a) (obj)));
        } else
        {
            obj = new com.google.android.apps.gsa.shared.b.c(((com.google.android.apps.gsa.shared.exception.a) (obj)), (l)a1.d.a(), (c)a1.e.a(), a1.f, a1.g);
        }
        obj.c = i;
        ((f) (obj)).a();
    }

    static long b()
    {
        return a;
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(2L);
        b = TimeUnit.HOURS.toMillis(2L);
    }
}
