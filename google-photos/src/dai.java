// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class dai extends LinearLayout
{

    public int a;
    public float b;
    public int c;
    public float d;
    private int e;
    private float f;
    private int g;

    public dai(Context context)
    {
        this(context, null);
    }

    private dai(Context context, AttributeSet attributeset)
    {
        super(context, null);
        setWillNotDraw(false);
    }

    final void a(int i, float f1)
    {
        e = i;
        f = f1;
        getChildAt(g).setSelected(false);
        if (e + 1 >= getChildCount())
        {
            g = getChildCount() - 1;
        } else
        if (f < 0.5F)
        {
            g = e;
        } else
        {
            g = e + 1;
        }
        getChildAt(g).setSelected(true);
        invalidate();
    }

    protected final void onDraw(Canvas canvas)
    {
        Object obj = getChildAt(e);
        int j = ((View) (obj)).getRight();
        int i = ((View) (obj)).getLeft();
        int k = getHeight();
        if (f > 0.0F && e + 1 < getChildCount())
        {
            View view = getChildAt(e + 1);
            float f1 = f;
            int i1 = (int)((float)((View) (obj)).getWidth() * f1);
            int l = (int)(f * (float)view.getWidth());
            i += i1;
            j += l;
        }
        obj = new Paint();
        ((Paint) (obj)).setColor(c);
        canvas.drawRect(0.0F, (float)k - d, getWidth(), k, ((Paint) (obj)));
        ((Paint) (obj)).setColor(a);
        canvas.drawRect(i, (float)k - b, j, k, ((Paint) (obj)));
    }
}
