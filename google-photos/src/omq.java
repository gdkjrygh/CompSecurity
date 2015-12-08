// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class omq
    implements opi
{

    private Bundle a;
    private omp b;

    omq(omp omp1, Bundle bundle)
    {
        b = omp1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof omb)
        {
            Bundle bundle = omp.a(b).a(opv, a);
            ((omb)opv).a(b.ad, b.ae, bundle);
        }
    }
}
