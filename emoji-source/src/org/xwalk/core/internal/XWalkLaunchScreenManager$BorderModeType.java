// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkLaunchScreenManager

private static final class  extends Enum
{

    private static final NONE $VALUES[];
    public static final NONE NONE;
    public static final NONE REPEAT;
    public static final NONE ROUND;
    public static final NONE STRETCH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REPEAT = new <init>("REPEAT", 0);
        STRETCH = new <init>("STRETCH", 1);
        ROUND = new <init>("ROUND", 2);
        NONE = new <init>("NONE", 3);
        $VALUES = (new .VALUES[] {
            REPEAT, STRETCH, ROUND, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
