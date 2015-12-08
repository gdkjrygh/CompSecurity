// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

private class mChildView
    implements Runnable
{

    final View mChildView;
    final SlidingPaneLayout this$0;

    public void run()
    {
        if (mChildView.getParent() == SlidingPaneLayout.this)
        {
            ViewCompat.setLayerType(mChildView, 0, null);
            SlidingPaneLayout.access$900(SlidingPaneLayout.this, mChildView);
        }
        SlidingPaneLayout.access$1000(SlidingPaneLayout.this).remove(this);
    }

    (View view)
    {
        this$0 = SlidingPaneLayout.this;
        super();
        mChildView = view;
    }
}
