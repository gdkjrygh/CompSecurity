// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.a;

import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.e;
import com.jcp.fragments.gs;

// Referenced classes of package com.jcp.a:
//            c

class d
    implements g
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public boolean a(e e1)
    {
        e1 = e1.b();
        if (c.a(a) != null && (c.a(a) instanceof gs))
        {
            ((gs)c.a(a)).b(Integer.parseInt(e1));
        }
        return false;
    }
}
