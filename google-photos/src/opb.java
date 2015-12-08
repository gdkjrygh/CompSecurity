// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class opb
    implements opi
{

    private Bundle a;
    private View b;
    private oow c;

    opb(oow oow1, Bundle bundle, View view)
    {
        c = oow1;
        a = bundle;
        b = view;
        super();
    }

    public final void a(opv opv)
    {
        if (opv instanceof oov)
        {
            Bundle bundle = c.a(opv, a);
            ((oov)opv).a(b, bundle);
        }
    }
}
