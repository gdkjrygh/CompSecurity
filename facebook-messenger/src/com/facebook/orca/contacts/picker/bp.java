// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.i;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bf, bi, bj

class bp extends d
{

    final bi a;

    private bp(bi bi)
    {
        a = bi;
        super();
    }

    bp(bi bi, bj bj)
    {
        this(bi);
    }

    public bf a()
    {
        return new bf((aq)a(com/facebook/http/protocol/aq), (i)a(com/facebook/orca/protocol/methods/i));
    }

    public Object b()
    {
        return a();
    }
}
