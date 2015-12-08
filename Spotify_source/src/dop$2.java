// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Set;

final class nit> extends epd
{

    private dop a;

    protected final int a()
    {
        return dop.a(a);
    }

    protected final void a(int i)
    {
        dop.c(a);
    }

    protected final boolean b()
    {
        dot dot1 = a.K();
        return dot1 != null && !TextUtils.isEmpty(dot1.getNextDataSet()) && !dop.b(a).contains(dot1.getId());
    }

    (dop dop1)
    {
        a = dop1;
        super();
    }
}
