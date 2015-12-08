// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.af;

import android.content.Context;
import p.ak.b;
import p.q.e;
import p.q.f;
import p.x.m;

// Referenced classes of package p.af:
//            i, j

public class c
    implements b
{

    private final i a;
    private final j b;
    private final m c = new m();
    private final p.ae.c d;

    public c(Context context, p.t.c c1)
    {
        a = new i(context, c1);
        d = new p.ae.c(a);
        b = new j(c1);
    }

    public e a()
    {
        return d;
    }

    public e b()
    {
        return a;
    }

    public p.q.b c()
    {
        return c;
    }

    public f d()
    {
        return b;
    }
}
