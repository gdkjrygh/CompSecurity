// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nwf extends nzc
{

    private final poq a;

    public nwf(Context context, int i, poq poq1)
    {
        super(context, new nyg(context, i), "setphotossettings", new pdh(), new pdi());
        a = poq1;
    }

    public static nwf a(Context context, int i)
    {
        poq poq1 = new poq();
        poq1.g = Boolean.TRUE;
        return new nwf(context, i, poq1);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdh)qlw;
        super.a(qlw);
        qlw.a = new plt();
        ((pdh) (qlw)).a.a = a;
    }
}
