// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.GetChars;
import com.kik.android.c.b;
import kik.android.e.f;

public final class u extends b
{

    public u(Drawable drawable, String s, String s1, f f, int i, boolean flag)
    {
        super(drawable, s, s1, f, i, flag);
    }

    public final void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        if (charsequence instanceof GetChars)
        {
            char c = ((GetChars)charsequence).charAt(i);
            if (c != '\uFEFF' && c != '\u2026' && c != '\u2025')
            {
                super.draw(canvas, charsequence, i, j, f, k, l, i1, paint);
            }
        }
    }
}
