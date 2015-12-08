// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.os.Handler;
import android.os.SystemClock;
import com.immersion.content.EndpointWarp;
import com.immersion.hapticmediasdk.controllers.HapticPlaybackThread;
import com.immersion.hapticmediasdk.utils.RuntimeInfo;
import java.util.ArrayList;

public class ccrcrr
    implements Runnable
{

    public static int b044A044A044A044A044A044A = 2;
    public static int b044A044A044A044A044A044A = 45;
    public static int b044A044A044A044A044A044A = 1;
    private final byte a[];
    private final long b;
    public final HapticPlaybackThread b042504250425042504250425;
    private final long c;
    private final int d;
    private final long e;

    public ccrcrr(HapticPlaybackThread hapticplaybackthread, long l, long l1, byte abyte0[], int i, 
            long l2)
    {
        int j;
        try
        {
            b042504250425042504250425 = hapticplaybackthread;
            super();
            a = abyte0;
            b = l;
        }
        // Misplaced declaration of an exception variable
        catch (HapticPlaybackThread hapticplaybackthread)
        {
            throw hapticplaybackthread;
        }
        j = b044A044A044A044A044A044A;
        switch ((j * (b044A044A044A044A044A044A + j)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 15;
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            c = l1;
            d = i;
            e = l2;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HapticPlaybackThread hapticplaybackthread)
        {
            throw hapticplaybackthread;
        }
    }

    public static int b044A044A044A044A044A044A()
    {
        return 32;
    }

    public void run()
    {
        if (HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425))
        {
            synchronized (HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425))
            {
                HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425).remove(this);
            }
            if (b >= c)
            {
                if (HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425).areHapticsEnabled())
                {
                    HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425).update(a, a.length, e, d);
                }
                synchronized (HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425))
                {
                    HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425, HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425));
                    HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425, HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425));
                    HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425, SystemClock.uptimeMillis());
                }
            }
            HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425).post(HapticPlaybackThread.b041104110411041104110411(b042504250425042504250425));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
