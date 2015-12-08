// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.c.c;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class addView extends FrameLayout
    implements c
{

    final CollapsibleActionView a;

    public final void a()
    {
        a.onActionViewExpanded();
    }

    public final void b()
    {
        a.onActionViewCollapsed();
    }

    View getWrappedView()
    {
        return (View)a;
    }

    (View view)
    {
        super(view.getContext());
        a = (CollapsibleActionView)view;
        addView(view);
    }
}
