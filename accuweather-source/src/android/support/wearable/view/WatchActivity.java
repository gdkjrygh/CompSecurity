// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package android.support.wearable.view:
//            SwipeTouchDelegate

public abstract class WatchActivity extends Activity
{

    public static final String KEY_EXTRA_EXIT_NOTIF_ID = "exit_notif_id";
    public static final String KEY_EXTRA_EXIT_NOTIF_PACKAGE = "exit_notif_package";
    public static final String KEY_EXTRA_EXIT_NOTIF_TAG = "exit_notif_tag";
    private static final int NO_POINTER = -1;
    public static final String TAG = "WearableSamples:WatchActivity";
    private int mActivePointerId;
    private float mInitialTouchX;
    private int mMaxFlingVelocity;
    private int mMinFlingVelocity;
    private SwipeTouchDelegate mSwipeTouchDelegate;
    private VelocityTracker mVelocityTracker;

    public WatchActivity()
    {
        mVelocityTracker = null;
        mActivePointerId = -1;
    }

    private boolean handlePointerDown(MotionEvent motionevent)
    {
        if (mActivePointerId == -1)
        {
            mActivePointerId = motionevent.getPointerId(0);
            mInitialTouchX = motionevent.getX();
            mVelocityTracker = VelocityTracker.obtain();
            mVelocityTracker.addMovement(motionevent);
        }
        return false;
    }

    private boolean handlePointerMove(MotionEvent motionevent)
    {
        if (mActivePointerId != -1)
        {
            mVelocityTracker.addMovement(motionevent);
        }
        return false;
    }

    private boolean handlePointerUp(MotionEvent motionevent)
    {
label0:
        {
            int i = motionevent.findPointerIndex(mActivePointerId);
            if (mActivePointerId == -1 || i == -1)
            {
                return false;
            }
            mVelocityTracker.addMovement(motionevent);
            mVelocityTracker.computeCurrentVelocity(1000);
            float f = motionevent.getX(i);
            float f1 = mInitialTouchX;
            float f2 = mVelocityTracker.getXVelocity(i);
            float f3 = Math.abs(f2);
            float f4 = Math.abs(mVelocityTracker.getYVelocity(i));
            float f5 = getResources().getDisplayMetrics().widthPixels;
            boolean flag1 = false;
            boolean flag;
            if (f - f1 < f5 / 2.0F)
            {
                flag = flag1;
                if ((float)mMinFlingVelocity > f3)
                {
                    break label0;
                }
                flag = flag1;
                if (f3 > (float)mMaxFlingVelocity)
                {
                    break label0;
                }
                flag = flag1;
                if (f4 >= f3)
                {
                    break label0;
                }
                flag = flag1;
                if (f2 <= 0.0F)
                {
                    break label0;
                }
            }
            flag = flag1;
            if (mSwipeTouchDelegate != null)
            {
                if (mSwipeTouchDelegate.isDismissHandler())
                {
                    mSwipeTouchDelegate.onDismissGesture();
                    flag = flag1;
                } else
                {
                    flag = true;
                    setResult(-1, getResultIntent());
                    finish();
                }
            }
        }
        mVelocityTracker.recycle();
        mVelocityTracker = null;
        mActivePointerId = -1;
        return flag;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag;
        i = motionevent.getAction();
        flag = false;
        i & 0xff;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 83
    //                   1 101
    //                   2 92
    //                   3 101;
           goto _L1 _L2 _L3 _L4 _L3
_L3:
        break MISSING_BLOCK_LABEL_101;
_L1:
        Log.e("WearableSamples:WatchActivity", (new StringBuilder()).append("Unknown action type: ").append(i).toString());
_L5:
        return flag || super.dispatchTouchEvent(motionevent);
_L2:
        flag = handlePointerDown(motionevent);
          goto _L5
_L4:
        flag = handlePointerMove(motionevent);
          goto _L5
        flag = handlePointerUp(motionevent);
          goto _L5
    }

    public Intent getResultIntent()
    {
        return null;
    }

    public Intent getResultIntent(int i)
    {
        return getResultIntent(i, null);
    }

    public Intent getResultIntent(int i, String s)
    {
        Intent intent = new Intent();
        intent.putExtra("exit_notif_package", getPackageName());
        intent.putExtra("exit_notif_id", i);
        intent.putExtra("exit_notif_tag", s);
        return intent;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = ViewConfiguration.get(this);
        mMinFlingVelocity = bundle.getScaledMinimumFlingVelocity() * 16;
        mMaxFlingVelocity = bundle.getScaledMaximumFlingVelocity();
    }

    public void setSwipeTouchDelegate(SwipeTouchDelegate swipetouchdelegate)
    {
        mSwipeTouchDelegate = swipetouchdelegate;
    }
}
