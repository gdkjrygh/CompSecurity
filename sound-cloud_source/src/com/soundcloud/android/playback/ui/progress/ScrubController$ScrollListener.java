// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.os.Handler;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.playback.ui.progress:
//            ScrubController, ProgressHelper

private class <init>
    implements com.soundcloud.android.view.OnScrollListener
{

    final ScrubController this$0;

    public void onScroll(int i, int j)
    {
        if (ScrubController.access$200(ScrubController.this) && ScrubController.access$300(ScrubController.this) != null)
        {
            float f = Math.max(0.0F, Math.min(1.0F, ScrubController.access$300(ScrubController.this).getProgressFromPosition(i)));
            ScrubController.access$400(ScrubController.this).removeMessages(0);
            ScrubController.access$400(ScrubController.this).sendMessageDelayed(ScrubController.access$400(ScrubController.this).obtainMessage(0, Float.valueOf(f)), 250L);
            for (Iterator iterator = ScrubController.access$500(ScrubController.this).iterator(); iterator.hasNext(); (()iterator.next()).displayScrubPosition(f)) { }
        }
    }

    private ()
    {
        this$0 = ScrubController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
