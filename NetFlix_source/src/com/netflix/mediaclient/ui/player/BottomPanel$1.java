// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            BottomPanel, PlayerActivity

class this._cls0
    implements android.view.stener
{

    final BottomPanel this$0;

    public void onClick(View view)
    {
        view = context;
        if (view != null)
        {
            view.extendTimeoutTimer();
        }
        displayMdxTargets();
    }

    ()
    {
        this$0 = BottomPanel.this;
        super();
    }
}
