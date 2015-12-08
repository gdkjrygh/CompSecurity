// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.bl;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            tu, uj

final class ub
    implements o
{

    private final WeakReference a;
    private final a b;
    private final int c;

    public ub(tu tu1, a a1, int i)
    {
        a = new WeakReference(tu1);
        b = a1;
        c = i;
    }

    public final void a(ConnectionResult connectionresult)
    {
        tu tu1;
        boolean flag = false;
        tu1 = (tu)a.get();
        if (tu1 == null)
        {
            return;
        }
        if (Looper.myLooper() == tu.c(tu1).a())
        {
            flag = true;
        }
        bl.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        tu.b(tu1).lock();
        boolean flag1 = com.google.android.gms.internal.tu.a(tu1, 0);
        if (!flag1)
        {
            tu.b(tu1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            com.google.android.gms.internal.tu.a(tu1, connectionresult, b, c);
        }
        if (tu.j(tu1))
        {
            tu.k(tu1);
        }
        tu.b(tu1).unlock();
        return;
        connectionresult;
        tu.b(tu1).unlock();
        throw connectionresult;
    }

    public final void b(ConnectionResult connectionresult)
    {
        tu tu1;
        boolean flag = true;
        tu1 = (tu)a.get();
        if (tu1 == null)
        {
            return;
        }
        if (Looper.myLooper() != tu.c(tu1).a())
        {
            flag = false;
        }
        bl.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        tu.b(tu1).lock();
        flag = com.google.android.gms.internal.tu.a(tu1, 1);
        if (!flag)
        {
            tu.b(tu1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            com.google.android.gms.internal.tu.a(tu1, connectionresult, b, c);
        }
        if (tu.j(tu1))
        {
            tu.l(tu1);
        }
        tu.b(tu1).unlock();
        return;
        connectionresult;
        tu.b(tu1).unlock();
        throw connectionresult;
    }
}
