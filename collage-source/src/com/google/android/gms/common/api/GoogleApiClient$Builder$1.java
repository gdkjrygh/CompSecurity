// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

// Referenced classes of package com.google.android.gms.common.api:
//            c, zzp

class a
    implements Runnable
{

    final c a;
    final a b;

    public void run()
    {
        if (a(b).isFinishing() || b(b).getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            nager(b, zzp.b(b(b)), a);
            return;
        }
    }

    A(A a1, c c1)
    {
        b = a1;
        a = c1;
        super();
    }
}
