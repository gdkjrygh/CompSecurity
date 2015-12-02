// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package com.facebook.widget.text:
//            b, k

public class j
    implements b
{

    private final TextView a;
    private final Paint b;
    private URLSpan c;
    private Path d;
    private k e;

    public j(TextView textview)
    {
        this(textview, 0xffcccccc);
    }

    public j(TextView textview, int i)
    {
        d = new Path();
        e = null;
        a = textview;
        b = new Paint();
        b.setColor(i);
        b.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    private Rect a()
    {
        Rect rect = new Rect(0, 0, a.getWidth(), a.getHeight());
        rect.left = rect.left + a.getTotalPaddingLeft();
        rect.top = rect.top + a.getTotalPaddingTop();
        rect.bottom = rect.bottom - a.getTotalPaddingBottom();
        rect.right = rect.right - a.getTotalPaddingRight();
        return rect;
    }

    private URLSpan b(MotionEvent motionevent)
    {
        int i = (int)motionevent.getX();
        int l = (int)motionevent.getY();
        if (a().contains(i, l))
        {
            int i1 = a.getTotalPaddingLeft();
            int j1 = a.getTotalPaddingTop();
            motionevent = a.getLayout();
            i = motionevent.getOffsetForHorizontal(motionevent.getLineForVertical(l - j1), i - i1);
            motionevent = (URLSpan[])((Spanned)a.getText()).getSpans(i, i, android/text/style/URLSpan);
            if (motionevent.length > 0)
            {
                return motionevent[0];
            }
        }
        return null;
    }

    public void a(Canvas canvas)
    {
        if (c == null)
        {
            return;
        } else
        {
            canvas.save();
            Object obj = a();
            canvas.translate(((Rect) (obj)).left, ((Rect) (obj)).top);
            obj = a.getLayout();
            Spanned spanned = (Spanned)a.getText();
            ((Layout) (obj)).getSelectionPath(spanned.getSpanStart(c), spanned.getSpanEnd(c), d);
            canvas.drawPath(d, b);
            canvas.restore();
            return;
        }
    }

    public void a(k k1)
    {
        e = k1;
    }

    public boolean a(MotionEvent motionevent)
    {
        if (a.getText() instanceof Spanned) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        i = motionevent.getAction();
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c = b(motionevent);
        a.invalidate();
_L4:
        if (c != null)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == 1)
        {
            if (c != null)
            {
                if (c == b(motionevent))
                {
                    motionevent = c;
                    c = null;
                    a.invalidate();
                    if (e == null || !e.a(motionevent, a))
                    {
                        motionevent.onClick(a);
                    }
                } else
                {
                    c = null;
                    a.invalidate();
                }
            }
        } else
        if (i == 3 && c != null)
        {
            c = null;
            a.invalidate();
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
