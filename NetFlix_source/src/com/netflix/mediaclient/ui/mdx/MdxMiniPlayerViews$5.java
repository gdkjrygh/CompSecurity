// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.MiniPlayerViews._cls5
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        Log.v("MdxMiniPlayerViews", "resume pressed");
        setControlsEnabled(false);
        MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).onResumeClicked();
    }

    xMiniPlayerViewCallbacks()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
