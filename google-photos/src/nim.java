// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class nim extends mtf
{

    private final nxv a;
    private final String b;
    private final String c = null;
    private final pmv j;
    private final pnc k[] = null;
    private final boolean l;
    private final boolean m;

    nim(Context context, String s, String s1, String s2, pmv pmv, pnc apnc[], boolean flag, 
            boolean flag1)
    {
        super(context, s);
        a = (nxv)olm.a(context, nxv);
        b = s1;
        j = pmv;
        l = flag;
        m = flag1;
    }

    protected final mue a()
    {
        Object obj = new nil(d(), b, c, 0, j, k, l, m);
        a.a(((nxx) (obj)));
        if (((nil) (obj)).l())
        {
            return new mue(((nxx) (obj)).l, ((nxx) (obj)).n, ((nxx) (obj)).m);
        }
        obj = ((pca)((nil) (obj)).t()).a;
        mue mue1;
        Bundle bundle;
        if (b.a(((pnh) (obj)).b, false))
        {
            obj = null;
        }
        mue1 = new mue(true);
        bundle = mue1.a();
        if (obj != null)
        {
            bundle.putParcelable("oob_response", new mvf(((qlw) (obj))));
        }
        bundle.putBoolean("allow_non_google_accounts", l);
        return mue1;
    }
}
