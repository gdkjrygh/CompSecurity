// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.propeller.WriteResult;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.policies:
//            FetchPoliciesCommand, StorePoliciesCommand, LoadTracksForPolicyUpdateCommand

public class PolicyOperations
{

    public static final f FILTER_MONETIZABLE = new _cls2();
    public static final long POLICY_STALE_AGE_MILLISECONDS;
    private static final String TAG = com/soundcloud/android/policies/PolicyOperations.getSimpleName();
    public static final f TO_TRACK_URN = new _cls1();
    private final FetchPoliciesCommand fetchPoliciesCommand;
    private final LoadTracksForPolicyUpdateCommand loadTracksForPolicyUpdateCommand;
    private final R scheduler;
    private final StorePoliciesCommand storePoliciesCommand;

    PolicyOperations(FetchPoliciesCommand fetchpoliciescommand, StorePoliciesCommand storepoliciescommand, LoadTracksForPolicyUpdateCommand loadtracksforpolicyupdatecommand, R r)
    {
        fetchPoliciesCommand = fetchpoliciescommand;
        storePoliciesCommand = storepoliciescommand;
        scheduler = r;
        loadTracksForPolicyUpdateCommand = loadtracksforpolicyupdatecommand;
    }

    private b fetchAndStorePolicies(Collection collection)
    {
        return ((FetchPoliciesCommand)fetchPoliciesCommand.with(collection)).toObservable().subscribeOn(scheduler).doOnNext(storePoliciesCommand.toAction());
    }

    public b filterMonetizableTracks(Collection collection)
    {
        return fetchAndStorePolicies(collection).flatMap(RxUtils.emitCollectionItems()).filter(FILTER_MONETIZABLE).map(TO_TRACK_URN).toList();
    }

    public b updatePolicies(Collection collection)
    {
        return fetchAndStorePolicies(collection).map(RxUtils.TO_VOID);
    }

    public List updateTrackPolicies()
    {
        List list;
        Collection collection;
        list = loadTracksForPolicyUpdateCommand.call(null);
        collection = ((FetchPoliciesCommand)fetchPoliciesCommand.with(list)).call();
        if (((WriteResult)storePoliciesCommand.call(collection)).success())
        {
            return list;
        }
        try
        {
            list = Collections.emptyList();
        }
        catch (Exception exception)
        {
            return Collections.emptyList();
        }
        return list;
    }

    static 
    {
        POLICY_STALE_AGE_MILLISECONDS = TimeUnit.HOURS.toMillis(24L);
    }

    private class _cls1
        implements f
    {

        public final Urn call(ApiPolicyInfo apipolicyinfo)
        {
            return apipolicyinfo.getUrn();
        }

        public final volatile Object call(Object obj)
        {
            return call((ApiPolicyInfo)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Boolean call(ApiPolicyInfo apipolicyinfo)
        {
            boolean flag;
            if (!apipolicyinfo.isMonetizable())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((ApiPolicyInfo)obj);
        }

        _cls2()
        {
        }
    }

}
