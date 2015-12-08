// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.c;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerViewAccessibilityDelegate, RecyclerView

class this._cls0 extends a
{

    final RecyclerViewAccessibilityDelegate this$0;

    public void onInitializeAccessibilityNodeInfo(View view, c c)
    {
        super.onInitializeAccessibilityNodeInfo(view, c);
        if (!RecyclerViewAccessibilityDelegate.access$000(RecyclerViewAccessibilityDelegate.this) && mRecyclerView.getLayoutManager() != null)
        {
            mRecyclerView.getLayoutManager().izeAccessibilityNodeInfoForItem(view, c);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle)
    {
        if (super.performAccessibilityAction(view, i, bundle))
        {
            return true;
        }
        if (!RecyclerViewAccessibilityDelegate.access$000(RecyclerViewAccessibilityDelegate.this) && mRecyclerView.getLayoutManager() != null)
        {
            return mRecyclerView.getLayoutManager().cessibilityActionForItem(view, i, bundle);
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = RecyclerViewAccessibilityDelegate.this;
        super();
    }
}
