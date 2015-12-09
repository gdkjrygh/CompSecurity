// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cg;

import p.dm.b;
import p.dm.h;
import p.dm.j;
import p.dq.c;

// Referenced classes of package p.cg:
//            a, b

class .Object
    implements h
{

    final a a;

    public j a(b b1, c c)
    {
        if (b1 == null)
        {
            return new p.cg.b();
        } else
        {
            return new p.cg.b(b1.f(), b1.e(), c);
        }
    }

    .Object(a a1)
    {
        a = a1;
        super();
    }
}
