// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;

public final class bho extends View
{

    private static final TimeInterpolator a;
    private final int b;
    private Drawable c;
    private boolean d;
    private final Paint e = new Paint();
    private final Paint f = new Paint();
    private final String g;
    private int h;
    private int i;
    private long j;
    private long k;

    public bho(Context context, Drawable drawable, String s, int l, int i1, int j1)
    {
        super(context);
        context = getResources();
        b = context.getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_look_item_scroll_duration);
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setColor(0xff000000 | l);
        f.setColor(context.getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_look_list_item_title));
        f.setTextAlign(android.graphics.Paint.Align.CENTER);
        f.setTextSize(context.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_look_list_item_title_size));
        f.setAntiAlias(true);
        c = drawable;
        c.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        g = s;
        h = context.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_look_list_item_bar_height);
        i = context.getDimensionPixelSize(com.google.android.apps.consumerphotoeditor.R.dimen.cpe_look_list_item_title_vertical_offset);
        setClickable(true);
        setEnabled(true);
    }

    public final void a(boolean flag, boolean flag1)
    {
        if (d == flag)
        {
            return;
        }
        d = flag;
        if (flag1)
        {
            j = SystemClock.elapsedRealtime();
            k = j + (long)b;
            invalidate();
        }
        String s;
        if (flag)
        {
            s = getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_name_selected, new Object[] {
                g
            });
        } else
        {
            s = getResources().getString(com.google.android.apps.consumerphotoeditor.R.string.cpe_a11y_filter_name, new Object[] {
                g
            });
        }
        setContentDescription(s);
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        float f2 = (float)(SystemClock.elapsedRealtime() - j) / (float)(k - j);
        float f1;
        float f3;
        float f4;
        float f5;
        TimeInterpolator timeinterpolator;
        if (f2 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        timeinterpolator = a;
        if (!d)
        {
            f1 = 1.0F - f1;
        }
        f1 = timeinterpolator.getInterpolation(f1);
        if (f1 < 0.0F)
        {
            f1 = 0.0F;
        } else
        if (f1 > 1.0F)
        {
            f1 = 1.0F;
        }
        if (f1 == 1.0F)
        {
            canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), e);
        } else
        {
            c.draw(canvas);
            canvas.drawRect(0.0F, getHeight() - h, getWidth(), getHeight(), e);
        }
        f3 = getHeight() - h;
        f2 = getWidth() / 2;
        f3 = ((1.0F - f1) * f3 + (float)getHeight()) / 2.0F;
        f4 = (f.descent() + f.ascent()) / 2.0F;
        f5 = i;
        if (f1 > 0.0F && f1 < 1.0F)
        {
            float f6 = h;
            float f7 = ((float)getHeight() * f1 * (float)Math.sqrt(5D)) / 2.0F;
            canvas.drawCircle(f2, getHeight() - 1, (1.0F - f1) * f6 + f7, e);
            invalidate();
        }
        canvas.drawText(g, f2, (f3 - f4) + f5, f);
    }

    protected final void onMeasure(int l, int i1)
    {
        setMeasuredDimension(c.getIntrinsicWidth(), c.getIntrinsicHeight());
    }

    static 
    {
        a = bgb.a;
    }
}
