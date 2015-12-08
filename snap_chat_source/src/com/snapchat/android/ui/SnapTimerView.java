// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import In;
import Jo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;

// Referenced classes of package com.snapchat.android.ui:
//            AbstractSnapTimerView

public class SnapTimerView extends AbstractSnapTimerView
{

    private boolean g;
    private Bitmap h;
    private Bitmap i;
    private Paint j;
    private Paint k;
    private RectF l;

    public SnapTimerView(Context context)
    {
        super(context);
        b();
    }

    public SnapTimerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b();
    }

    private void b()
    {
        setTextColor(-1);
        setTextSize(1, 20F);
        setGravity(17);
        k = new Paint(1);
        j = new Paint(1);
        l = new RectF();
    }

    private void c()
    {
        byte byte0 = 2;
        Object obj = getText();
        int i1;
        if (obj != null)
        {
            i1 = ((CharSequence) (obj)).length();
        } else
        {
            i1 = 0;
        }
        if (i1 < 2)
        {
            i1 = byte0;
        }
        if (g)
        {
            byte0 = 18;
        } else
        {
            byte0 = 12;
        }
        i1 = (int)Jo.a(i1 * 12 + byte0, getContext());
        obj = getLayoutParams();
        obj.width = i1;
        obj.height = i1;
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public final void a(int i1, int j1)
    {
        super.setText(Integer.toString(i1 + j1));
        c();
    }

    public void onDraw(Canvas canvas)
    {
        long l1 = 0L;
        if (a)
        {
            b = SystemClock.elapsedRealtime();
        }
        if (getHeight() != 0 && getWidth() != 0)
        {
            canvas.drawRect(l, j);
            long l3 = b - c;
            long l2 = d - c;
            float f;
            if (l3 >= 0L)
            {
                if (l3 > l2)
                {
                    l1 = l2;
                } else
                {
                    l1 = l3;
                }
            }
            f = (float)(l1 * 360L) / (float)l2;
            k.setAlpha(255);
            canvas.drawArc(l, f - 90F, 360F - f, true, k);
            k.setAlpha(85);
            canvas.drawArc(l, -90F, f, true, k);
        }
        super.onDraw(canvas);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 > 0 && j1 > 0)
        {
            if (i == null || i.getWidth() != i1 || i.getHeight() != j1)
            {
                if (i != null)
                {
                    i.recycle();
                }
                double d;
                if (g)
                {
                    k1 = 0x7f020272;
                } else
                {
                    k1 = 0x7f020270;
                }
                i = In.a(getContext(), k1, i1, j1);
                k.setShader(new BitmapShader(i, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            }
            if (h == null || h.getWidth() != i1 || h.getHeight() != j1)
            {
                if (h != null)
                {
                    h.recycle();
                }
                if (g)
                {
                    k1 = 0x7f020271;
                } else
                {
                    k1 = 0x7f02026f;
                }
                h = In.a(getContext(), k1, i1, j1);
                j.setShader(new BitmapShader(h, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        k1 = Math.max(i1, j1) / 2;
        d = Math.pow(k1, 2D);
        l1 = (int)Math.ceil(Math.sqrt(Math.pow(k1, 2D) + d));
        k1 = l1 - j1 / 2;
        l1 -= i1 / 2;
        l.set(0 - l1, 0 - k1, l1 + i1, k1 + j1);
    }

    public void setShouldShowStoryTimerDesign(boolean flag)
    {
        if (g == flag)
        {
            return;
        }
        g = flag;
        if (i != null)
        {
            i.recycle();
            i = null;
        }
        if (h != null)
        {
            h.recycle();
            h = null;
        }
        c();
    }
}
