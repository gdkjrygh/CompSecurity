// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class htm
    implements mud
{

    private htl a;

    htm(htl htl1)
    {
        a = htl1;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        mua = a;
        if (mue1 == null || mue1.c())
        {
            return;
        } else
        {
            mua.a = mue1.a().getStringArrayList("extra_country_codes");
            mua.a();
            return;
        }
    }
}
