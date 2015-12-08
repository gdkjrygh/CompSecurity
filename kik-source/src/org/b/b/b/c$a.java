// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.b.b;

import org.b.a.d;

// Referenced classes of package org.b.b.b:
//            c, h, f

static final class d
    implements org.b.a.ject
{

    String a;
    d b;
    org.b.a.a.d c;
    private int d;

    public final String toString()
    {
        h h1 = h.k;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(h.a(a));
        stringbuffer.append("(");
        stringbuffer.append(((f)b).b(h1));
        stringbuffer.append(")");
        return stringbuffer.toString();
    }

    public ng(int i, String s, d d1, org.b.a.a.d d2)
    {
        a = s;
        b = d1;
        c = d2;
        d = i;
    }
}
