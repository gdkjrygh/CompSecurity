// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.List;

final class myw extends nzc
{

    private final List a;
    private final myv b;

    public myw(Context context, nyg nyg1, List list, myv myv1)
    {
        super(context, nyg1, "getmobileexperiments", new pbf(), new pbg());
        a = list;
        b = myv1;
    }

    public final void a(ByteBuffer bytebuffer, String s)
    {
        b.c(h.a);
        super.a(bytebuffer, s);
    }

    protected final void a(qlw qlw)
    {
        ((pbf)qlw).a = b.e(a);
    }

    public final void b()
    {
        if (!l())
        {
            b.a(g, h.a, ((pbg)q).a);
        }
        b.b(h.a);
    }
}
