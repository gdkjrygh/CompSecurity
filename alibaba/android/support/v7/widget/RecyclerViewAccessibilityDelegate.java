// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import cm;
import es;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class RecyclerViewAccessibilityDelegate extends cm
{

    final cm mItemDelegate = new cm() {

        final RecyclerViewAccessibilityDelegate this$0;

        public void onInitializeAccessibilityNodeInfo(View view, es es1)
        {
            super.onInitializeAccessibilityNodeInfo(view, es1);
            if (mRecyclerView.getLayoutManager() != null)
            {
                mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, es1);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            if (super.performAccessibilityAction(view, i, bundle))
            {
                return true;
            }
            if (mRecyclerView.getLayoutManager() != null)
            {
                return mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
            } else
            {
                return false;
            }
        }

            
            {
                this$0 = RecyclerViewAccessibilityDelegate.this;
                super();
            }
    };
    final RecyclerView mRecyclerView;

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerview)
    {
        mRecyclerView = recyclerview;
    }

    cm getItemDelegate()
    {
        return mItemDelegate;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if (view instanceof RecyclerView)
        {
            view = (RecyclerView)view;
            if (view.getLayoutManager() != null)
            {
                view.getLayoutManager().onInitializeAccessibilityEvent(accessibilityevent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, es es1)
    {
        super.onInitializeAccessibilityNodeInfo(view, es1);
        es1.b(android/support/v7/widget/RecyclerView.getName());
        if (mRecyclerView.getLayoutManager() != null)
        {
            mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(es1);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        if (super.performAccessibilityAction(view, i, bundle))
        {
            return true;
        }
        if (mRecyclerView.getLayoutManager() != null)
        {
            return mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
        } else
        {
            return false;
        }
    }
}
