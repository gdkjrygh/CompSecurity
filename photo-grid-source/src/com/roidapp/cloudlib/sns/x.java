// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.os.Handler;
import android.os.Looper;
import com.roidapp.baselib.e.j;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            y, w

class x
    implements j
{

    private static final Handler b = new Handler(Looper.getMainLooper());
    private final w a;

    public x(w w1)
    {
        a = w1;
    }

    public final void a()
    {
        if (a != null)
        {
            b.post(new y(3, null, a, (byte)0));
        }
    }

    public final void a(int i, Exception exception)
    {
        if (a != null)
        {
            a.a(i, exception);
            b.post(new y(1, new com.roidapp.baselib.c.x(Integer.valueOf(i), exception), a, (byte)0));
        }
    }

    public void a(Object obj)
    {
        if (a != null)
        {
            a.a(obj);
            b.post(new y(0, obj, a, (byte)0));
        }
    }

    public final void b(Object obj)
    {
        if (a != null)
        {
            b.post(new y(2, obj, a, (byte)0));
        }
    }

}
