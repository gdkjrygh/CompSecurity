// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class omf
    implements opi
{

    private Bundle a;
    private ome b;

    omf(ome ome1, Bundle bundle)
    {
        b = ome1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof omb)
        {
            Bundle bundle = ome.a(b).a(opv, a);
            ((omb)opv).a(b, b.f, bundle);
        }
    }
}
