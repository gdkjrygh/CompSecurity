// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tab;


// Referenced classes of package com.hmobile.tab:
//            TabView

public static final class  extends Enum
{

    public static final BOTTOM BOTTOM;
    private static final BOTTOM ENUM$VALUES[];
    public static final BOTTOM TOP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/hmobile/tab/TabView$Orientation, s);
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
        TOP = new <init>("TOP", 0);
        BOTTOM = new <init>("BOTTOM", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            TOP, BOTTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
