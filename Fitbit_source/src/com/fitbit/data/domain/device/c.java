// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;


// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareVersion

public class c
{

    private FirmwareVersion a;
    private FirmwareVersion b;

    public c(FirmwareVersion firmwareversion)
    {
        this(firmwareversion, FirmwareVersion.a);
    }

    public c(FirmwareVersion firmwareversion, FirmwareVersion firmwareversion1)
    {
        a = firmwareversion;
        b = firmwareversion1;
    }

    public FirmwareVersion a()
    {
        return a;
    }

    public FirmwareVersion b()
    {
        return b;
    }
}
