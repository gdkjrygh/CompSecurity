// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.inject.d;
import com.facebook.orca.f.o;
import com.facebook.orca.protocol.methods.ad;
import com.facebook.orca.threads.q;

// Referenced classes of package com.facebook.orca.sms:
//            bi, y, u, br, 
//            bk, af, ah, ai

class av extends d
{

    final ah a;

    private av(ah ah)
    {
        a = ah;
        super();
    }

    av(ah ah, ai ai)
    {
        this(ah);
    }

    public bi a()
    {
        return new bi((ad)a(com/facebook/orca/protocol/methods/ad), (q)a(com/facebook/orca/threads/q), (y)a(com/facebook/orca/sms/y), (u)a(com/facebook/orca/sms/u), (br)a(com/facebook/orca/sms/br), (bk)a(com/facebook/orca/sms/bk), (af)a(com/facebook/orca/sms/af), (o)a(com/facebook/orca/f/o));
    }

    public Object b()
    {
        return a();
    }
}
