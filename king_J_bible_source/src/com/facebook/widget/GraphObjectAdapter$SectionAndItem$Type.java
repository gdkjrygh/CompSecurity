// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter

public static final class  extends Enum
{

    public static final ACTIVITY_CIRCLE ACTIVITY_CIRCLE;
    private static final ACTIVITY_CIRCLE ENUM$VALUES[];
    public static final ACTIVITY_CIRCLE GRAPH_OBJECT;
    public static final ACTIVITY_CIRCLE SECTION_HEADER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/widget/GraphObjectAdapter$SectionAndItem$Type, s);
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
        GRAPH_OBJECT = new <init>("GRAPH_OBJECT", 0);
        SECTION_HEADER = new <init>("SECTION_HEADER", 1);
        ACTIVITY_CIRCLE = new <init>("ACTIVITY_CIRCLE", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            GRAPH_OBJECT, SECTION_HEADER, ACTIVITY_CIRCLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
