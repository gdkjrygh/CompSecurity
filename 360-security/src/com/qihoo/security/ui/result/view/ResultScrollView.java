// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import com.nineoldandroids.a.b;
import com.nineoldandroids.a.o;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            a

public class ResultScrollView extends ScrollView
{
    public static interface a
    {

        public abstract void a(ResultScrollView resultscrollview, int i, int j, int k, int l);
    }


    private VelocityTracker a;
    private a b;
    private final int c;
    private final AtomicBoolean d;
    private float e;

    public ResultScrollView(Context context)
    {
        this(context, null);
    }

    public ResultScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ResultScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = VelocityTracker.obtain();
        b = null;
        d = new AtomicBoolean(false);
        e = 0.0F;
        c = com.qihoo.security.ui.result.view.a.a().c() + com.qihoo.security.ui.result.view.a.a().d();
    }

    static int a(ResultScrollView resultscrollview)
    {
        return resultscrollview.c;
    }

    private void a(MotionEvent motionevent)
    {
        if (a == null)
        {
            a = VelocityTracker.obtain();
        }
        a.addMovement(motionevent);
    }

    private void b()
    {
        if (a != null)
        {
            a.clear();
            a.recycle();
            a = null;
        }
    }

    public void a()
    {
        post(new Runnable() {

            final ResultScrollView a;

            public void run()
            {
                a.smoothScrollTo(0, 0);
            }

            
            {
                a = ResultScrollView.this;
                super();
            }
        });
    }

    public void a(int i, long l, b b1)
    {
        post(new Runnable(i, b1, l) {

            final int a;
            final b b;
            final long c;
            final ResultScrollView d;

            public void run()
            {
                o o1 = o.b(new int[] {
                    a
                });
                if (b != null)
                {
                    o1.a(b);
                }
                o1.a(new com.nineoldandroids.a.o.b(this) {

                    final _cls2 a;

                    public void a(o o1)
                    {
                        int i = ((Integer)(Integer)o1.o()).intValue();
                        if (i < a.a)
                        {
                            a.d.smoothScrollTo(0, i);
                            return;
                        } else
                        {
                            a.d.smoothScrollTo(0, a.a);
                            o1.b();
                            return;
                        }
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
                o1.d(c);
                o1.a(new LinearInterpolator());
                o1.a();
            }

            
            {
                d = ResultScrollView.this;
                a = i;
                b = b1;
                c = l;
                super();
            }
        });
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (j != l)
        {
            d.set(true);
        }
        if (b != null)
        {
            b.a(this, i, j, k, l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 40
    //                   0 40
    //                   1 78
    //                   2 46
    //                   3 78;
           goto _L1 _L1 _L2 _L3 _L2
_L1:
        return super.onTouchEvent(motionevent);
_L3:
        a.computeCurrentVelocity(1000);
        float f = a.getYVelocity();
        if (f != 0.0F)
        {
            e = f;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (d.getAndSet(false) && getScrollY() < c)
        {
            if (e >= 0.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            post(new Runnable() {

                final ResultScrollView a;

                public void run()
                {
                    a.smoothScrollTo(0, ResultScrollView.a(a));
                }

            
            {
                a = ResultScrollView.this;
                super();
            }
            });
        }
_L6:
        b();
        if (true) goto _L1; else goto _L4
_L4:
        if (e <= 0.0F) goto _L6; else goto _L5
_L5:
        post(new Runnable() {

            final ResultScrollView a;

            public void run()
            {
                a.smoothScrollTo(0, 0);
            }

            
            {
                a = ResultScrollView.this;
                super();
            }
        });
          goto _L6
    }

    public void setScrollViewListener(a a1)
    {
        b = a1;
    }
}
