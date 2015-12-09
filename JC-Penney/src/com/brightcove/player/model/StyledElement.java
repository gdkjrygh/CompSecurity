// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            Element, Length

public class StyledElement extends Element
{

    protected String e;
    protected String f;
    protected String g;
    protected Length h;
    protected FontWeight i;
    protected FontStyle j;
    protected TextDecoration k;
    protected TextAlign l;
    protected String m;

    public StyledElement()
    {
    }

    public String getBackgroundColor()
    {
        return g;
    }

    public String getColor()
    {
        return f;
    }

    public String getFontFamily()
    {
        return m;
    }

    public Length getFontSize()
    {
        return h;
    }

    public FontStyle getFontStyle()
    {
        return j;
    }

    public FontWeight getFontWeight()
    {
        return i;
    }

    public String getStyleName()
    {
        return e;
    }

    public TextAlign getTextAlign()
    {
        return l;
    }

    public TextDecoration getTextDecoration()
    {
        return k;
    }

    public void setBackgroundColor(String s)
    {
        g = s;
    }

    public void setColor(String s)
    {
        f = s;
    }

    public void setFontFamily(String s)
    {
        m = s;
    }

    public void setFontSize(Length length)
    {
        h = length;
    }

    public void setFontStyle(FontStyle fontstyle)
    {
        j = fontstyle;
    }

    public void setFontWeight(FontWeight fontweight)
    {
        i = fontweight;
    }

    public void setStyleName(String s)
    {
        e = s;
    }

    public void setTextAlign(TextAlign textalign)
    {
        l = textalign;
    }

    public void setTextDecoration(TextDecoration textdecoration)
    {
        k = textdecoration;
    }
}
