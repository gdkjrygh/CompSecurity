// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executor;

public final class cjd
{

    final chq a;
    final Executor b;
    final cko c;
    final Context d;
    final noj e;
    final int f;

    public cjd(chq chq1, Executor executor, cko cko1, Context context, noj noj1, int i)
    {
        a = (chq)b.a(chq1, "renderContext", null);
        b = (Executor)b.a(executor, "backgroundExecutor", null);
        c = (cko)b.a(cko1, "bitmapFactory", null);
        d = (Context)b.a(context, "context", null);
        e = (noj)b.a(noj1, "movieMakerProvider", null);
        f = i;
    }
}
