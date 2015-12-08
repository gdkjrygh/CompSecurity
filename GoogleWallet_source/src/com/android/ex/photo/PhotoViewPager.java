// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class PhotoViewPager extends ViewPager
{
    public static final class InterceptType extends Enum
    {

        private static final InterceptType $VALUES[];
        public static final InterceptType BOTH;
        public static final InterceptType LEFT;
        public static final InterceptType NONE;
        public static final InterceptType RIGHT;

        public static InterceptType valueOf(String s)
        {
            return (InterceptType)Enum.valueOf(com/android/ex/photo/PhotoViewPager$InterceptType, s);
        }

        public static InterceptType[] values()
        {
            return (InterceptType[])$VALUES.clone();
        }

        static 
        {
            NONE = new InterceptType("NONE", 0);
            LEFT = new InterceptType("LEFT", 1);
            RIGHT = new InterceptType("RIGHT", 2);
            BOTH = new InterceptType("BOTH", 3);
            $VALUES = (new InterceptType[] {
                NONE, LEFT, RIGHT, BOTH
            });
        }

        private InterceptType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface OnInterceptTouchListener
    {

        public abstract InterceptType onTouchIntercept(float f, float f1);
    }


    private float mActivatedX;
    private float mActivatedY;
    private int mActivePointerId;
    private float mLastMotionX;
    private OnInterceptTouchListener mListener;

    public PhotoViewPager(Context context)
    {
        super(context);
        initialize();
    }

    public PhotoViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initialize();
    }

    private void initialize()
    {
        setPageTransformer(true, new android.support.v4.view.ViewPager.PageTransformer() {

            final PhotoViewPager this$0;

            public final void transformPage(View view, float f)
            {
                if (f < 0.0F || f >= 1.0F)
                {
                    view.setTranslationX(0.0F);
                    view.setAlpha(1.0F);
                    view.setScaleX(1.0F);
                    view.setScaleY(1.0F);
                    return;
                } else
                {
                    view.setTranslationX(-f * (float)view.getWidth());
                    view.setAlpha(Math.max(0.0F, 1.0F - f));
                    f = Math.max(0.0F, 1.0F - 0.3F * f);
                    view.setScaleX(f);
                    view.setScaleY(f);
                    return;
                }
            }

            
            {
                this$0 = PhotoViewPager.this;
                super();
            }
        });
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        InterceptType intercepttype;
        int j;
        if (mListener != null)
        {
            intercepttype = mListener.onTouchIntercept(mActivatedX, mActivatedY);
        } else
        {
            intercepttype = InterceptType.NONE;
        }
        if (intercepttype == InterceptType.BOTH || intercepttype == InterceptType.LEFT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (intercepttype == InterceptType.BOTH || intercepttype == InterceptType.RIGHT)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = motionevent.getAction() & 0xff;
        if (j == 3 || j == 1)
        {
            mActivePointerId = -1;
        }
        j;
        JVM INSTR lookupswitch 3: default 124
    //                   0: 241
    //                   2: 149
    //                   6: 277;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        if (flag || flag1)
        {
            int k = mActivePointerId;
            if (k != -1)
            {
                float f = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, k));
                if (flag && flag1)
                {
                    mLastMotionX = f;
                    return false;
                }
                if (flag && f > mLastMotionX)
                {
                    mLastMotionX = f;
                    return false;
                }
                if (flag1 && f < mLastMotionX)
                {
                    mLastMotionX = f;
                    return false;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        mLastMotionX = motionevent.getX();
        mActivatedX = motionevent.getRawX();
        mActivatedY = motionevent.getRawY();
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
        continue; /* Loop/switch isn't completed */
_L4:
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mLastMotionX = MotionEventCompat.getX(motionevent, i);
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setOnInterceptTouchListener(OnInterceptTouchListener onintercepttouchlistener)
    {
        mListener = onintercepttouchlistener;
    }
}
