// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerControlBar

class val.target extends DebouncingOnClickListener
{

    final k this$0;
    final PlayerControlBar val$target;

    public void doClick(View view)
    {
        val$target.onSkipPrevClick();
    }

    ()
    {
        this$0 = final_;
        val$target = PlayerControlBar.this;
        super();
    }
}
