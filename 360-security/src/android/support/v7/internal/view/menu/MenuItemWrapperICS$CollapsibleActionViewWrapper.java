// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.b.b;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

static class addView extends FrameLayout
    implements CollapsibleActionView
{

    final b mWrappedView;

    View getWrappedView()
    {
        return (View)mWrappedView;
    }

    public void onActionViewCollapsed()
    {
        mWrappedView.b();
    }

    public void onActionViewExpanded()
    {
        mWrappedView.a();
    }

    (View view)
    {
        super(view.getContext());
        mWrappedView = (b)view;
        addView(view);
    }
}
