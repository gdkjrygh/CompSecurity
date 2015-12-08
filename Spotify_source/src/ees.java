// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ees extends eet
{

    private static String a = ees.getSimpleName();
    private final EnumSet b;
    private final EnumSet c;
    private List d;
    private AdEventReporter e;

    public ees()
    {
        b = EnumSet.of(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a, com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.b, com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.d);
        c = EnumSet.of(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.b, com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a);
        e = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
        d = new ArrayList();
    }

    protected final void a()
    {
        String s = a;
        s = a;
        e.c();
    }

    public final void a(eeq eeq1)
    {
        if (b.contains(eeq1.a))
        {
            if (eeq1.b)
            {
                eeq1 = eeq1.a;
                if (!c.contains(eeq1) || !d.contains(eeq1))
                {
                    boolean flag = c();
                    d.add(eeq1);
                    if (flag)
                    {
                        g();
                    }
                }
            } else
            {
                eeq1 = eeq1.a;
                boolean flag1 = d();
                d.remove(eeq1);
                if (flag1)
                {
                    f();
                    return;
                }
            }
        }
    }

    protected final void b()
    {
        String s = a;
        e.a("sp://ads/v1/adslots/preroll");
        s = a;
    }

    public final boolean c()
    {
        return d.isEmpty();
    }

    public final boolean d()
    {
        return !d.isEmpty();
    }

    protected final String e()
    {
        return a;
    }

}
