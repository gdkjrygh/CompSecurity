// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.ui;


// Referenced classes of package com.fitbit.dncs.ui:
//            DncsPairingRequestDialogController

public static final class  extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];

    public static  a()
    {
        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/fitbit/dncs/ui/DncsPairingRequestDialogController$DncsPairingTrigger, s);
    }

    public static a[] values()
    {
        return (a[])c.clone();
    }

    static 
    {
        a = new <init>("AUTO", 0);
        b = new <init>("USER", 1);
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
