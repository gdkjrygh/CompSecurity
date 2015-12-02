// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.inject.d;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.i.a;
import com.facebook.orca.sms.bj;
import com.facebook.orca.threads.g;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ag extends d
{

    final h a;

    private ag(h h)
    {
        a = h;
        super();
    }

    ag(h h, i i)
    {
        this(h);
    }

    public a a()
    {
        return new a((bj)a(com/facebook/orca/sms/bj), (com.facebook.orca.protocol.a)a(com/facebook/orca/protocol/a), (g)a(com/facebook/orca/threads/g), b(java/lang/Boolean, com/facebook/orca/annotations/IsClientSmsEnabled), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsReadPermitted));
    }

    public Object b()
    {
        return a();
    }
}
