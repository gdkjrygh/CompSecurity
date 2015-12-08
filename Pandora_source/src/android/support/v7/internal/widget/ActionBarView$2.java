// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.h;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView

class a
    implements android.view.ener
{

    final ActionBarView a;

    public void onClick(View view)
    {
        view = ActionBarView.b(a).b;
        if (view != null)
        {
            view.collapseActionView();
        }
    }

    (ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }
}
