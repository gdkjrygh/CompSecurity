// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            aa, ae, v, ai, 
//            j, y, s

public final class t
{

    private final Context a;
    private final Context b;

    public t(Context context)
    {
        y.a(context);
        context = context.getApplicationContext();
        y.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    protected static aa a(s s)
    {
        return new aa(s);
    }

    protected static ae b(s s)
    {
        return new ae(s);
    }

    public static v d(s s)
    {
        return new v(s);
    }

    public static ai e(s s)
    {
        return new ai(s);
    }

    public static j f(s s)
    {
        return new j(s);
    }

    public final Context a()
    {
        return a;
    }

    public final Context b()
    {
        return b;
    }

    final com.google.android.gms.analytics.internal.y c(s s)
    {
        return new com.google.android.gms.analytics.internal.y(s, this);
    }
}
