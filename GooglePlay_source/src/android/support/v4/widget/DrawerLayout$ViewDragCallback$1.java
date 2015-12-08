// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, ViewDragHelper

final class this._cls1
    implements Runnable
{

    final uch this$1;

    public final void run()
    {
        boolean flag = false;
        Object obj1 = this._cls1.this;
        int k = ((this._cls1) (obj1)).ragger.mEdgeSize;
        Object obj;
        int i;
        int j;
        if (((ragger) (obj1)).bsGravity == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            obj = ((bsGravity) (obj1))._fld0.findDrawerWithGravity(3);
            this._cls1 _lcls1;
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
            obj = ((ty) (obj1))._fld0.findDrawerWithGravity(5);
            j = ((ty) (obj1))._fld0.getWidth();
            j -= k;
        }
        if (obj != null && (i != 0 && ((View) (obj)).getLeft() < j || i == 0 && ((View) (obj)).getLeft() > j) && ((is._cls0) (obj1))._fld0.getDrawerLockMode(((View) (obj))) == 0)
        {
            _lcls1 = (is._cls0)((View) (obj)).getLayoutParams();
            ((is._cls0) (obj1)).ragger.smoothSlideViewTo(((View) (obj)), j, ((View) (obj)).getTop());
            _lcls1.ing = true;
            ((ing) (obj1))._fld0.invalidate();
            ((is._cls0) (obj1)).oseOtherDrawer();
            obj = ((oseOtherDrawer) (obj1))._fld0;
            if (!((DrawerLayout) (obj)).mChildrenCanceledTouch)
            {
                l = SystemClock.uptimeMillis();
                obj1 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                j = ((DrawerLayout) (obj)).getChildCount();
                for (i = ((flag) ? 1 : 0); i < j; i++)
                {
                    ((DrawerLayout) (obj)).getChildAt(i).dispatchTouchEvent(((MotionEvent) (obj1)));
                }

                ((MotionEvent) (obj1)).recycle();
                obj.mChildrenCanceledTouch = true;
            }
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
