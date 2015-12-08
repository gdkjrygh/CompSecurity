// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Looper;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.x;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            f, h, b

static final class c
    implements c
{

    private final WeakReference a;
    private final b b;
    private final int c;

    public final void a(a a1)
    {
        f f1;
        boolean flag = false;
        f1 = (f)a.get();
        if (f1 == null)
        {
            return;
        }
        if (Looper.myLooper() == f1.a.e)
        {
            flag = true;
        }
        x.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        f1.b.lock();
        boolean flag1 = f1.c(0);
        if (!flag1)
        {
            f1.b.unlock();
            return;
        }
        if (!a1.b())
        {
            f1.b(a1, b, c);
        }
        if (f1.d())
        {
            if (!f1.e)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            f1.e();
        }
_L2:
        f1.b.unlock();
        return;
        f1.g();
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        f1.b.unlock();
        throw a1;
    }

    public final void b(a a1)
    {
        f f1;
        boolean flag = true;
        f1 = (f)a.get();
        if (f1 == null)
        {
            return;
        }
        if (Looper.myLooper() != f1.a.e)
        {
            flag = false;
        }
        x.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        f1.b.lock();
        flag = f1.c(1);
        if (!flag)
        {
            f1.b.unlock();
            return;
        }
        if (!a1.b())
        {
            f1.b(a1, b, c);
        }
        if (f1.d())
        {
            f1.f();
        }
        f1.b.unlock();
        return;
        a1;
        f1.b.unlock();
        throw a1;
    }

    public (f f1, b b1, int i)
    {
        a = new WeakReference(f1);
        b = b1;
        c = i;
    }
}
