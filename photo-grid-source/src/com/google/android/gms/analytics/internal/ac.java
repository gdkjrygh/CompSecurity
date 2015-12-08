// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            as, az, ae, be, 
//            n, am, aa

public final class ac
{

    private final Context a;
    private final Context b;

    public ac(Context context)
    {
        bl.a(context);
        context = context.getApplicationContext();
        bl.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    protected static as a(aa aa)
    {
        return new as(aa);
    }

    protected static az b(aa aa)
    {
        return new az(aa);
    }

    public static ae d(aa aa)
    {
        return new ae(aa);
    }

    public static be e(aa aa)
    {
        return new be(aa);
    }

    public static n f(aa aa)
    {
        return new n(aa);
    }

    public final Context a()
    {
        return a;
    }

    public final Context b()
    {
        return b;
    }

    final am c(aa aa)
    {
        return new am(aa, this);
    }
}
