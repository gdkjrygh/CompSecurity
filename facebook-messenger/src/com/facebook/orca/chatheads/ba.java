// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.google.common.d.a.s;
import com.google.common.d.a.w;

// Referenced classes of package com.facebook.orca.chatheads:
//            bw, al, cf, ChatHeadCloseTargetView, 
//            ag, bb

class ba extends bw
{

    final ag a;
    final al b;

    ba(al al1, ag ag1)
    {
        b = al1;
        a = ag1;
        super(al1, null);
    }

    public void a()
    {
        if (!al.F(b).e().c())
        {
            a.performHapticFeedback(0);
        }
        al.b(b, a);
        if (al.F(b) != null)
        {
            al.F(b).e().b().a(new bb(this), w.a());
        }
    }
}
