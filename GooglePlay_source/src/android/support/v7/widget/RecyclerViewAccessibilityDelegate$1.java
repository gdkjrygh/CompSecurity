// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            RecyclerViewAccessibilityDelegate, RecyclerView

final class this._cls0 extends AccessibilityDelegateCompat
{

    final RecyclerViewAccessibilityDelegate this$0;

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
        if (!shouldIgnore() && mRecyclerView.mLayout != null)
        {
            mRecyclerView.mLayout.izeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
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
                    bundle = ((ecyclerView) (view)).View.mRecycler;
                    view = ((View) (view)).View.mState;
                    return false;
                }
            }
        }
        return flag;
    }

    pat()
    {
        this$0 = RecyclerViewAccessibilityDelegate.this;
        super();
    }
}
