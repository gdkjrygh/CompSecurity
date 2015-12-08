// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal:
//            me

final class mf
    implements Runnable
{

    final me a;

    mf(me me1)
    {
        a = me1;
        super();
    }

    public final void run()
    {
        if (!me.a(a).get())
        {
            return;
        } else
        {
            zzb.e("Timed out waiting for WebView to finish loading.");
            a.cancel();
            return;
        }
    }
}
