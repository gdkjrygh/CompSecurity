// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public class Span extends StyledElement
{

    private String h;

    public Span()
    {
    }

    public Span(StyledElement styledelement)
    {
        if (styledelement == null)
        {
            throw new IllegalArgumentException("must provide a StyledElement");
        } else
        {
            a = styledelement.getID();
            b = styledelement.getStyleName();
            c = styledelement.getColor();
            d = styledelement.getBackgroundColor();
            e = styledelement.getFontSize();
            f = styledelement.getFontStyle();
            g = styledelement.getFontFamily();
            return;
        }
    }

    public Span(String s)
    {
        h = s;
    }

    public String getText()
    {
        return h;
    }

    public void setText(String s)
    {
        h = s;
    }
}
