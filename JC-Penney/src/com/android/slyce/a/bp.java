// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.a;
import com.android.slyce.a.a.e;
import com.android.slyce.a.a.h;
import java.io.PrintStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.android.slyce.a:
//            am, aj, ap, bq

public class bp
{

    static final boolean a;

    public bp()
    {
    }

    public static void a(a a1, Exception exception)
    {
        if (a1 != null)
        {
            a1.a(exception);
        }
    }

    public static void a(h h1)
    {
        if (h1 != null)
        {
            h1.a();
        }
    }

    public static void a(am am1, aj aj1)
    {
        e e1 = null;
        do
        {
            if (am1.k())
            {
                break;
            }
            e e2 = am1.f();
            e1 = e2;
            if (e2 == null)
            {
                break;
            }
            int i = aj1.d();
            e1 = e2;
            if (i <= 0)
            {
                break;
            }
            e2.a(am1, aj1);
            e1 = e2;
            if (i == aj1.d())
            {
                e1 = e2;
                if (e2 == am1.f())
                {
                    e1 = e2;
                    if (!am1.k())
                    {
                        System.out.println((new StringBuilder()).append("handler: ").append(e2).toString());
                        if (!a)
                        {
                            throw new AssertionError();
                        } else
                        {
                            throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
                        }
                    }
                }
            }
        } while (true);
        if (aj1.d() != 0 && !am1.k())
        {
            System.out.println((new StringBuilder()).append("handler: ").append(e1).toString());
            System.out.println((new StringBuilder()).append("emitter: ").append(am1).toString());
            if (!a)
            {
                throw new AssertionError();
            } else
            {
                throw new RuntimeException("Not all data was consumed by Util.emitAllData");
            }
        } else
        {
            return;
        }
    }

    public static void a(am am1, Exception exception)
    {
        if (am1 == null)
        {
            return;
        } else
        {
            a(am1.h(), exception);
            return;
        }
    }

    public static void a(ap ap1)
    {
        if (ap1 == null)
        {
            return;
        } else
        {
            a(ap1.g());
            return;
        }
    }

    public static void a(ap ap1, aj aj1, a a1)
    {
        aj1 = new bq(ap1, aj1, a1);
        ap1.a(aj1);
        aj1.a();
    }

    public static void a(ap ap1, byte abyte0[], a a1)
    {
        ByteBuffer bytebuffer = aj.c(abyte0.length);
        bytebuffer.put(abyte0);
        bytebuffer.flip();
        abyte0 = new aj();
        abyte0.a(bytebuffer);
        a(ap1, ((aj) (abyte0)), a1);
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/bp.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
