// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import com.facebook.debug.log.b;
import com.google.common.a.fi;
import java.util.Iterator;

// Referenced classes of package com.facebook.location:
//            h, j

class k
    implements Runnable
{

    final h a;
    final j b;

    k(j j1, h h1)
    {
        b = j1;
        a = h1;
        super();
    }

    public void run()
    {
        com.facebook.debug.log.b.b(h.a(), "Registering location updates");
        String s;
        for (Iterator iterator = j.a(b).iterator(); iterator.hasNext(); j.a(b, s))
        {
            s = (String)iterator.next();
        }

    }
}
