// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.a;

import java.util.concurrent.TimeUnit;
import rx.R;
import rx.X;
import rx.b;

// Referenced classes of package rx.internal.a:
//            dv, dr, dt

public final class dq extends dv
{

    public dq(long l, TimeUnit timeunit, b b, R r)
    {
        super(new dr(l, timeunit), new dt(l, timeunit), b, r);
    }

    public final volatile X a(X x)
    {
        return super.a(x);
    }
}
