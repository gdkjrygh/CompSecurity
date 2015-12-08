// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, d, Api, Scope, 
//            c

public static final class DP
{

    private Looper DF;
    private final Set DH;
    private int DI;
    private View DJ;
    private String DK;
    private final Map DL;
    private FragmentActivity DM;
    private tionFailedListener DN;
    private final Set DO;
    private final Set DP;
    private final Context mContext;
    private String yQ;

    private d eJ()
    {
        FragmentManager fragmentmanager;
label0:
        {
            fragmentmanager = DM.getSupportFragmentManager();
            if (fragmentmanager.getFragments() == null)
            {
                break label0;
            }
            Iterator iterator = fragmentmanager.getFragments().iterator();
            Fragment fragment;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                fragment = (Fragment)iterator.next();
            } while (!(fragment instanceof d) || !fragment.isAdded() || ((d)fragment).isInitialized());
            return (d)fragment;
        }
        d d1 = new d();
        fragmentmanager.beginTransaction().add(d1, null).commit();
        return d1;
    }

    public Manager addApi(Api api)
    {
        DL.put(api, null);
        api = api.eA();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            DH.add(((Scope)api.get(i)).eP());
        }

        return this;
    }

    public s addApi(Api api, s s)
    {
        hm.b(s, "Null options are not permitted for this Api");
        DL.put(api, s);
        api = api.eA();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            DH.add(((Scope)api.get(i)).eP());
        }

        return this;
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        DO.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        DP.add(tionfailedlistener);
        return this;
    }

    public DP addScope(Scope scope)
    {
        DH.add(scope.eP());
        return this;
    }

    public GoogleApiClient build()
    {
        d d1;
        c c1;
        boolean flag;
        if (!DL.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "must call addApi() to add at least one API");
        d1 = null;
        if (DM != null)
        {
            d1 = eJ();
        }
        c1 = new c(mContext, DF, eI(), DL, d1, DO, DP);
        if (d1 != null)
        {
            d1.a(c1, DN);
        }
        return c1;
    }

    public gy eI()
    {
        return new gy(yQ, DH, DI, DJ, DK);
    }

    public tionFailedListener enableAutoManage(FragmentActivity fragmentactivity, tionFailedListener tionfailedlistener)
    {
        DM = (FragmentActivity)hm.b(fragmentactivity, "Null activity is not permitted.");
        DN = tionfailedlistener;
        return this;
    }

    public DN setAccountName(String s)
    {
        yQ = s;
        return this;
    }

    public yQ setGravityForPopups(int i)
    {
        DI = i;
        return this;
    }

    public DI setHandler(Handler handler)
    {
        hm.b(handler, "Handler must not be null");
        DF = handler.getLooper();
        return this;
    }

    public DF setViewForPopups(View view)
    {
        DJ = view;
        return this;
    }

    public DJ useDefaultAccount()
    {
        return setAccountName("<<default account>>");
    }

    public tionFailedListener(Context context)
    {
        DH = new HashSet();
        DL = new HashMap();
        DO = new HashSet();
        DP = new HashSet();
        mContext = context;
        DF = context.getMainLooper();
        DK = context.getPackageName();
    }

    public tionFailedListener(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
    {
        this(context);
        hm.b(oncallbacks, "Must provide a connected listener");
        DO.add(oncallbacks);
        hm.b(tionfailedlistener, "Must provide a connection failed listener");
        DP.add(tionfailedlistener);
    }
}
