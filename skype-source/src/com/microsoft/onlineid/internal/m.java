// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.microsoft.onlineid.internal:
//            b, k

public final class m
{

    private final Intent a;
    private Context b;

    public m(Intent intent)
    {
        a = intent;
    }

    public m(b b1)
    {
        this(b1.a());
        b = b1.b();
    }

    public final PendingIntent a()
    {
        k.a(b, "context");
        k.a(a, "intent");
        return PendingIntent.getActivity(b, 0, a, 0x8000000);
    }

    public final m a(Context context)
    {
        b = context;
        return this;
    }
}
