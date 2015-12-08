// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.ListView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;

public final class SwipeableListItemTouchListener
    implements android.view.View.OnTouchListener
{
    public static final class SwipeDirection extends Enum
    {

        private static final SwipeDirection $VALUES[];
        public static final SwipeDirection LEFT;
        public static final SwipeDirection RIGHT;

        public static SwipeDirection valueOf(String s1)
        {
            return (SwipeDirection)Enum.valueOf(com/snapchat/android/ui/listeners/SwipeableListItemTouchListener$SwipeDirection, s1);
        }

        public static SwipeDirection[] values()
        {
            return (SwipeDirection[])$VALUES.clone();
        }

        static 
        {
            LEFT = new SwipeDirection("LEFT", 0);
            RIGHT = new SwipeDirection("RIGHT", 1);
            $VALUES = (new SwipeDirection[] {
                LEFT, RIGHT
            });
        }

        private SwipeDirection(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface a
    {

        public abstract float a(View view);

        public abstract void a(View view, int i1, boolean flag);

        public abstract boolean a(View view, float f1);

        public abstract int b(View view);
    }

    public static interface b
        extends a
    {

        public abstract void a(int i1);

        public abstract void b(int i1);
    }


    public boolean a;
    protected View b;
    boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private float i;
    private ListView j;
    private a k;
    private int l;
    private SwipeDirection m;
    private float n;
    private float o;
    private boolean p;
    private boolean q;
    private int r;
    private VelocityTracker s;
    private long t;
    private final Handler u = new Handler();

    public SwipeableListItemTouchListener(ListView listview, SwipeDirection swipedirection, a a1)
    {
        l = 1;
        Resources resources = listview.getContext().getResources();
        float f1 = resources.getDisplayMetrics().density;
        d = ViewConfiguration.get(listview.getContext()).getScaledTouchSlop();
        e = (int)(400F * f1);
        f = (int)(f1 * 25F);
        g = resources.getInteger(0x10e0000);
        j = listview;
        k = a1;
        m = swipedirection;
    }

    static float a(SwipeableListItemTouchListener swipeablelistitemtouchlistener, float f1)
    {
        swipeablelistitemtouchlistener.i = f1;
        return f1;
    }

    private void a()
    {
        s.recycle();
        s = null;
        n = 0.0F;
        o = 0.0F;
        b = null;
        p = false;
        q = false;
        h = 0;
        i = 0.0F;
        t = 0L;
    }

    private void a(View view, int i1, int j1)
    {
        a(view, i1, j1, ((Interpolator) (new LinearInterpolator())));
    }

    private void a(View view, int i1, int j1, Interpolator interpolator)
    {
        ValueAnimator valueanimator;
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        valueanimator = ValueAnimator.ofInt(new int[] {
            (int)i, i1
        }).setDuration(j1);
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(view) {

            private View a;
            private SwipeableListItemTouchListener b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                SwipeableListItemTouchListener.a(b, ((Integer)valueanimator1.getAnimatedValue()).intValue());
                SwipeableListItemTouchListener.b(b).b(b.b);
                SwipeableListItemTouchListener.b(b).a(a, SwipeableListItemTouchListener.c(b));
            }

            
            {
                b = SwipeableListItemTouchListener.this;
                a = view;
                super();
            }
        });
        valueanimator.addListener(new android.animation.Animator.AnimatorListener(view, flag) {

            private View a;
            private boolean b;
            private SwipeableListItemTouchListener c;

            public final void onAnimationCancel(Animator animator)
            {
            }

            public final void onAnimationEnd(Animator animator)
            {
                int k1 = c.a(a);
                if (SwipeableListItemTouchListener.b(c) != null && k1 != -1)
                {
                    SwipeableListItemTouchListener.b(c).a(a, k1, b);
                }
            }

            public final void onAnimationRepeat(Animator animator)
            {
            }

            public final void onAnimationStart(Animator animator)
            {
            }

            
            {
                c = SwipeableListItemTouchListener.this;
                a = view;
                b = flag;
                super();
            }
        });
        valueanimator.setInterpolator(interpolator);
        valueanimator.start();
    }

    static boolean a(SwipeableListItemTouchListener swipeablelistitemtouchlistener)
    {
        int i1 = swipeablelistitemtouchlistener.a(swipeablelistitemtouchlistener.b);
        if (swipeablelistitemtouchlistener.k != null && (int)swipeablelistitemtouchlistener.k.a(swipeablelistitemtouchlistener.b) == 0 && (swipeablelistitemtouchlistener.k instanceof b) && i1 != -1)
        {
            ((b)swipeablelistitemtouchlistener.k).b(i1);
            return true;
        } else
        {
            return false;
        }
    }

    static a b(SwipeableListItemTouchListener swipeablelistitemtouchlistener)
    {
        return swipeablelistitemtouchlistener.k;
    }

    static float c(SwipeableListItemTouchListener swipeablelistitemtouchlistener)
    {
        return swipeablelistitemtouchlistener.i;
    }

    protected final int a(View view)
    {
        if (j == null || view == null || view.getParent() == null)
        {
            return -1;
        }
        int i1;
        int j1;
        try
        {
            i1 = j.getPositionForView(view);
            j1 = j.getHeaderViewsCount();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return -1;
        }
        return i1 - j1;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        Object obj;
        int k2;
        view = null;
        obj = null;
        k2 = 1;
        if (l < 2)
        {
            l = j.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 62
    //                   1 1575
    //                   2 982
    //                   3 377;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        if (c) goto _L1; else goto _L6
_L6:
        int i1;
        int k1;
        int j2;
        int l2;
        int i3;
        view = new Rect();
        k1 = j.getChildCount();
        int ai[] = new int[2];
        j.getLocationOnScreen(ai);
        j2 = (int)motionevent.getRawX();
        k2 = ai[0];
        l2 = (int)motionevent.getRawY();
        i3 = ai[1];
        i1 = 0;
_L10:
        View view1;
        if (i1 >= k1)
        {
            continue; /* Loop/switch isn't completed */
        }
        view1 = j.getChildAt(i1);
        view1.getHitRect(view);
        if (!view.contains(j2 - k2, l2 - i3)) goto _L8; else goto _L7
_L7:
        if (j instanceof StickyListHeadersListView)
        {
            view = obj;
            if (view1 != null)
            {
                if (view1.getParent() == null)
                {
                    view = obj;
                } else
                {
                    i1 = j.getPositionForView(view1);
                    int l1 = j.getFirstVisiblePosition();
                    view = ((StickyListHeadersListView)j).getWrappedView(i1 - l1);
                }
            }
        } else
        {
            view = view1;
        }
        b = view;
        if (b == null) goto _L1; else goto _L9
_L9:
        n = motionevent.getRawX();
        o = motionevent.getRawY();
        motionevent.getX();
        motionevent.getY();
        if (a)
        {
            h = (int)k.a(b);
        } else
        {
            h = 0;
        }
        i = h;
        s = VelocityTracker.obtain();
        s.addMovement(motionevent);
        t = SystemClock.uptimeMillis();
        u.postDelayed(new Runnable() {

            private SwipeableListItemTouchListener a;

            public final void run()
            {
                SwipeableListItemTouchListener.a(a);
            }

            
            {
                a = SwipeableListItemTouchListener.this;
                super();
            }
        }, ViewConfiguration.getLongPressTimeout());
        return false;
_L8:
        i1++;
          goto _L10
_L5:
        boolean flag = true;
_L11:
        if (s != null && !c)
        {
            u.removeCallbacksAndMessages(null);
            float f1 = motionevent.getRawX() - n;
            s.addMovement(motionevent);
            s.computeCurrentVelocity(1000);
            float f2 = s.getXVelocity();
            float f3 = Math.abs(f2);
            float f4 = Math.abs(s.getYVelocity());
            MotionEvent motionevent1;
            int j1;
            int i2;
            if (Math.abs(f1) >= (float)k.b(b))
            {
                if (f1 > 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                i2 = 1;
            } else
            if ((float)e <= f2)
            {
                if (f1 > 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                i2 = 1;
            } else
            if ((float)e <= f3 && f4 < f3 && p)
            {
                if (f2 < 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (f1 < 0.0F)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (j1 == i2)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (f1 > 0.0F)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
            } else
            {
                j1 = 0;
                i2 = 0;
            }
            if (i2 != 0)
            {
                if (a)
                {
                    if (m == SwipeDirection.LEFT && j1 != 0)
                    {
                        a(b, 0, g);
                    } else
                    {
                        a(b, -k.b(b), g);
                    }
                } else
                if (!flag && f1 > 0.0F)
                {
                    a(b, 0, g);
                } else
                if (q)
                {
                    a(b, k.b(b), 50, new DecelerateInterpolator());
                } else
                {
                    i = 0.0F;
                }
            } else
            {
                j1 = a(b);
                long l3 = SystemClock.uptimeMillis();
                if (Math.abs(f1) <= (float)d && k != null && (int)k.a(b) == 0 && (k instanceof b) && j1 != -1 && l3 - t <= 190L)
                {
                    ((b)k).a(j1);
                    j1 = k2;
                } else
                {
                    j1 = 0;
                }
                if (j1 == 0)
                {
                    if (h != 0)
                    {
                        f1 = (float)k.b(b) / 2.0F;
                        if ((float)h > f1)
                        {
                            h = k.b(b);
                            if (m.equals(SwipeDirection.LEFT))
                            {
                                h = -h;
                            }
                        } else
                        {
                            h = 0;
                        }
                    }
                    a(b, h, g);
                }
            }
            a();
            return false;
        }
          goto _L1
_L4:
        if (s != null && !c)
        {
            f1 = motionevent.getRawX() - n;
            f2 = motionevent.getRawY() - o;
            if (Math.abs(f1) > (float)d || Math.abs(f2) > (float)d)
            {
                u.removeCallbacksAndMessages(null);
            }
            s.addMovement(motionevent);
            if (!q)
            {
                s.computeCurrentVelocity(1000);
                f3 = s.getXVelocity();
                if (f3 > s.getYVelocity() && f3 > (float)e)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (f1 > (float)f)
                {
                    i2 = 1;
                } else
                {
                    i2 = 0;
                }
                if (i2 != 0 && j1 != 0)
                {
                    q = true;
                }
            }
            if (f1 > 0.0F)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i2 = (int)k.a(b);
            if (i2 == 0 && j1 == 0 && m == SwipeDirection.RIGHT || i2 == 0 && j1 != 0 && m == SwipeDirection.LEFT)
            {
                view = Boolean.valueOf(false);
            } else
            if (a && j1 != 0 && h >= 0)
            {
                if (b != null && p)
                {
                    a(b, 0, g);
                }
                a();
                view = Boolean.valueOf(false);
            } else
            {
                if (Math.abs(f1) > (float)d && Math.abs(f2) < Math.abs(f1) / 2.0F)
                {
                    p = true;
                    if (j1 != 0)
                    {
                        j1 = d;
                    } else
                    {
                        j1 = -d;
                    }
                    r = j1;
                    j.requestDisallowInterceptTouchEvent(true);
                    motionevent1 = MotionEvent.obtain(motionevent);
                    motionevent1.setAction(motionevent.getActionIndex() << 8 | 3);
                    j.onTouchEvent(motionevent1);
                    motionevent1.recycle();
                }
                if (p || q)
                {
                    i = ((float)h + f1) - (float)r;
                    if (m == SwipeDirection.LEFT && i > 0.0F)
                    {
                        i = 0.0F;
                    }
                    if (m == SwipeDirection.RIGHT && i < 0.0F)
                    {
                        i = 0.0F;
                    }
                    k.b(b);
                    if (Math.abs(f1) >= (float)k.b(b))
                    {
                        k.a(b);
                        k.b(b);
                    }
                    view = Boolean.valueOf(k.a(b, i));
                }
            }
            if (view != null)
            {
                return view.booleanValue();
            }
        }
          goto _L1
_L3:
        flag = false;
          goto _L11
    }

    // Unreferenced inner class com/snapchat/android/ui/listeners/SwipeableListItemTouchListener$1

/* anonymous class */
    public final class _cls1
        implements android.widget.AbsListView.OnScrollListener
    {

        private SwipeableListItemTouchListener a;

        public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
        {
        }

        public final void onScrollStateChanged(AbsListView abslistview, int i1)
        {
            boolean flag = true;
            abslistview = a;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                flag = false;
            }
            abslistview.c = flag;
        }

            public 
            {
                a = SwipeableListItemTouchListener.this;
                super();
            }
    }

}
