// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class hob
    implements mud
{

    private hoa a;

    hob(hoa hoa1)
    {
        a = hoa1;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        mua = a;
        if (mue1 == null || mue1.c())
        {
            mue1 = ((hoa) (mua)).d.a();
            mue1.d = ((hoa) (mua)).a.getResources().getString(c.eh);
            mue1.a().c();
        }
    }
}
