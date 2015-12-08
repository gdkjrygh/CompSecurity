// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import bB;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

final class a
    implements Runnable
{

    private hildAt a;

    public final void run()
    {
        boolean flag = false;
        Object obj1 = a;
        int k = ((a) (obj1)).a.i;
        Object obj;
        int i;
        int j;
        if (((a) (obj1)).a == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            obj = ((a) (obj1)).a.a(3);
            utParams utparams;
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
            obj = ((a) (obj1)).a.a(5);
            j = ((a) (obj1)).a.getWidth();
            j -= k;
        }
        if (obj != null && (i != 0 && ((View) (obj)).getLeft() < j || i == 0 && ((View) (obj)).getLeft() > j) && ((idth) (obj1)).idth.a(((View) (obj))) == 0)
        {
            utparams = (utParams)((View) (obj)).getLayoutParams();
            ((utParams) (obj1)).utParams.a(((View) (obj)), j, ((View) (obj)).getTop());
            utparams.c = true;
            ((utParams.c) (obj1)).c.invalidate();
            ((lidate) (obj1)).lidate();
            obj = ((lidate) (obj1)).lidate;
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

    utParams(utParams utparams)
    {
        a = utparams;
        super();
    }
}
