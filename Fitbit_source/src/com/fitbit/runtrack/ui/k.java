// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.fitbit.maps.a;
import com.fitbit.maps.b;
import com.fitbit.util.fonts.FitbitFont;

public class k
{

    final Drawable a;
    final Rect b;
    final Paint c = new Paint();
    final Context d;

    public k(Context context, int i)
    {
        byte byte0 = 32;
        super();
        d = context;
        a = d.getResources().getDrawable(i);
        int j = a.getIntrinsicWidth();
        i = j;
        if (j <= 0)
        {
            i = a.getMinimumWidth();
        }
        j = i;
        if (i <= 0)
        {
            j = 32;
        }
        int l = a.getIntrinsicHeight();
        i = l;
        if (l <= 0)
        {
            i = a.getMinimumHeight();
        }
        if (i <= 0)
        {
            i = byte0;
        }
        b = new Rect(0, 0, j, i);
        c.setAntiAlias(true);
        c.setLinearText(true);
        c.setColor(-1);
        c.setTypeface(FitbitFont.e.a(context, Typeface.DEFAULT_BOLD));
        c.setStyle(android.graphics.Paint.Style.FILL);
    }

    public a a(String s)
    {
        Bitmap bitmap = Bitmap.createBitmap(b.width(), b.height(), android.graphics.Bitmap.Config.ARGB_8888);
        a.setBounds(b);
        Canvas canvas = new Canvas(bitmap);
        a.draw(canvas);
        Rect rect = new Rect();
        float f;
        int j;
        if (a.getPadding(rect))
        {
            rect.set(b.left + rect.left, b.top + rect.top, b.right - rect.right, b.bottom - rect.bottom);
        } else
        {
            rect = b;
        }
        rect.top = (int)((float)rect.top + d.getResources().getDimension(0x7f0a00f9));
        canvas.save();
        canvas.translate(rect.left, rect.top);
        s = s.split("\\s");
        f = ((float)rect.height() - (float)(s.length - 1) * c.getFontSpacing()) / 2.0F;
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            float f1 = c.measureText(s1);
            canvas.drawText(s1, ((float)rect.width() - f1) / 2.0F, f, c);
            f += c.getFontSpacing();
        }

        canvas.restore();
        return com.fitbit.maps.b.a(bitmap);
    }

    public void a(float f)
    {
        c.setTextSize(f);
    }
}
