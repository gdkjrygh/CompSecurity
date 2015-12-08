// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, d, b, Api, 
//            Scope

public static final class IT
{

    private String Dd;
    private Looper IH;
    private final Set IJ;
    private int IK;
    private View IL;
    private String IM;
    private final Map IN;
    private FragmentActivity IO;
    private int IP;
    private tionFailedListener IQ;
    private int IR;
    private final Set IS;
    private final Set IT;
    private final Context mContext;

    private GoogleApiClient gl()
    {
        d d1 = d.a(IO);
        GoogleApiClient googleapiclient = d1.ak(IP);
        Object obj = googleapiclient;
        if (googleapiclient == null)
        {
            obj = new b(mContext.getApplicationContext(), IH, gk(), IN, IS, IT, IP, IR);
        }
        d1.a(IP, ((GoogleApiClient) (obj)), IQ);
        return ((GoogleApiClient) (obj));
    }

    public IQ addApi(Api api)
    {
        IN.put(api, null);
        api = api.gd();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            IJ.add(((Scope)api.get(i)).gs());
        }

        return this;
    }

    public s addApi(Api api, s s)
    {
        o.b(s, "Null options are not permitted for this Api");
        IN.put(api, s);
        api = api.gd();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            IJ.add(((Scope)api.get(i)).gs());
        }

        return this;
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        IS.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        IT.add(tionfailedlistener);
        return this;
    }

    public IT addScope(Scope scope)
    {
        IJ.add(scope.gs());
        return this;
    }

    public GoogleApiClient build()
    {
        boolean flag;
        if (!IN.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "must call addApi() to add at least one API");
        if (IP >= 0)
        {
            return gl();
        } else
        {
            return new b(mContext, IH, gk(), IN, IS, IT, -1, IR);
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
        o.b(flag, "clientId must be non-negative");
        IP = i;
        IO = (FragmentActivity)o.b(fragmentactivity, "Null activity is not permitted.");
        IQ = tionfailedlistener;
        return this;
    }

    public ClientSettings gk()
    {
        return new ClientSettings(Dd, IJ, IK, IL, IM);
    }

    public IM setAccountName(String s)
    {
        Dd = s;
        return this;
    }

    public Dd setGravityForPopups(int i)
    {
        IK = i;
        return this;
    }

    public IK setHandler(Handler handler)
    {
        o.b(handler, "Handler must not be null");
        IH = handler.getLooper();
        return this;
    }

    public IH setViewForPopups(View view)
    {
        IL = view;
        return this;
    }

    public IL useDefaultAccount()
    {
        return setAccountName("<<default account>>");
    }

    public tionFailedListener(Context context)
    {
        IJ = new HashSet();
        IN = new HashMap();
        IP = -1;
        IR = 2;
        IS = new HashSet();
        IT = new HashSet();
        mContext = context;
        IH = context.getMainLooper();
        IM = context.getPackageName();
    }

    public tionFailedListener(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
    {
        this(context);
        o.b(oncallbacks, "Must provide a connected listener");
        IS.add(oncallbacks);
        o.b(tionfailedlistener, "Must provide a connection failed listener");
        IT.add(tionfailedlistener);
    }
}
