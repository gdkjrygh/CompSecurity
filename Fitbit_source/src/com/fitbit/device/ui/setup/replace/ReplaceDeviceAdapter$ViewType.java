// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;


// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ReplaceDeviceAdapter

private static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    static  a(int i)
    {
         a1[] = values();
        if (i < a1.length)
        {
            return a1[i];
        } else
        {
            return null;
        }
    }

    public static values valueOf(String s)
    {
        return (values)Enum.valueOf(com/fitbit/device/ui/setup/replace/ReplaceDeviceAdapter$ViewType, s);
    }

    public static values[] values()
    {
        return (values[])d.clone();
    }

    static 
    {
        a = new <init>("DEVICE", 0);
        b = new <init>("MOTIONBIT", 1);
        c = new <init>("ADD_NEW", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
