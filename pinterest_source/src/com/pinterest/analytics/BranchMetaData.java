// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import android.app.Activity;
import android.content.Intent;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.network.json.PinterestJsonObject;
import io.branch.referral.Branch;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class BranchMetaData
{

    public static PinterestJsonObject a()
    {
        Branch.a();
        return new PinterestJsonObject(Branch.c().toString());
    }

    public static PinterestJsonObject a(Activity activity)
    {
        Branch branch = Branch.a();
        CountDownLatch countdownlatch = new CountDownLatch(1);
        a(branch, activity, countdownlatch);
        try
        {
            countdownlatch.await(10000L, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        return new PinterestJsonObject(Branch.c().toString());
    }

    public static void a(Branch branch, Activity activity, CountDownLatch countdownlatch)
    {
        branch.a(new _cls1(countdownlatch), activity.getIntent().getData(), activity);
    }

    static void a(String s)
    {
        StopWatch.get().complete("INSTALL_REFERRER_DELAY");
        AnalyticsApi.a("install_referrer");
        Preferences.persisted().set("PREF_BRANCH_DATA", s);
        if (Experiments.z())
        {
            Events.post(new PinterestDeepLinkMetaData.MetaDataReceivedEvent());
        }
    }

    public static PinterestJsonObject b()
    {
        return new PinterestJsonObject(Preferences.persisted().getString("PREF_BRANCH_DATA", (new PinterestJsonObject()).toString()));
    }

    private class _cls1
        implements io.branch.referral.Branch.BranchReferralInitListener
    {

        final CountDownLatch a;

        public final void a(JSONObject jsonobject, BranchError brancherror)
        {
            if (a != null)
            {
                a.countDown();
            }
            if (brancherror == null)
            {
                if (jsonobject.optBoolean("+is_first_session", false))
                {
                    BranchMetaData.a(jsonobject.toString());
                }
                if (jsonobject.length() <= 0)
                {
                    PLog.error("Branch metadata is empty.", new Object[0]);
                }
                return;
            } else
            {
                PLog.error((new StringBuilder("Branch metadata not retrieved: ")).append(brancherror.a()).toString(), new Object[0]);
                return;
            }
        }

        _cls1(CountDownLatch countdownlatch)
        {
            a = countdownlatch;
            super();
        }
    }

}
