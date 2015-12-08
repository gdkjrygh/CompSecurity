// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;


// Referenced classes of package org.xwalk.core:
//            XWalkUIClient

public static final class  extends Enum
{

    private static final BY_JAVASCRIPT $VALUES[];
    public static final BY_JAVASCRIPT BY_JAVASCRIPT;
    public static final BY_JAVASCRIPT BY_USER_GESTURE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(org/xwalk/core/XWalkUIClient$InitiateBy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BY_USER_GESTURE = new <init>("BY_USER_GESTURE", 0);
        BY_JAVASCRIPT = new <init>("BY_JAVASCRIPT", 1);
        $VALUES = (new .VALUES[] {
            BY_USER_GESTURE, BY_JAVASCRIPT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
