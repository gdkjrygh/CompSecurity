// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

public final class bpi
{

    private static final det a;
    private static final deq b;

    static deq a()
    {
        return b;
    }

    public static void a(Context context, Executor executor, bqz bqz)
    {
        b.a(context, "context", null);
        b.a(executor, "backgroundExecutor", null);
        b.a(bqz, "settings", null);
        executor.execute(new bpk(bqz, context));
    }

    static 
    {
        a = new bpj();
        der der1 = new der();
        det det = a;
        if (der1.a.size() != 0)
        {
            throw new dev(0);
        } else
        {
            der1.a.add(new deu(1, det));
            b = new deq(der1.a);
        }
    }
}
