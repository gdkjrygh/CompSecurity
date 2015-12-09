// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;


// Referenced classes of package com.fitbit.pedometer:
//            PedometerAdapterHelper

public static final class internalName extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    private final String internalName;

    public static internalName a(String s)
    {
        internalName ainternalname[] = values();
        for (int i = 0; i < ainternalname.length; i++)
        {
            internalName internalname = ainternalname[i];
            if (internalname.internalName.equals(s))
            {
                return internalname;
            }
        }

        return null;
    }

    public static internalName valueOf(String s)
    {
        return (internalName)Enum.valueOf(com/fitbit/pedometer/PedometerAdapterHelper$PedometerManufacturer, s);
    }

    public static internalName[] values()
    {
        return (internalName[])d.clone();
    }

    public String a()
    {
        return internalName;
    }

    static 
    {
        a = new <init>("DUMMY", 0, "DUMMY");
        b = new <init>("HTC", 1, "HTC");
        c = new <init>("GOOGLE", 2, "GOOGLE");
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        internalName = s1;
    }
}
