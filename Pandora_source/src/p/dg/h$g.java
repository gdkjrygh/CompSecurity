// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import p.cw.c;
import p.dd.at;
import p.dd.ay;

// Referenced classes of package p.dg:
//            h, l

private class c
    implements Runnable
{

    final h a;
    private final boolean b;
    private final String c;

    public void run()
    {
        if (h.a(a) != null)
        {
            h.a(a).a(b, c, com.pandora.radio.util.e);
            h.b(a).a(new ay(null, p.dd..d));
            h.b(a).a(new at(null));
        }
        h.a(a, null);
    }

    public .String(h h1, boolean flag, String s)
    {
        a = h1;
        super();
        b = flag;
        c = s;
    }
}
