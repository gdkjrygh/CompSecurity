// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.d.a;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

class n extends FrameLayout
    implements a
{

    final CollapsibleActionView a;

    n(View view)
    {
        super(view.getContext());
        a = (CollapsibleActionView)view;
        addView(view);
    }

    public void a()
    {
        a.onActionViewExpanded();
    }

    public void b()
    {
        a.onActionViewCollapsed();
    }

    View c()
    {
        return (View)a;
    }
}
