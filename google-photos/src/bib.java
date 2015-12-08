// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.concurrent.Callable;

final class bib
    implements Callable
{

    private blg a[];

    bib(bhy bhy, blg ablg[])
    {
        a = ablg;
        super();
    }

    public final Object call()
    {
        blg ablg[] = a;
        int j = ablg.length;
        for (int i = 0; i < j; i++)
        {
            blg blg1 = ablg[i];
            SystemClock.elapsedRealtime();
            blg1.d();
        }

        return null;
    }
}
