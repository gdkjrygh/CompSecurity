// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.http.protocol.aq;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.ah;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            ac, bi, bj

class bm extends d
{

    final bi a;

    private bm(bi bi)
    {
        a = bi;
        super();
    }

    bm(bi bi, bj bj)
    {
        this(bi);
    }

    public ac a()
    {
        return new ac((aq)a(com/facebook/http/protocol/aq), (ah)a(com/facebook/orca/protocol/methods/ah));
    }

    public Object b()
    {
        return a();
    }
}
