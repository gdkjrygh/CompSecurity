// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            cx, de, di

final class a
    implements Runnable
{

    final de a;
    final cx b;

    public final void run()
    {
        try
        {
            a.c.c();
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not destroy mediation adapter.", remoteexception);
        }
    }

    til.client.b(cx cx1, de de1)
    {
        b = cx1;
        a = de1;
        super();
    }
}
