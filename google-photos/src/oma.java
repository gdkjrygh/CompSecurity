// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class oma
    implements opi
{

    private Bundle a;
    private olz b;

    oma(olz olz1, Bundle bundle)
    {
        b = olz1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof omb)
        {
            Bundle bundle = olz.a(b).a(opv, a);
            ((omb)opv).a(b, b.a, bundle);
        }
    }
}
