// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class nfg
    implements nfp
{

    private final nfh a[] = new nfh[32];
    private volatile boolean b;
    private volatile boolean c;

    public nfg()
    {
        new AtomicInteger();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = new nfh();
            a[i].a = new AtomicReference();
        }

        b = false;
        c = false;
    }

    public final void a(nfn nfn1)
    {
        boolean flag4 = c;
        flag4 = b;
        boolean flag = false;
        boolean flag1 = false;
        int i = 0;
        do
        {
            while (i < a.length) 
            {
                Object obj = a[i].a.get();
                boolean flag2 = flag1;
                boolean flag3 = flag;
                if (obj != null)
                {
                    if (a[i].a.get() == obj)
                    {
                        String s = String.format(Locale.US, "%s@%s", new Object[] {
                            obj.getClass().getSimpleName(), Integer.toHexString(System.identityHashCode(obj))
                        });
                        long l;
                        if (android.os.Build.VERSION.SDK_INT >= 17)
                        {
                            l = SystemClock.elapsedRealtimeNanos();
                        } else
                        {
                            l = TimeUnit.NANOSECONDS.toMillis(SystemClock.elapsedRealtime());
                        }
                        if (l < 1000L)
                        {
                            obj = String.format(Locale.US, "%d ns", new Object[] {
                                Long.valueOf(l)
                            });
                        } else
                        if (l < 0xf4240L)
                        {
                            obj = String.format(Locale.US, "%d us", new Object[] {
                                Long.valueOf(l / 1000L)
                            });
                        } else
                        if (l < 0x3b9aca00L)
                        {
                            obj = String.format(Locale.US, "%d ms", new Object[] {
                                Long.valueOf(l / 0xf4240L)
                            });
                        } else
                        {
                            l /= 0x3b9aca00L;
                            long l1 = l / 60L;
                            long l2 = l1 / 60L;
                            obj = String.format(Locale.US, "%2d:%02d.%02d   ", new Object[] {
                                Long.valueOf(l2), Long.valueOf(l1 - 60L * l2), Long.valueOf(l - 60L * l1)
                            });
                        }
                        nfn1.a("%s currently has %s (%s), acquired %s ago", new Object[] {
                            null, s, null, obj
                        });
                        flag2 = true;
                        flag3 = flag;
                    } else
                    {
                        flag3 = true;
                        flag2 = flag1;
                    }
                }
                i++;
                flag1 = flag2;
                flag = flag3;
            }
            if (flag)
            {
                nfn1.a("WARNING: Resources were modified during summarization.");
            }
            if (!flag1)
            {
                nfn1.a("No tracked resources are currently held.");
            }
            return;
        } while (true);
    }

    static 
    {
        nfg.getSimpleName();
    }
}
