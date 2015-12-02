// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.i.a.a.f;
import com.facebook.messages.ipc.peer.d;

// Referenced classes of package com.facebook.orca.chatheads:
//            m, al

class bm
    implements m
{

    final al a;

    bm(al al1)
    {
        a = al1;
        super();
    }

    public void a()
    {
        al.p(a).a(d.i, Boolean.TRUE);
    }

    public void b()
    {
        al.p(a).a(d.i, Boolean.FALSE);
    }
}
