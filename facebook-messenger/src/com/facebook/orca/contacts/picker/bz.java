// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.common.time.a;
import com.facebook.inject.d;
import com.facebook.orca.protocol.methods.i;
import com.facebook.orca.protocol.methods.p;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bi, bj

class bz extends d
{

    final bi a;

    private bz(bi bi)
    {
        a = bi;
        super();
    }

    bz(bi bi, bj bj)
    {
        this(bi);
    }

    public i a()
    {
        return new i((p)a(com/facebook/orca/protocol/methods/p), (a)a(com/facebook/common/time/a));
    }

    public Object b()
    {
        return a();
    }
}
