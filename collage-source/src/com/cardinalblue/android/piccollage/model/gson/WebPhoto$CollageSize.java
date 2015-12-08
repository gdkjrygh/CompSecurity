// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;


// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable, WebPhoto

public static class height
    implements IGsonable
{

    private int height;
    private int width;

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public boolean isSquare()
    {
        while (width == -1 || height == -1 || width != height) 
        {
            return false;
        }
        return true;
    }

    public I(int i, int j)
    {
        width = -1;
        height = -1;
        width = i;
        height = j;
    }
}
