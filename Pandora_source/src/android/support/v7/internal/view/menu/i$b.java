// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p.h.b;

// Referenced classes of package android.support.v7.internal.view.menu:
//            i

static class addView extends FrameLayout
    implements CollapsibleActionView
{

    final b a;

    View a()
    {
        return (View)a;
    }

    public void onActionViewCollapsed()
    {
        a.b();
    }

    public void onActionViewExpanded()
    {
        a.a();
    }

    (View view)
    {
        super(view.getContext());
        a = (b)view;
        addView(view);
    }
}
