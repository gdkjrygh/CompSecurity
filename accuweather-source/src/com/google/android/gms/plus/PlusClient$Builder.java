// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.internal.i;

// Referenced classes of package com.google.android.gms.plus:
//            PlusClient

public static class mContext
{

    private final com.google.android.gms.common.lient.ConnectionCallbacks abv;
    private final com.google.android.gms.common.lient.OnConnectionFailedListener abw;
    private final i abx;
    private final Context mContext;

    public PlusClient build()
    {
        return new PlusClient(new e(mContext, abv, abw, abx.ke()));
    }

    public abx clearScopes()
    {
        abx.kd();
        return this;
    }

    public abx setAccountName(String s)
    {
        abx.bz(s);
        return this;
    }

    public transient abx setActions(String as[])
    {
        abx.f(as);
        return this;
    }

    public transient abx setScopes(String as[])
    {
        abx.e(as);
        return this;
    }

    public nFailedListener(Context context, com.google.android.gms.common.lient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.lient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        abv = connectioncallbacks;
        abw = onconnectionfailedlistener;
        abx = new i(mContext);
    }
}
