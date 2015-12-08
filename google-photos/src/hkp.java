// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hkp extends nzc
{

    public final qbx a;
    public qhl b;

    public hkp(Context context, int i, qbx qbx1)
    {
        super(context, new nyg(context, i), "removecollections", new pcx(), new pcy());
        a = qbx1;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcx)qlw;
        qlw.a = new qhk();
        qlw = ((pcx) (qlw)).a;
        qlw.a = (new qbx[] {
            a
        });
        qlw.b = b.i();
    }

    protected final void b(qlw qlw)
    {
        qlw = (pcy)qlw;
        super.b(qlw);
        b = ((pcy) (qlw)).a;
    }
}
