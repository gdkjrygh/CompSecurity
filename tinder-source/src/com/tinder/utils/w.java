// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

public final class w extends EdgeEffect
{
    public static interface a
    {

        public abstract void onPull(float f, float f1);

        public abstract void onRelease();
    }


    public a a;
    public boolean b;

    public w(Context context)
    {
        super(context);
    }

    public final boolean draw(Canvas canvas)
    {
        if (b)
        {
            return true;
        } else
        {
            return super.draw(canvas);
        }
    }

    public final void onPull(float f)
    {
        super.onPull(f);
        if (a != null)
        {
            a.onPull(f, 0.0F);
        }
    }

    public final void onPull(float f, float f1)
    {
        super.onPull(f, f1);
        if (a != null)
        {
            a.onPull(f, f1);
        }
    }

    public final void onRelease()
    {
        super.onRelease();
        if (a != null && !isFinished())
        {
            a.onRelease();
        }
    }

    public final void setColor(int i)
    {
        super.setColor(i);
    }
}
