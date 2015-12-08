// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormat

class TextFormatData
    implements TextFormat
{

    private TextFormat.Color backgroundColor;
    private int backgroundOpacity;
    private String bottomInset;
    private TextFormat.Color edgeColor;
    private TextFormat.Color fillColor;
    private int fillOpacity;
    private TextFormat.Font font;
    private TextFormat.Color fontColor;
    private TextFormat.FontEdge fontEdge;
    private int fontOpacity;
    private TextFormat.Size size;

    TextFormatData()
    {
        fontColor = TextFormat.Color.DEFAULT;
        backgroundColor = TextFormat.Color.DEFAULT;
        fillColor = TextFormat.Color.DEFAULT;
        edgeColor = TextFormat.Color.DEFAULT;
        size = TextFormat.Size.DEFAULT;
        fontEdge = TextFormat.FontEdge.DEFAULT;
        font = TextFormat.Font.DEFAULT;
        fontOpacity = -1;
        backgroundOpacity = -1;
        fillOpacity = -1;
        bottomInset = "default";
    }

    public TextFormat.Color getBackgroundColor()
    {
        return backgroundColor;
    }

    public int getBackgroundOpacity()
    {
        return backgroundOpacity;
    }

    public String getBottomInset()
    {
        return bottomInset;
    }

    public TextFormat.Color getEdgeColor()
    {
        return edgeColor;
    }

    public TextFormat.Color getFillColor()
    {
        return fillColor;
    }

    public int getFillOpacity()
    {
        return fillOpacity;
    }

    public TextFormat.Font getFont()
    {
        return font;
    }

    public TextFormat.Color getFontColor()
    {
        return fontColor;
    }

    public TextFormat.FontEdge getFontEdge()
    {
        return fontEdge;
    }

    public int getFontOpacity()
    {
        return fontOpacity;
    }

    public TextFormat.Size getSize()
    {
        return size;
    }

    public void setBackgroundColor(TextFormat.Color color)
    {
        backgroundColor = color;
    }

    public void setBackgroundOpacity(int i)
    {
        backgroundOpacity = i;
    }

    public void setBottomInset(String s)
    {
        bottomInset = s;
    }

    public void setEdgeColor(TextFormat.Color color)
    {
        edgeColor = color;
    }

    public void setFillColor(TextFormat.Color color)
    {
        fillColor = color;
    }

    public void setFillOpacity(int i)
    {
        fillOpacity = i;
    }

    public void setFont(TextFormat.Font font1)
    {
        font = font1;
    }

    public void setFontColor(TextFormat.Color color)
    {
        fontColor = color;
    }

    public void setFontEdge(TextFormat.FontEdge fontedge)
    {
        fontEdge = fontedge;
    }

    public void setFontOpacity(int i)
    {
        fontOpacity = i;
    }

    public void setSize(TextFormat.Size size1)
    {
        size = size1;
    }
}
