// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.graphics.PointF;
import com.skype.android.util.PropertyAnimationUtil;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

final class val.point
    implements Runnable
{

    final VideoCaptureFragment this$0;
    final PointF val$point;

    public final void run()
    {
        VideoCaptureFragment.access$1000(VideoCaptureFragment.this).setColor(-1);
        VideoCaptureFragment.access$1000(VideoCaptureFragment.this).setTouchPoint(val$point);
        PropertyAnimationUtil _tmp = VideoCaptureFragment.access$1100(VideoCaptureFragment.this);
        PropertyAnimationUtil.c(VideoCaptureFragment.access$1000(VideoCaptureFragment.this));
        VideoCaptureFragment.access$1000(VideoCaptureFragment.this).invalidate();
    }

    ()
    {
        this$0 = final_videocapturefragment;
        val$point = PointF.this;
        super();
    }
}
