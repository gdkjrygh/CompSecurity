// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;

final class iiq
    implements mud
{

    private iip a;

    iiq(iip iip1)
    {
        a = iip1;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        mua = a;
        if (mue1 == null || mue1.c())
        {
            if (((iip) (mua)).c.a())
            {
                noy.a("result", mue1);
            }
            mua.e = true;
            return;
        }
        Bundle bundle = mue1.a();
        mue1 = bundle.getString("next_resume_token");
        if (((iip) (mua)).f == 0L)
        {
            mua.f = bundle.getLong("request_time");
        }
        if (!TextUtils.isEmpty(mue1))
        {
            mtj mtj1 = ((iip) (mua)).a;
            int i = ((iip) (mua)).b.d();
            p.a(mue1, "ResumeToken must non-empty");
            mtj1.a(new ihu(i, mue1));
            return;
        } else
        {
            ((iip) (mua)).a.a(new fhl(((iip) (mua)).b.d(), ((iip) (mua)).f));
            mua.e = true;
            return;
        }
    }
}
