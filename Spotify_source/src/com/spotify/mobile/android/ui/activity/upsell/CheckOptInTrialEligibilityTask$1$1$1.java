// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import de;
import gey;
import gin;
import gio;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            CheckOptInTrialEligibilityTask

final class a extends JsonHttpCallbackReceiver
{

    private a a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.yTask._cls1._cls1._cls1 _pcls1)
    {
        Logger.a(throwable, "CheckOptInTrialEligibility: Failed checking trial eligibility", new Object[0]);
        CheckOptInTrialEligibilityTask.c(a.a.a).e();
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (ilityResponse)obj;
        boolean flag = response.isViable();
        int i = response.getTrialDurationDays();
        Logger.a("CheckOptInTrialEligibilityTask: backend eligibility retrieved: %s for %s days", new Object[] {
            Boolean.valueOf(flag), Integer.valueOf(i)
        });
        if (flag)
        {
            response = b;
        } else
        {
            response = c;
        }
        CheckOptInTrialEligibilityTask.b(response, CheckOptInTrialEligibilityTask.a(a.a.a), i);
        CheckOptInTrialEligibilityTask.b(a.a.a).a(new Intent("opt-in-trial-eligibility-received"));
        CheckOptInTrialEligibilityTask.c(a.a.a).d();
        CheckOptInTrialEligibilityTask.d(a.a.a).b().a(CheckOptInTrialEligibilityTask.h(), flag).a(CheckOptInTrialEligibilityTask.g(), CheckOptInTrialEligibilityTask.a(a.a.a)).a(CheckOptInTrialEligibilityTask.f(), i).b();
    }

    ilityResponse(ilityResponse ilityresponse, Handler handler, Class class1)
    {
        a = ilityresponse;
        super(handler, class1);
    }

    // Unreferenced inner class com/spotify/mobile/android/ui/activity/upsell/CheckOptInTrialEligibilityTask$1

/* anonymous class */
    final class CheckOptInTrialEligibilityTask._cls1
        implements Runnable
    {

        final CheckOptInTrialEligibilityTask a;

        public final void run()
        {
            Request request = CheckOptInTrialEligibilityTask.e();
            CheckOptInTrialEligibilityTask.e(a).registerConnectionCallback(new CheckOptInTrialEligibilityTask._cls1._cls1(this, request));
            CheckOptInTrialEligibilityTask.e(a).connect();
        }

            
            {
                a = checkoptintrialeligibilitytask;
                super();
            }
    }


    // Unreferenced inner class com/spotify/mobile/android/ui/activity/upsell/CheckOptInTrialEligibilityTask$1$1

/* anonymous class */
    final class CheckOptInTrialEligibilityTask._cls1._cls1
        implements com.spotify.cosmos.android.Resolver.ConnectionCallback
    {

        final CheckOptInTrialEligibilityTask._cls1 a;
        private Request b;

        public final void onServiceConnected(Resolver resolver)
        {
            Logger.a("CheckOptInTrialEligibilityTask: fetching eligibility from backend", new Object[0]);
            resolver.resolve(b, new CheckOptInTrialEligibilityTask._cls1._cls1._cls1(this, new Handler(Looper.getMainLooper()), com/spotify/mobile/android/ui/activity/upsell/CheckOptInTrialEligibilityTask$EligibilityResponse));
        }

        public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
        {
        }

        public final void onServiceDisconnected(Resolver resolver)
        {
        }

            
            {
                a = _pcls1;
                b = request;
                super();
            }
    }

}
