// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DWebView

class val.view
    implements android.view.ent._cls2
{

    final val.view this$1;
    final View val$view;

    public boolean onTouch(View view1, MotionEvent motionevent)
    {
        this;
        JVM INSTR monitorenter ;
        if (motionevent.getY() >= 250F || ideoLayout == null) goto _L2; else goto _L1
_L1:
        oseVideo();
_L4:
        this;
        JVM INSTR monitorexit ;
        return true;
_L2:
        val$view.onTouchEvent(motionevent);
        if (true) goto _L4; else goto _L3
_L3:
        view1;
        throw view1;
    }

    ()
    {
        this$1 = final_;
        val$view = View.this;
        super();
    }
}
