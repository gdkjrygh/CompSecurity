// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.inject.d;
import com.facebook.orca.k.a;
import com.facebook.orca.protocol.methods.bb;
import com.facebook.orca.push.a.b;
import com.facebook.orca.sms.bk;
import com.facebook.orca.sms.bn;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class ce extends d
{

    final h a;

    private ce(h h)
    {
        a = h;
        super();
    }

    ce(h h, i i)
    {
        this(h);
    }

    public b a()
    {
        return new b((a)a(com/facebook/orca/k/a), (bb)a(com/facebook/orca/protocol/methods/bb), (bn)a(com/facebook/orca/sms/bn), (bk)a(com/facebook/orca/sms/bk), (com.facebook.orca.threads.a)a(com/facebook/orca/threads/a), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId));
    }

    public Object b()
    {
        return a();
    }
}
