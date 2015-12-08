// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AltCamOverlay

class val.target extends DebouncingOnClickListener
{

    final val.target this$0;
    final AltCamOverlay val$target;

    public void doClick(View view)
    {
        val$target.onShowCams();
    }

    ()
    {
        this$0 = final_;
        val$target = AltCamOverlay.this;
        super();
    }
}
