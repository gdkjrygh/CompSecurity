// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.c2dm;

import com.facebook.http.protocol.aq;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.push.c2dm:
//            r, aa, ae, d, 
//            e

class h extends d
{

    final com.facebook.push.c2dm.d a;

    private h(com.facebook.push.c2dm.d d1)
    {
        a = d1;
        super();
    }

    h(com.facebook.push.c2dm.d d1, e e)
    {
        this(d1);
    }

    public r a()
    {
        return new r((aa)a(com/facebook/push/c2dm/aa), (ae)a(com/facebook/push/c2dm/ae), b(com/facebook/http/protocol/aq));
    }

    public Object b()
    {
        return a();
    }
}
