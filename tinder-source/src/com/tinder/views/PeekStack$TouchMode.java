// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;


// Referenced classes of package com.tinder.views:
//            PeekStack

static final class  extends Enum
{

    private static final ANIMATING $VALUES[];
    public static final ANIMATING ANIMATING;
    public static final ANIMATING COLLAPSED;
    public static final ANIMATING DRAGGING;
    public static final ANIMATING EXPANDED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/views/PeekStack$TouchMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COLLAPSED = new <init>("COLLAPSED", 0);
        EXPANDED = new <init>("EXPANDED", 1);
        DRAGGING = new <init>("DRAGGING", 2);
        ANIMATING = new <init>("ANIMATING", 3);
        $VALUES = (new .VALUES[] {
            COLLAPSED, EXPANDED, DRAGGING, ANIMATING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
