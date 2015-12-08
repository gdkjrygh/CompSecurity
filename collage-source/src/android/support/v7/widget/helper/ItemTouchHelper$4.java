// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//            ItemTouchHelper

class val.swipeDir
    implements Runnable
{

    final ItemTouchHelper this$0;
    final coverAnimation val$anim;
    final int val$swipeDir;

    public void run()
    {
label0:
        {
            if (ItemTouchHelper.access$300(ItemTouchHelper.this) != null && ItemTouchHelper.access$300(ItemTouchHelper.this).isAttachedToWindow() && !val$anim.mOverridden && val$anim.mViewHolder.getAdapterPosition() != -1)
            {
                android.support.v7.widget.nimator nimator = ItemTouchHelper.access$300(ItemTouchHelper.this).getItemAnimator();
                if (nimator != null && nimator.isRunning(null) || ItemTouchHelper.access$1800(ItemTouchHelper.this))
                {
                    break label0;
                }
                mCallback.onSwiped(val$anim.mViewHolder, val$swipeDir);
            }
            return;
        }
        ItemTouchHelper.access$300(ItemTouchHelper.this).post(this);
    }

    coverAnimation()
    {
        this$0 = final_itemtouchhelper;
        val$anim = coveranimation;
        val$swipeDir = I.this;
        super();
    }
}
