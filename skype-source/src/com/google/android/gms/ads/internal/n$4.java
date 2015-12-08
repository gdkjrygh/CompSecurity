// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.ads.internal:
//            n, zzq

final class b
    implements Runnable
{

    final String a;
    final gb b;
    final n c;

    public final void run()
    {
        try
        {
            ((bw)c.c.v.get(a)).a((f)b.w);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
        }
    }

    .client.b(n n1, String s, gb gb1)
    {
        c = n1;
        a = s;
        b = gb1;
        super();
    }
}
