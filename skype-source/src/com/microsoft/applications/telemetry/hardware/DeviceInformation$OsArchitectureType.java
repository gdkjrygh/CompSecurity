// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.hardware;


// Referenced classes of package com.microsoft.applications.telemetry.hardware:
//            DeviceInformation

private static final class osArchType extends Enum
{

    private static final ARCH_ARM $VALUES[];
    public static final ARCH_ARM ARCH_ARM;
    public static final ARCH_ARM ARCH_UNKNOWN;
    public static final ARCH_ARM ARCH_X64;
    public static final ARCH_ARM ARCH_X86;
    private final int osArchType;

    public static osArchType valueOf(String s)
    {
        return (osArchType)Enum.valueOf(com/microsoft/applications/telemetry/hardware/DeviceInformation$OsArchitectureType, s);
    }

    public static osArchType[] values()
    {
        return (osArchType[])$VALUES.clone();
    }

    public final int getValue()
    {
        return osArchType;
    }

    static 
    {
        ARCH_UNKNOWN = new <init>("ARCH_UNKNOWN", 0, 0);
        ARCH_X86 = new <init>("ARCH_X86", 1, 1);
        ARCH_X64 = new <init>("ARCH_X64", 2, 2);
        ARCH_ARM = new <init>("ARCH_ARM", 3, 3);
        $VALUES = (new .VALUES[] {
            ARCH_UNKNOWN, ARCH_X86, ARCH_X64, ARCH_ARM
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        osArchType = j;
    }
}
