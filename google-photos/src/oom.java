// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class oom
    implements opi
{

    private Bundle a;
    private ool b;

    oom(ool ool1, Bundle bundle)
    {
        b = ool1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof ooi)
        {
            Bundle bundle = b.a(opv, a);
            ((ooi)opv).b_(bundle);
        }
    }
}
