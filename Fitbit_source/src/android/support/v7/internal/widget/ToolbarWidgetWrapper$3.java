// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ToolbarWidgetWrapper

class r extends ViewPropertyAnimatorListenerAdapter
{

    final ToolbarWidgetWrapper this$0;

    public void onAnimationStart(View view)
    {
        ToolbarWidgetWrapper.access$000(ToolbarWidgetWrapper.this).setVisibility(0);
    }

    r()
    {
        this$0 = ToolbarWidgetWrapper.this;
        super();
    }
}
