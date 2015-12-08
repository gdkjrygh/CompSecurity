// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.view.MotionEvent;
import com.skype.android.animation.SkypeMultiPropertyAnimatorSet;

// Referenced classes of package com.skype.android.app.location:
//            SendLocationActivity, SendLocationAnimator

final class this._cls0
    implements MapTouchListener
{

    final SendLocationActivity this$0;

    public final void onMapTouch(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 1: default 28
    //                   0 29
    //                   1 81;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (!SendLocationActivity.access$200(SendLocationActivity.this))
        {
            SendLocationActivity.access$202(SendLocationActivity.this, true);
            SendLocationActivity.access$300(SendLocationActivity.this).getPinUpAnimator().a(630L);
            SendLocationActivity.access$300(SendLocationActivity.this).getShadowUpAnimator().a(630L);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (SendLocationActivity.access$200(SendLocationActivity.this))
        {
            SendLocationActivity.access$202(SendLocationActivity.this, false);
            SendLocationActivity.access$300(SendLocationActivity.this).getPinDownAnimator().a(630L);
            SendLocationActivity.access$300(SendLocationActivity.this).getShadowDownAnimator().a(300L);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    Set()
    {
        this$0 = SendLocationActivity.this;
        super();
    }
}
