// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.fastscroll;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;

// Referenced classes of package com.skype.android.widget.fastscroll:
//            LayoutCostMeter

static final class a extends Drawable
    implements a
{

    final Handler a;
    Drawable b;
    private int c;

    public final void a(View view)
    {
        if (b != null)
        {
            throw new IllegalStateException("already attached");
        } else
        {
            c = view.getId();
            b = view.getBackground();
            LayoutCostMeter.a(view, this);
            return;
        }
    }

    public final void b(View view)
    {
        if (view.getBackground() != this)
        {
            throw new IllegalStateException("already detached");
        } else
        {
            LayoutCostMeter.a(view, b);
            b = null;
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        a.obtainMessage(c, sponse.d).sendToTarget();
    }

    public final int getOpacity()
    {
        return 0;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

    public sponse(Handler handler)
    {
        a = handler;
    }
}
