// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.snapchat.android.ui.camera.TakeSnapButton;
import com.snapchat.android.ui.lenses.LensesView;

public final class Fw extends Id
{

    public boolean a;
    private final TakeSnapButton b;
    private final ScaleGestureDetector c;
    private final com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface d;
    private boolean e;
    private boolean f;
    private boolean g;
    private final PI h;
    private MotionEvent i;
    private boolean j;

    public Fw(TakeSnapButton takesnapbutton, PI pi, ScaleGestureDetector scalegesturedetector, com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface cameradecorinterface)
    {
        this(takesnapbutton, pi, scalegesturedetector, cameradecorinterface, new HS());
    }

    private Fw(TakeSnapButton takesnapbutton, PI pi, ScaleGestureDetector scalegesturedetector, com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface cameradecorinterface, HS hs)
    {
        super(takesnapbutton, (byte)0);
        e = false;
        a = false;
        b();
        b = (TakeSnapButton)dv.a(takesnapbutton);
        h = (PI)dv.a(pi);
        c = (ScaleGestureDetector)dv.a(scalegesturedetector);
        d = (com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface)dv.a(cameradecorinterface);
        dv.a(hs);
    }

    static boolean a(Fw fw)
    {
        fw.e = false;
        return false;
    }

    public final void b()
    {
        g = false;
        f = false;
        j = false;
        if (i != null)
        {
            i.recycle();
            i = null;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        int l;
        int i1;
        l = motionevent.getActionMasked();
        i1 = motionevent.getMetaState();
        c.onTouchEvent(motionevent);
        if (a && j)
        {
            ((LensesView)h.a()).dispatchTouchEvent(motionevent);
        }
        if (l != 1) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (!g && !f || i1 == -1 && f || i1 != -1 && g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        if (l != 3) goto _L4; else goto _L3
_L3:
        if (!j)
        {
            if (a && i != null)
            {
                ((LensesView)h.a()).dispatchTouchEvent(i);
            }
            d.a(com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.FINGER_UP);
        }
        b();
_L6:
        return super.onTouch(view, motionevent);
_L4:
        if (l == 0)
        {
            if (!f && !g)
            {
                d.a(com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.FINGER_DOWN);
                if (i1 == -1)
                {
                    f = true;
                } else
                {
                    g = true;
                }
                if (a)
                {
                    i = MotionEvent.obtain(motionevent);
                    i.setAction(3);
                    ((LensesView)h.a()).dispatchTouchEvent(motionevent);
                }
            }
        } else
        if (l == 2 && a)
        {
            if (j || i == null)
            {
                return false;
            }
            if (Math.abs(motionevent.getRawX() - i.getRawX()) > (float)ViewConfiguration.get(view.getContext()).getScaledTouchSlop() && motionevent.getEventTime() - motionevent.getDownTime() < 190L)
            {
                d.a(com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface.TakeSnapButtonAction.START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW);
                b.a();
                j = true;
            }
        } else
        if (l == 5)
        {
            e = true;
            b.postDelayed(new Runnable() {

                private Fw a;

                public final void run()
                {
                    Fw.a(a);
                }

            
            {
                a = Fw.this;
                super();
            }
            }, 300L);
        } else
        if (l == 6 && e)
        {
            int k = motionevent.getActionIndex();
            Point point = zB.a(view);
            point = new Point((int)(motionevent.getX(k) * view.getScaleX() + (float)point.x), (int)(motionevent.getY(k) * view.getScaleY() + (float)point.y));
            d.b(point.x, point.y);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
