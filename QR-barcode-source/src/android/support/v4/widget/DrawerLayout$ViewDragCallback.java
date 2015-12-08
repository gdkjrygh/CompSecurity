// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, ViewDragHelper

private class mGravity extends mGravity
{

    private ViewDragHelper mDragger;
    private final int mGravity;
    private final Runnable mPeekRunnable = new Runnable() {

        final DrawerLayout.ViewDragCallback this$1;

        public void run()
        {
            peekDrawer();
        }

            
            {
                this$1 = DrawerLayout.ViewDragCallback.this;
                super();
            }
    };
    final DrawerLayout this$0;

    private void closeOtherDrawer()
    {
        byte byte0 = 3;
        if (mGravity == 3)
        {
            byte0 = 5;
        }
        View view = findDrawerWithGravity(byte0);
        if (view != null)
        {
            closeDrawer(view);
        }
    }

    private void peekDrawer()
    {
        int i = 0;
        int j = mDragger.getEdgeSize();
        View view;
        boolean flag;
        if (mGravity == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = findDrawerWithGravity(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = findDrawerWithGravity(5);
            i = getWidth() - j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
        {
            vity vity = ()view.getLayoutParams();
            mDragger.smoothSlideViewTo(view, i, view.getTop());
            vity.eking = true;
            invalidate();
            closeOtherDrawer();
            cancelChildViewTouch();
        }
    }

    public int clampViewPositionHorizontal(View view, int i, int j)
    {
        if (checkDrawerViewGravity(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            j = getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public int clampViewPositionVertical(View view, int i, int j)
    {
        return view.getTop();
    }

    public int getViewHorizontalDragRange(View view)
    {
        return view.getWidth();
    }

    public void onEdgeDragStarted(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = findDrawerWithGravity(3);
        } else
        {
            view = findDrawerWithGravity(5);
        }
        if (view != null && getDrawerLockMode(view) == 0)
        {
            mDragger.captureChildView(view, j);
        }
    }

    public boolean onEdgeLock(int i)
    {
        return false;
    }

    public void onEdgeTouched(int i, int j)
    {
        postDelayed(mPeekRunnable, 160L);
    }

    public void onViewCaptured(View view, int i)
    {
        ((mPeekRunnable)view.getLayoutParams()).eking = false;
        closeOtherDrawer();
    }

    public void onViewDragStateChanged(int i)
    {
        updateDrawerState(mGravity, i, mDragger.getCapturedView());
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        j = view.getWidth();
        float f;
        if (checkDrawerViewGravity(view, 3))
        {
            f = (float)(j + i) / (float)j;
        } else
        {
            f = (float)(getWidth() - i) / (float)j;
        }
        setDrawerViewOffset(view, f);
        if (f == 0.0F)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        invalidate();
    }

    public void onViewReleased(View view, float f, float f1)
    {
        int j;
        f1 = getDrawerViewOffset(view);
        j = view.getWidth();
        if (!checkDrawerViewGravity(view, 3)) goto _L2; else goto _L1
_L1:
        int i;
        if (f > 0.0F || f == 0.0F && f1 > 0.5F)
        {
            i = 0;
        } else
        {
            i = -j;
        }
_L4:
        mDragger.settleCapturedViewAt(i, view.getTop());
        invalidate();
        return;
_L2:
        i = getWidth();
        if (f < 0.0F || f == 0.0F && f1 < 0.5F)
        {
            i -= j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeCallbacks()
    {
        DrawerLayout.this.removeCallbacks(mPeekRunnable);
    }

    public void setDragger(ViewDragHelper viewdraghelper)
    {
        mDragger = viewdraghelper;
    }

    public boolean tryCaptureView(View view, int i)
    {
        return isDrawerView(view) && checkDrawerViewGravity(view, mGravity) && getDrawerLockMode(view) == 0;
    }


    public _cls1.this._cls1(int i)
    {
        this$0 = DrawerLayout.this;
        super();
        mGravity = i;
    }
}
