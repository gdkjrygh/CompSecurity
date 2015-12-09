// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView

class a
    implements android.view.ener
{

    final ActionBarView a;

    public void onClick(View view)
    {
        a.h.onMenuItemSelected(0, ActionBarView.c(a));
    }

    (ActionBarView actionbarview)
    {
        a = actionbarview;
        super();
    }
}
