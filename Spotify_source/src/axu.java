// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.anrwatchdog.ANRError;

public final class axu extends Thread
{

    public static final axv a = new axv() {

        public final void a(ANRError anrerror)
        {
            throw anrerror;
        }

    };
    private static final axw c = new axw() {

        public final void a(InterruptedException interruptedexception)
        {
            Log.w("ANRWatchdog", (new StringBuilder("Interrupted: ")).append(interruptedexception.getMessage()).toString());
        }

    };
    public axv b;
    private axw d;
    private final Handler e;
    private String f;
    private volatile int g;
    private final Runnable h;

    public axu()
    {
        this((byte)0);
    }

    private axu(byte byte0)
    {
        b = a;
        d = c;
        e = new Handler(Looper.getMainLooper());
        f = "";
        g = 0;
        h = new Runnable() {

            private axu a;

            public final void run()
            {
                axu.a(a, (axu.a(a) + 1) % 10);
            }

            
            {
                a = axu.this;
                super();
            }
        };
    }

    static int a(axu axu1)
    {
        return axu1.g;
    }

    static int a(axu axu1, int i)
    {
        axu1.g = i;
        return i;
    }

    public final void run()
    {
        setName("|ANR-WatchDog|");
        do
        {
            if (isInterrupted())
            {
                break;
            }
            int i = g;
            e.post(h);
            Object obj;
            try
            {
                Thread.sleep(5000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                d.a(((InterruptedException) (obj)));
                return;
            }
            if (g != i)
            {
                continue;
            }
            if (f != null)
            {
                obj = ANRError.a(f);
            } else
            {
                obj = ANRError.a();
            }
            b.a(((ANRError) (obj)));
            break;
        } while (true);
    }

}
