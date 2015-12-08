// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.threatmetrix.TrustDefenderMobile.EndNotifier;
import com.threatmetrix.TrustDefenderMobile.ProfilingResult;
import com.threatmetrix.TrustDefenderMobile.THMStatusCode;
import com.threatmetrix.TrustDefenderMobile.TrustDefenderMobile;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.jobs:
//            ThreatMetrixJob

class this._cls0
    implements EndNotifier
{

    final ThreatMetrixJob this$0;

    public void complete(ProfilingResult profilingresult)
    {
        if (profilingresult.b() == THMStatusCode.b)
        {
            L.d("TrustDefender profiling successfully for session id=%s", new Object[] {
                profilingresult.a()
            });
        } else
        {
            L.e((new StringBuilder()).append("TrustDefender profiling failed with status: ").append(profilingresult).toString(), new Object[0]);
        }
        ThreatMetrixJob.access$000(ThreatMetrixJob.this).a(0);
        ThreatMetrixJob.access$000(ThreatMetrixJob.this).d();
    }

    ofilingResult()
    {
        this$0 = ThreatMetrixJob.this;
        super();
    }
}
