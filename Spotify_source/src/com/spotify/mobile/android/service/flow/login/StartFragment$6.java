// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.flow.login;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.spotify.mobile.android.service.flow.login:
//            StartFragment

final class a
    implements android.view.ener
{

    private StartFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 162
    //                   2 63
    //                   3 162;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        StartFragment.a(a, motionevent.getX());
        StartFragment.d(a).removeMessages(1);
        return true;
_L4:
        float f = motionevent.getX();
        if (StartFragment.f(a))
        {
            StartFragment.a(a, f);
            return true;
        }
        float f1 = StartFragment.g(a) - f;
        StartFragment.a(a, f);
        if (Math.abs(f1 / (float)StartFragment.h(a)) > 0.01F)
        {
            StartFragment.i(a);
            if (f1 > 0.0F)
            {
                StartFragment.j(a);
                return true;
            } else
            {
                StartFragment.k(a);
                return true;
            }
        }
          goto _L1
_L3:
        StartFragment.l(a);
        return true;
    }

    (StartFragment startfragment)
    {
        a = startfragment;
        super();
    }
}
