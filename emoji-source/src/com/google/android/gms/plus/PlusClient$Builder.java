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

    private final i abA;
    private final com.google.android.gms.common.lient.ConnectionCallbacks aby;
    private final com.google.android.gms.common.lient.OnConnectionFailedListener abz;
    private final Context mContext;

    public PlusClient build()
    {
        return new PlusClient(new e(mContext, aby, abz, abA.kj()));
    }

    public abA clearScopes()
    {
        abA.ki();
        return this;
    }

    public abA setAccountName(String s)
    {
        abA.bz(s);
        return this;
    }

    public transient abA setActions(String as[])
    {
        abA.f(as);
        return this;
    }

    public transient abA setScopes(String as[])
    {
        abA.e(as);
        return this;
    }

    public nFailedListener(Context context, com.google.android.gms.common.lient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.lient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        aby = connectioncallbacks;
        abz = onconnectionfailedlistener;
        abA = new i(mContext);
    }
}
