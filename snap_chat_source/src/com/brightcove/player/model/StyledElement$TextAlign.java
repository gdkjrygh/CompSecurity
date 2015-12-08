// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public static final class _cls9 extends Enum
{

    public static final END CENTER;
    public static final END END;
    public static final END LEFT;
    public static final END RIGHT;
    public static final END START;
    public static final END UNDEFINED;
    private static final END a[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/brightcove/player/model/StyledElement$TextAlign, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])a.clone();
    }

    static 
    {
        UNDEFINED = new <init>("UNDEFINED", 0);
        START = new <init>("START", 1);
        LEFT = new <init>("LEFT", 2);
        CENTER = new <init>("CENTER", 3);
        RIGHT = new <init>("RIGHT", 4);
        END = new <init>("END", 5);
        a = (new a[] {
            UNDEFINED, START, LEFT, CENTER, RIGHT, END
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
