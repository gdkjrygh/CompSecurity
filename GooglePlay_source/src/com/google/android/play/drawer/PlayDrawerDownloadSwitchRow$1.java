// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.google.android.play.drawer:
//            PlayDrawerDownloadSwitchRow

final class this._cls0
    implements android.view.wnloadSwitchRow._cls1
{

    final PlayDrawerDownloadSwitchRow this$0;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 0)
        {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    ()
    {
        this$0 = PlayDrawerDownloadSwitchRow.this;
        super();
    }
}
