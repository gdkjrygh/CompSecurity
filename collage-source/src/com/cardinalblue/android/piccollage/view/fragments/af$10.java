// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements i
{

    final a a;
    final af b;

    public Void a(j j1)
        throws Exception
    {
        af.f(b).set(false);
        if (j1.c())
        {
            return null;
        }
        if (j1.d())
        {
            a.a(null, j1.f());
            return null;
        } else
        {
            a.a((CBCollagesResponse)j1.e(), null);
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    Response(af af1, Response response)
    {
        b = af1;
        a = response;
        super();
    }
}
