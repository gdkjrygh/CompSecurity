// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

final class ang.Object
    implements Executor
{

    private Handler a;

    public final void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    (Handler handler)
    {
        a = handler;
        super();
    }
}
