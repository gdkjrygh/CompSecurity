// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.content.browser.PositionObserver;

// Referenced classes of package org.chromium.content.browser.input:
//            HandleViewResources

public class PopupTouchHandleDrawable extends View
{
    public static interface PopupTouchHandleDrawableDelegate
    {

        public abstract View getParent();

        public abstract PositionObserver getParentPositionObserver();

        public abstract boolean isScrollInProgress();

        public abstract boolean onTouchHandleEvent(MotionEvent motionevent);
    }


    static final boolean $assertionsDisabled;
    static final int CENTER = 1;
    private static final int FADE_IN_DELAY_MS = 300;
    private static final int FADE_IN_DURATION_MS = 200;
    static final int LEFT = 0;
    static final int RIGHT = 2;
    private float mAlpha;
    private final PopupWindow mContainer;
    private final Context mContext;
    private Runnable mDeferredHandleFadeInRunnable;
    private final WeakReference mDelegate;
    private Drawable mDrawable;
    private long mFadeStartTime;
    private boolean mHasPendingInvalidate;
    private float mHotspotX;
    private float mHotspotY;
    private Runnable mInvalidationRunnable;
    private int mOrientation;
    private final org.chromium.content.browser.PositionObserver.Listener mParentPositionListener = new org.chromium.content.browser.PositionObserver.Listener() {

        final PopupTouchHandleDrawable this$0;

        public void onPositionChanged(int i, int j)
        {
            updateParentPosition(i, j);
        }

            
            {
                this$0 = PopupTouchHandleDrawable.this;
                super();
            }
    };
    private PositionObserver mParentPositionObserver;
    private int mParentPositionX;
    private int mParentPositionY;
    private int mPositionX;
    private int mPositionY;
    private final int mTempScreenCoords[] = new int[2];
    private boolean mTemporarilyHidden;
    private boolean mVisible;

    public PopupTouchHandleDrawable(PopupTouchHandleDrawableDelegate popuptouchhandledrawabledelegate)
    {
        boolean flag = true;
        super(popuptouchhandledrawabledelegate.getParent().getContext());
        mOrientation = -1;
        mContext = popuptouchhandledrawabledelegate.getParent().getContext();
        mDelegate = new WeakReference(popuptouchhandledrawabledelegate);
        mContainer = new PopupWindow(mContext, null, 0x10102c8);
        mContainer.setSplitTouchEnabled(true);
        mContainer.setClippingEnabled(false);
        mContainer.setAnimationStyle(0);
        mAlpha = 1.0F;
        if (getVisibility() != 0)
        {
            flag = false;
        }
        mVisible = flag;
    }

    private void beginFadeIn()
    {
        if (getVisibility() == 0)
        {
            return;
        } else
        {
            mAlpha = 0.0F;
            mFadeStartTime = AnimationUtils.currentAnimationTimeMillis();
            doInvalidate();
            return;
        }
    }

    private void doInvalidate()
    {
        updatePosition();
        updateVisibility();
        invalidate();
    }

    private int getAdjustedPositionX()
    {
        return mPositionX + Math.round(mHotspotX);
    }

    private int getAdjustedPositionY()
    {
        return mPositionY + Math.round(mHotspotY);
    }

    private int getContainerPositionX()
    {
        return mParentPositionX + mPositionX;
    }

    private int getContainerPositionY()
    {
        return mParentPositionY + mPositionY;
    }

    private void hide()
    {
        mTemporarilyHidden = false;
        mContainer.dismiss();
        if (mParentPositionObserver != null)
        {
            mParentPositionObserver.removeListener(mParentPositionListener);
            mParentPositionObserver = null;
        }
    }

    private boolean intersectsWith(float f, float f1, float f2, float f3)
    {
        if (mDrawable != null)
        {
            int i = mDrawable.getIntrinsicWidth();
            int j = mDrawable.getIntrinsicHeight();
            if (f < (float)(mPositionX + i) && f1 < (float)(mPositionY + j) && f + f2 > (float)mPositionX && f1 + f3 > (float)mPositionY)
            {
                return true;
            }
        }
        return false;
    }

    private boolean isScrollInProgress()
    {
        PopupTouchHandleDrawableDelegate popuptouchhandledrawabledelegate = (PopupTouchHandleDrawableDelegate)mDelegate.get();
        if (popuptouchhandledrawabledelegate == null)
        {
            hide();
            return false;
        } else
        {
            return popuptouchhandledrawabledelegate.isScrollInProgress();
        }
    }

    private void rescheduleFadeIn()
    {
        if (mDeferredHandleFadeInRunnable == null)
        {
            mDeferredHandleFadeInRunnable = new Runnable() {

                final PopupTouchHandleDrawable this$0;

                public void run()
                {
                    if (isScrollInProgress())
                    {
                        rescheduleFadeIn();
                        return;
                    } else
                    {
                        mTemporarilyHidden = false;
                        beginFadeIn();
                        return;
                    }
                }

            
            {
                this$0 = PopupTouchHandleDrawable.this;
                super();
            }
            };
        }
        removeCallbacks(mDeferredHandleFadeInRunnable);
        ApiCompatibilityUtils.postOnAnimationDelayed(this, mDeferredHandleFadeInRunnable, 300L);
    }

    private void scheduleInvalidate()
    {
        if (mInvalidationRunnable == null)
        {
            mInvalidationRunnable = new Runnable() {

                final PopupTouchHandleDrawable this$0;

                public void run()
                {
                    mHasPendingInvalidate = false;
                    doInvalidate();
                }

            
            {
                this$0 = PopupTouchHandleDrawable.this;
                super();
            }
            };
        }
        if (mHasPendingInvalidate)
        {
            return;
        } else
        {
            mHasPendingInvalidate = true;
            ApiCompatibilityUtils.postOnAnimation(this, mInvalidationRunnable);
            return;
        }
    }

    private void setCenterOrientation()
    {
        setOrientation(1);
    }

    private void setFocus(float f, float f1)
    {
        int i = (int)f - Math.round(mHotspotX);
        int j = (int)f1 - Math.round(mHotspotY);
        if (mPositionX == i && mPositionY == j)
        {
            return;
        }
        mPositionX = i;
        mPositionY = j;
        if (isScrollInProgress())
        {
            temporarilyHide();
            return;
        } else
        {
            scheduleInvalidate();
            return;
        }
    }

    private void setLeftOrientation()
    {
        setOrientation(0);
    }

    private void setOpacity(float f)
    {
    }

    private void setOrientation(int i)
    {
        if (!$assertionsDisabled && (i < 0 || i > 2))
        {
            throw new AssertionError();
        }
        if (mOrientation == i)
        {
            return;
        }
        boolean flag;
        int j;
        int k;
        if (mOrientation != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mOrientation = i;
        j = getAdjustedPositionX();
        k = getAdjustedPositionY();
        i;
        JVM INSTR tableswitch 0 2: default 84
    //                   0 153
    //                   1 84
    //                   2 185;
           goto _L1 _L2 _L1 _L3
_L1:
        mDrawable = HandleViewResources.getCenterHandleDrawable(mContext);
        mHotspotX = (float)mDrawable.getIntrinsicWidth() / 2.0F;
_L5:
        mHotspotY = 0.0F;
        if (flag)
        {
            setFocus(j, k);
        }
        mDrawable.setAlpha((int)(255F * mAlpha));
        scheduleInvalidate();
        return;
_L2:
        mDrawable = HandleViewResources.getLeftHandleDrawable(mContext);
        mHotspotX = (float)(mDrawable.getIntrinsicWidth() * 3) / 4F;
        continue; /* Loop/switch isn't completed */
_L3:
        mDrawable = HandleViewResources.getRightHandleDrawable(mContext);
        mHotspotX = (float)mDrawable.getIntrinsicWidth() / 4F;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void setRightOrientation()
    {
        setOrientation(2);
    }

    private void setVisible(boolean flag)
    {
        mVisible = flag;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        if (getVisibility() == i)
        {
            return;
        } else
        {
            scheduleInvalidate();
            return;
        }
    }

    private void show()
    {
        if (mContainer.isShowing())
        {
            return;
        }
        PopupTouchHandleDrawableDelegate popuptouchhandledrawabledelegate = (PopupTouchHandleDrawableDelegate)mDelegate.get();
        if (popuptouchhandledrawabledelegate == null)
        {
            hide();
            return;
        }
        mParentPositionObserver = popuptouchhandledrawabledelegate.getParentPositionObserver();
        if (!$assertionsDisabled && mParentPositionObserver == null)
        {
            throw new AssertionError();
        } else
        {
            updateParentPosition(mParentPositionObserver.getPositionX(), mParentPositionObserver.getPositionY());
            mParentPositionObserver.addListener(mParentPositionListener);
            mContainer.setContentView(this);
            mContainer.showAtLocation(popuptouchhandledrawabledelegate.getParent(), 0, getContainerPositionX(), getContainerPositionY());
            return;
        }
    }

    private void temporarilyHide()
    {
        mTemporarilyHidden = true;
        updateVisibility();
        rescheduleFadeIn();
    }

    private void updateAlpha()
    {
        if (mAlpha == 1.0F)
        {
            return;
        } else
        {
            mAlpha = Math.min(1.0F, (float)(AnimationUtils.currentAnimationTimeMillis() - mFadeStartTime) / 200F);
            mDrawable.setAlpha((int)(255F * mAlpha));
            scheduleInvalidate();
            return;
        }
    }

    private void updateParentPosition(int i, int j)
    {
        if (mParentPositionX == i && mParentPositionY == j)
        {
            return;
        } else
        {
            mParentPositionX = i;
            mParentPositionY = j;
            temporarilyHide();
            return;
        }
    }

    private void updatePosition()
    {
        mContainer.update(getContainerPositionX(), getContainerPositionY(), getRight() - getLeft(), getBottom() - getTop());
    }

    private void updateVisibility()
    {
        boolean flag = false;
        int i;
        if (mVisible && !mTemporarilyHidden)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        setVisibility(i);
    }

    protected void onDraw(Canvas canvas)
    {
        if (mDrawable == null)
        {
            return;
        } else
        {
            updateAlpha();
            mDrawable.setBounds(0, 0, getRight() - getLeft(), getBottom() - getTop());
            mDrawable.draw(canvas);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (mDrawable == null)
        {
            setMeasuredDimension(0, 0);
            return;
        } else
        {
            setMeasuredDimension(mDrawable.getIntrinsicWidth(), mDrawable.getIntrinsicHeight());
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        PopupTouchHandleDrawableDelegate popuptouchhandledrawabledelegate = (PopupTouchHandleDrawableDelegate)mDelegate.get();
        if (popuptouchhandledrawabledelegate == null)
        {
            hide();
            return false;
        } else
        {
            popuptouchhandledrawabledelegate.getParent().getLocationOnScreen(mTempScreenCoords);
            float f = motionevent.getRawX();
            float f1 = motionevent.getX();
            float f2 = mTempScreenCoords[0];
            float f3 = motionevent.getRawY();
            float f4 = motionevent.getY();
            float f5 = mTempScreenCoords[1];
            motionevent = MotionEvent.obtainNoHistory(motionevent);
            motionevent.offsetLocation(f - f1 - f2, f3 - f4 - f5);
            boolean flag = popuptouchhandledrawabledelegate.onTouchHandleEvent(motionevent);
            motionevent.recycle();
            return flag;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/input/PopupTouchHandleDrawable.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



/*
    static boolean access$102(PopupTouchHandleDrawable popuptouchhandledrawable, boolean flag)
    {
        popuptouchhandledrawable.mHasPendingInvalidate = flag;
        return flag;
    }

*/





/*
    static boolean access$502(PopupTouchHandleDrawable popuptouchhandledrawable, boolean flag)
    {
        popuptouchhandledrawable.mTemporarilyHidden = flag;
        return flag;
    }

*/

}
