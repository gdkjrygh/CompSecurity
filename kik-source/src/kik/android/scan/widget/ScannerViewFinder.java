// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kik.android.chat.KikApplication;

public class ScannerViewFinder extends FrameLayout
{

    private final Paint a;
    private int b;
    private final Paint c;
    private int d;
    private int e;
    private int f;

    public ScannerViewFinder(Context context)
    {
        this(context, null);
    }

    public ScannerViewFinder(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ScannerViewFinder(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Paint();
        b = KikApplication.e(0x7f0c0005);
        c = new Paint();
        d = KikApplication.a(40);
        e = KikApplication.a(40);
        f = KikApplication.a(200);
        a.setAntiAlias(true);
        a.setColor(Color.argb(81, 255, 255, 255));
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setStrokeWidth(4F);
        c.setAntiAlias(true);
        c.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        setWillNotDraw(false);
        setLayerType(1, null);
    }

    public final Point a()
    {
        return new Point(getMeasuredWidth() / 2, (getMeasuredHeight() - f) / 2);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawColor(b);
        int i = Math.min(getWidth() - d - e, getHeight() - f);
        canvas.drawCircle(getWidth() / 2, (getHeight() - f) / 2, i / 2, c);
        canvas.drawCircle(getWidth() / 2, (getHeight() - f) / 2, i / 2, a);
    }
}
