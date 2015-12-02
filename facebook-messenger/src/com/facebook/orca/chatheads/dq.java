// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.MotionEvent;
import com.facebook.orca.compose.ComposeFragment;
import com.facebook.orca.compose.av;
import com.facebook.orca.threadview.ThreadViewMessageFragment;

// Referenced classes of package com.facebook.orca.chatheads:
//            em, dh, ek

class dq
    implements em
{

    final dh a;

    dq(dh dh1)
    {
        a = dh1;
        super();
    }

    public void a(ek ek)
    {
        if (dh.g(a))
        {
            dh.f(a).T();
        }
        dh.h(a).b();
    }

    public boolean a(MotionEvent motionevent)
    {
        if (dh.f(a).Q().W())
        {
            return false;
        }
        if (motionevent.getAction() == 0 && dh.f(a).Q().a(motionevent))
        {
            return dh.f(a).Q().X();
        } else
        {
            return true;
        }
    }

    public void b(ek ek)
    {
        dh.h(a).a(dh.f(a).Q().d());
    }

    public void c(ek ek)
    {
        dh.a(a, "swipe_up_thread_view");
    }
}
