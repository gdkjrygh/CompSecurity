// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ea

final class eb
    implements Runnable
{

    final Context a;

    eb(Context context)
    {
        a = context;
        super();
    }

    public final void run()
    {
        synchronized (ea.d())
        {
            ea.b(ea.c(a));
            ea.d().notifyAll();
        }
    }
}
