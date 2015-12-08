// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.PendingPlan;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.WeightGoal;
import com.fitbit.data.repo.am;
import com.fitbit.e.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.weight.Weight;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs, t, an, 
//            aq

public class co extends e
{

    private static final String a = "SyncFoodPlanOperation";

    public co(bs bs1, boolean flag, boolean flag1)
    {
        super(bs1, flag, flag1);
    }

    protected java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a()
    {
        return null;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        e().a(true);
        i().lock();
        a1 = com.fitbit.data.bl.t.a();
        obj = a1.d();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.fitbit.e.a.a("SaveFoodPlan", "Pending plan is null... skipping saving food plan", new Object[0]);
        e().a(false);
        i().unlock();
        return;
        Profile profile;
        a1 = a1.b(((PendingPlan) (obj)));
        obj = ((PendingPlan) (obj)).a();
        profile = com.fitbit.data.bl.an.a().b();
        profile.a(((DietPlan) (obj)));
        profile.setTimeUpdated(new Date());
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        e().a().a(new Date(), ((Weight)a1.d()).a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b(), ((Weight)a1.j()).a(com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG).b());
        com.fitbit.data.bl.t.a().a(a1);
        ((DietPlan) (obj)).a(e().a().a(null, ((DietPlan) (obj)).d().getApiName(), null));
        com.fitbit.data.bl.aq.a().i().save(profile);
        e().a(false);
        i().unlock();
        return;
        a1;
        e().a(false);
        i().unlock();
        throw a1;
    }

    public String c()
    {
        return "SyncFoodPlanOperation";
    }
}
