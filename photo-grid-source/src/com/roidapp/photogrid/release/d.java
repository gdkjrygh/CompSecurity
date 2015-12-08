// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;
import com.roidapp.baselib.view.FixedDrawerLayout;

// Referenced classes of package com.roidapp.photogrid.release:
//            c

final class d
    implements android.view.View.OnTouchListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        c.a(a);
        c.c(a).e(c.b(a));
        if (true) goto _L1; else goto _L3
_L3:
    }
}
