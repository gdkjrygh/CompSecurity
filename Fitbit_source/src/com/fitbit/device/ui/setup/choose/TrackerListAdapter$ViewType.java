// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;


// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            TrackerListAdapter

private static final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

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
        return (values)Enum.valueOf(com/fitbit/device/ui/setup/choose/TrackerListAdapter$ViewType, s);
    }

    public static values[] values()
    {
        return (values[])c.clone();
    }

    static 
    {
        a = new <init>("DEVICE", 0);
        b = new <init>("SIGNUP", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
