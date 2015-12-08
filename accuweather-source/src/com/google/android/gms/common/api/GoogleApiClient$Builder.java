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
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, d, Api, Scope, 
//            c

public static final class DM
{

    private Looper DC;
    private final Set DE;
    private int DF;
    private View DG;
    private String DH;
    private final Map DI;
    private FragmentActivity DJ;
    private tionFailedListener DK;
    private final Set DL;
    private final Set DM;
    private final Context mContext;
    private String yN;

    private d eE()
    {
        FragmentManager fragmentmanager;
label0:
        {
            fragmentmanager = DJ.getSupportFragmentManager();
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
        DI.put(api, null);
        api = api.ev();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            DE.add(((Scope)api.get(i)).eK());
        }

        return this;
    }

    public s addApi(Api api, s s)
    {
        hn.b(s, "Null options are not permitted for this Api");
        DI.put(api, s);
        api = api.ev();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            DE.add(((Scope)api.get(i)).eK());
        }

        return this;
    }

    public onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        DL.add(oncallbacks);
        return this;
    }

    public tionFailedListener addOnConnectionFailedListener(tionFailedListener tionfailedlistener)
    {
        DM.add(tionfailedlistener);
        return this;
    }

    public DM addScope(Scope scope)
    {
        DE.add(scope.eK());
        return this;
    }

    public GoogleApiClient build()
    {
        d d1;
        c c1;
        boolean flag;
        if (!DI.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "must call addApi() to add at least one API");
        d1 = null;
        if (DJ != null)
        {
            d1 = eE();
        }
        c1 = new c(mContext, DC, eD(), DI, d1, DL, DM);
        if (d1 != null)
        {
            d1.a(c1, DK);
        }
        return c1;
    }

    public gz eD()
    {
        return new gz(yN, DE, DF, DG, DH);
    }

    public tionFailedListener enableAutoManage(FragmentActivity fragmentactivity, tionFailedListener tionfailedlistener)
    {
        DJ = (FragmentActivity)hn.b(fragmentactivity, "Null activity is not permitted.");
        DK = tionfailedlistener;
        return this;
    }

    public DK setAccountName(String s)
    {
        yN = s;
        return this;
    }

    public yN setGravityForPopups(int i)
    {
        DF = i;
        return this;
    }

    public DF setHandler(Handler handler)
    {
        hn.b(handler, "Handler must not be null");
        DC = handler.getLooper();
        return this;
    }

    public DC setViewForPopups(View view)
    {
        DG = view;
        return this;
    }

    public DG useDefaultAccount()
    {
        return setAccountName("<<default account>>");
    }

    public tionFailedListener(Context context)
    {
        DE = new HashSet();
        DI = new HashMap();
        DL = new HashSet();
        DM = new HashSet();
        mContext = context;
        DC = context.getMainLooper();
        DH = context.getPackageName();
    }

    public tionFailedListener(Context context, onCallbacks oncallbacks, tionFailedListener tionfailedlistener)
    {
        this(context);
        hn.b(oncallbacks, "Must provide a connected listener");
        DL.add(oncallbacks);
        hn.b(tionfailedlistener, "Must provide a connection failed listener");
        DM.add(tionfailedlistener);
    }
}
