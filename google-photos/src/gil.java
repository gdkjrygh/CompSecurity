// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;

public final class gil
    implements opl, ops, opv
{

    private final ar a;
    private final int b;
    private final int c;
    private boolean d;

    public gil(ar ar1, opd opd1)
    {
        this(ar1, opd1, b.ry);
    }

    private gil(ar ar1, opd opd1, int i)
    {
        a = ar1;
        b = i;
        c = ar1.getRequestedOrientation();
        opd1.a(this);
    }

    public final void a()
    {
        d = true;
        a.setRequestedOrientation(c);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            d = bundle.getBoolean("extra_cleared");
        }
        if (a.getResources().getBoolean(b) && !d)
        {
            a.setRequestedOrientation(1);
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("extra_cleared", d);
    }
}
