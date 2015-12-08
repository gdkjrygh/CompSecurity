// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class hge
    implements mud
{

    private hgd a;

    hge(hgd hgd1)
    {
        a = hgd1;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        mua = a;
        mua.d = ((hgd) (mua)).d + 1;
        if (mue1 == null || mue1.c())
        {
            if (((hgd) (mua)).c.a() && mue1 != null)
            {
                mue1 = mue1.c;
            }
            mua.e = false;
            mua.f = true;
        } else
        {
            mua.g = (hgk)mue1.a().getParcelable("resume_data");
            if (((hgd) (mua)).g != null && !((hgd) (mua)).g.a())
            {
                mua.a();
            } else
            {
                if (((hgd) (mua)).b.a())
                {
                    noy.a("number of fetches", Integer.valueOf(((hgd) (mua)).d));
                }
                mua.e = false;
                mua.f = true;
            }
        }
        if (((hgd) (mua)).a != null && ((hgd) (mua)).f)
        {
            ((hgd) (mua)).a.a();
        }
    }
}
