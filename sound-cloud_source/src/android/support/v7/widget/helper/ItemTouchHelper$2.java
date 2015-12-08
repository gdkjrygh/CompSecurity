// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.List;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

class this._cls0
    implements android.support.v7.widget.mTouchListener
{

    final ItemTouchHelper this$0;

    public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        ItemTouchHelper.access$400(ItemTouchHelper.this).onTouchEvent(motionevent);
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 0)
        {
            mActivePointerId = MotionEventCompat.getPointerId(motionevent, 0);
            mInitialTouchX = motionevent.getX();
            mInitialTouchY = motionevent.getY();
            ItemTouchHelper.access$500(ItemTouchHelper.this);
            if (mSelected == null)
            {
                recyclerview = ItemTouchHelper.access$600(ItemTouchHelper.this, motionevent);
                if (recyclerview != null)
                {
                    ItemTouchHelper itemtouchhelper = ItemTouchHelper.this;
                    itemtouchhelper.mInitialTouchX = itemtouchhelper.mInitialTouchX - ((coverAnimation) (recyclerview)).mX;
                    itemtouchhelper = ItemTouchHelper.this;
                    itemtouchhelper.mInitialTouchY = itemtouchhelper.mInitialTouchY - ((coverAnimation) (recyclerview)).mY;
                    ItemTouchHelper.access$700(ItemTouchHelper.this, ((coverAnimation) (recyclerview)).mViewHolder, true);
                    if (mPendingCleanup.remove(((coverAnimation) (recyclerview)).mViewHolder.itemView))
                    {
                        mCallback.clearView(ItemTouchHelper.access$300(ItemTouchHelper.this), ((coverAnimation) (recyclerview)).mViewHolder);
                    }
                    ItemTouchHelper.access$800(ItemTouchHelper.this, ((coverAnimation) (recyclerview)).mViewHolder, ((coverAnimation) (recyclerview)).mActionState);
                    ItemTouchHelper.access$900(ItemTouchHelper.this, motionevent, mSelectedFlags, 0);
                }
            }
        } else
        if (i == 3 || i == 1)
        {
            mActivePointerId = -1;
            ItemTouchHelper.access$800(ItemTouchHelper.this, null, 0);
        } else
        if (mActivePointerId != -1)
        {
            int j = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
            if (j >= 0)
            {
                ItemTouchHelper.access$1000(ItemTouchHelper.this, i, motionevent, j);
            }
        }
        if (ItemTouchHelper.access$1100(ItemTouchHelper.this) != null)
        {
            ItemTouchHelper.access$1100(ItemTouchHelper.this).addMovement(motionevent);
        }
        return mSelected != null;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            ItemTouchHelper.access$800(ItemTouchHelper.this, null, 0);
            return;
        }
    }

    public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        int i;
        i = 0;
        ItemTouchHelper.access$400(ItemTouchHelper.this).onTouchEvent(motionevent);
        if (ItemTouchHelper.access$1100(ItemTouchHelper.this) != null)
        {
            ItemTouchHelper.access$1100(ItemTouchHelper.this).addMovement(motionevent);
        }
        if (mActivePointerId != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int k;
        j = MotionEventCompat.getActionMasked(motionevent);
        k = MotionEventCompat.findPointerIndex(motionevent, mActivePointerId);
        if (k >= 0)
        {
            ItemTouchHelper.access$1000(ItemTouchHelper.this, j, motionevent, k);
        }
        recyclerview = mSelected;
        if (recyclerview == null) goto _L1; else goto _L3
_L3:
        switch (j)
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
        case 3: // '\003'
            if (ItemTouchHelper.access$1100(ItemTouchHelper.this) != null)
            {
                ItemTouchHelper.access$1100(ItemTouchHelper.this).computeCurrentVelocity(1000, ItemTouchHelper.access$300(ItemTouchHelper.this).getMaxFlingVelocity());
            }
            ItemTouchHelper.access$800(ItemTouchHelper.this, null, 0);
            mActivePointerId = -1;
            return;

        case 2: // '\002'
            if (k >= 0)
            {
                ItemTouchHelper.access$900(ItemTouchHelper.this, motionevent, mSelectedFlags, k);
                ItemTouchHelper.access$100(ItemTouchHelper.this, recyclerview);
                ItemTouchHelper.access$300(ItemTouchHelper.this).removeCallbacks(ItemTouchHelper.access$200(ItemTouchHelper.this));
                ItemTouchHelper.access$200(ItemTouchHelper.this).run();
                ItemTouchHelper.access$300(ItemTouchHelper.this).invalidate();
                return;
            }
            break;

        case 6: // '\006'
            j = MotionEventCompat.getActionIndex(motionevent);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (MotionEventCompat.getPointerId(motionevent, j) != mActivePointerId) goto _L1; else goto _L5
_L5:
        if (ItemTouchHelper.access$1100(ItemTouchHelper.this) != null)
        {
            ItemTouchHelper.access$1100(ItemTouchHelper.this).computeCurrentVelocity(1000, ItemTouchHelper.access$300(ItemTouchHelper.this).getMaxFlingVelocity());
        }
        if (j == 0)
        {
            i = 1;
        }
        mActivePointerId = MotionEventCompat.getPointerId(motionevent, i);
        ItemTouchHelper.access$900(ItemTouchHelper.this, motionevent, mSelectedFlags, j);
        return;
    }

    llback()
    {
        this$0 = ItemTouchHelper.this;
        super();
    }
}
