// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class opa
    implements opi
{

    private Bundle a;
    private oow b;

    opa(oow oow1, Bundle bundle)
    {
        b = oow1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof oot)
        {
            b.a(opv, a);
            ((oot)opv).a();
        }
    }
}
