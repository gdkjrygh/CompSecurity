// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bu;

// Referenced classes of package com.google.android.gms.ads.internal:
//            n, zzq

final class a
    implements Runnable
{

    final e a;
    final n b;

    public final void run()
    {
        try
        {
            b.c.t.a(a);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
        }
    }

    ats.e(n n1, e e)
    {
        b = n1;
        a = e;
        super();
    }
}
