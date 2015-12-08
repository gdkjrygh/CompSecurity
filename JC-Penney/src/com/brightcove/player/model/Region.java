// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement, Length

public class Region extends StyledElement
{

    private Length a;
    private Length b;
    private Length c;
    private Length n;
    private DisplayAlign o;

    public Region()
    {
    }

    public DisplayAlign getDisplayAlign()
    {
        return o;
    }

    public Length getExtentX()
    {
        return c;
    }

    public Length getExtentY()
    {
        return n;
    }

    public Length getOriginX()
    {
        return a;
    }

    public Length getOriginY()
    {
        return b;
    }

    public void setDisplayAlign(DisplayAlign displayalign)
    {
        o = displayalign;
    }

    public void setExtentX(Length length)
    {
        c = length;
    }

    public void setExtentY(Length length)
    {
        n = length;
    }

    public void setOriginX(Length length)
    {
        a = length;
    }

    public void setOriginY(Length length)
    {
        b = length;
    }
}
