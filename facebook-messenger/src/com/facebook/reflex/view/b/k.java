// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.b;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.reflex.r;
import com.facebook.reflex.t;

// Referenced classes of package com.facebook.reflex.view.b:
//            l, r

public class k
{

    private static final k a = new k();
    private final int b[] = new int[2];

    public k()
    {
    }

    public static MotionEvent a(r r1)
    {
        return a(r1, r1.f(), r1.g());
    }

    private static MotionEvent a(r r1, float f, float f1)
    {
        int i = c(r1);
        return MotionEvent.obtain(r1.b(), r1.c(), i, f, f1, 0);
    }

    public static k a()
    {
        return a;
    }

    public static MotionEvent b(r r1)
    {
        return a(r1, r1.d(), r1.e());
    }

    private static int c(r r1)
    {
        switch (l.a[r1.a().ordinal()])
        {
        case 3: // '\003'
        default:
            return 3;

        case 1: // '\001'
            return 0;

        case 2: // '\002'
            return 1;

        case 4: // '\004'
            return 2;
        }
    }

    public void a(View view, MotionEvent motionevent)
    {
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        View view1 = view;
        while (view1 != null) 
        {
            int j = view1.getLeft();
            int i = view1.getTop();
            float f2;
            int j1;
            int i2;
            if (view1 instanceof com.facebook.reflex.view.b.r)
            {
                int l1 = ((com.facebook.reflex.view.b.r)view1).getScrollOffsetX();
                int i1 = ((com.facebook.reflex.view.b.r)view1).getScrollOffsetY();
                j -= l1;
                i -= i1;
            } else
            {
                int j2 = view1.getScrollX();
                int k1 = view1.getScrollY();
                j -= j2;
                i -= k1;
            }
            if (view1.getParent() instanceof View)
            {
                view = (View)view1.getParent();
            } else
            {
                view = null;
            }
            i2 = i;
            j1 = j;
            if (view == null)
            {
                view1.getLocationInWindow(b);
                j1 = j + b[0];
                i2 = i + b[1];
            }
            f2 = j1;
            f1 -= i2;
            f -= f2;
            view1 = view;
        }
        motionevent.setLocation(f, f1);
    }

}
