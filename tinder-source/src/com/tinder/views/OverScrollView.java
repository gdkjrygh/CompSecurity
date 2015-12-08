// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import com.tinder.utils.ad;
import com.tinder.utils.f;
import com.tinder.utils.o;
import com.tinder.utils.v;
import com.tinder.utils.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class OverScrollView extends ScrollView
    implements com.tinder.utils.w.a
{
    public static interface OverScrollListener
    {

        public abstract void onOverScroll(double d);
    }


    private static final int DEFAULT_OVERSCROLL = 480;
    private Context mContext;
    private boolean mDragging;
    private w mEdgeEffect;
    private WeakReference mOverScrollListener;
    private int mOverScrollMax;
    private f mScroller;
    private int mTouchSlop;

    public OverScrollView(Context context)
    {
        super(context);
        mOverScrollMax = 480;
        mContext = context;
        init();
    }

    public OverScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mOverScrollMax = 480;
        mContext = context;
        init();
    }

    public OverScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mOverScrollMax = 480;
        mContext = context;
        init();
    }

    public OverScrollView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mOverScrollMax = 480;
        mContext = context;
        init();
    }

    private static boolean edgeEffectsCausesCrash()
    {
        return Build.MANUFACTURER.contains("HTC") && android.os.Build.VERSION.SDK_INT == 16;
    }

    private void init()
    {
        mTouchSlop = ViewConfiguration.get(mContext).getScaledTouchSlop();
        try
        {
            mScroller = new f(getContext());
            Field field = getClass().getDeclaredField("mScroller");
            field.setAccessible(true);
            mScroller.a = 800;
            mScroller.setFriction(0.025F);
            field.set(this, mScroller);
            if (!edgeEffectsCausesCrash())
            {
                mEdgeEffect = new w(getContext());
                mEdgeEffect.a = this;
                mEdgeEffect.b = true;
                Field field1 = android/widget/ScrollView.getDeclaredField("mEdgeGlowTop");
                field1.setAccessible(true);
                field1.set(this, mEdgeEffect);
            }
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            v.a("OverScrollView parent ScrollView implementation did not contain a member variable called mScroller", nosuchfieldexception);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            v.a("Failed to set vale of mScroller field in OverScrollView parent ScrollView implementation", illegalaccessexception);
        }
    }

    public int getOverScrollMax()
    {
        return mOverScrollMax;
    }

    public boolean isDragging()
    {
        return mDragging;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = ad.a(motionevent, mTouchSlop, 125, 55);
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 44
    //                   0 52
    //                   1 61
    //                   2 70;
           goto _L1 _L2 _L3 _L4
_L1:
        super.onInterceptTouchEvent(motionevent);
        return false;
_L2:
        super.onInterceptTouchEvent(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        super.onInterceptTouchEvent(motionevent);
        if (true) goto _L1; else goto _L4
_L4:
        if (flag)
        {
            requestDisallowInterceptTouchEvent(true);
            super.onInterceptTouchEvent(motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onOverScrolled(int i, int j, boolean flag, boolean flag1)
    {
        super.onOverScrolled(i, j, flag, flag1);
        float f1 = (float)(-j) / (float)mOverScrollMax;
        if (o.a(mOverScrollListener))
        {
            ((OverScrollListener)mOverScrollListener.get()).onOverScroll(f1);
        }
    }

    public void onPull(float f1, float f2)
    {
    }

    public void onRelease()
    {
        if (getScrollY() <= 0)
        {
            smoothScrollTo(0, 0);
        }
    }

    protected boolean overScrollBy(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag)
    {
        l1 = mOverScrollMax;
        if (l >= j1)
        {
            l1 = 0;
        }
        if (j < 0 && l <= 0 && !flag)
        {
            l1 /= 8;
            j /= 14;
        }
        return super.overScrollBy(i, j, k, l, i1, j1, k1, l1, flag);
    }

    public void setOverScrollListener(OverScrollListener overscrolllistener)
    {
        mOverScrollListener = new WeakReference(overscrolllistener);
    }

    public void setOverScrollMax(int i)
    {
        mOverScrollMax = i;
    }
}
