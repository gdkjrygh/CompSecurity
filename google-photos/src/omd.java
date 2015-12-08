// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class omd
    implements opi
{

    private Bundle a;
    private omc b;

    omd(omc omc1, Bundle bundle)
    {
        b = omc1;
        a = bundle;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof omb)
        {
            Bundle bundle = omc.a(b).a(opv, a);
            ((omb)opv).a(b, b.a, bundle);
        }
    }
}
