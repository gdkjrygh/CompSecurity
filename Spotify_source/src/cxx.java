// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class cxx
{

    private final Executor a = Executors.newSingleThreadExecutor();

    public cxx()
    {
    }

    public final Future a(Context context, String s, cxz cxz)
    {
        context = new FutureTask(new cxy(context, s, cxz));
        a.execute(context);
        return context;
    }
}
