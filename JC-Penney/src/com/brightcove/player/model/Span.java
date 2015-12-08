// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            StyledElement

public class Span extends StyledElement
{

    private String a;

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
            d = styledelement.getID();
            e = styledelement.getStyleName();
            f = styledelement.getColor();
            g = styledelement.getBackgroundColor();
            h = styledelement.getFontSize();
            j = styledelement.getFontStyle();
            m = styledelement.getFontFamily();
            return;
        }
    }

    public Span(String s)
    {
        a = s;
    }

    public String getText()
    {
        return a;
    }

    public void setText(String s)
    {
        a = s;
    }
}
