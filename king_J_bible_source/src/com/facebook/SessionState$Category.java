// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            SessionState

private static final class  extends Enum
{

    public static final CLOSED_CATEGORY CLOSED_CATEGORY;
    public static final CLOSED_CATEGORY CREATED_CATEGORY;
    private static final CLOSED_CATEGORY ENUM$VALUES[];
    public static final CLOSED_CATEGORY OPENED_CATEGORY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/SessionState$Category, s);
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
        CREATED_CATEGORY = new <init>("CREATED_CATEGORY", 0);
        OPENED_CATEGORY = new <init>("OPENED_CATEGORY", 1);
        CLOSED_CATEGORY = new <init>("CLOSED_CATEGORY", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            CREATED_CATEGORY, OPENED_CATEGORY, CLOSED_CATEGORY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
