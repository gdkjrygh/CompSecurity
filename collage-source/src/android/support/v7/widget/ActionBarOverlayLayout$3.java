// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;

// Referenced classes of package android.support.v7.widget:
//            ActionBarOverlayLayout, ActionBarContainer

class this._cls0
    implements Runnable
{

    final ActionBarOverlayLayout this$0;

    public void run()
    {
        ActionBarOverlayLayout.access$200(ActionBarOverlayLayout.this);
        ActionBarOverlayLayout.access$002(ActionBarOverlayLayout.this, ViewCompat.animate(ActionBarOverlayLayout.access$400(ActionBarOverlayLayout.this)).translationY(-ActionBarOverlayLayout.access$400(ActionBarOverlayLayout.this).getHeight()).setListener(ActionBarOverlayLayout.access$300(ActionBarOverlayLayout.this)));
    }

    ()
    {
        this$0 = ActionBarOverlayLayout.this;
        super();
    }
}
