// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            cv, cs

final class cu
    implements android.view.View.OnTouchListener
{

    Handler a;
    final cs b;
    private int c;
    private int d;

    cu(cs cs)
    {
        b = cs;
        super();
        c = 0;
        d = 0xff67a8ef;
        a = new cv(this);
    }

    static int a(cu cu1)
    {
        return cu1.d;
    }

    static int a(cu cu1, int i)
    {
        cu1.c = i;
        return i;
    }

    static int b(cu cu1)
    {
        return cu1.c;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        a.sendMessageDelayed(a.obtainMessage(d, view), 5L);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
