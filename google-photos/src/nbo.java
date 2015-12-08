// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.MessageQueue;

final class nbo
    implements Runnable
{

    private nbl a;

    nbo(nbl nbl1)
    {
        a = nbl1;
        super();
    }

    public final void run()
    {
        Looper.myQueue().addIdleHandler(nbl.a(a));
    }
}
