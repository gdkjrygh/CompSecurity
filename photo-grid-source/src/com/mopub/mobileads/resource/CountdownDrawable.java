// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.resource;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.mopub.common.util.Dips;

// Referenced classes of package com.mopub.mobileads.resource:
//            CircleDrawable, TextDrawable

public class CountdownDrawable extends CircleDrawable
    implements TextDrawable
{

    private final Paint a = new Paint();
    private String b;
    private final float c;
    private Rect d;

    public CountdownDrawable(Context context)
    {
        b = "";
        c = Dips.dipsToFloatPixels(18F, context);
        a.setTextSize(c);
        a.setAntiAlias(true);
        a.setColor(-1);
        a.setStyle(android.graphics.Paint.Style.FILL);
        a.setTextAlign(android.graphics.Paint.Align.LEFT);
        d = new Rect();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        String s = String.valueOf(b);
        a.getTextBounds(s, 0, s.length(), d);
        int i = b();
        int j = d.width() / 2;
        int k = c();
        int l = d.height() / 2;
        canvas.drawText(s, i - j, k + l, a);
    }

    public void updateText(String s)
    {
        if (!b.equals(s))
        {
            b = s;
            invalidateSelf();
        }
    }
}
