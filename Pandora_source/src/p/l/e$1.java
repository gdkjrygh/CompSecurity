// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.l;

import p.al.e;

// Referenced classes of package p.l:
//            e

class g.Object
    implements Runnable
{

    final e a;
    final p.l.e b;

    public void run()
    {
        if (!a.isCancelled())
        {
            b.a(a);
        }
    }

    le(p.l.e e1, e e2)
    {
        b = e1;
        a = e2;
        super();
    }
}
