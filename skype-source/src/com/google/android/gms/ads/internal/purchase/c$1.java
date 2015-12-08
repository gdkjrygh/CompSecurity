// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.er;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            c, f, k, g

final class b
    implements Runnable
{

    final f a;
    final Intent b;
    final c c;

    public final void run()
    {
        if (com.google.android.gms.ads.internal.purchase.c.a(c).a(a.b, b))
        {
            com.google.android.gms.ads.internal.purchase.c.c(c).a(new g(com.google.android.gms.ads.internal.purchase.c.b(c), a.c, true, -1, b, a));
            return;
        }
        try
        {
            com.google.android.gms.ads.internal.purchase.c.c(c).a(new g(com.google.android.gms.ads.internal.purchase.c.b(c), a.c, false, -1, b, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.c("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (c c1, f f1, Intent intent)
    {
        c = c1;
        a = f1;
        b = intent;
        super();
    }
}
