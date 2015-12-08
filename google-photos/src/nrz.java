// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class nrz extends nzc
{

    private final qqn a;

    nrz(Context context, int i, qqn qqn)
    {
        super(context, new nyg(context, i), "gnssetreadstates", new pbt(), new pbu());
        a = qqn;
    }

    protected final void a(qlw qlw)
    {
        ((pbt)qlw).a = a;
    }
}
