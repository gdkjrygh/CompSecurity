// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.c.c;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class q extends FrameLayout
    implements c
{

    final CollapsibleActionView a;

    q(View view)
    {
        super(view.getContext());
        a = (CollapsibleActionView)view;
        addView(view);
    }

    public final void a()
    {
        a.onActionViewExpanded();
    }

    public final void b()
    {
        a.onActionViewCollapsed();
    }
}
