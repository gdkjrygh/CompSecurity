// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cf;

import android.content.Context;
import android.os.AsyncTask;
import com.pandora.radio.data.ag;
import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;
import p.cw.c;
import p.dd.an;

// Referenced classes of package p.cf:
//            e, d, c, a

public class b
{
    public static class a extends com.pandora.radio.util.b
    {

        private static volatile b a;

        public static b a()
        {
            if (a == null)
            {
                a = new b();
            }
            return a;
        }
    }


    private static final long a;
    private final Context b;
    private final ag c;

    private b()
    {
        b = com.pandora.android.provider.b.a.h();
        c = com.pandora.android.provider.b.a.b().k();
    }


    public static b a()
    {
        p/cf/b;
        JVM INSTR monitorenter ;
        b b1 = a.a();
        p/cf/b;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean e()
    {
        long l = c.S();
        return Math.abs(System.currentTimeMillis() - l) > a;
    }

    void a(String s)
    {
        (new e(com.pandora.android.provider.b.a.b(), s)).a_(new Object[0]);
    }

    public void b()
    {
        com.pandora.android.provider.b.a.b().b(this);
    }

    void b(String s)
    {
        (new d(s)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void c()
    {
        com.pandora.android.provider.b.a.b().c(this);
    }

    void d()
    {
        (new p.cf.c(b, "692639182113-ddkaofim38hrnume0r1e9dudnbvarde6.apps.googleusercontent.com")).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void onSignInState(an an1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 1: // '\001'
            if (e())
            {
                (new p.cf.a(com.pandora.android.provider.b.a.b())).a_(new Object[0]);
            }
            // fall through

        case 2: // '\002'
        case 3: // '\003'
            return;

        case 4: // '\004'
            c.d(0L);
            return;
        }
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
