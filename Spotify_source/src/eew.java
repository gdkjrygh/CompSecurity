// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import java.util.HashMap;
import java.util.Map;

public class eew extends eet
{

    private final AdEventReporter a = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
    private final Map b = new HashMap();

    public eew()
    {
    }

    protected final void a()
    {
        a.b(AdSlot.WATCHNOW);
    }

    public final void a(eeq eeq1)
    {
        if (eeq1.a.equals(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.e))
        {
            boolean flag = c();
            b.put(eeq1.a, Boolean.valueOf(eeq1.b));
            boolean flag1 = c();
            if (flag != flag1)
            {
                if (flag1)
                {
                    a();
                    return;
                } else
                {
                    b();
                    return;
                }
            }
        }
    }

    protected final void b()
    {
        a.a(AdSlot.WATCHNOW);
    }

    public final boolean c()
    {
        return !d();
    }

    public final boolean d()
    {
        return b.containsKey(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.e) && ((Boolean)b.get(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.e)).booleanValue();
    }

    protected final String e()
    {
        return getClass().getSimpleName();
    }
}
