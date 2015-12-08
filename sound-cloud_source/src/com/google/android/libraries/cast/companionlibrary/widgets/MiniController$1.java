// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.widget.ProgressBar;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.widgets:
//            MiniController

class val.progress
    implements Runnable
{

    final MiniController this$0;
    final int val$duration;
    final int val$progress;

    public void run()
    {
        MiniController.access$000(MiniController.this).setMax(val$duration);
        MiniController.access$000(MiniController.this).setProgress(val$progress);
    }

    Q()
    {
        this$0 = final_minicontroller;
        val$duration = i;
        val$progress = I.this;
        super();
    }
}
