// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ToolbarWidgetWrapper, Toolbar

class mCanceled extends ViewPropertyAnimatorListenerAdapter
{

    private boolean mCanceled;
    final ToolbarWidgetWrapper this$0;
    final int val$visibility;

    public void onAnimationCancel(View view)
    {
        mCanceled = true;
    }

    public void onAnimationEnd(View view)
    {
        if (!mCanceled)
        {
            ToolbarWidgetWrapper.access$000(ToolbarWidgetWrapper.this).setVisibility(val$visibility);
        }
    }

    public void onAnimationStart(View view)
    {
        ToolbarWidgetWrapper.access$000(ToolbarWidgetWrapper.this).setVisibility(0);
    }

    nerAdapter()
    {
        this$0 = final_toolbarwidgetwrapper;
        val$visibility = I.this;
        super();
        mCanceled = false;
    }
}
