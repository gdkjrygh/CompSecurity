// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package p.k:
//            e

class g.Object
    implements Executor
{

    final Handler a;
    final e b;

    public void execute(Runnable runnable)
    {
        a.post(runnable);
    }

    os.Handler(e e1, Handler handler)
    {
        b = e1;
        a = handler;
        super();
    }
}
