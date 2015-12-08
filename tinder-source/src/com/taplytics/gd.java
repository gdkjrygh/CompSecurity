// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;

// Referenced classes of package com.taplytics:
//            hk, ge, turkey

public final class gd extends ShapeDrawable
{

    private final Paint a = new Paint(getPaint());
    private final Paint b;
    private final int c = hk.a(2.0F);

    public gd(int i)
    {
        super(new RectShape());
        a.setColor(0);
        b = new Paint(a);
        Paint paint = new Paint(a);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(i);
        b.setStyle(android.graphics.Paint.Style.FILL);
        b.setStrokeWidth(2.0F);
        b.setColor(i);
    }

    public static String a(turkey turkey1)
    {
        switch (ge.a[turkey1.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return "View Selection Mode";

        case 2: // '\002'
            return "Navigate to desired activity or screen";

        case 3: // '\003'
            return "Choose a button to track clicks.";

        case 4: // '\004'
            return "Connection lost. Attempting to reconnect.";
        }
    }

    public static String b(turkey turkey1)
    {
        switch (ge.a[turkey1.ordinal()])
        {
        case 3: // '\003'
        default:
            return "";

        case 1: // '\001'
            return "Tap any view.";

        case 2: // '\002'
            return "Press the button on Taplytics when you've arrived";

        case 4: // '\004'
            return "Check your network connection.";
        }
    }

    protected final void onDraw(Shape shape, Canvas canvas, Paint paint)
    {
        int i = hk.a(35F);
        int j = canvas.getWidth();
        int k = canvas.getHeight();
        paint = new Rect(0, 0, j, i);
        Rect rect = new Rect(0, i, c, k - c);
        Rect rect1 = new Rect(j - c, i, j, k - c);
        Rect rect2 = new Rect(0, k - c, j, k);
        shape.draw(canvas, a);
        canvas.drawRect(paint, b);
        canvas.drawRect(rect, b);
        canvas.drawRect(rect1, b);
        canvas.drawRect(rect2, b);
    }
}
