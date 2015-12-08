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

    private final com.google.android.gms.common.lient.ConnectionCallbacks ali;
    private final com.google.android.gms.common.lient.OnConnectionFailedListener alj;
    private final i alk;
    private final Context mContext;

    public PlusClient build()
    {
        return new PlusClient(new e(mContext, ali, alj, alk.nq()));
    }

    public alk clearScopes()
    {
        alk.np();
        return this;
    }

    public alk setAccountName(String s)
    {
        alk.ch(s);
        return this;
    }

    public transient alk setActions(String as[])
    {
        alk.h(as);
        return this;
    }

    public transient alk setScopes(String as[])
    {
        alk.g(as);
        return this;
    }

    public nFailedListener(Context context, com.google.android.gms.common.lient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.lient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        ali = connectioncallbacks;
        alj = onconnectionfailedlistener;
        alk = new i(mContext);
    }
}
