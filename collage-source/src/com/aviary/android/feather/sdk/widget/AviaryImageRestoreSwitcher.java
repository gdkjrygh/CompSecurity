// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ViewSwitcher;
import com.aviary.android.feather.common.a.a;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

public class AviaryImageRestoreSwitcher extends ViewSwitcher
{
    class CancelStatusRunnable
        implements Runnable
    {

        final AviaryImageRestoreSwitcher a;

        public void run()
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("CancelStatusRunnable::run");
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a(a, com.aviary.android.feather.sdk.widget.d.a);
        }

        CancelStatusRunnable()
        {
            a = AviaryImageRestoreSwitcher.this;
            super();
        }
    }

    class a
        implements android.view.GestureDetector.OnGestureListener
    {

        final AviaryImageRestoreSwitcher a;

        public boolean onDown(MotionEvent motionevent)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onDown");
            return true;
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onFling");
            return false;
        }

        public void onLongPress(MotionEvent motionevent)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onLongPress");
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a(a, d.c);
        }

        public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onScroll");
            return false;
        }

        public void onShowPress(MotionEvent motionevent)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onShowPress");
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a(a, d.b);
        }

        public boolean onSingleTapUp(MotionEvent motionevent)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onSingleTapUp");
            return false;
        }

        a()
        {
            a = AviaryImageRestoreSwitcher.this;
            super();
        }
    }

    class b
        implements android.view.ScaleGestureDetector.OnScaleGestureListener
    {

        final AviaryImageRestoreSwitcher a;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onScale");
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onScaleBegin");
            return false;
        }

        public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
        {
            com.aviary.android.feather.sdk.widget.AviaryImageRestoreSwitcher.a.b("onScaleEnd");
        }

        b()
        {
            a = AviaryImageRestoreSwitcher.this;
            super();
        }
    }

    public static interface c
    {

        public abstract boolean B();

        public abstract void C();

        public abstract void D();
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d e[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/aviary/android/feather/sdk/widget/AviaryImageRestoreSwitcher$d, s);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            a = new d("None", 0);
            b = new d("Begin", 1);
            c = new d("Applied_Begin", 2);
            d = new d("Applied_End", 3);
            e = (new d[] {
                a, b, c, d
            });
        }

        private d(String s, int i1)
        {
            super(s, i1);
        }
    }


    static com.aviary.android.feather.common.a.a.c a;
    android.view.GestureDetector.OnGestureListener b;
    android.view.ScaleGestureDetector.OnScaleGestureListener c;
    private boolean d;
    private d e;
    private c f;
    private ScaleGestureDetector g;
    private GestureDetector h;
    private ImageViewTouch i;
    private ImageViewTouch j;
    private int k;
    private CancelStatusRunnable l;

    public AviaryImageRestoreSwitcher(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryImageRestoreViewStyle);
    }

    public AviaryImageRestoreSwitcher(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        d = true;
        e = com.aviary.android.feather.sdk.widget.d.a;
        b = new a();
        c = new b();
        k = 2000;
        l = new CancelStatusRunnable();
        context = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryImageRestoreSwitcher, i1, 0);
        k = context.getInt(0, 2000);
        context.recycle();
        a.b((new StringBuilder()).append("timeout: ").append(k).toString());
    }

    private boolean a(MotionEvent motionevent)
    {
        a.b("onUp");
        if (d && getHandler() != null)
        {
            if (e == d.b)
            {
                return a(com.aviary.android.feather.sdk.widget.d.a);
            }
            if (e == d.c)
            {
                if (a(d.d))
                {
                    getHandler().removeCallbacks(l);
                    getHandler().postDelayed(l, k);
                }
                return true;
            }
        }
        return false;
    }

    private boolean a(d d1)
    {
        boolean flag = false;
        if (d) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        a.b((new StringBuilder()).append("setStatus. from: ").append(e).append(" to ").append(d1).toString());
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[d.values().length];
                try
                {
                    a[d.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[d.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[d.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.sdk.widget.d.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.aviary.android.feather.sdk.widget._cls1.a[d1.ordinal()];
        JVM INSTR tableswitch 1 4: default 88
    //                   1 133
    //                   2 189
    //                   3 220
    //                   4 235;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_235;
_L9:
        if (!flag)
        {
            a.d((new StringBuilder()).append("setStatus. from: ").append(e).append(" to ").append(d1).toString());
            return flag;
        } else
        {
            e = d1;
            return flag;
        }
_L4:
        if (!b() || !c() || getVisibility() != 0) goto _L1; else goto _L8
_L8:
        if (e == com.aviary.android.feather.sdk.widget.d.a)
        {
            if (f != null)
            {
                flag = f.B();
            } else
            {
                flag = true;
            }
        }
          goto _L9
_L5:
        if (e == d.b)
        {
            if (f != null)
            {
                f.C();
            }
            flag = true;
        }
          goto _L9
_L6:
        if (e == d.c)
        {
            flag = true;
        }
          goto _L9
        if (e == d.b)
        {
            if (f != null)
            {
                f.D();
            }
            flag = true;
        } else
        if (e == d.d)
        {
            if (f != null)
            {
                f.D();
            }
            flag = true;
        }
          goto _L9
    }

    static boolean a(AviaryImageRestoreSwitcher aviaryimagerestoreswitcher, d d1)
    {
        return aviaryimagerestoreswitcher.a(d1);
    }

    private boolean c()
    {
        return i.getScale() == i.getMinScale();
    }

    public void a()
    {
        a.b("clearStatus");
        if (e != com.aviary.android.feather.sdk.widget.d.a)
        {
            e = com.aviary.android.feather.sdk.widget.d.a;
            getHandler().removeCallbacks(l);
            if (f != null)
            {
                f.D();
            }
        }
    }

    protected boolean b()
    {
        return d && getDisplayedChild() == 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (d)
        {
            if (getDisplayedChild() == 0)
            {
                boolean flag1 = g.onTouchEvent(motionevent);
                boolean flag = flag1;
                if (flag1)
                {
                    flag = flag1;
                    if (!g.isInProgress())
                    {
                        flag = h.onTouchEvent(motionevent);
                    }
                }
                a.a((new StringBuilder()).append("handled: ").append(flag).toString());
            }
            switch (motionevent.getAction() & 0xff)
            {
            case 1: // '\001'
                break MISSING_BLOCK_LABEL_120;
            }
        }
_L1:
        if (e == com.aviary.android.feather.sdk.widget.d.a)
        {
            return super.dispatchTouchEvent(motionevent);
        } else
        {
            return true;
        }
        a(motionevent);
          goto _L1
    }

    public ImageViewTouch getDefaultImageView()
    {
        return i;
    }

    public boolean getRestoreEnabled()
    {
        return d;
    }

    public ImageViewTouch getRestoredImageView()
    {
        return j;
    }

    public d getStatus()
    {
        return e;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a.b((new StringBuilder()).append("onFinishInflate: ").append(getChildCount()).toString());
        i = (ImageViewTouch)getChildAt(0);
        j = (ImageViewTouch)getChildAt(1);
        j.setDoubleTapEnabled(false);
        j.setScaleEnabled(false);
        j.setScrollEnabled(false);
        j.setLongClickable(false);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return d;
    }

    public void setDisplayedChild(int i1)
    {
        super.setDisplayedChild(i1);
    }

    public void setOnRestoreStateListener(c c1)
    {
        f = c1;
    }

    public void setRestoreEnabled(boolean flag)
    {
        d = flag;
        if (d)
        {
            e = com.aviary.android.feather.sdk.widget.d.a;
            g = new ScaleGestureDetector(getContext(), c);
            h = new GestureDetector(getContext(), b, null, false);
            h.setIsLongpressEnabled(true);
            return;
        } else
        {
            e = com.aviary.android.feather.sdk.widget.d.a;
            g = null;
            h = null;
            return;
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("AviaryImageRestoreSwitcher", com.aviary.android.feather.common.a.a.d.a);
    }
}
