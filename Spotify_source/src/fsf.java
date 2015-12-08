// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fsf
    implements UserEligibilityRepository, eda
{

    public Resolver a;
    public Handler b;
    private final de c;
    private Set d;
    private PaymentState e;
    private boolean f;
    private boolean g;
    private BroadcastReceiver h;
    private SessionState i;

    public fsf(Resolver resolver, de de1)
    {
        d = new HashSet();
        a = resolver;
        c = de1;
        b = new Handler();
    }

    static void a(fsk fsk1, boolean flag)
    {
        com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel eligibilitylevel;
        if (flag)
        {
            eligibilitylevel = com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.b;
        } else
        {
            eligibilitylevel = com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.c;
        }
        fsk1.a(eligibilitylevel);
    }

    final void a()
    {
        if (g)
        {
            c.a(h);
            g = false;
        }
        fsk fsk1;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); a(fsk1))
        {
            fsk1 = (fsk)iterator.next();
            iterator.remove();
        }

    }

    public final void a(SessionState sessionstate)
    {
        i = sessionstate;
        e = sessionstate.l;
        if (!d.isEmpty() && dtw.a(i.m))
        {
            a();
        }
    }

    public final void a(fsk fsk1)
    {
        boolean flag1 = true;
        if (!f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.values().length];
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[CheckOptInTrialEligibilityTask.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 86
    //                   2 168
    //                   3 204;
           goto _L3 _L4 _L5 _L6
_L3:
        boolean flag = false;
_L9:
        if (flag) goto _L1; else goto _L7
_L7:
        a.resolve(new Request("GET", "sp://ads/v1/targeting"), new com.spotify.cosmos.android.Resolver.CallbackReceiver(b, fsk1) {

            private fsk a;

            protected final void onError(Throwable throwable)
            {
                a.a(com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.c);
            }

            protected final void onResolved(Response response)
            {
                fsk fsk2;
                boolean flag2;
                try
                {
                    if (response.getStatus() != 200)
                    {
                        fsf.a(a, false);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    Logger.c("AdsCore returned an unexpected JSON %s", new Object[] {
                        response.getMessage()
                    });
                    a.a(com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.c);
                    return;
                }
                response = (new JSONObject(new String(response.getBody()))).getJSONArray("targetings").getJSONObject(0);
                fsk2 = a;
                if (!response.has("eligibletrial"))
                {
                    break MISSING_BLOCK_LABEL_104;
                }
                flag2 = response.getBoolean("eligibletrial");
_L1:
                fsf.a(fsk2, flag2);
                return;
                flag2 = true;
                  goto _L1
            }

            
            {
                a = fsk1;
                super(handler);
            }
        });
        return;
_L4:
        if (i != null && dtw.a(i.m)) goto _L3; else goto _L8
_L8:
        d.add(fsk1);
        flag = flag1;
        if (!g)
        {
            h = new BroadcastReceiver() {

                private fsf a;

                public final void onReceive(Context context, Intent intent)
                {
                    a.a();
                }

            
            {
                a = fsf.this;
                super();
            }
            };
            c.a(h, new IntentFilter("opt-in-trial-eligibility-received"));
            g = true;
            flag = flag1;
        }
          goto _L9
_L5:
        if (e != null && !e.c())
        {
            fsk1.a(com.spotify.mobile.android.ui.activity.upsell.repository.UserEligibilityRepository.EligibilityLevel.a);
            flag = flag1;
        } else
        {
            flag = false;
        }
          goto _L9
_L6:
        flag = false;
          goto _L9
    }

    public final void b()
    {
        if (g)
        {
            c.a(h);
            g = false;
        }
        b.removeCallbacksAndMessages(null);
        a.destroy();
        a = null;
        f = true;
    }

    // Unreferenced inner class fsf$2

/* anonymous class */
    public final class _cls2 extends com.spotify.cosmos.android.Resolver.CallbackReceiver
    {

        private fsj a;

        protected final void onError(Throwable throwable)
        {
            (new StringBuilder("Could not retrieve account age. Error resolving was: ")).append(throwable.getMessage());
        }

        protected final void onResolved(Response response)
        {
            try
            {
                if (response.getStatus() != 200)
                {
                    (new StringBuilder("Could not retrieve account age. AdsCore Response code is ")).append(response.getStatus());
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                Logger.c("AdsCore returned an unexpected JSON %s", new Object[] {
                    response.getMessage()
                });
                (new StringBuilder("Could not retrieve account age. Returned JSON was corrupt")).append(response.getMessage());
                return;
            }
            response = (new JSONObject(new String(response.getBody()))).getJSONArray("targetings").getJSONObject(0);
            if (response.has("accountage"))
            {
                a.a(response.getInt("accountage"));
                return;
            }
            (new StringBuilder("Could not find account age in AdsCore Response. Response JSON was:")).append(response.toString());
            return;
        }

            public 
            {
                a = fsj1;
                super(handler);
            }
    }

}
