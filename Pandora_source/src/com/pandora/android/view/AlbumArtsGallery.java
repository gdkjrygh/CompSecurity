// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;
import com.pandora.radio.data.aa;

// Referenced classes of package com.pandora.android.view:
//            EcoGallery

public class AlbumArtsGallery extends EcoGallery
{
    public static interface a
        extends SpinnerAdapter
    {

        public abstract void a(int i);

        public abstract void a(View view, int i);

        public abstract void a(View view, aa aa1);
    }


    private float F;
    private int G;
    private int H;
    private long I;
    private boolean J;
    private boolean K;
    private float L;
    private boolean M;

    public AlbumArtsGallery(Context context)
    {
        super(context);
    }

    public AlbumArtsGallery(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset, 0);
    }

    public AlbumArtsGallery(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset, i);
    }

    private void a(Context context, AttributeSet attributeset, int i)
    {
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.AlbumArtsGallery, i, 0);
        M = context.getBoolean(0, false);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private a getGalleryAdapter()
    {
        return (a)getAdapter();
    }

    private int getRealWidth()
    {
        int i = getMeasuredWidth();
        return ((android.view.ViewGroup.MarginLayoutParams)getLayoutParams()).rightMargin + i;
    }

    private void n()
    {
        if (G != 0)
        {
            return;
        }
        int i;
        int j;
        int k;
        if (M)
        {
            k = getResources().getDimensionPixelSize(0x7f09012c);
            j = getResources().getDimensionPixelOffset(0x7f09012d);
            i = getResources().getDimensionPixelSize(0x7f090129);
        } else
        {
            k = getResources().getDimensionPixelSize(0x7f090053);
            j = getResources().getDimensionPixelOffset(0x7f090064);
            i = getResources().getDimensionPixelSize(0x7f090061);
        }
        G = i + (j * 2 + (k + -getRealWidth()));
        H = G;
        setRightMargin(G);
    }

    private void setRightMargin(int i)
    {
        ((android.view.ViewGroup.MarginLayoutParams)getLayoutParams()).rightMargin = i;
    }

    public void a(aa aa1, int i)
    {
        getGalleryAdapter().a(getChildAt(i - getFirstVisiblePosition()), aa1);
    }

    public void a(String s, int i)
    {
        int k = getLastVisiblePosition();
        int l = getFirstVisiblePosition();
        for (int j = 0; j < (k - l) + 1; j++)
        {
            if (s.equals(((aa)getChildAt(j).getTag(0x7f100029)).w()))
            {
                getGalleryAdapter().a(getChildAt(j), i);
            }
        }

    }

    protected boolean a(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 37
    //                   1 140
    //                   2 53;
           goto _L1 _L2 _L3 _L4
_L1:
        return K;
_L2:
        J = true;
        L = motionevent.getX();
        continue; /* Loop/switch isn't completed */
_L4:
        if (J && !K)
        {
            float f = motionevent.getX() - L;
            float f1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if (Math.abs(f) > f1)
            {
                MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
                motionevent1.setAction(0);
                motionevent1.setLocation(motionevent.getX() - f, motionevent.getY());
                super.onTouchEvent(motionevent1);
                K = true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (J)
        {
            J = false;
            if (K)
            {
                K = false;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        F = Math.abs(f / 100F);
        return super.onFling(motionevent, motionevent1, -F, f1);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (Math.abs(SystemClock.uptimeMillis() - I) > 250L)
        {
            super.onLayout(flag, i, j, k, l);
            n();
        } else
        {
            i = 0;
            while (i < getChildCount()) 
            {
                View view = getChildAt(i);
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getHeight(), 0x40000000));
                view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                i++;
            }
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = getRealWidth();
        super.onMeasure(i, j);
        if (getRealWidth() != k)
        {
            G = 0;
            n();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        I = SystemClock.uptimeMillis();
        F = 1.0F;
        return super.onScroll(motionevent, motionevent1, f, f1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        a(motionevent);
        return super.onTouchEvent(motionevent);
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        if (spinneradapter != null && !(spinneradapter instanceof a))
        {
            throw new IllegalArgumentException("adapter must implement AlbumArtsGalleryAdapter");
        } else
        {
            super.setAdapter(spinneradapter);
            return;
        }
    }

    public void setIsNowPlayingItemSelected(boolean flag)
    {
        if (flag)
        {
            setRightMargin(G);
            return;
        } else
        {
            setRightMargin(H);
            return;
        }
    }

    public void setSelectedItemPosition(int i)
    {
        super.setSelectedItemPosition(i);
        if (getGalleryAdapter() != null)
        {
            getGalleryAdapter().a(i);
        }
    }
}
