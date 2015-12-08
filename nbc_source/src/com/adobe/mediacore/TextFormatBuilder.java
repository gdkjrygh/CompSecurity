// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormatData, TextFormat

public final class TextFormatBuilder
{

    private TextFormatData textFormat;

    public TextFormatBuilder()
    {
        textFormat = new TextFormatData();
    }

    public TextFormatBuilder(TextFormat.Font font, TextFormat.Size size, TextFormat.FontEdge fontedge, TextFormat.Color color, TextFormat.Color color1, TextFormat.Color color2, TextFormat.Color color3, 
            int i, int j, int k, String s)
    {
        textFormat = new TextFormatData();
        textFormat.setFont(font);
        textFormat.setSize(size);
        textFormat.setFontEdge(fontedge);
        textFormat.setFontColor(color);
        textFormat.setBackgroundColor(color1);
        textFormat.setFillColor(color2);
        textFormat.setEdgeColor(color3);
        textFormat.setFontOpacity(i);
        textFormat.setBackgroundOpacity(j);
        textFormat.setFillOpacity(k);
        textFormat.setBottomInset(s);
    }

    public TextFormatBuilder setBackgroundColor(TextFormat.Color color)
    {
        textFormat.setBackgroundColor(color);
        return this;
    }

    public TextFormatBuilder setBackgroundOpacity(int i)
    {
        textFormat.setBackgroundOpacity(i);
        return this;
    }

    public TextFormatBuilder setBottomInset(String s)
    {
        textFormat.setBottomInset(s);
        return this;
    }

    public TextFormatBuilder setEdgeColor(TextFormat.Color color)
    {
        textFormat.setEdgeColor(color);
        return this;
    }

    public TextFormatBuilder setFillColor(TextFormat.Color color)
    {
        textFormat.setFillColor(color);
        return this;
    }

    public TextFormatBuilder setFillOpacity(int i)
    {
        textFormat.setFillOpacity(i);
        return this;
    }

    public TextFormatBuilder setFont(TextFormat.Font font)
    {
        textFormat.setFont(font);
        return this;
    }

    public TextFormatBuilder setFontColor(TextFormat.Color color)
    {
        textFormat.setFontColor(color);
        return this;
    }

    public TextFormatBuilder setFontEdge(TextFormat.FontEdge fontedge)
    {
        textFormat.setFontEdge(fontedge);
        return this;
    }

    public TextFormatBuilder setFontOpacity(int i)
    {
        textFormat.setFontOpacity(i);
        return this;
    }

    public TextFormatBuilder setSize(TextFormat.Size size)
    {
        textFormat.setSize(size);
        return this;
    }

    public TextFormat toTextFormat()
    {
        return textFormat;
    }
}
