// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.wave;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.wave:
//            WaveView, Wave, Solid

public class WaveTextView extends LocaleTextView
    implements WaveView.a
{

    private static final Xfermode b;
    private int a;
    private Path c;
    private Solid d;
    private final Path e;
    private int f;
    private int g;
    private WaveView h;
    private int i;
    private int j;

    public WaveTextView(Context context)
    {
        super(context);
        a = 0xff0000ff;
        c = null;
        d = null;
        e = new Path();
        f = 0;
        g = 0;
        i = 0;
        j = 0;
        a(((AttributeSet) (null)));
    }

    public WaveTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0xff0000ff;
        c = null;
        d = null;
        e = new Path();
        f = 0;
        g = 0;
        i = 0;
        j = 0;
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.WaveTextView);
            i = (int)attributeset.getDimension(1, 0.0F);
            j = (int)attributeset.getDimension(0, 0.0F);
            attributeset.recycle();
        }
    }

    private void b()
    {
        boolean flag1 = false;
        ViewParent viewparent = getParent();
        do
        {
label0:
            {
                boolean flag = flag1;
                if (viewparent != null)
                {
                    if (viewparent != h.getParent())
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (!flag)
                {
                    throw new IllegalStateException("WaveTextView should has a WaveView's parent as container");
                } else
                {
                    return;
                }
            }
            viewparent = viewparent.getParent();
        } while (true);
    }

    private void c()
    {
        int k = getLeft();
        int l = getTop();
        ViewParent viewparent = getParent();
        do
        {
label0:
            {
                if (viewparent != null)
                {
                    View view = (View)viewparent;
                    k += view.getLeft();
                    l = view.getTop() + l;
                    if (viewparent != h.getParent())
                    {
                        break label0;
                    }
                }
                f = k;
                g = l;
                return;
            }
            viewparent = viewparent.getParent();
        } while (true);
    }

    public void a()
    {
        postInvalidate();
    }

    public void a(int k)
    {
        postInvalidate();
    }

    public void a(WaveView waveview)
    {
        h = waveview;
        c = waveview.getWave().b();
        d = waveview.getSolid();
        b();
        waveview.setWaveCallback(this);
    }

    protected void onDraw(Canvas canvas)
    {
        c = h.getWave().b();
        d = h.getSolid();
        if (c != null && d != null)
        {
            e.reset();
            e.set(h.getWave().b());
            e.addPath(h.getWave().a());
            e.addRect(d.getLeft(), d.getTop(), d.getRight(), d.getBottom(), android.graphics.Path.Direction.CCW);
            if (f <= 0)
            {
                c();
            }
            e.offset(-f + i, -g + j);
            int k = canvas.saveLayer(0.0F, 0.0F, getWidth(), getHeight(), null, 31);
            super.onDraw(canvas);
            getPaint().setXfermode(b);
            getPaint().setColor(a);
            canvas.drawPath(e, getPaint());
            getPaint().setXfermode(null);
            canvas.restoreToCount(k);
            return;
        } else
        {
            super.onDraw(canvas);
            return;
        }
    }

    protected void onLayout(boolean flag, int k, int l, int i1, int j1)
    {
        super.onLayout(flag, k, l, i1, j1);
        while (isInEditMode() || !flag) 
        {
            return;
        }
        c();
    }

    public void setRevertColor(int k)
    {
        a = k;
    }

    static 
    {
        b = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP);
    }
}
