// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment, FilterRosterView

final class this._cls0
    implements android.view.reFragment._cls3
{

    final VideoCaptureFragment this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && VideoCaptureFragment.access$700(VideoCaptureFragment.this).isShown())
        {
            VideoCaptureFragment.access$800(VideoCaptureFragment.this);
            return true;
        }
        if (VideoCaptureFragment.access$600(VideoCaptureFragment.this) != null)
        {
            VideoCaptureFragment.access$900(VideoCaptureFragment.this).Touch(view, motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = VideoCaptureFragment.this;
        super();
    }
}
