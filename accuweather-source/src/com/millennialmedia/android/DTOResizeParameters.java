// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


class DTOResizeParameters
{

    boolean allowOffScreen;
    String customClosePosition;
    int height;
    int offsetX;
    int offsetY;
    int width;
    int xMax;
    int yMax;

    DTOResizeParameters(float f, int i, int j, String s, int k, int l, boolean flag, 
            int i1, int j1)
    {
        width = (int)((float)i * f);
        height = (int)((float)j * f);
        customClosePosition = s;
        offsetX = (int)((float)k * f);
        offsetY = (int)((float)l * f);
        allowOffScreen = flag;
        xMax = i1;
        yMax = j1;
    }

    public String toString()
    {
        return String.format("width[%d] height[%d] offsetX[%d] offsetY[%d] allowOffScreen[%b] customClosePosition[%s] maxX[%d] maxY[%d]", new Object[] {
            Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(offsetX), Integer.valueOf(offsetY), Boolean.valueOf(allowOffScreen), customClosePosition, Integer.valueOf(xMax), Integer.valueOf(yMax)
        });
    }
}
