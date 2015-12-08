// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appstate;

import android.content.Context;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateClient

public static final class it
{

    private static final String ip[] = {
        "https://www.googleapis.com/auth/appstate"
    };
    private com.google.android.gms.common.t.ConnectionCallbacks iq;
    private com.google.android.gms.common.t.OnConnectionFailedListener ir;
    private String is[];
    private String it;
    private Context mContext;

    public AppStateClient create()
    {
        return new AppStateClient(mContext, iq, ir, it, is, null);
    }

    public ner setAccountName(String s)
    {
        it = (String)dm.e(s);
        return this;
    }

    public transient it setScopes(String as[])
    {
        is = as;
        return this;
    }


    public ner(Context context, com.google.android.gms.common.t.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.t.OnConnectionFailedListener onconnectionfailedlistener)
    {
        mContext = context;
        iq = connectioncallbacks;
        ir = onconnectionfailedlistener;
        is = ip;
        it = "<<default account>>";
    }
}
