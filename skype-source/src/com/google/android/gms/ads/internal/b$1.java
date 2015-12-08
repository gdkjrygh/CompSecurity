// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.purchase.i;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.hi;

// Referenced classes of package com.google.android.gms.ads.internal:
//            b, p, zzq

final class a
    implements Runnable
{

    final Intent a;
    final b b;

    public final void run()
    {
        p.o();
        int j = i.a(a);
        p.o();
        if (j == 0 && b.c.j != null && b.c.j.b != null && b.c.j.b.g() != null)
        {
            b.c.j.b.g().a();
        }
        b.c.D = false;
    }

    lay.c(b b1, Intent intent)
    {
        b = b1;
        a = intent;
        super();
    }
}
