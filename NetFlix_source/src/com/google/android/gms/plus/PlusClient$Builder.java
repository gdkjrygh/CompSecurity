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

    private final com.google.android.gms.common.lient.ConnectionCallbacks TQ;
    private final com.google.android.gms.common.lient.OnConnectionFailedListener TR;
    private final i TS;
    private final Context mContext;

    public PlusClient build()
    {
        return new PlusClient(new e(mContext, TQ, TR, TS.iZ()));
    }

    public TS clearScopes()
    {
        TS.iY();
        return this;
    }

    public TS setAccountName(String s)
    {
        TS.bh(s);
        return this;
    }

    public transient TS setActions(String as[])
    {
        TS.f(as);
        return this;
    }

    public transient TS setScopes(String as[])
    {
        TS.e(as);
        return this;
    }

    public nFailedListener(Context context, com.google.android.gms.common.lient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.lient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        TQ = connectioncallbacks;
        TR = onconnectionfailedlistener;
        TS = new i(mContext);
    }
}
