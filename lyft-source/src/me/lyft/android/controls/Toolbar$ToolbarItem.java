// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;


public final class typefaceStyle
{

    private final int iconId;
    private final int id;
    private int layoutId;
    private int textColor;
    private final String title;
    private int typefaceStyle;

    public int getIconId()
    {
        return iconId;
    }

    public int getId()
    {
        return id;
    }

    public int getLayoutId()
    {
        return layoutId;
    }

    public int getTextColor()
    {
        return textColor;
    }

    public String getTitle()
    {
        return title;
    }

    public int getTypefaceStyle()
    {
        return typefaceStyle;
    }

    public typefaceStyle setLayoutId(int i)
    {
        layoutId = i;
        return this;
    }


    public (int i, int j)
    {
        this(i, null, j, -1);
    }

    public <init>(int i, String s)
    {
        this(i, s, 0, -1);
    }

    public <init>(int i, String s, int j)
    {
        this(i, s, j, -1);
    }

    public <init>(int i, String s, int j, int k)
    {
        this(i, s, j, k, -1);
    }

    public <init>(int i, String s, int j, int k, int l)
    {
        layoutId = 0x7f030140;
        id = i;
        title = s;
        iconId = j;
        textColor = k;
        typefaceStyle = l;
    }
}
