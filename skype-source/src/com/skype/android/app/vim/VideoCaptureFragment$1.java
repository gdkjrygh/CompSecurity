// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.os.SystemClock;
import com.skype.android.media.CamcorderView;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

final class this._cls0
    implements Runnable
{

    final VideoCaptureFragment this$0;

    public final void run()
    {
        if (VideoCaptureFragment.access$000(VideoCaptureFragment.this) != null)
        {
            long l = SystemClock.elapsedRealtime();
            long l1 = VideoCaptureFragment.access$100(VideoCaptureFragment.this);
            VideoCaptureFragment.access$102(VideoCaptureFragment.this, SystemClock.elapsedRealtime());
            VideoCaptureFragment.access$202(VideoCaptureFragment.this, VideoCaptureFragment.access$200(VideoCaptureFragment.this) + (l - l1));
            l = VideoCaptureFragment.access$300(VideoCaptureFragment.this) * 1000;
            l1 = VideoCaptureFragment.access$200(VideoCaptureFragment.this);
            if (VideoCaptureFragment.access$400(VideoCaptureFragment.this) == RECORDING)
            {
                VideoCaptureFragment.access$500(VideoCaptureFragment.this).postDelayed(this, 100L);
                VideoCaptureFragment.access$000(VideoCaptureFragment.this).onProgressUpdate(VideoCaptureFragment.access$200(VideoCaptureFragment.this), VideoCaptureFragment.access$300(VideoCaptureFragment.this));
            }
            if (l - l1 <= 0L)
            {
                moveToState(REVIEW);
                return;
            }
        }
    }

    llback()
    {
        this$0 = VideoCaptureFragment.this;
        super();
    }
}
