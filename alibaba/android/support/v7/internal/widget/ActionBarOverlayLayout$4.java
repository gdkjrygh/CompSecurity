// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import ds;
import ei;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout, ActionBarContainer

class this._cls0
    implements Runnable
{

    final ActionBarOverlayLayout this$0;

    public void run()
    {
        ActionBarOverlayLayout.access$300(ActionBarOverlayLayout.this);
        ActionBarOverlayLayout.access$002(ActionBarOverlayLayout.this, ds.s(ActionBarOverlayLayout.access$500(ActionBarOverlayLayout.this)).c(-ActionBarOverlayLayout.access$500(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.access$400(ActionBarOverlayLayout.this)));
        if (ActionBarOverlayLayout.access$600(ActionBarOverlayLayout.this) != null && ActionBarOverlayLayout.access$600(ActionBarOverlayLayout.this).getVisibility() != 8)
        {
            ActionBarOverlayLayout.access$202(ActionBarOverlayLayout.this, ds.s(ActionBarOverlayLayout.access$600(ActionBarOverlayLayout.this)).c(ActionBarOverlayLayout.access$600(ActionBarOverlayLayout.this).getHeight()).a(ActionBarOverlayLayout.access$700(ActionBarOverlayLayout.this)));
        }
    }

    A()
    {
        this$0 = ActionBarOverlayLayout.this;
        super();
    }
}
