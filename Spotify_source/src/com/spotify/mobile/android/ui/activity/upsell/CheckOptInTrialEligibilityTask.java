// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import de;
import dmz;
import fnu;
import fnv;
import gcz;
import gey;
import gez;
import gfb;
import gfd;
import gfe;
import gin;
import gio;
import gip;
import giq;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class CheckOptInTrialEligibilityTask
{

    public static final gip b = gip.b("check_optin_trial_eligibility");
    public static final gip c = gip.b("check_optin_trial_eligibility_username");
    public static final gip d = gip.b("check_optin_trial_eligibility_duration");
    public static State e;
    public static String f;
    public static int g;
    public static boolean h;
    public static boolean i;
    public final de a;
    public final String j;
    public final gin k;
    public final gey l;
    public fnu m;
    private final Resolver n;
    private final Runnable o = new Runnable() {

        final CheckOptInTrialEligibilityTask a;

        public final void run()
        {
            Request request = CheckOptInTrialEligibilityTask.e();
            CheckOptInTrialEligibilityTask.e(a).registerConnectionCallback(new com.spotify.cosmos.android.Resolver.ConnectionCallback(this, request) {

                final _cls1 a;
                private Request b;

                public final void onServiceConnected(Resolver resolver)
                {
                    Logger.a("CheckOptInTrialEligibilityTask: fetching eligibility from backend", new Object[0]);
                    resolver.resolve(b, new JsonHttpCallbackReceiver(this, new Handler(Looper.getMainLooper()), com/spotify/mobile/android/ui/activity/upsell/CheckOptInTrialEligibilityTask$EligibilityResponse) {

                        private _cls1 a;

                        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                        {
                            Logger.a(throwable, "CheckOptInTrialEligibility: Failed checking trial eligibility", new Object[0]);
                            CheckOptInTrialEligibilityTask.c(a.a.a).e();
                        }

                        protected final void onResolved(Response response, Object obj)
                        {
                            response = (EligibilityResponse)obj;
                            boolean flag = response.isViable();
                            int i1 = response.getTrialDurationDays();
                            Logger.a("CheckOptInTrialEligibilityTask: backend eligibility retrieved: %s for %s days", new Object[] {
                                Boolean.valueOf(flag), Integer.valueOf(i1)
                            });
                            if (flag)
                            {
                                response = State.b;
                            } else
                            {
                                response = State.c;
                            }
                            CheckOptInTrialEligibilityTask.b(response, CheckOptInTrialEligibilityTask.a(a.a.a), i1);
                            CheckOptInTrialEligibilityTask.b(a.a.a).a(new Intent("opt-in-trial-eligibility-received"));
                            CheckOptInTrialEligibilityTask.c(a.a.a).d();
                            CheckOptInTrialEligibilityTask.d(a.a.a).b().a(CheckOptInTrialEligibilityTask.h(), flag).a(CheckOptInTrialEligibilityTask.g(), CheckOptInTrialEligibilityTask.a(a.a.a)).a(CheckOptInTrialEligibilityTask.f(), i1).b();
                        }

            
            {
                a = _pcls1;
                super(handler, class1);
            }

                        private class EligibilityResponse
                            implements JacksonModel
                        {

                            private final int mTrialDuration;
                            private final boolean mViable;

                            public int getTrialDurationDays()
                            {
                                return mTrialDuration;
                            }

                            public boolean isViable()
                            {
                                return mViable;
                            }

                            public EligibilityResponse(boolean flag, int i1)
                            {
                                mViable = flag;
                                mTrialDuration = i1;
                            }
                        }

                    });
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
            });
            CheckOptInTrialEligibilityTask.e(a).connect();
        }

            
            {
                a = CheckOptInTrialEligibilityTask.this;
                super();
            }
    };

    public CheckOptInTrialEligibilityTask(Context context, String s, de de)
    {
        m = fnv.a;
        j = (String)ctz.a(s);
        k = ((giq)dmz.a(giq)).b(context);
        n = Cosmos.getResolver(context);
        a = de;
        context = new gez("check-optin-trial-eligibility", o);
        context.a = new gfd(100L, TimeUnit.MILLISECONDS);
        context.c = new gfb(400L, TimeUnit.MILLISECONDS);
        context.d = 10;
        context.e = new gfe(5L, 7L, TimeUnit.HOURS);
        l = context.a();
    }

    public static State a()
    {
        return e;
    }

    static String a(CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask)
    {
        return checkoptintrialeligibilitytask.j;
    }

    public static String a(String s)
    {
        return s;
    }

    public static void a(State state, String s, int i1)
    {
        if (state == State.a)
        {
            return;
        } else
        {
            Logger.a("Got trial eligibility: %s (was %s) %d days (from backend)", new Object[] {
                state, e, Integer.valueOf(i1)
            });
            e = state;
            f = s;
            g = i1;
            h = true;
            return;
        }
    }

    public static int b()
    {
        return g;
    }

    static de b(CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask)
    {
        return checkoptintrialeligibilitytask.a;
    }

    static void b(State state, String s, int i1)
    {
        a(state, s, i1);
    }

    static gey c(CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask)
    {
        return checkoptintrialeligibilitytask.l;
    }

    public static void c()
    {
        e = State.a;
        f = null;
        g = 0;
        h = false;
        i = true;
    }

    static gin d(CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask)
    {
        return checkoptintrialeligibilitytask.k;
    }

    static Resolver e(CheckOptInTrialEligibilityTask checkoptintrialeligibilitytask)
    {
        return checkoptintrialeligibilitytask.n;
    }

    static Request e()
    {
        Object obj = (gcz)dmz.a(gcz);
        obj = String.format(Locale.US, "{\"trial\":\"opt-in\", \"device_id\":\"%s\"}", new Object[] {
            ((gcz) (obj)).e()
        });
        return new Request("GET", "hm://login-trial/v2/viable", new HashMap(), ((String) (obj)).getBytes());
    }

    static gip f()
    {
        return d;
    }

    static gip g()
    {
        return c;
    }

    static gip h()
    {
        return b;
    }

    public final void d()
    {
        if (l.c)
        {
            l.c();
        }
        n.destroy();
    }

    static 
    {
        e = State.a;
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/ui/activity/upsell/CheckOptInTrialEligibilityTask$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("UNKNOWN", 0);
            b = new State("ELIGIBLE", 1);
            c = new State("NOT_ELIGIBLE", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

}
