// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executor;

public final class dfj
{

    public dfk a;
    public Executor b;
    public Executor c;
    public dfb d;
    public Executor e;
    public dfb f;
    private Executor g;
    private Executor h;

    public dfj(Context context)
    {
        a = (dfk)olm.a(context, dfk);
    }

    public final Executor a()
    {
        if (g == null)
        {
            g = a.a(dfj, "BackgroundThreadExecutor");
        }
        return g;
    }

    public final Executor b()
    {
        if (h == null)
        {
            h = a.b(dfj, "BackgroundThreadPoolExecutor");
        }
        return h;
    }
}
