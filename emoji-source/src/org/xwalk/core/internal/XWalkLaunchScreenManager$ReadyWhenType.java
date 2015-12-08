// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkLaunchScreenManager

private static final class  extends Enum
{

    private static final CUSTOM $VALUES[];
    public static final CUSTOM COMPLETE;
    public static final CUSTOM CUSTOM;
    public static final CUSTOM FIRST_PAINT;
    public static final CUSTOM USER_INTERACTIVE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FIRST_PAINT = new <init>("FIRST_PAINT", 0);
        USER_INTERACTIVE = new <init>("USER_INTERACTIVE", 1);
        COMPLETE = new <init>("COMPLETE", 2);
        CUSTOM = new <init>("CUSTOM", 3);
        $VALUES = (new .VALUES[] {
            FIRST_PAINT, USER_INTERACTIVE, COMPLETE, CUSTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
