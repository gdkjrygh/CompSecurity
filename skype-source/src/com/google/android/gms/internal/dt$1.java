// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            dt, dj

final class a
    implements Runnable
{

    final dt a;

    public final void run()
    {
        try
        {
            dt.a(a).a();
            return;
        }
        catch (RemoteException remoteexception)
        {
            b.b("Could not call onAdClicked.", remoteexception);
        }
    }

    til.client.b(dt dt1)
    {
        a = dt1;
        super();
    }
}
