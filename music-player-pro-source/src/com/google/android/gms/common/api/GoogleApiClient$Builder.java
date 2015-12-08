// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, g, c, Api, 
//            Scope

public static final class JQ
{

    private String DZ;
    private Looper JF;
    private final Set JH;
    private int JI;
    private View JJ;
    private String JK;
    private final Map JL;
    private FragmentActivity JM;
    private int JN;
    private tionFailedListener JO;
    private final Set JP;
    private final Set JQ;
    private final Context mContext;

    private GoogleApiClient gI()
    {
        g g1 = g.a(JM);
        GoogleApiClient googleapiclient = g1.an(JN);
        Object obj = googleapiclient;
        if (googleapiclient == null)
        {
            obj = new c(mContext.getApplicationContext(), JF, gH(), JL, JP, JQ, JN);
        }
        g1.a(JN, ((GoogleApiClient) (obj)), JO);
        return ((GoogleApiClient) (obj));
    }

    public JO addApi(Api api)
    {
        JL.put(api, null);
        api = api.gy();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            JH.add(((Scope)api.get(i)).gO());
        }

        return this;
    }

    public s addApi(Api api, s s)
    {
        jx.b(s, "Null options are not permitted for this Api");
        JL.put(api, s);
        api = api.gy();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            JH.add(((Scope)api.get(i)).gO());
        }

        return this;
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        JP.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        JQ.add(tionfailedlistener);
        return this;
    }

    public JQ addScope(Scope scope)
    {
        JH.add(scope.gO());
        return this;
    }

    public GoogleApiClient build()
    {
        boolean flag;
        if (!JL.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "must call addApi() to add at least one API");
        if (JN >= 0)
        {
            return gI();
        } else
        {
            return new c(mContext, JF, gH(), JL, JP, JQ, -1);
        }
    }

    public tionFailedListener enableAutoManage(FragmentActivity fragmentactivity, int i, tionFailedListener tionfailedlistener)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "clientId must be non-negative");
        JN = i;
        JM = (FragmentActivity)jx.b(fragmentactivity, "Null activity is not permitted.");
        JO = tionfailedlistener;
        return this;
    }

    public jg gH()
    {
        return new jg(DZ, JH, JI, JJ, JK);
    }

    public JK setAccountName(String s)
    {
        DZ = s;
        return this;
    }

    public DZ setGravityForPopups(int i)
    {
        JI = i;
        return this;
    }

    public JI setHandler(Handler handler)
    {
        jx.b(handler, "Handler must not be null");
        JF = handler.getLooper();
        return this;
    }

    public JF setViewForPopups(View view)
    {
        JJ = view;
        return this;
    }

    public JJ useDefaultAccount()
    {
        return setAccountName("<<default account>>");
    }

    public tionFailedListener(Context context)
    {
        JH = new HashSet();
        JL = new HashMap();
        JN = -1;
        JP = new HashSet();
        JQ = new HashSet();
        mContext = context;
        JF = context.getMainLooper();
        JK = context.getPackageName();
    }

    public tionFailedListener(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
    {
        this(context);
        jx.b(oncallbacks, "Must provide a connected listener");
        JP.add(oncallbacks);
        jx.b(tionfailedlistener, "Must provide a connection failed listener");
        JQ.add(tionfailedlistener);
    }
}
