// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            hv, hs, hm, bg

final class hw
    implements Runnable
{

    final bg a;
    final hv b;

    hw(hv hv1, bg bg1)
    {
        b = hv1;
        a = bg1;
        super();
    }

    public final void run()
    {
        hs.a(b.a).zzc(a);
        a.a();
    }
}
