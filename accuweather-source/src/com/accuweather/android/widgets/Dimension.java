// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;


public class Dimension
{

    private int height;
    private int width;

    public Dimension()
    {
    }

    public Dimension(int i, int j)
    {
        width = i;
        height = j;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setWidth(int i)
    {
        width = i;
    }
}
