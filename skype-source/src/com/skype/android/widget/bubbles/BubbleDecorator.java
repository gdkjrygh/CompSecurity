// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.bubbles;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.LevelListDrawable;

public class BubbleDecorator
{

    private boolean a;
    private Bubblable.Direction b;
    private LevelListDrawable c;
    private Resources d;

    public BubbleDecorator(Resources resources)
    {
        d = resources;
    }

    public final void a()
    {
        c = (LevelListDrawable)d.getDrawable(0x7f02009b);
    }

    public final void a(Canvas canvas)
    {
        if (c != null)
        {
            c.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            c.draw(canvas);
        }
    }

    public final void a(Bubblable.Direction direction, boolean flag)
    {
        b = direction;
        a = flag;
        int i = d.getInteger(b.a());
        byte byte0;
        if (a && b != Bubblable.Direction.c)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        c.setLevel(i + byte0);
    }
}
