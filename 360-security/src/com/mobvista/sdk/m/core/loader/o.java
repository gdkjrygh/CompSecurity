// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            n

final class o
    implements Runnable
{

    final Context a;
    final n b;

    o(n n1, Context context)
    {
        b = n1;
        a = context;
        super();
    }

    public final void run()
    {
        n.a(b, a, n.a(b));
    }
}
