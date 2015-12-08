// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            hk

final class hm
    implements android.view.View.OnTouchListener
{

    boolean a;
    final hk b;

    hm(hk hk)
    {
        b = hk;
        super();
        a = false;
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 48
    //                   2 41;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        a = false;
        return false;
_L4:
        a = true;
        return false;
_L3:
        if (a)
        {
            a = false;
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
