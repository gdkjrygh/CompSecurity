// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.gms.internal:
//            w, zzk

final class a
    implements Runnable
{

    final zzk a;
    final w b;

    public final void run()
    {
        try
        {
            w.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    (w w1, zzk zzk)
    {
        b = w1;
        a = zzk;
        super();
    }
}
