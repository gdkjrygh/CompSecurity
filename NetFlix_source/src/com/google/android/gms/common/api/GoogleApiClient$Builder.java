// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Scope, b

public static final class AZ
{

    private Looper AS;
    private final Set AT;
    private int AU;
    private View AV;
    private String AW;
    private final Map AX;
    private final Set AY;
    private final Set AZ;
    private final Context mContext;
    private String wG;

    public AZ addApi(Api api)
    {
        AX.put(api, null);
        api = api.dZ();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            AT.add(((Scope)api.get(i)).en());
        }

        return this;
    }

    public s addApi(Api api, s s)
    {
        fq.b(s, "Null options are not permitted for this Api");
        AX.put(api, s);
        api = api.dZ();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            AT.add(((Scope)api.get(i)).en());
        }

        return this;
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        AY.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        AZ.add(tionfailedlistener);
        return this;
    }

    public AZ addScope(Scope scope)
    {
        AT.add(scope.en());
        return this;
    }

    public GoogleApiClient build()
    {
        return new b(mContext, AS, eh(), AX, AY, AZ);
    }

    public fc eh()
    {
        return new fc(wG, AT, AU, AV, AW);
    }

    public AW setAccountName(String s)
    {
        wG = s;
        return this;
    }

    public wG setGravityForPopups(int i)
    {
        AU = i;
        return this;
    }

    public AU setHandler(Handler handler)
    {
        fq.b(handler, "Handler must not be null");
        AS = handler.getLooper();
        return this;
    }

    public AS setViewForPopups(View view)
    {
        AV = view;
        return this;
    }

    public AV useDefaultAccount()
    {
        return setAccountName("<<default account>>");
    }

    public tionFailedListener(Context context)
    {
        AT = new HashSet();
        AX = new HashMap();
        AY = new HashSet();
        AZ = new HashSet();
        mContext = context;
        AS = context.getMainLooper();
        AW = context.getPackageName();
    }

    public tionFailedListener(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
    {
        this(context);
        fq.b(oncallbacks, "Must provide a connected listener");
        AY.add(oncallbacks);
        fq.b(tionfailedlistener, "Must provide a connection failed listener");
        AZ.add(tionfailedlistener);
    }
}
