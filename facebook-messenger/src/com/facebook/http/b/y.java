// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.http.protocol.am;
import com.facebook.http.protocol.aq;
import com.facebook.http.protocol.i;
import com.facebook.http.protocol.k;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.http.b:
//            w, x

class y extends d
{

    final w a;

    private y(w w)
    {
        a = w;
        super();
    }

    y(w w, x x)
    {
        this(w);
    }

    public i a()
    {
        return new k((aq)a(com/facebook/http/protocol/aq), (am)a(com/facebook/http/protocol/am));
    }

    public Object b()
    {
        return a();
    }
}
