// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            z, cf, DrawerLayout, x

final class aa
    implements Runnable
{

    final z a;

    aa(z z1)
    {
        a = z1;
        super();
    }

    public final void run()
    {
        boolean flag = false;
        Object obj1 = a;
        int k = ((z) (obj1)).b.i;
        Object obj;
        int i;
        int j;
        if (((z) (obj1)).a == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            obj = ((z) (obj1)).c.a(3);
            x x1;
            long l;
            if (obj != null)
            {
                j = -((View) (obj)).getWidth();
            } else
            {
                j = 0;
            }
            j += k;
        } else
        {
            obj = ((z) (obj1)).c.a(5);
            j = ((z) (obj1)).c.getWidth();
            j -= k;
        }
        if (obj != null && (i != 0 && ((View) (obj)).getLeft() < j || i == 0 && ((View) (obj)).getLeft() > j) && ((z) (obj1)).c.a(((View) (obj))) == 0)
        {
            x1 = (x)((View) (obj)).getLayoutParams();
            ((z) (obj1)).b.a(((View) (obj)), j, ((View) (obj)).getTop());
            x1.c = true;
            ((z) (obj1)).c.invalidate();
            ((z) (obj1)).b();
            obj = ((z) (obj1)).c;
            if (!((DrawerLayout) (obj)).d)
            {
                l = SystemClock.uptimeMillis();
                obj1 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                j = ((DrawerLayout) (obj)).getChildCount();
                for (i = ((flag) ? 1 : 0); i < j; i++)
                {
                    ((DrawerLayout) (obj)).getChildAt(i).dispatchTouchEvent(((MotionEvent) (obj1)));
                }

                ((MotionEvent) (obj1)).recycle();
                obj.d = true;
            }
        }
    }
}
