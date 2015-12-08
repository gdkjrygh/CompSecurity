// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class mva
{

    private volatile mvb a;

    public mva()
    {
    }

    public final String a()
    {
        mvb mvb1;
        for (mvb1 = a; mvb1 == null || SystemClock.elapsedRealtime() >= mvb1.b;)
        {
            return null;
        }

        return mvb1.a;
    }

    public final void a(owr owr1)
    {
        String s = owr1.a;
        long l = owr1.b.intValue();
        if (l <= 0L)
        {
            a = null;
            return;
        } else
        {
            long l1 = SystemClock.elapsedRealtime();
            a = new mvb(s, TimeUnit.SECONDS.toMillis(l) + l1);
            return;
        }
    }
}
