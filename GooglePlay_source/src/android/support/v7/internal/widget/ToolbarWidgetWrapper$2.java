// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ToolbarWidgetWrapper

final class mCanceled extends ViewPropertyAnimatorListenerAdapter
{

    private boolean mCanceled;
    final ToolbarWidgetWrapper this$0;

    public final void onAnimationCancel(View view)
    {
        mCanceled = true;
    }

    public final void onAnimationEnd(View view)
    {
        if (!mCanceled)
        {
            mToolbar.setVisibility(8);
        }
    }

    r()
    {
        this$0 = ToolbarWidgetWrapper.this;
        super();
        mCanceled = false;
    }
}
