// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            TestUserManager

private static final class  extends Enum
{

    private static final SHARED $VALUES[];
    public static final SHARED PRIVATE;
    public static final SHARED SHARED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/TestUserManager$Mode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRIVATE = new <init>("PRIVATE", 0);
        SHARED = new <init>("SHARED", 1);
        $VALUES = (new .VALUES[] {
            PRIVATE, SHARED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
