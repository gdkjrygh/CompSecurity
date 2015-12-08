// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkNavigationHistoryInternal

public static final class  extends Enum
{

    private static final FORWARD $VALUES[];
    public static final FORWARD BACKWARD;
    public static final FORWARD FORWARD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/internal/XWalkNavigationHistoryInternal$DirectionInternal, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BACKWARD = new <init>("BACKWARD", 0);
        FORWARD = new <init>("FORWARD", 1);
        $VALUES = (new .VALUES[] {
            BACKWARD, FORWARD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
