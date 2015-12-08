// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.at;

// Referenced classes of package com.android.slyce.a.c.c:
//            o

public class f extends at
{

    static final boolean g;
    long d;
    long e;
    aj f;

    public f(long l)
    {
        f = new aj();
        d = l;
    }

    public void a(am am, aj aj1)
    {
        if (!g && e >= d)
        {
            throw new AssertionError();
        }
        int i = aj1.d();
        long l = Math.min(d - e, i);
        aj1.a(f, (int)l);
        i = f.d();
        super.a(am, f);
        l = e;
        e = (long)(i - f.d()) + l;
        f.a(aj1);
        if (e == d)
        {
            a(null);
        }
    }

    protected void a(Exception exception)
    {
        Object obj = exception;
        if (exception == null)
        {
            obj = exception;
            if (e != d)
            {
                obj = new o((new StringBuilder()).append("End of data reached before content length was read: ").append(e).append("/").append(d).append(" Paused: ").append(k()).toString());
            }
        }
        super.a(((Exception) (obj)));
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/c/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
    }
}
