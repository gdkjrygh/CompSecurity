// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.Scroller;
import com.google.android.apps.photos.pager.viewpager.PhotoViewPager;
import java.util.ArrayList;

public final class gsf
    implements Runnable
{

    private PhotoViewPager a;

    public gsf(PhotoViewPager photoviewpager)
    {
        a = photoviewpager;
        super();
    }

    public final void run()
    {
        int i;
        PhotoViewPager.a(a).computeScrollOffset();
        i = PhotoViewPager.a(a).getCurrX();
        if (PhotoViewPager.a(a).isFinished() || !((ViewPager) (a)).n) goto _L2; else goto _L1
_L1:
        float f;
        Object obj;
        obj = a;
        f = -(i - PhotoViewPager.b(a));
        if (!((ViewPager) (obj)).n)
        {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        float f2;
        int j;
        try
        {
            obj.i = ((ViewPager) (obj)).i + f;
            f2 = (float)((ViewPager) (obj)).getScrollX() - f;
            j = ((ViewPager) (obj)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("PhotoViewPager", 3))
            {
                obj = String.valueOf(obj);
                (new StringBuilder(String.valueOf(obj).length() + 23)).append("NPE when fake dragging\n").append(((String) (obj)));
            }
            a.i();
            return;
        }
        f = j;
        float f4 = ((ViewPager) (obj)).e;
        float f1 = j;
        float f3;
        nm nm1;
        nm nm2;
        f3 = ((ViewPager) (obj)).f;
        nm1 = (nm)((ViewPager) (obj)).a.get(0);
        nm2 = (nm)((ViewPager) (obj)).a.get(((ViewPager) (obj)).a.size() - 1);
        if (nm1.b == 0) goto _L4; else goto _L3
_L3:
        f = nm1.e * (float)j;
_L9:
        if (nm2.b == ((ViewPager) (obj)).b.b() - 1) goto _L6; else goto _L5
_L5:
        f1 = nm2.e * (float)j;
          goto _L7
_L8:
        obj.i = ((ViewPager) (obj)).i + (f - (float)(int)f);
        ((ViewPager) (obj)).scrollTo((int)f, ((ViewPager) (obj)).getScrollY());
        ((ViewPager) (obj)).b((int)f);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(((ViewPager) (obj)).o, l, 2, ((ViewPager) (obj)).i, 0.0F, 0);
        ((ViewPager) (obj)).l.addMovement(motionevent);
        motionevent.recycle();
        PhotoViewPager.a(a, i);
        a.postDelayed(PhotoViewPager.c(a), 10L);
        return;
_L2:
        a.i();
        return;
_L12:
        f = f2;
          goto _L8
_L6:
        f1 *= f3;
          goto _L7
_L4:
        f *= f4;
          goto _L9
_L7:
        if (f2 >= f) goto _L10; else goto _L8
_L10:
        if (f2 <= f1) goto _L12; else goto _L11
_L11:
        f = f1;
          goto _L8
    }
}
