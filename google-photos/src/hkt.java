// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hkt extends nzc
{

    public boolean a;
    private final long b;
    private final String c;

    public hkt(Context context, int i, long l, String s)
    {
        super(context, new nyg(context, i), "updatephotoalbum", new pdn(), new pdo());
        a = false;
        p.a(s);
        c = s;
        b = l;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdn)qlw;
        qlw.a = new plv();
        qlw = ((pdn) (qlw)).a;
        qlw.a = String.valueOf(b);
        qlw.b = c;
    }

    protected final void b(qlw qlw)
    {
        qlw = (pdo)qlw;
        super.b(qlw);
        qlw = ((pdo) (qlw)).a;
        if (!l() && ((pmg) (qlw)).a.booleanValue())
        {
            a = true;
        }
    }
}
