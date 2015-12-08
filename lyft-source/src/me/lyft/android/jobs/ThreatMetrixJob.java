// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import com.threatmetrix.TrustDefenderMobile.Config;
import com.threatmetrix.TrustDefenderMobile.EndNotifier;
import com.threatmetrix.TrustDefenderMobile.ProfilingOptions;
import com.threatmetrix.TrustDefenderMobile.ProfilingResult;
import com.threatmetrix.TrustDefenderMobile.THMStatusCode;
import com.threatmetrix.TrustDefenderMobile.TrustDefenderMobile;
import me.lyft.android.LyftApplication;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.GoogleLocationMapper;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class ThreatMetrixJob
    implements Job
{

    ILocationService locationService;
    LyftApplication lyftApplication;
    private TrustDefenderMobile trustDefenderMobile;
    private final UserDTO user;

    public ThreatMetrixJob(UserDTO userdto)
    {
        user = userdto;
    }

    public void execute()
    {
        trustDefenderMobile = new TrustDefenderMobile(lyftApplication.getString(0x7f070369));
        trustDefenderMobile.a((new Config()).a(true).a(lyftApplication).a(new EndNotifier() {

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
                trustDefenderMobile.a(0);
                trustDefenderMobile.d();
            }

            
            {
                this$0 = ThreatMetrixJob.this;
                super();
            }
        }));
        locationService.getLastLocation().subscribe(new SimpleSubscriber() {

            final ThreatMetrixJob this$0;

            public volatile void onNext(Object obj)
            {
                onNext((Location)obj);
            }

            public void onNext(Location location)
            {
                super.onNext(location);
                trustDefenderMobile.a((new ProfilingOptions()).a(user.getId()).a(GoogleLocationMapper.toAndroidLocation(location)));
            }

            
            {
                this$0 = ThreatMetrixJob.this;
                super();
            }
        });
    }


}
