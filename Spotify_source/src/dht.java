// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public final class dht
{

    public Drawable a;

    public dht(Context context)
    {
        context = context.obtainStyledAttributes(new int[] {
            0x7f010183, 0x101012a
        });
        a = context.getDrawable(0);
        context.recycle();
    }

    public final void a(Canvas canvas, int i, int j)
    {
        a.setBounds(0, j - a.getIntrinsicHeight(), i, j);
        a.draw(canvas);
    }
}
