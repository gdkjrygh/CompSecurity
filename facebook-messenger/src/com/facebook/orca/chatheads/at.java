// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.google.common.d.a.ab;
import com.google.common.d.a.h;
import com.google.common.d.a.s;
import com.google.common.d.a.w;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, au

class at
    implements h
{

    final ab a;
    final al b;

    at(al al1, ab ab1)
    {
        b = al1;
        a = ab1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((Void)obj);
    }

    public void a(Throwable throwable)
    {
        if (!(throwable instanceof CancellationException))
        {
            al.v(b).a(al.a.getSimpleName(), "popupNewChatHead failed", throwable);
        }
        a.a_(null);
    }

    public void a(Void void1)
    {
        if (al.a(b))
        {
            a.a_(null);
            return;
        } else
        {
            al.u(b).a(new au(this), w.a());
            return;
        }
    }
}
