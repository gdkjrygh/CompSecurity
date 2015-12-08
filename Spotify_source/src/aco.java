// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class aco
    implements acs
{

    acr a;
    private ScheduledExecutorService b;
    private act c;
    private ade d;

    public aco(acr acr, ActivityPackage activitypackage, boolean flag)
    {
        b = Executors.newSingleThreadScheduledExecutor();
        c = acl.a();
        if (b != null)
        {
            d = new ade(b, new Runnable() {

                public final void run()
                {
                }

            });
        } else
        {
            c.e("Timer not initialized, attribution handler is disabled", new Object[0]);
        }
        a = acr;
    }

    public final void a()
    {
        a(0L);
    }

    final void a(long l)
    {
        ade ade1 = d;
        long l1;
        if (ade1.b == null)
        {
            l1 = 0L;
        } else
        {
            l1 = ade1.b.getDelay(TimeUnit.MILLISECONDS);
        }
        if (l1 > l)
        {
            return;
        }
        if (l != 0L)
        {
            c.b("Waiting to query attribution in %d milliseconds", new Object[] {
                Long.valueOf(l)
            });
        }
        ade1 = d;
        if (ade1.b != null)
        {
            ade1.b.cancel(false);
        }
        ade1.b = ade1.a.schedule(ade1.c, l, TimeUnit.MILLISECONDS);
    }

    public final void a(JSONObject jsonobject)
    {
        b.submit(new Runnable(jsonobject) {

            private JSONObject a;
            private aco b;

            public final void run()
            {
                aco aco1;
                long l;
label0:
                {
                    aco1 = b;
                    JSONObject jsonobject1 = a;
                    if (jsonobject1 != null)
                    {
                        AdjustAttribution adjustattribution = AdjustAttribution.a(jsonobject1.optJSONObject("attribution"));
                        l = jsonobject1.optLong("ask_in", -1L);
                        if (l >= 0L)
                        {
                            break label0;
                        }
                        aco1.a.a(adjustattribution);
                        aco1.a.b(false);
                    }
                    return;
                }
                aco1.a.b(true);
                aco1.a(l);
            }

            
            {
                b = aco.this;
                a = jsonobject;
                super();
            }
        });
    }
}
