// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, AdapterHelper

public final class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat
{

    final AccessibilityDelegateCompat mItemDelegate = new AccessibilityDelegateCompat() {

        final RecyclerViewAccessibilityDelegate this$0;

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            if (!shouldIgnore() && mRecyclerView.mLayout != null)
            {
                mRecyclerView.mLayout.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
        {
            boolean flag1 = false;
            boolean flag;
            if (super.performAccessibilityAction(view, i, bundle))
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (!shouldIgnore())
                {
                    flag = flag1;
                    if (mRecyclerView.mLayout != null)
                    {
                        view = mRecyclerView.mLayout;
                        bundle = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mRecycler;
                        view = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mState;
                        return false;
                    }
                }
            }
            return flag;
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

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/widget/RecyclerView.getName());
        if ((view instanceof RecyclerView) && !shouldIgnore())
        {
            view = (RecyclerView)view;
            if (((RecyclerView) (view)).mLayout != null)
            {
                ((RecyclerView) (view)).mLayout.onInitializeAccessibilityEvent(accessibilityevent);
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        accessibilitynodeinfocompat.setClassName(android/support/v7/widget/RecyclerView.getName());
        if (!shouldIgnore() && mRecyclerView.mLayout != null)
        {
            view = mRecyclerView.mLayout;
            RecyclerView.Recycler recycler = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mRecycler;
            RecyclerView.State state = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mState;
            if (ViewCompat.canScrollVertically(((RecyclerView.LayoutManager) (view)).mRecyclerView, -1) || ViewCompat.canScrollHorizontally(((RecyclerView.LayoutManager) (view)).mRecyclerView, -1))
            {
                accessibilitynodeinfocompat.addAction(8192);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            if (ViewCompat.canScrollVertically(((RecyclerView.LayoutManager) (view)).mRecyclerView, 1) || ViewCompat.canScrollHorizontally(((RecyclerView.LayoutManager) (view)).mRecyclerView, 1))
            {
                accessibilitynodeinfocompat.addAction(4096);
                accessibilitynodeinfocompat.setScrollable(true);
            }
            int i = view.getRowCountForAccessibility(recycler, state);
            int j = view.getColumnCountForAccessibility(recycler, state);
            view = new android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat(AccessibilityNodeInfoCompat.access$000().obtainCollectionInfo(i, j, false, 0));
            AccessibilityNodeInfoCompat.IMPL.setCollectionInfo(accessibilitynodeinfocompat.mInfo, ((android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat)view).mInfo);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        boolean flag1 = false;
        if (!super.performAccessibilityAction(view, i, bundle)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (shouldIgnore()) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (mRecyclerView.mLayout == null) goto _L4; else goto _L5
_L5:
        view = mRecyclerView.mLayout;
        bundle = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mRecycler;
        bundle = ((RecyclerView.LayoutManager) (view)).mRecyclerView.mState;
        flag = flag1;
        if (((RecyclerView.LayoutManager) (view)).mRecyclerView == null) goto _L4; else goto _L6
_L6:
        i;
        JVM INSTR lookupswitch 2: default 108
    //                   4096: 205
    //                   8192: 138;
           goto _L7 _L8 _L9
_L7:
        int j;
        i = 0;
        j = 0;
_L13:
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i == 0) goto _L4; else goto _L10
_L10:
        ((RecyclerView.LayoutManager) (view)).mRecyclerView.scrollBy(i, j);
        return true;
_L9:
        int k;
        int l;
        int i1;
        if (ViewCompat.canScrollVertically(((RecyclerView.LayoutManager) (view)).mRecyclerView, -1))
        {
            i = -(view.getHeight() - view.getPaddingTop() - view.getPaddingBottom());
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((RecyclerView.LayoutManager) (view)).mRecyclerView, -1)) goto _L12; else goto _L11
_L11:
        k = -(view.getWidth() - view.getPaddingLeft() - view.getPaddingRight());
        j = i;
        i = k;
          goto _L13
_L8:
        if (ViewCompat.canScrollVertically(((RecyclerView.LayoutManager) (view)).mRecyclerView, 1))
        {
            i = view.getHeight() - view.getPaddingTop() - view.getPaddingBottom();
        } else
        {
            i = 0;
        }
        j = i;
        if (!ViewCompat.canScrollHorizontally(((RecyclerView.LayoutManager) (view)).mRecyclerView, 1)) goto _L12; else goto _L14
_L14:
        k = view.getWidth();
        l = view.getPaddingLeft();
        i1 = view.getPaddingRight();
        j = i;
        i = k - l - i1;
          goto _L13
_L12:
        i = 0;
          goto _L13
    }

    final boolean shouldIgnore()
    {
        RecyclerView recyclerview = mRecyclerView;
        return !recyclerview.mFirstLayoutComplete || recyclerview.mDataSetHasChangedAfterLayout || recyclerview.mAdapterHelper.hasPendingUpdates();
    }
}
