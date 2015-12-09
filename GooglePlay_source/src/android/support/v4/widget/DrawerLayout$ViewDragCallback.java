// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.SystemClock;
import android.support.v4.view.VelocityTrackerCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, ViewDragHelper

private final class mAbsGravity extends mAbsGravity
{

    final int mAbsGravity;
    ViewDragHelper mDragger;
    private final Runnable mPeekRunnable = new Runnable() {

        final DrawerLayout.ViewDragCallback this$1;

        public final void run()
        {
            boolean flag = false;
            Object obj1 = DrawerLayout.ViewDragCallback.this;
            int l = ((DrawerLayout.ViewDragCallback) (obj1)).mDragger.mEdgeSize;
            Object obj;
            int j;
            int k;
            if (((DrawerLayout.ViewDragCallback) (obj1)).mAbsGravity == 3)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                obj = ((DrawerLayout.ViewDragCallback) (obj1)).this$0.findDrawerWithGravity(3);
                DrawerLayout.LayoutParams layoutparams;
                long l1;
                if (obj != null)
                {
                    k = -((View) (obj)).getWidth();
                } else
                {
                    k = 0;
                }
                k += l;
            } else
            {
                obj = ((DrawerLayout.ViewDragCallback) (obj1)).this$0.findDrawerWithGravity(5);
                k = ((DrawerLayout.ViewDragCallback) (obj1)).this$0.getWidth();
                k -= l;
            }
            if (obj != null && (j != 0 && ((View) (obj)).getLeft() < k || j == 0 && ((View) (obj)).getLeft() > k) && ((DrawerLayout.ViewDragCallback) (obj1)).this$0.getDrawerLockMode(((View) (obj))) == 0)
            {
                layoutparams = (DrawerLayout.LayoutParams)((View) (obj)).getLayoutParams();
                ((DrawerLayout.ViewDragCallback) (obj1)).mDragger.smoothSlideViewTo(((View) (obj)), k, ((View) (obj)).getTop());
                layoutparams.isPeeking = true;
                ((DrawerLayout.ViewDragCallback) (obj1)).this$0.invalidate();
                ((DrawerLayout.ViewDragCallback) (obj1)).closeOtherDrawer();
                obj = ((DrawerLayout.ViewDragCallback) (obj1)).this$0;
                if (!((DrawerLayout) (obj)).mChildrenCanceledTouch)
                {
                    l1 = SystemClock.uptimeMillis();
                    obj1 = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
                    k = ((DrawerLayout) (obj)).getChildCount();
                    for (j = ((flag) ? 1 : 0); j < k; j++)
                    {
                        ((DrawerLayout) (obj)).getChildAt(j).dispatchTouchEvent(((MotionEvent) (obj1)));
                    }

                    ((MotionEvent) (obj1)).recycle();
                    obj.mChildrenCanceledTouch = true;
                }
            }
        }

            
            {
                this$1 = DrawerLayout.ViewDragCallback.this;
                super();
            }
    };
    final DrawerLayout this$0;

    public final int clampViewPositionHorizontal$17e143b0(View view, int i)
    {
        if (checkDrawerViewAbsoluteGravity(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int j = getWidth();
            return Math.max(j - view.getWidth(), Math.min(i, j));
        }
    }

    public final int clampViewPositionVertical$17e143b0(View view)
    {
        return view.getTop();
    }

    final void closeOtherDrawer()
    {
        byte byte0 = 3;
        if (mAbsGravity == 3)
        {
            byte0 = 5;
        }
        View view = findDrawerWithGravity(byte0);
        if (view != null)
        {
            closeDrawer(view);
        }
    }

    public final int getViewHorizontalDragRange(View view)
    {
        if (DrawerLayout.isDrawerView(view))
        {
            return view.getWidth();
        } else
        {
            return 0;
        }
    }

    public final void onEdgeDragStarted(int i, int j)
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

    public final void onEdgeTouched$255f295()
    {
        postDelayed(mPeekRunnable, 160L);
    }

    public final void onViewCaptured$5359dc9a(View view)
    {
        ((mPeekRunnable)view.getLayoutParams()).eking = false;
        closeOtherDrawer();
    }

    public final void onViewDragStateChanged(int i)
    {
        DrawerLayout drawerlayout;
        View view;
        closeOtherDrawer closeotherdrawer;
        drawerlayout = DrawerLayout.this;
        view = mDragger.mCapturedView;
        int j = drawerlayout.mLeftDragger.mDragState;
        int k = drawerlayout.mRightDragger.mDragState;
        if (j == 1 || k == 1)
        {
            j = 1;
        } else
        if (j == 2 || k == 2)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        if (view == null || i != 0) goto _L2; else goto _L1
_L1:
        closeotherdrawer = (mDragger)view.getLayoutParams();
        if (closeotherdrawer.reen != 0.0F) goto _L4; else goto _L3
_L3:
        closeotherdrawer = (reen)view.getLayoutParams();
        if (closeotherdrawer.nOpen)
        {
            closeotherdrawer.nOpen = false;
            if (drawerlayout.mListener != null)
            {
                drawerlayout.mListener.DrawerClosed(view);
            }
            drawerlayout.updateChildrenImportantForAccessibility(view, false);
            if (drawerlayout.hasWindowFocus())
            {
                view = drawerlayout.getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
_L2:
        if (j != drawerlayout.mDrawerState)
        {
            drawerlayout.mDrawerState = j;
            if (drawerlayout.mListener != null)
            {
                drawerlayout.mListener.DrawerStateChanged(j);
            }
        }
        return;
_L4:
        if (closeotherdrawer.reen == 1.0F)
        {
            closeOtherDrawer closeotherdrawer1 = (reen)view.getLayoutParams();
            if (!closeotherdrawer1.nOpen)
            {
                closeotherdrawer1.nOpen = true;
                if (drawerlayout.mListener != null)
                {
                    drawerlayout.mListener.DrawerOpened(view);
                }
                drawerlayout.updateChildrenImportantForAccessibility(view, true);
                if (drawerlayout.hasWindowFocus())
                {
                    drawerlayout.sendAccessibilityEvent(32);
                }
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void onViewPositionChanged$5b6f797d(View view, int i)
    {
        int j = view.getWidth();
        float f;
        if (checkDrawerViewAbsoluteGravity(view, 3))
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

    public final void onViewReleased$17e2ac03(View view, float f)
    {
        float f1 = DrawerLayout.getDrawerViewOffset(view);
        int j = view.getWidth();
        ViewDragHelper viewdraghelper;
        int i;
        if (checkDrawerViewAbsoluteGravity(view, 3))
        {
            if (f > 0.0F || f == 0.0F && f1 > 0.5F)
            {
                i = 0;
            } else
            {
                i = -j;
            }
        } else
        {
            i = getWidth();
            if (f < 0.0F || f == 0.0F && f1 > 0.5F)
            {
                i -= j;
            }
        }
        viewdraghelper = mDragger;
        j = view.getTop();
        if (!viewdraghelper.mReleaseInProgress)
        {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else
        {
            viewdraghelper.forceSettleCapturedViewAt(i, j, (int)VelocityTrackerCompat.getXVelocity(viewdraghelper.mVelocityTracker, viewdraghelper.mActivePointerId), (int)VelocityTrackerCompat.getYVelocity(viewdraghelper.mVelocityTracker, viewdraghelper.mActivePointerId));
            invalidate();
            return;
        }
    }

    public final void removeCallbacks()
    {
        DrawerLayout.this.removeCallbacks(mPeekRunnable);
    }

    public final boolean tryCaptureView$5359dc96(View view)
    {
        return DrawerLayout.isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
    }

    public _cls1.this._cls1(int i)
    {
        this$0 = DrawerLayout.this;
        super();
        mAbsGravity = i;
    }
}
