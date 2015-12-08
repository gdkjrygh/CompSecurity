// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.graphics.Bitmap;

public final class d
{

    Bitmap a;
    int b;

    public d(Bitmap bitmap)
    {
        a = bitmap;
        b = 0;
    }

    private boolean c()
    {
        return (b / 90) % 2 != 0;
    }

    public final int a()
    {
        if (c())
        {
            return a.getWidth();
        } else
        {
            return a.getHeight();
        }
    }

    public final int b()
    {
        if (c())
        {
            return a.getHeight();
        } else
        {
            return a.getWidth();
        }
    }
}
