// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.os.Handler;
import android.os.Looper;
import com.facebook.fbservice.service.OperationResult;
import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.fbservice.ops:
//            n, r, q

class z extends n
{

    final r a;

    private z(r r1)
    {
        a = r1;
        super();
    }

    z(r r1, q q)
    {
        this(r1);
    }

    private void e()
    {
        boolean flag1 = true;
        if (isDone())
        {
            return;
        }
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot call get on main thread for unfinished operation");
        if (r.b(a).getLooper() != Looper.myLooper())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot call get on the operation's handler thread for unfinished operation");
    }

    public OperationResult a(long l, TimeUnit timeunit)
    {
        e();
        return (OperationResult)super.get(l, timeunit);
    }

    public boolean a(OperationResult operationresult)
    {
        return super.a_(operationresult);
    }

    public boolean a_(Object obj)
    {
        return a((OperationResult)obj);
    }

    public boolean a_(Throwable throwable)
    {
        return super.a_(throwable);
    }

    public OperationResult b()
    {
        e();
        return (OperationResult)super.get();
    }

    public Object get()
    {
        return b();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a(l, timeunit);
    }
}
