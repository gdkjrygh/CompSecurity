// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import p.bf.a;
import p.bg.ba;

// Referenced classes of package p.bd:
//            j, a

class .Object
    implements Runnable
{

    final ba a;
    final j b;

    public void run()
    {
        if (j.d(b) instanceof p.bd.a)
        {
            ((p.bd.a)j.d(b)).a(a);
        } else
        if (j.d(b) instanceof a)
        {
            return;
        }
    }

    (j j1, ba ba)
    {
        b = j1;
        a = ba;
        super();
    }
}
