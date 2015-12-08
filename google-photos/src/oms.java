// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class oms
    implements opi
{

    private Bundle a;
    private omr b;

    oms(omr omr1, Bundle bundle)
    {
        b = omr1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof omb)
        {
            Bundle bundle = omr.a(b).a(opv, a);
            ((omb)opv).a(b, b.d, bundle);
        }
    }
}
