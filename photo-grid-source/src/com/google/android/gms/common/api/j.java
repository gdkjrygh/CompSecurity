// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.internal.uz;

// Referenced classes of package com.google.android.gms.common.api:
//            i, h

final class j
    implements Runnable
{

    final h a;
    final i b;

    j(i k, h h)
    {
        b = k;
        a = h;
        super();
    }

    public final void run()
    {
        if (i.a(b).isFinishing() || i.a(b).getSupportFragmentManager().isDestroyed())
        {
            return;
        } else
        {
            i.a(b, uz.b(i.a(b)), a);
            return;
        }
    }
}
