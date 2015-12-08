// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.MiniPlayerViews._cls7
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, "stop pressed");
        setControlsEnabled(false);
        MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).onStopClicked();
    }

    xMiniPlayerViewCallbacks()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
