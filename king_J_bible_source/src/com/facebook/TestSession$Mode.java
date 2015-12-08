// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            TestSession

private static final class  extends Enum
{

    private static final SHARED ENUM$VALUES[];
    public static final SHARED PRIVATE;
    public static final SHARED SHARED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/TestSession$Mode, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        PRIVATE = new <init>("PRIVATE", 0);
        SHARED = new <init>("SHARED", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            PRIVATE, SHARED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
