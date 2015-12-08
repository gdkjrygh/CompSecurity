// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class ope
    implements opi
{

    private Bundle a;
    private opd b;

    ope(opd opd1, Bundle bundle)
    {
        b = opd1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof opl)
        {
            Bundle bundle = b.a(opv, a);
            ((opl)opv).a(bundle);
        }
    }
}
