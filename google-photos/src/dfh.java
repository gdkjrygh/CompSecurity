// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class dfh
    implements Executor
{

    private final Handler a;

    public dfh(Looper looper)
    {
        a = new Handler(looper);
    }

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }
}
