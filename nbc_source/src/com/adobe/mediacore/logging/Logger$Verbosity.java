// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.logging;


// Referenced classes of package com.adobe.mediacore.logging:
//            Logger

public static final class level extends Enum
{

    private static final DEBUG $VALUES[];
    public static final DEBUG DEBUG;
    public static final DEBUG ERROR;
    public static final DEBUG INFO;
    public static final DEBUG NONE;
    public static final DEBUG WARN;
    private final int level;

    public static level valueOf(String s)
    {
        return (level)Enum.valueOf(com/adobe/mediacore/logging/Logger$Verbosity, s);
    }

    public static level[] values()
    {
        return (level[])$VALUES.clone();
    }

    public int getLevel()
    {
        return level;
    }

    static 
    {
        NONE = new <init>("NONE", 0, 0);
        ERROR = new <init>("ERROR", 1, 1);
        WARN = new <init>("WARN", 2, 2);
        INFO = new <init>("INFO", 3, 3);
        DEBUG = new <init>("DEBUG", 4, 4);
        $VALUES = (new .VALUES[] {
            NONE, ERROR, WARN, INFO, DEBUG
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        level = j;
    }
}
