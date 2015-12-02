// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.animatablelistview;


// Referenced classes of package com.facebook.widget.animatablelistview:
//            p, i

public final class o extends Enum
{

    private static final o $VALUES[];
    public static final o HIDE_WITH_ANIMATION_DOWN;
    public static final o HIDE_WITH_ANIMATION_UP;
    public static final o REVEAL_WITH_ANIMATION_DOWN;
    public static final o REVEAL_WITH_ANIMATION_UP;

    private o(String s, int j)
    {
        super(s, j);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/facebook/widget/animatablelistview/o, s);
    }

    public static o[] values()
    {
        return (o[])$VALUES.clone();
    }

    public i toMutationType()
    {
        switch (p.a[ordinal()])
        {
        default:
            throw new RuntimeException("Unknown type");

        case 1: // '\001'
            return i.ADD_WITH_ANIMATION_DOWN;

        case 2: // '\002'
            return i.ADD_WITH_ANIMATION_UP;

        case 3: // '\003'
            return i.REMOVE_WITH_ANIMATION_DOWN;

        case 4: // '\004'
            return i.REMOVE_WITH_ANIMATION_UP;
        }
    }

    static 
    {
        REVEAL_WITH_ANIMATION_UP = new o("REVEAL_WITH_ANIMATION_UP", 0);
        REVEAL_WITH_ANIMATION_DOWN = new o("REVEAL_WITH_ANIMATION_DOWN", 1);
        HIDE_WITH_ANIMATION_UP = new o("HIDE_WITH_ANIMATION_UP", 2);
        HIDE_WITH_ANIMATION_DOWN = new o("HIDE_WITH_ANIMATION_DOWN", 3);
        $VALUES = (new o[] {
            REVEAL_WITH_ANIMATION_UP, REVEAL_WITH_ANIMATION_DOWN, HIDE_WITH_ANIMATION_UP, HIDE_WITH_ANIMATION_DOWN
        });
    }
}
