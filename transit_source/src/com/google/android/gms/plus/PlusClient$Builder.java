// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.plus:
//            PlusClient

public static class mContext
{

    private final com.google.android.gms.common.lient.OnConnectionFailedListener ir;
    private final Context mContext;
    private final com.google.android.gms.common.lient.ConnectionCallbacks rc;
    private final fo rd;

    public PlusClient build()
    {
        return new PlusClient(new fl(mContext, rd.dh(), rc, ir));
    }

    public ir clearScopes()
    {
        rd.dg();
        return this;
    }

    public rd setAccountName(String s)
    {
        rd.Z(s);
        return this;
    }

    public transient rd setActions(String as[])
    {
        rd.e(as);
        return this;
    }

    public transient rd setScopes(String as[])
    {
        rd.d(as);
        return this;
    }

    public nFailedListener(Context context, com.google.android.gms.common.lient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.lient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        rc = connectioncallbacks;
        ir = onconnectionfailedlistener;
        rd = new fo(mContext);
    }
}
