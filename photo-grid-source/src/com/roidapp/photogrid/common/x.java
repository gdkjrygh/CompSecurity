// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

final class x extends BitmapDrawable
{

    public x(Resources resources)
    {
        super(resources, BitmapFactory.decodeResource(resources, 0x7f020001));
        setGravity(80);
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawColor(-1);
        super.draw(canvas);
    }
}
