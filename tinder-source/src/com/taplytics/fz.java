// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.widget.FrameLayout;

// Referenced classes of package com.taplytics:
//            cv, gb, ga, turkey

public final class fz extends FrameLayout
{

    private Paint a;
    private Paint b;
    private ga c;

    public fz(Context context)
    {
        super(context);
        a = new Paint();
        a.setColor(gb.a(cv.a().d));
        a.setStrokeWidth(20F);
        a.setStyle(android.graphics.Paint.Style.FILL);
        b = new Paint();
        b.setColor(Color.parseColor("#CCe75f68"));
        b.setStrokeWidth(2.0F);
        b.setStyle(android.graphics.Paint.Style.FILL);
    }

    public final void a()
    {
        c = null;
        invalidate();
    }

    public final void onDraw(Canvas canvas)
    {
        if (c != null)
        {
            canvas.drawCircle(c.b, c.c, c.a, a);
            canvas.drawCircle(c.b, c.c, 3F, b);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 6: default 48
    //                   0 98
    //                   1 185
    //                   2 178
    //                   3 166
    //                   4 48
    //                   5 171
    //                   6 192;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_192;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        int i = 0;
_L8:
        if (cv.a().d.equals(turkey.b) || cv.a().d.equals(turkey.d))
        {
            if (i != 0 || super.onTouchEvent(motionevent))
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
_L2:
        if (cv.a().d.equals(turkey.b) || cv.a().d.equals(turkey.d))
        {
            i = (int)motionevent.getX(0);
            int j = (int)motionevent.getY(0);
            if (c == null)
            {
                c = new ga(i, j);
            }
        }
        invalidate();
_L9:
        i = 1;
          goto _L8
_L6:
        invalidate();
          goto _L9
_L4:
        invalidate();
          goto _L9
_L3:
        invalidate();
          goto _L9
        invalidate();
          goto _L9
    }
}
