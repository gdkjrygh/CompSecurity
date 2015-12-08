// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a.b;

final class ac extends b
{

    boolean a;

    public ac(Drawable drawable)
    {
        super(drawable);
        a = true;
    }

    public final void draw(Canvas canvas)
    {
        if (a)
        {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f1)
    {
        if (a)
        {
            super.setHotspot(f, f1);
        }
    }

    public final void setHotspotBounds(int i, int j, int k, int l)
    {
        if (a)
        {
            super.setHotspotBounds(i, j, k, l);
        }
    }

    public final boolean setState(int ai[])
    {
        if (a)
        {
            return super.setState(ai);
        } else
        {
            return false;
        }
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        if (a)
        {
            return super.setVisible(flag, flag1);
        } else
        {
            return false;
        }
    }
}
