// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.view.MotionEvent;
import android.view.View;
import com.skype.android.media.effects.DoodleRenderer;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

final class this._cls0
    implements android.view.reFragment._cls2
{

    final VideoCaptureFragment this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 100
    //                   2 69;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        if (VideoCaptureFragment.access$600(VideoCaptureFragment.this) != null)
        {
            VideoCaptureFragment.access$600(VideoCaptureFragment.this).a((float)Math.random(), (float)Math.random(), (float)Math.random());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (VideoCaptureFragment.access$600(VideoCaptureFragment.this) != null)
        {
            VideoCaptureFragment.access$600(VideoCaptureFragment.this).b(motionevent.getX(), motionevent.getY());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (VideoCaptureFragment.access$600(VideoCaptureFragment.this) != null)
        {
            VideoCaptureFragment.access$600(VideoCaptureFragment.this).d();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    ()
    {
        this$0 = VideoCaptureFragment.this;
        super();
    }
}
