// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;


// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialogVault

public static final class value extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN MDX;
    public static final UNKNOWN PLAYER;
    public static final UNKNOWN PLAY_LAUNCHER;
    public static final UNKNOWN UNKNOWN;
    private String value;

    public static value create(String s)
    {
        value avalue[] = values();
        int j = avalue.length;
        for (int i = 0; i < j; i++)
        {
            value value1 = avalue[i];
            if (value1.value.equalsIgnoreCase(s))
            {
                return value1;
            }
        }

        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/netflix/mediaclient/ui/pin/PinDialogVault$PinInvokedFrom, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public String getValue()
    {
        return value;
    }

    static 
    {
        MDX = new <init>("MDX", 0, "mdx");
        PLAYER = new <init>("PLAYER", 1, "player");
        PLAY_LAUNCHER = new <init>("PLAY_LAUNCHER", 2, "launcher");
        UNKNOWN = new <init>("UNKNOWN", 3, "");
        $VALUES = (new .VALUES[] {
            MDX, PLAYER, PLAY_LAUNCHER, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
