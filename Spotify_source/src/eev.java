// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.EnumSet;

public class eev extends eet
{

    private static final EnumSet a;
    private boolean b;

    public eev()
    {
    }

    protected final void a()
    {
        ((eez)dmz.a(eez)).c = true;
    }

    public final void a(eeq eeq1)
    {
        if (a.contains(eeq1.a))
        {
            boolean flag = c();
            if (com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.g.equals(eeq1.a))
            {
                b = eeq1.b;
            }
            if (c() != flag)
            {
                if (flag)
                {
                    b();
                    return;
                } else
                {
                    a();
                    return;
                }
            }
        }
    }

    protected final void b()
    {
        ((eez)dmz.a(eez)).c = false;
    }

    public final boolean c()
    {
        return !b;
    }

    public final boolean d()
    {
        return b;
    }

    protected final String e()
    {
        return getClass().getSimpleName();
    }

    static 
    {
        a = EnumSet.of(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.g);
    }
}
