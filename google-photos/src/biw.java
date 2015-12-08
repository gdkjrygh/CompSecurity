// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.concurrent.Executor;

public class biw
    implements bih
{

    private final Executor c;
    private final Executor d;
    private final bih e;

    public biw(Executor executor, Executor executor1, bih bih1)
    {
        c = (Executor)b.a(executor, "backgroundExecutor", null);
        d = (Executor)b.a(executor1, "mainExecutor", null);
        e = (bih)b.a(bih1, "analyzer", null);
    }

    static bih a(biw biw1)
    {
        return biw1.e;
    }

    static Executor b(biw biw1)
    {
        return biw1.d;
    }

    public final void a()
    {
        e.a();
    }

    public final void a(Uri uri, bim bim, bii bii)
    {
        c.execute(new bix(this, uri, bim, bii));
    }

    static 
    {
        biw.getSimpleName();
    }
}
