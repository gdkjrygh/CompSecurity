// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;


// Referenced classes of package com.microsoft.applications.skypetelemetry.hardware:
//            DeviceInformation

private static final class e extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d f[];
    private final int e;

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/microsoft/applications/skypetelemetry/hardware/DeviceInformation$a, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new <init>("ARCH_UNKNOWN", 0, 0);
        b = new <init>("ARCH_X86", 1, 1);
        c = new <init>("ARCH_X64", 2, 2);
        d = new <init>("ARCH_ARM", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        e = j;
    }
}
