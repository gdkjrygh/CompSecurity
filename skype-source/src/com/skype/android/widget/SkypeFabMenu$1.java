// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;

// Referenced classes of package com.skype.android.widget:
//            SkypeFabMenu

final class a
    implements android.view.tener
{

    final SkypeFabMenu a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        view.animate().scaleX(1.15F).scaleY(1.15F).setInterpolator(new DecelerateInterpolator()).setDuration(100L).start();
        if (true) goto _L1; else goto _L3
_L3:
    }

    lator(SkypeFabMenu skypefabmenu)
    {
        a = skypefabmenu;
        super();
    }
}
