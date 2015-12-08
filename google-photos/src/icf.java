// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

public final class icf
    implements omb, opv
{

    public static final int a;
    public Context b;
    public int c;
    public ice d;
    public dgk e;
    private final iau f;

    public icf(opd opd1, iau iau1)
    {
        f = iau1;
        opd1.a(this);
    }

    static Context a(icf icf1)
    {
        return icf1.b;
    }

    static int b(icf icf1)
    {
        return icf1.c;
    }

    public final icf a(olm olm1)
    {
        olm1.a(icf, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = context;
        c = ((mmr)olm1.a(mmr)).d();
        d = (ice)olm1.a(ice);
        e = (dgk)olm1.a(dgk);
    }

    public final void a(ich ich1)
    {
        a(ich1, ich.c);
    }

    public void a(ich ich1, ich ich2)
    {
        f.a(ich1.e, ich1.d, ich2.d);
    }

    static 
    {
        a = (int)TimeUnit.SECONDS.toMillis(5L);
    }
}
