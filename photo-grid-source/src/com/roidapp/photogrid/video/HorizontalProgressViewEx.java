// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.c.a.a.a;
import com.roidapp.photogrid.release.hs;

// Referenced classes of package com.roidapp.photogrid.video:
//            ScrollImageViewEx

public class HorizontalProgressViewEx extends LinearLayout
{

    private ScrollImageViewEx a;
    private hs b;
    private boolean c;
    private boolean d;

    public HorizontalProgressViewEx(Context context)
    {
        super(context);
        a = null;
        b = null;
        c = false;
        d = false;
    }

    public HorizontalProgressViewEx(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        b = null;
        c = false;
        d = false;
    }

    public HorizontalProgressViewEx(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        b = null;
        c = false;
        d = false;
    }

    public final void a(hs hs1)
    {
        b = hs1;
    }

    public final void a(ScrollImageViewEx scrollimageviewex)
    {
        a = scrollimageviewex;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        switch (motionevent.getAction())
        {
        default:
            return super.onTouchEvent(motionevent);

        case 0: // '\0'
            if (a == null)
            {
                return false;
            }
            Rect rect = new Rect();
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                ScrollImageViewEx scrollimageviewex = a;
                float f;
                if (a.a)
                {
                    f = com.c.a.a.a.a(scrollimageviewex).a();
                } else
                {
                    f = scrollimageviewex.getX();
                }
                rect.left = (int)f;
                scrollimageviewex = a;
                if (a.a)
                {
                    f = com.c.a.a.a.a(scrollimageviewex).b();
                } else
                {
                    f = scrollimageviewex.getY();
                }
                rect.top = (int)f;
                rect.bottom = rect.top + a.getHeight();
                rect.right = rect.left + a.getWidth();
            } else
            if (android.os.Build.VERSION.SDK_INT < 18)
            {
                rect.left = (int)((float)a.getLeft() + a.getTranslationX());
                rect.top = (int)((float)a.getTop() + a.getTranslationY());
                rect.bottom = rect.top + a.getHeight();
                rect.right = rect.left + a.getWidth();
            } else
            {
                a.getHitRect(rect);
            }
            if (rect.contains((int)(motionevent.getX() - (float)(a.b / 2)), (int)motionevent.getY()))
            {
                c = true;
                return true;
            } else
            {
                return false;
            }

        case 2: // '\002'
            if (!c)
            {
                return false;
            }
            if (a == null)
            {
                return false;
            }
            if (a.a != 0 && motionevent.getX() > (float)a.a)
            {
                return true;
            }
            float f2 = motionevent.getX() - (float)a.b;
            float f1;
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                f1 = ((android.widget.LinearLayout.LayoutParams)a.getLayoutParams()).leftMargin;
                a.setX(f2);
            } else
            {
                f1 = a.getX();
                a.setX(f2);
            }
            if (b != null && f2 != f1)
            {
                b.a(f2);
            }
            return true;

        case 1: // '\001'
            break;
        }
        if (!c)
        {
            return false;
        }
        if (a == null)
        {
            return false;
        }
        Rect rect1 = new Rect();
        a.getHitRect(rect1);
        if (rect1.contains((int)motionevent.getX(), (int)motionevent.getY()))
        {
            c = false;
            return true;
        } else
        {
            return false;
        }
    }
}
