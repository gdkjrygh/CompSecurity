// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.translate.copydrop.views.CopyView;
import com.google.android.libraries.translate.e.h;

// Referenced classes of package com.google.android.apps.translate.copydrop:
//            TranslateCopyDropService

final class a
    implements android.view.View.OnTouchListener
{

    final TranslateCopyDropService a;
    private int b;
    private int c;
    private float d;
    private float e;

    a(TranslateCopyDropService translatecopydropservice)
    {
        a = translatecopydropservice;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1 = true;
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 36
    //                   1 92
    //                   2 166;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        b = TranslateCopyDropService.a(a).x;
        c = TranslateCopyDropService.a(a).y;
        d = motionevent.getRawX();
        e = motionevent.getRawY();
        TranslateCopyDropService.b(a).a();
        return true;
_L3:
        flag = flag1;
        if (Math.abs(b - TranslateCopyDropService.a(a).x) >= 10) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (Math.abs(c - TranslateCopyDropService.a(a).y) >= 10) goto _L6; else goto _L7
_L7:
        view = TranslateCopyDropService.b(a);
        h.a(252);
        view.setVisibility(8);
        return true;
_L4:
        TranslateCopyDropService.a(a).x = b + (int)(motionevent.getRawX() - d);
        TranslateCopyDropService.a(a).y = c - (int)(motionevent.getRawY() - e);
        TranslateCopyDropService.c(a).updateViewLayout(TranslateCopyDropService.b(a), TranslateCopyDropService.a(a));
        return true;
    }
}
