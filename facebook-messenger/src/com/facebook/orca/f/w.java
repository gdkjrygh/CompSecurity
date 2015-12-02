// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.messages.model.threads.Message;
import com.google.common.base.Predicate;

// Referenced classes of package com.facebook.orca.f:
//            v

class w
    implements Predicate
{

    final v a;

    w(v v1)
    {
        a = v1;
        super();
    }

    public boolean a(Message message)
    {
        return a.a.equals(message.w());
    }

    public boolean apply(Object obj)
    {
        return a((Message)obj);
    }
}
