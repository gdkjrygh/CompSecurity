// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.facebook.g;
import com.facebook.h;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;

class ce extends ReplacementSpan
{

    private final UserWithIdentifier a;
    private final int b;
    private final int c;
    private final Drawable d;
    private final int e;

    public ce(UserWithIdentifier userwithidentifier, int i, TextPaint textpaint, Resources resources)
    {
        e = i;
        a = userwithidentifier;
        b = resources.getDimensionPixelOffset(g.picked_user_span_margin_x);
        c = resources.getDimensionPixelOffset(g.picked_user_span_margin_y);
        d = a(textpaint, resources);
    }

    private Drawable a(TextPaint textpaint, Resources resources)
    {
        Drawable drawable = resources.getDrawable(h.token_field);
        float f = (float)(e - b * 2) - textpaint.measureText(" ");
        if (f < 0.0F)
        {
            throw new IllegalStateException("Space available to draw display name can not be negative");
        } else
        {
            String s = TextUtils.ellipsize(a.a().h(), textpaint, f, android.text.TextUtils.TruncateAt.END).toString();
            int i = (int)(textpaint.measureText(s) + (float)(b * 2));
            int j = (int)((float)i + textpaint.measureText(" "));
            android.graphics.Paint.FontMetricsInt fontmetricsint = textpaint.getFontMetricsInt();
            int k = (fontmetricsint.bottom - fontmetricsint.top) + c * 2;
            Bitmap bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0);
            drawable.setBounds(0, 0, i, k);
            drawable.draw(canvas);
            f = k - c - fontmetricsint.bottom;
            canvas.drawText(s, b, f, textpaint);
            textpaint = new BitmapDrawable(resources, bitmap);
            textpaint.setBounds(0, 0, j, k);
            return textpaint;
        }
    }

    public UserWithIdentifier a()
    {
        return a;
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        canvas.save();
        canvas.translate(f, i1 - d.getBounds().bottom);
        d.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        paint = (TextPaint)paint;
        if (fontmetricsint != null)
        {
            paint.getFontMetricsInt(fontmetricsint);
            fontmetricsint.top = fontmetricsint.top - c;
            fontmetricsint.bottom = fontmetricsint.bottom + c;
            fontmetricsint.ascent = fontmetricsint.top;
            fontmetricsint.descent = fontmetricsint.bottom;
        }
        return d.getBounds().width();
    }
}
