// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.commons.core.utilities;


// Referenced classes of package com.inmobi.commons.core.utilities:
//            Logger

public static final class  extends Enum
{

    private static final INTERNAL $VALUES[];
    public static final INTERNAL DEBUG;
    public static final INTERNAL ERROR;
    public static final INTERNAL INTERNAL;
    public static final INTERNAL NONE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/inmobi/commons/core/utilities/Logger$InternalLogLevel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        ERROR = new <init>("ERROR", 1);
        DEBUG = new <init>("DEBUG", 2);
        INTERNAL = new <init>("INTERNAL", 3);
        $VALUES = (new .VALUES[] {
            NONE, ERROR, DEBUG, INTERNAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
