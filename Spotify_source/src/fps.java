// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

public final class fps extends Observable
{

    public static final long a;
    public final Handler b;
    public final fqa c;
    public boolean d;
    private final gcf e;

    public fps(Handler handler, fqa fqa1, gcf gcf1)
    {
        b = handler;
        c = fqa1;
        e = gcf1;
    }

    static gcf a(fps fps1)
    {
        return fps1.e;
    }

    private void a(com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup, long l, boolean flag)
    {
        if (d)
        {
            Assertion.b("Attempted to schedule store refresh with destroyed store control");
            return;
        } else
        {
            long l1 = gcf.a();
            l = Math.max(l1, l);
            long l2 = gcf.c();
            b.removeCallbacksAndMessages(reasongroup);
            b.postAtTime(new Runnable(reasongroup, flag) {

                private com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup a;
                private boolean b;
                private fps c;

                public final void run()
                {
                    fps.a(c, a, b);
                }

            
            {
                c = fps.this;
                a = reasongroup;
                b = flag;
                super();
            }
            }, reasongroup, (l - l1) + l2);
            return;
        }
    }

    static void a(fps fps1, DynamicUpsellConfig dynamicupsellconfig, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        if (fps1.d)
        {
            Logger.c("Received configuration callback but store control is destroyed", new Object[0]);
            return;
        }
        long l1 = dynamicupsellconfig.findEarliestExpiry(reasongroup);
        long l = l1;
        if (l1 == -1L)
        {
            l = gcf.a() + a;
        }
        fps1.a(reasongroup, l, true);
        fps1.setChanged();
        fps1.notifyObservers(dynamicupsellconfig);
    }

    static void a(fps fps1, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup, long l)
    {
        fps1.a(reasongroup, l, true);
    }

    static void a(fps fps1, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup, boolean flag)
    {
        if (fps1.d)
        {
            Assertion.b("Attempted to refresh store with destroyed store control");
            return;
        } else
        {
            fqb fqb = fps1. new fqb(reasongroup) {

                private com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup a;
                private fps b;

                public final void a(Optional optional)
                {
                    if (optional.b())
                    {
                        optional = (DynamicUpsellConfig)optional.c();
                        fps.a(b, optional, a);
                        return;
                    } else
                    {
                        optional = b;
                        com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup1 = a;
                        fps.a(b);
                        fps.a(optional, reasongroup1, gcf.a() + fps.a);
                        return;
                    }
                }

                public final void a(DynamicUpsellConfig dynamicupsellconfig)
                {
                    fps.a(b, dynamicupsellconfig, a);
                }

            
            {
                b = fps.this;
                a = reasongroup;
                super();
            }
            };
            fps1.c.a(fqb, flag, reasongroup);
            return;
        }
    }

    public final void a(com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup, boolean flag)
    {
        a(reasongroup, -1L, flag);
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(10L);
    }
}
