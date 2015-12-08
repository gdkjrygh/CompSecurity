// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.animation.AnimatorSet;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.tinder.utils:
//            a

static final class t>
    implements android.view..OnTouchListener
{

    final View a;
    final float b = 1.0F;
    final float c;
    final long d;
    final android.animation.ator.AnimatorListener e = null;
    final long f;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 67
    //                   2 36
    //                   3 67;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return false;
_L2:
        com.tinder.utils.a.a(a, b, c, d, e).start();
        continue; /* Loop/switch isn't completed */
_L3:
        com.tinder.utils.a.b(a, b, c, f, e).start();
        if (true) goto _L1; else goto _L4
_L4:
    }

    ent(View view, float f1, long l, long l1)
    {
        a = view;
        c = f1;
        d = l;
        f = l1;
        super();
    }
}
