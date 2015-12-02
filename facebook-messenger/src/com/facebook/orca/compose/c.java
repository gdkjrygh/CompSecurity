// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.orca.d.af;

// Referenced classes of package com.facebook.orca.compose:
//            AudioComposerView

class c
    implements android.view.View.OnTouchListener
{

    final AudioComposerView a;

    c(AudioComposerView audiocomposerview)
    {
        a = audiocomposerview;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1 = true;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 40
    //                   1 88
    //                   2 78
    //                   3 98;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        boolean flag = false;
_L7:
        return flag;
_L2:
        flag = flag1;
        if (AudioComposerView.f(a)) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (AudioComposerView.d(a).d()) goto _L7; else goto _L8
_L8:
        AudioComposerView.g(a);
        return true;
_L4:
        AudioComposerView.a(a, motionevent);
        return true;
_L3:
        AudioComposerView.b(a, motionevent);
        return true;
_L5:
        AudioComposerView.h(a);
        return true;
    }
}
