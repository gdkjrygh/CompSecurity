// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.ExecutorService;

final class nit> extends fyi
{

    private epw a;

    public final boolean b()
    {
        a.a.shutdown();
        a.b.removeCallbacksAndMessages(null);
        return true;
    }

    (epw epw1)
    {
        a = epw1;
        super();
    }
}
