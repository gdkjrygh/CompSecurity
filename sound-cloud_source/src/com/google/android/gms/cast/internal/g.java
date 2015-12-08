// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            e, DeviceStatus

final class g
    implements Runnable
{

    final e a;
    final DeviceStatus b;
    final e.b c;

    g(e.b b1, e e1, DeviceStatus devicestatus)
    {
        c = b1;
        a = e1;
        b = devicestatus;
        super();
    }

    public final void run()
    {
        e.a(a, b);
    }
}
