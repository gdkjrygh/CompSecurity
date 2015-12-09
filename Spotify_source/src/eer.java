// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class eer extends eet
{

    private final EnumSet a;
    private final EnumSet b;
    private AdEventReporter c;
    private Set d;
    private boolean e;

    public eer()
    {
        a = EnumSet.of(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.c, com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.f);
        b = EnumSet.of(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.a);
        c = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
        d = new HashSet();
        e = false;
    }

    protected final void a()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            c.a();
            return;
        }
    }

    public final void a(eeq eeq1)
    {
label0:
        {
            if (a.contains(eeq1.a) || b.contains(eeq1.a))
            {
                if (eeq1.b)
                {
                    d.add(eeq1.a);
                } else
                {
                    d.remove(eeq1.a);
                }
                if (!c())
                {
                    break label0;
                }
                a();
            }
            return;
        }
        b();
    }

    protected final void b()
    {
        if (!e)
        {
            return;
        } else
        {
            e = false;
            c.b();
            return;
        }
    }

    public final boolean c()
    {
        return d.containsAll(a) && Collections.disjoint(d, b);
    }

    public final boolean d()
    {
        return !c();
    }

    protected final String e()
    {
        return getClass().getSimpleName();
    }
}
