// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.spotlets.running.auto.MotionState;
import com.spotify.mobile.android.spotlets.running.service.RunningService;
import com.spotify.mobile.android.spotlets.running.steptracker.StepTrackerService;
import com.spotify.mobile.android.util.Assertion;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class fdt
    implements android.os.Handler.Callback, fdw
{

    private static final long e;
    public few a;
    public final fec b;
    public int c;
    public final Handler d = new Handler(this);
    private final fdx f;

    public fdt(fdx fdx1, fec fec, few few1)
    {
        f = fdx1;
        b = fec;
        a = few1;
    }

    static fdx a(fdt fdt1)
    {
        return fdt1.f;
    }

    private void b()
    {
        d.removeCallbacksAndMessages(null);
        d.sendEmptyMessageDelayed(1, e);
    }

    static void b(fdt fdt1)
    {
        fdt1.c();
    }

    private void c()
    {
        d.removeCallbacksAndMessages(null);
        d.sendEmptyMessageDelayed(2, e);
    }

    static void c(fdt fdt1)
    {
        fdt1.b();
    }

    static few d(fdt fdt1)
    {
        return fdt1.a;
    }

    public final void a()
    {
        Object obj = a;
        if (((few) (obj)).e != null)
        {
            obj = ((few) (obj)).e;
            if (((RunningService) (obj)).c != null)
            {
                ((RunningService) (obj)).c.a();
            }
        }
    }

    public final void a(double d1)
    {
        if (ffi.b(d1))
        {
            c = (int)d1;
            f.c(c);
            return;
        } else
        {
            c = 0;
            f.f();
            return;
        }
    }

    public final void a(double d1, MotionState motionstate)
    {
        a(d1);
        a(motionstate);
    }

    public final void a(MotionState motionstate)
    {
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[MotionState.values().length];
                try
                {
                    a[MotionState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[MotionState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[MotionState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MotionState.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[motionstate.ordinal()])
        {
        default:
            Assertion.b((new StringBuilder("Unsupported state: ")).append(motionstate).toString());
            return;

        case 1: // '\001'
            f.a(0x7f080460);
            f.b(0x7f08045f);
            f.f();
            f.d(0x7f020268);
            return;

        case 2: // '\002'
            f.a(0x7f08045c);
            f.b(0x7f08045b);
            f.d(0x7f020266);
            return;

        case 3: // '\003'
            f.a(0x7f08045a);
            f.b(false);
            f.d(0x7f020269);
            a();
            c();
            return;

        case 4: // '\004'
            f.a(0x7f08045e);
            break;
        }
        f.b(0x7f08045d);
        f.f();
        f.d(0x7f020267);
        a();
        b();
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            f.h();
            return true;

        case 2: // '\002'
            f.g();
            break;
        }
        return true;
    }

    static 
    {
        e = TimeUnit.SECONDS.toMillis(1L);
    }

    // Unreferenced inner class fdt$1

/* anonymous class */
    public final class _cls1
        implements fez
    {

        private fdt a;

        public final void a(Uri uri)
        {
            fdt.a(a).a(uri);
        }

            public 
            {
                a = fdt.this;
                super();
            }
    }


    // Unreferenced inner class fdt$2

/* anonymous class */
    public final class _cls2
        implements ffb
    {

        private fdt a;

        public final void a()
        {
            fdt.b(a);
        }

        public final void b()
        {
            fdt.c(a);
        }

            public 
            {
                a = fdt.this;
                super();
            }
    }


    // Unreferenced inner class fdt$3

/* anonymous class */
    public final class _cls3
        implements fey
    {

        private fdt a;

        public final void a()
        {
            fdt.d(a).e.a();
            Object obj = fdt.d(a);
            Object obj1 = a;
            ((few) (obj)).e.d.add(obj1);
            obj = fdt.d(a).e;
            obj.c = new fdv(((android.content.Context) (obj)));
            obj1 = ((RunningService) (obj)).c;
            boolean flag;
            if (((fdv) (obj1)).b == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.b(flag, "TempoDetectionObserver is already registered!");
            obj1.b = ((fdw) (obj));
            StepTrackerService.a(((fdv) (obj1)).a, ((android.content.ServiceConnection) (obj1)));
            ((RunningService) (obj)).a();
        }

            public 
            {
                a = fdt.this;
                super();
            }
    }

}
