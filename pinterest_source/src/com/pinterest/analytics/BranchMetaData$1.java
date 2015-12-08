// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.kit.log.PLog;
import io.branch.referral.BranchError;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

// Referenced classes of package com.pinterest.analytics:
//            BranchMetaData

final class a
    implements io.branch.referral.rralInitListener
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

    nitListener(CountDownLatch countdownlatch)
    {
        a = countdownlatch;
        super();
    }
}
