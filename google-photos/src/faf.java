// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class faf
{

    private final Context a;
    private final fai b;
    private final noz c;
    private final noz d;

    public faf(Context context, fai fai1)
    {
        a = context;
        b = fai1;
        c = noz.a(context, 4, "DatabaseProcessorExecut", new String[0]);
        d = noz.a(context, 3, "DatabaseProcessorExecut", new String[0]);
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        long l1;
        boolean flag;
        l1 = noy.a();
        list = b.a();
        flag = list.isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c.a())
        {
            noy.a("numProcessors", Integer.valueOf(list.size()));
        }
        eil eil1 = new eil();
        eil1.b = l;
        eil1.a = 0.25F;
        boolean flag1 = (new eik(a, eil1)).a(new fag(a, b, list));
        if (c.a())
        {
            noy.a("duration", l1);
            noy.a("successful", Boolean.valueOf(flag1));
            noy.a("numProcessors", Integer.valueOf(list.size()));
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
