// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ColorModel

public class ColorOption
{

    ColorModel color;
    ColorModel contrastColor;
    private String thumbnail;

    public ColorOption()
    {
        this(-1, 0xff000000);
    }

    public ColorOption(int i)
    {
        this(i, -1);
    }

    public ColorOption(int i, int j)
    {
        color = new ColorModel();
        color.setColor(i);
        contrastColor = new ColorModel();
        if (j == 0)
        {
            contrastColor.setColor(legacyConstrastColor(i));
            return;
        } else
        {
            contrastColor.setColor(j);
            return;
        }
    }

    private int legacyConstrastColor(int i)
    {
        int j = -1;
        if (i == -1)
        {
            j = 0xff000000;
        }
        return j;
    }

    public static ColorOption parse(int i)
    {
        return new ColorOption(i);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ColorOption)
        {
            if (getColor() == ((ColorOption) (obj = (ColorOption)obj)).getColor())
            {
                return true;
            }
        }
        return false;
    }

    public int getColor()
    {
        return color.getColor();
    }

    public int getContrastColor()
    {
        return contrastColor.getColor();
    }

    public String getThumbnail()
    {
        return thumbnail;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("color: ").append(getColor()).append(", contrast color: ").append(getContrastColor());
        return stringbuilder.toString();
    }
}
