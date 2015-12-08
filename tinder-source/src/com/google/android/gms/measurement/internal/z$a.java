// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            z

public final class b
{

    final z a;
    private final String b;
    private final long c = 0L;
    private boolean d;
    private long e;

    public final long a()
    {
        if (!d)
        {
            d = true;
            e = z.a(a).getLong(b, c);
        }
        return e;
    }

    public final void a(long l)
    {
        android.content.edPreferences.Editor editor = z.a(a).edit();
        editor.putLong(b, l);
        editor.apply();
        e = l;
    }

    public (z z1, String s)
    {
        a = z1;
        super();
        u.a(s);
        b = s;
    }
}
