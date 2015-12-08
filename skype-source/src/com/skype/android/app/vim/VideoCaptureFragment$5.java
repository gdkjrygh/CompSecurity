// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import com.skype.android.util.PropertyAnimationUtil;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

final class val.success
    implements Runnable
{

    final VideoCaptureFragment this$0;
    final boolean val$success;

    public final void run()
    {
        val.success success1 = VideoCaptureFragment.access$1000(VideoCaptureFragment.this);
        int i;
        if (val$success)
        {
            i = 0xff00ff00;
        } else
        {
            i = 0xffff0000;
        }
        success1.setColor(i);
        VideoCaptureFragment.access$1000(VideoCaptureFragment.this).invalidate();
        VideoCaptureFragment.access$1100(VideoCaptureFragment.this).d(VideoCaptureFragment.access$1000(VideoCaptureFragment.this));
    }

    ()
    {
        this$0 = final_videocapturefragment;
        val$success = Z.this;
        super();
    }
}
