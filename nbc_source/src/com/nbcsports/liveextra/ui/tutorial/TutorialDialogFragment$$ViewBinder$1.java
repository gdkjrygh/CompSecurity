// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.tutorial;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.nbcsports.liveextra.ui.tutorial:
//            TutorialDialogFragment

class val.target extends DebouncingOnClickListener
{

    final val.target this$0;
    final TutorialDialogFragment val$target;

    public void doClick(View view)
    {
        val$target.onClose();
    }

    ()
    {
        this$0 = final_;
        val$target = TutorialDialogFragment.this;
        super();
    }
}
