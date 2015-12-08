// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.internal.DeviceStatus;

final class jwl
    implements Runnable
{

    private jwh a;
    private DeviceStatus b;

    jwl(jwj jwj, jwh jwh1, DeviceStatus devicestatus)
    {
        a = jwh1;
        b = devicestatus;
        super();
    }

    public final void run()
    {
        jwh.a(a, b);
    }
}
