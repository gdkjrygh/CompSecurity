// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionBarOverlayLayout

class rAdapter extends ViewPropertyAnimatorListenerAdapter
{

    final ActionBarOverlayLayout this$0;

    public void onAnimationCancel(View view)
    {
        ActionBarOverlayLayout.access$002(ActionBarOverlayLayout.this, null);
        ActionBarOverlayLayout.access$102(ActionBarOverlayLayout.this, false);
    }

    public void onAnimationEnd(View view)
    {
        ActionBarOverlayLayout.access$002(ActionBarOverlayLayout.this, null);
        ActionBarOverlayLayout.access$102(ActionBarOverlayLayout.this, false);
    }

    rAdapter()
    {
        this$0 = ActionBarOverlayLayout.this;
        super();
    }
}
