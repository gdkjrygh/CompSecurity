// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fv;
import Jo;
import OW;
import Pd;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.widget.FrameLayout;
import cR;
import cT;
import cV;
import com.snapchat.android.Timber;
import dv;

public class VerticalFlinger extends FrameLayout
{
    public static final class MovementState extends Enum
    {

        private static final MovementState $VALUES[];
        public static final MovementState CENTER;
        public static final MovementState DEACTIVATED;
        public static final MovementState DRAG;
        public static final MovementState FLING;
        public static final MovementState GONE;
        public static final MovementState RETURN;

        public static MovementState valueOf(String s1)
        {
            return (MovementState)Enum.valueOf(com/snapchat/android/ui/VerticalFlinger$MovementState, s1);
        }

        public static MovementState[] values()
        {
            return (MovementState[])$VALUES.clone();
        }

        static 
        {
            CENTER = new MovementState("CENTER", 0);
            DRAG = new MovementState("DRAG", 1);
            FLING = new MovementState("FLING", 2);
            GONE = new MovementState("GONE", 3);
            RETURN = new MovementState("RETURN", 4);
            DEACTIVATED = new MovementState("DEACTIVATED", 5);
            $VALUES = (new MovementState[] {
                CENTER, DRAG, FLING, GONE, RETURN, DEACTIVATED
            });
        }

        private MovementState(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface a
    {
    }

    final class b
        implements Fv.b
    {

        private VerticalFlinger a;

        public final void a()
        {
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[MovementState.values().length];
                    try
                    {
                        a[MovementState.CENTER.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[MovementState.DRAG.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[MovementState.FLING.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[MovementState.GONE.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[MovementState.RETURN.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[MovementState.DEACTIVATED.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[VerticalFlinger.a(a).ordinal()])
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unhandled state: ")).append(VerticalFlinger.a(a)).toString());

            case 2: // '\002'
                Timber.d("VerticalFlinger", "Received spring rest event while in DRAG state. Weird. Ignoring.", new Object[0]);
                // fall through

            case 1: // '\001'
            case 4: // '\004'
                return;

            case 3: // '\003'
                VerticalFlinger.a(a, MovementState.GONE);
                return;

            case 5: // '\005'
                VerticalFlinger.a(a, MovementState.CENTER);
                return;

            case 6: // '\006'
                VerticalFlinger.a(a, MovementState.CENTER);
                break;
            }
        }

        public final void a(Fv fv)
        {
            VerticalFlinger verticalflinger = a;
            fv.e();
            if (fv.d)
            {
                fv = new OW(fv.a.d.a, fv.b.d.a);
            } else
            {
                dv.a(fv.e);
                fv = fv.e;
            }
            VerticalFlinger.a(verticalflinger, fv);
        }

        b()
        {
            a = VerticalFlinger.this;
            super();
        }
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private double j;
    private double k;
    private final Fv l;
    private MovementState m;
    private boolean n;
    private VelocityTracker o;
    private OW p;
    private OW q;
    private OW r;
    private int s;

    public VerticalFlinger(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (new Fv()).a(new cV(200D, 50D)));
    }

    private VerticalFlinger(Context context, AttributeSet attributeset, Fv fv)
    {
        super(context, attributeset);
        a = true;
        b = true;
        c = true;
        d = 30F;
        e = 0.5F;
        f = 0.0F;
        g = 0.0F;
        h = 0.0F;
        i = 0.0F;
        j = 0.0D;
        k = 0.0D;
        m = MovementState.CENTER;
        n = false;
        p = OW.a();
        q = OW.a();
        r = null;
        s = 1;
        l = fv;
        attributeset = l;
        fv = new b();
        attributeset.e();
        dv.a(fv);
        ((Fv) (attributeset)).c.a(fv);
        l.b(false);
        f = Jo.a(50F, context);
        g = Jo.a(60F, context);
        h = Jo.a(500F, context);
        i = Jo.a(25F, context);
        j = Math.toRadians(67.5D);
        k = Math.toRadians(112.5D);
    }

    static MovementState a(VerticalFlinger verticalflinger)
    {
        return verticalflinger.m;
    }

    private void a()
    {
        if (m == MovementState.CENTER || m == MovementState.DEACTIVATED)
        {
            return;
        }
        if (m == MovementState.DRAG)
        {
            e();
        }
        l.a(OW.a());
        l.a(true);
        a(MovementState.RETURN);
    }

    private void a(float f1)
    {
        setRotation(f1);
        invalidate();
    }

    private void a(OW ow)
    {
        if (!ow.equals(g()))
        {
            Fv fv = l;
            fv.e();
            dv.a(ow);
            if (fv.d)
            {
                fv.a.a(ow.x);
                fv.b.a(ow.y);
            } else
            {
                fv.e = ow;
            }
            c(ow);
        }
    }

    private void a(MotionEvent motionevent)
    {
        c(motionevent);
        motionevent = new OW(motionevent.getRawX(), motionevent.getRawY());
        OW ow = p;
        motionevent = new OW(((OW) (motionevent)).x - ow.x, ((OW) (motionevent)).y - ow.y);
        ow = q;
        double d1 = ((OW) (motionevent)).x;
        double d3 = ow.x;
        double d5 = ((OW) (motionevent)).y;
        motionevent = new OW(d1 + d3, ow.y + d5);
        _cls1.a[m.ordinal()];
        JVM INSTR tableswitch 1 6: default 152
    //                   1 179
    //                   2 300
    //                   3 308
    //                   4 324
    //                   5 340
    //                   6 279;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException((new StringBuilder("Unhandled state: ")).append(m).toString());
_L2:
        if (Math.abs(((OW) (motionevent)).y) <= (double)i && Math.abs(((OW) (motionevent)).x) <= (double)i)
        {
            break; /* Loop/switch isn't completed */
        }
        double d4 = Math.atan2(((OW) (motionevent)).y, ((OW) (motionevent)).x);
        double d2 = d4;
        if (d4 < 0.0D)
        {
            d2 = d4 + 3.1415926535897931D;
        }
        boolean flag;
        if (d2 >= j && d2 <= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(MovementState.DRAG);
            a(((OW) (motionevent)));
        } else
        {
            a(MovementState.DEACTIVATED);
        }
_L9:
        d();
        return;
_L3:
        a(((OW) (motionevent)));
        continue; /* Loop/switch isn't completed */
_L4:
        Timber.d("VerticalFlinger", "Received touch move event while in FLING state. Weird. Ignoring.", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L5:
        Timber.d("VerticalFlinger", "Received touch move event while in GONE state. Weird. Ignoring.", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L6:
        Timber.d("VerticalFlinger", "Received touch move event while in RETURN state. Weird. Ignoring.", new Object[0]);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a(MovementState movementstate)
    {
        if (m == movementstate) goto _L2; else goto _L1
_L1:
        MovementState movementstate1 = m;
        _cls1.a[movementstate1.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 87
    //                   2 114
    //                   3 131
    //                   4 155
    //                   5 172
    //                   6 196;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        throw new IllegalStateException((new StringBuilder("Unhandled state: ")).append(m).toString());
_L4:
        if (movementstate != MovementState.DRAG && movementstate != MovementState.FLING)
        {
            if (movementstate != MovementState.DEACTIVATED);
        }
_L11:
        m = movementstate;
_L2:
        return;
_L5:
        if (movementstate == MovementState.FLING || movementstate != MovementState.RETURN);
        continue; /* Loop/switch isn't completed */
_L6:
        if (movementstate == MovementState.RETURN || movementstate == MovementState.DRAG || movementstate != MovementState.GONE);
        continue; /* Loop/switch isn't completed */
_L7:
        if (movementstate == MovementState.RETURN || movementstate != MovementState.DRAG);
        continue; /* Loop/switch isn't completed */
_L8:
        if (movementstate == MovementState.CENTER || movementstate == MovementState.DRAG || movementstate != MovementState.FLING);
        continue; /* Loop/switch isn't completed */
_L9:
        if (movementstate == MovementState.CENTER);
        if (true) goto _L11; else goto _L10
_L10:
    }

    static void a(VerticalFlinger verticalflinger, OW ow)
    {
        verticalflinger.c(ow);
    }

    static void a(VerticalFlinger verticalflinger, MovementState movementstate)
    {
        verticalflinger.a(movementstate);
    }

    private void b()
    {
        boolean flag6 = true;
        _cls1.a[m.ordinal()];
        JVM INSTR tableswitch 1 6: default 52
    //                   1 314
    //                   2 79
    //                   3 491
    //                   4 507
    //                   5 523
    //                   6 539;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException((new StringBuilder("Unhandled state: ")).append(m).toString());
_L3:
        OW ow;
        Fv fv;
        OW ow1;
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        if (o == null)
        {
            Timber.e("VerticalFlinger", "Velocity tracker not available! Did Android send us events in the wrong order?", new Object[0]);
            ow = OW.a();
        } else
        {
            o.computeCurrentVelocity(1000, h);
            ow = new OW(o.getXVelocity(), o.getYVelocity());
        }
        fv = l;
        ow1 = new OW(ow.x * 0.25D, ow.y * 0.25D);
        fv.e();
        dv.a(ow1);
        if (fv.d)
        {
            fv.a.c(ow1.x);
            fv.b.c(ow1.y);
        } else
        {
            fv.f = ow1;
        }
        if (Math.signum(g().y) == Math.signum(ow.y))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Math.abs(g().y) > (double)g)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (Math.abs(ow.y) > (double)f)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (s != 4)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (f != 0.0F)
        {
            flag5 = true;
        } else
        {
            flag5 = false;
        }
        if (flag5 && flag && flag2 && flag3 && (!c || flag4))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L9; else goto _L8
_L8:
        b(ow);
_L12:
        e();
        return;
_L9:
        boolean flag1;
        if (e == 0.0F)
        {
            break MISSING_BLOCK_LABEL_478;
        }
        float f1 = e;
        float f2 = getHeight();
        if (Math.abs(g().y) <= (double)(f1 * f2))
        {
            break MISSING_BLOCK_LABEL_478;
        }
        flag1 = flag6;
_L10:
        if (flag1)
        {
            b(new OW(0.0D, Math.signum(g().y)));
        } else
        {
            a();
        }
        continue; /* Loop/switch isn't completed */
        flag1 = false;
          goto _L10
_L4:
        Timber.d("VerticalFlinger", "Received touch up event while in FLING state. Weird. Ignoring.", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L5:
        Timber.d("VerticalFlinger", "Received touch up event while in GONE state. Weird. Ignoring.", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L6:
        Timber.d("VerticalFlinger", "Received touch up event while in RETURN state. Weird. Ignoring.", new Object[0]);
        continue; /* Loop/switch isn't completed */
_L7:
        a(MovementState.CENTER);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b(OW ow)
    {
        Fv fv = l;
        double d1 = ow.y;
        OW ow1 = g();
        double d2 = (getHeight() * 3) / 2;
        d1 = d2;
        if (ow.y < 0.0D)
        {
            d1 = -d2;
        }
        fv.a(new OW(ow1.x + (ow.x * (d1 - ow1.y)) / ow.y, d1));
        l.a(true);
        a(MovementState.FLING);
    }

    private void b(MotionEvent motionevent)
    {
        p = new OW(motionevent.getRawX(), motionevent.getRawY());
        q = new OW(getTranslationX(), getTranslationY());
        setPivotX(motionevent.getX());
        setPivotY(motionevent.getY());
    }

    private void c()
    {
        l.a(false);
        a(MovementState.DRAG);
    }

    private void c(OW ow)
    {
        float f1;
        if (a)
        {
            f1 = (float)ow.x;
        } else
        {
            f1 = 0.0F;
        }
        setTranslationX(f1);
        setTranslationY((float)ow.y);
        if (b)
        {
            d(ow);
        }
        invalidate();
    }

    private void c(MotionEvent motionevent)
    {
        if (o != null)
        {
            motionevent = MotionEvent.obtain(motionevent.getDownTime(), motionevent.getEventTime(), motionevent.getAction(), motionevent.getRawX(), motionevent.getRawY(), motionevent.getMetaState());
            o.addMovement(motionevent);
            motionevent.recycle();
            return;
        } else
        {
            Timber.e("VerticalFlinger", "Velocity tracker not available! Did Android send us events in the wrong order?", new Object[0]);
            return;
        }
    }

    private void d()
    {
        OW ow;
        ow = g();
        if (r == null)
        {
            r = ow;
            return;
        }
        if (ow.y - r.y >= 0.0D) goto _L2; else goto _L1
_L1:
        if (s != 1) goto _L4; else goto _L3
_L3:
        s = 2;
_L6:
        r = ow;
        return;
_L4:
        if (s != 2)
        {
            s = 4;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (ow.y - r.y > 0.0D)
        {
            if (s == 1)
            {
                s = 3;
            } else
            if (s != 3)
            {
                s = 4;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void d(OW ow)
    {
        float f1 = (float)getWidth() / 2.0F;
        f1 = Math.max(-1F, Math.min(1.0F, (float)ow.x / f1));
        float f2 = (float)getHeight() / 2.0F;
        f2 = Math.max(-1F, Math.min(1.0F, (float)ow.y / f2));
        a(f1 * -d * f2);
    }

    private void e()
    {
        f();
        p = OW.a();
        q = OW.a();
        r = null;
        s = 1;
    }

    private void f()
    {
        if (o != null)
        {
            o.recycle();
            o = null;
        }
    }

    private OW g()
    {
        return new OW(getTranslationX(), getTranslationY());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (((Pd) (l)).mIsReleased)
        {
            throw new IllegalStateException("Attempt to attach to window after resources already released.");
        } else
        {
            return;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        l.d();
        f();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 62
    //                   1 227
    //                   2 234;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_234;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L15:
        if (m != MovementState.CENTER && m != MovementState.DEACTIVATED)
        {
            return true;
        }
        if (true) goto _L1; else goto _L7
_L7:
        if (o == null)
        {
            o = VelocityTracker.obtain();
        }
        c(motionevent);
        _cls1.a[m.ordinal()];
        JVM INSTR tableswitch 1 6: default 132
    //                   1 159
    //                   2 171
    //                   3 187
    //                   4 199
    //                   5 215
    //                   6 164;
           goto _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L13:
        break MISSING_BLOCK_LABEL_215;
_L14:
        break; /* Loop/switch isn't completed */
_L8:
        throw new IllegalStateException((new StringBuilder("Unhandled state: ")).append(m).toString());
_L9:
        b(motionevent);
_L16:
        d();
          goto _L15
_L10:
        Timber.d("VerticalFlinger", "Received touch down event while in DRAG state. Weird. Ignoring.", new Object[0]);
          goto _L16
_L11:
        b(motionevent);
        c();
          goto _L16
_L12:
        Timber.d("VerticalFlinger", "Received touch down event while in GONE state. Weird. Ignoring.", new Object[0]);
          goto _L16
        b(motionevent);
        c();
          goto _L16
_L5:
        b();
          goto _L15
        a(motionevent);
          goto _L15
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (n)
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 40
    //                   1 42
    //                   2 49;
           goto _L1 _L1 _L2 _L3
_L1:
        return true;
_L2:
        b();
        continue; /* Loop/switch isn't completed */
_L3:
        a(motionevent);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setConsistentSwipeDirectionRequired(boolean flag)
    {
        c = flag;
    }

    public void setDistanceOfNoReturn(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        e = f1;
    }

    public void setHorizontalMovementEnabled(boolean flag)
    {
        if (a != flag)
        {
            a = flag;
            a(new OW(0.0D, g().y));
        }
    }

    public void setListener(a a1)
    {
    }

    public void setMaxEffectiveAngle(double d1)
    {
        k = Math.toRadians(d1);
    }

    public void setMaxRotation(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        d = f1;
    }

    public void setMaxVelocity(float f1)
    {
        boolean flag;
        if (f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        g = Jo.a(f1, getContext());
    }

    public void setMinDistanceToFling(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        g = Jo.a(f1, getContext());
    }

    public void setMinEffectiveAngle(double d1)
    {
        j = Math.toRadians(d1);
    }

    public void setMinVelocityToFling(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        f = Jo.a(f1, getContext());
    }

    public void setOvershootClampingEnabled(boolean flag)
    {
        l.b(flag);
    }

    public void setPositionLocked(boolean flag)
    {
        boolean flag1;
label0:
        {
            flag1 = false;
            if (n != flag)
            {
                n = flag;
                if (!flag)
                {
                    break label0;
                }
                l.a(false);
            }
            return;
        }
        Fv fv;
label1:
        {
            fv = l;
            if (m != MovementState.FLING)
            {
                flag = flag1;
                if (m != MovementState.RETURN)
                {
                    break label1;
                }
            }
            flag = true;
        }
        fv.a(flag);
    }

    public void setRotationEnabled(boolean flag)
    {
label0:
        {
            if (b != flag)
            {
                b = flag;
                if (!flag)
                {
                    break label0;
                }
                d(g());
            }
            return;
        }
        a(0.0F);
    }

    public void setSpringConfig(cV cv)
    {
        l.a(cv);
    }

    public void setTouchSlop(float f1)
    {
        i = Jo.a(25F, getContext());
    }
}
