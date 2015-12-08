// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.view.MotionEvent;
import android.view.View;
import com.mopub.mobileads.ViewGestureDetector;

// Referenced classes of package com.mopub.mraid:
//            MraidBridge

final class d
    implements android.view.View.OnTouchListener
{

    final ViewGestureDetector a;
    final MraidBridge b;

    d(MraidBridge mraidbridge, ViewGestureDetector viewgesturedetector)
    {
        b = mraidbridge;
        a = viewgesturedetector;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.sendTouchEvent(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 36
    //                   0 38
    //                   1 38;
           goto _L1 _L2 _L2
_L1:
        return false;
_L2:
        if (!view.hasFocus())
        {
            view.requestFocus();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
