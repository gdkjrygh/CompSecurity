// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import com.google.a.y;
import java.net.URI;
import java.net.URISyntaxException;

final class aj extends am
{

    aj()
    {
    }

    private static URI b(a a1)
    {
        if (a1.f() != e.i) goto _L2; else goto _L1
_L1:
        a1.j();
_L4:
        return null;
_L2:
        a1 = a1.h();
        if ("null".equals(a1)) goto _L4; else goto _L3
_L3:
        a1 = new URI(a1);
        return a1;
        a1;
        throw new y(a1);
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final void a(f f1, Object obj)
    {
        obj = (URI)obj;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((URI) (obj)).toASCIIString();
        }
        f1.b(((String) (obj)));
    }
}
