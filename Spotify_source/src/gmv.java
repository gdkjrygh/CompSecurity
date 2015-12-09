// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Debug;
import com.github.anrwatchdog.ANRError;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Random;

public class gmv
    implements axv, dmx
{

    private final Random a;
    private boolean b;

    public gmv(Random random)
    {
        a = random;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ANRError anrerror)
    {
        boolean flag = false;
        if (!Debug.isDebuggerConnected())
        {
            if (!b)
            {
                Logger.b("ANR detected", new Object[0]);
                if ((double)a.nextFloat() < 0.14999999999999999D)
                {
                    flag = true;
                }
                if (flag)
                {
                    Assertion.a(anrerror);
                }
            } else
            {
                Logger.b(anrerror, "ANR detected, but listener was muzzled", new Object[0]);
                c();
            }
        }
        b();
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        axu axu1 = new axu();
        if (this == null)
        {
            axu1.b = axu.a;
        } else
        {
            axu1.b = this;
        }
        axu1.start();
    }
}
