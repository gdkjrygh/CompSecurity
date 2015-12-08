// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkUIClientInternal

public static final class  extends Enum
{

    private static final CANCELLED $VALUES[];
    public static final CANCELLED CANCELLED;
    public static final CANCELLED FAILED;
    public static final CANCELLED FINISHED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FINISHED = new <init>("FINISHED", 0);
        FAILED = new <init>("FAILED", 1);
        CANCELLED = new <init>("CANCELLED", 2);
        $VALUES = (new .VALUES[] {
            FINISHED, FAILED, CANCELLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
