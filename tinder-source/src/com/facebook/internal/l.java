// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.g;
import java.util.Collection;

// Referenced classes of package com.facebook.internal:
//            m

public final class l
{

    public static final Collection a = m.a(new String[] {
        "service_disabled", "AndroidAuthKillSwitchException"
    });
    public static final Collection b = m.a(new String[] {
        "access_denied", "OAuthAccessDeniedException"
    });
    private static final String c = com/facebook/internal/l.getName();

    public l()
    {
    }

    public static final String a()
    {
        return String.format("m.%s", new Object[] {
            g.f()
        });
    }

    public static final String b()
    {
        return String.format("https://graph.%s", new Object[] {
            g.f()
        });
    }

    public static final String c()
    {
        return String.format("https://graph-video.%s", new Object[] {
            g.f()
        });
    }

    public static final String d()
    {
        return "v2.4";
    }

}
