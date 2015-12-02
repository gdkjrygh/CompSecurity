// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;

import android.view.MotionEvent;

// Referenced classes of package com.facebook.reflex:
//            q, m, j

class p
    implements q
{

    final j a;
    final m b;

    p(m m1, j j)
    {
        b = m1;
        a = j;
        super();
    }

    public void a(MotionEvent motionevent)
    {
        m.a(b, motionevent);
    }
}
