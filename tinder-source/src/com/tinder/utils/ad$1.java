// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.tinder.utils:
//            ad

static final class >
    implements android.view.OnTouchListener
{

    final float a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 49
    //                   2 36
    //                   3 49;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        view.setAlpha(a);
        continue; /* Loop/switch isn't completed */
_L3:
        view.setAlpha(1.0F);
        if (true) goto _L1; else goto _L4
_L4:
    }

    nt(float f)
    {
        a = f;
        super();
    }
}
