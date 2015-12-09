// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.motion.MotionProcessor;
import com.spotify.mobile.android.motion.MotionProcessorObserver;
import com.spotify.mobile.android.spotlets.running.auto.MotionState;
import com.spotify.mobile.android.util.Assertion;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

public final class fff
    implements android.os.Handler.Callback, MotionProcessorObserver
{

    private static final long e;
    public final MotionProcessor a = new MotionProcessor(1.5D, 50, 50D, 0.20000000000000001D, 140D, 200D, 5D, 0.25D, 0.070000000000000007D, 1.3300000000000001D, 30D, 120D, 20D, 2D, 0.02D, 30D, 8L, 30D, 2.5D, 30D, 10D);
    public MotionState b;
    public double c;
    public boolean d;
    private final Set f = new CopyOnWriteArraySet();
    private final Handler g = new Handler(this);
    private boolean h;

    public fff()
    {
        b = MotionState.a;
    }

    private boolean a(MotionState motionstate)
    {
        boolean flag;
        if (b != motionstate)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = motionstate;
        return flag;
    }

    private void b()
    {
        g.removeMessages(1);
    }

    public final void a()
    {
        a.removeObserver(this);
        b();
        d = false;
    }

    public final boolean a(ffc ffc1)
    {
        return f.add(ffc1);
    }

    public final boolean b(ffc ffc1)
    {
        return f.remove(ffc1);
    }

    public final void detectedTempoDidChange(boolean flag, double d1)
    {
        c = ffi.a(d1);
        h = flag;
        if (d1 >= 140.000001D)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        h = false;
        if (!flag) goto _L2; else goto _L1
_L1:
        if (b == MotionState.b) goto _L2; else goto _L3
_L3:
        flag = a(MotionState.b);
        g.removeMessages(1);
        g.sendEmptyMessageDelayed(1, e);
_L8:
        Iterator iterator = f.iterator();
_L7:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        ffc ffc1;
        ffc1 = (ffc)iterator.next();
        if (b == MotionState.b || b == MotionState.c)
        {
            ffc1.a(c);
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        ffc1.a(b);
          goto _L7
        Exception exception;
        exception;
        Assertion.a("Exception while detectedTempoDidChange", exception);
_L5:
        return;
_L2:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        if (b == MotionState.a)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        b();
        flag = a(MotionState.a);
        c = 0.0D;
          goto _L8
        flag = false;
          goto _L8
    }

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 52
    //                   2 120;
           goto _L1 _L2 _L3
_L1:
        Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
_L5:
        return false;
_L2:
        a();
        c = 0.0D;
        b = MotionState.d;
        message = f.iterator();
        while (message.hasNext()) 
        {
            ffc ffc1 = (ffc)message.next();
            ffc1.a(b);
            ffc1.a(c);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void tempoDidChange(double d1)
    {
        boolean flag;
        c = ffi.a(d1);
        c = Math.min(c, 190D);
        if (h)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        flag = a(MotionState.b);
_L5:
        Iterator iterator = f.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ffc ffc1;
        ffc1 = (ffc)iterator.next();
        ffc1.a(c);
        if (!flag) goto _L4; else goto _L3
_L3:
        ffc1.a(b);
          goto _L4
        Exception exception;
        exception;
        Assertion.a("Exception while tempoDidChange", exception);
_L2:
        return;
        flag = a(MotionState.c);
        g.sendEmptyMessage(2);
          goto _L5
    }

    static 
    {
        e = TimeUnit.SECONDS.toMillis(30L);
    }
}
