// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

// Referenced classes of package p.i:
//            a

private static class <init>
    implements Executor
{

    public void execute(Runnable runnable)
    {
        (new Handler(Looper.getMainLooper())).post(runnable);
    }

    private le()
    {
    }

    le(le le)
    {
        this();
    }
}
