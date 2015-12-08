// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import android.os.Handler;

// Referenced classes of package com.facebook.rebound:
//            e

final class d
    implements Runnable
{

    final b.b a;

    d(b.b b)
    {
        a = b;
        super();
    }

    public final void run()
    {
        if (!a.c || a.d == null)
        {
            return;
        } else
        {
            a.d.b();
            a.a.post(a.b);
            return;
        }
    }
}
