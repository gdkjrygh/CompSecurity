// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.games:
//            GamesClient

public static final class ir
{

    private final com.google.android.gms.common.ient.ConnectionCallbacks iq;
    private final com.google.android.gms.common.ient.OnConnectionFailedListener ir;
    private String is[] = {
        "https://www.googleapis.com/auth/games"
    };
    private String it;
    private String mA;
    private int mB;
    private View mC;
    private final Context mContext;

    public GamesClient create()
    {
        return new GamesClient(mContext, mA, it, iq, ir, is, mB, mC, null);
    }

    public iledListener setAccountName(String s)
    {
        it = (String)dm.e(s);
        return this;
    }

    public it setGravityForPopups(int i)
    {
        mB = i;
        return this;
    }

    public transient mB setScopes(String as[])
    {
        is = as;
        return this;
    }

    public is setViewForPopups(View view)
    {
        mC = (View)dm.e(view);
        return this;
    }

    public iledListener(Context context, com.google.android.gms.common.ient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.ient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        it = "<<default account>>";
        mB = 49;
        mContext = context;
        mA = context.getPackageName();
        iq = connectioncallbacks;
        ir = onconnectionfailedlistener;
    }
}
