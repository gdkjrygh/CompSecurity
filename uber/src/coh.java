// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.LocationManager;
import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;
import com.ubercab.android.partner.funnel.onboarding.network.OnboardingApi;
import com.ubercab.android.partner.funnel.signup.network.SignupApi;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import retrofit.RequestInterceptor;
import retrofit.converter.GsonConverter;

public final class coh
{

    private final PartnerFunnelActivity a;
    private boolean b;

    protected coh(PartnerFunnelActivity partnerfunnelactivity, boolean flag)
    {
        a = partnerfunnelactivity;
        b = flag;
    }

    public static cts a(gqn gqn, ExecutorService executorservice, bjw bjw, RequestInterceptor requestinterceptor)
    {
        return new cts((OnboardingApi)(new grt(gqn)).a(new GsonConverter(bjw)).a(executorservice, executorservice).a(requestinterceptor).a().a(com/ubercab/android/partner/funnel/onboarding/network/OnboardingApi));
    }

    public static cvf a(hjo hjo)
    {
        return cvf.a(hjo);
    }

    public static cwj b(gqn gqn, ExecutorService executorservice, bjw bjw, RequestInterceptor requestinterceptor)
    {
        return new cwj((SignupApi)(new grt(gqn)).a(new GsonConverter(bjw)).a(executorservice, executorservice).a(requestinterceptor).a().a(com/ubercab/android/partner/funnel/signup/network/SignupApi));
    }

    public final PartnerFunnelActivity a()
    {
        return a;
    }

    public final Collection a(cqy cqy)
    {
        return cqx.a(cqy, a);
    }

    public final cqg b()
    {
        return new cqg(a);
    }

    final LocationManager c()
    {
        return (LocationManager)a.getSystemService("location");
    }

    public final boolean d()
    {
        return b;
    }
}
