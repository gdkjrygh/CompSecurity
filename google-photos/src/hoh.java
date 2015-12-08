// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class hoh
    implements mud
{

    private hog a;

    hoh(hog hog1)
    {
        a = hog1;
        super();
    }

    public final void a(mue mue1, mua mua)
    {
        mua = a;
        if (mue1 != null && !mue1.c())
        {
            boolean flag;
            if (!((hog) (mua)).b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mua.b = flag;
            ((hog) (mua)).f.a();
            if (((hog) (mua)).b)
            {
                mue1 = ((hog) (mua)).a.getResources().getString(c.er);
            } else
            {
                mue1 = ((hog) (mua)).a.getResources().getString(c.ek);
            }
            mua = ((hog) (mua)).e.a();
            mua.d = mue1;
            mua.a().c();
        }
    }
}
