// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import android.content.Context;
import com.facebook.inject.d;
import com.facebook.orca.a.j;
import com.facebook.orca.f.n;
import com.facebook.orca.protocol.methods.an;
import com.facebook.orca.protocol.methods.ao;
import com.facebook.push.mqtt.bx;
import com.fasterxml.jackson.databind.ObjectMapper;

// Referenced classes of package com.facebook.orca.protocol:
//            d, e

class ac extends d
{

    final com.facebook.orca.protocol.d a;

    private ac(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    ac(com.facebook.orca.protocol.d d1, e e)
    {
        this(d1);
    }

    public ao a()
    {
        return new ao((Context)a(android/content/Context), (bx)a(com/facebook/push/mqtt/bx), (n)a(com/facebook/orca/f/n), (an)a(com/facebook/orca/protocol/methods/an), b(com/facebook/orca/a/j), (ObjectMapper)a(com/fasterxml/jackson/databind/ObjectMapper), (com.facebook.c.j)a(com/facebook/c/j));
    }

    public Object b()
    {
        return a();
    }
}
