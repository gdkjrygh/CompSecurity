// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public class RoundCornerDecorator
{

    private Drawable a;
    private Resources b;

    public RoundCornerDecorator(Resources resources)
    {
        b = resources;
    }

    public final void a()
    {
        a = b.getDrawable(0x7f0201f2);
    }

    public final void a(int i)
    {
        a.setColorFilter(new PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
    }

    public final void a(Canvas canvas)
    {
        if (a != null)
        {
            a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            a.draw(canvas);
        }
    }
}
