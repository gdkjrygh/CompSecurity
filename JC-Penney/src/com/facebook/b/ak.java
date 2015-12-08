// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import com.facebook.s;
import java.util.Collection;

// Referenced classes of package com.facebook.b:
//            al

public final class ak
{

    public static final Collection a = al.a(new String[] {
        "service_disabled", "AndroidAuthKillSwitchException"
    });
    public static final Collection b = al.a(new String[] {
        "access_denied", "OAuthAccessDeniedException"
    });
    private static final String c = com/facebook/b/ak.getName();

    public ak()
    {
    }

    public static final String a()
    {
        return String.format("m.%s", new Object[] {
            s.e()
        });
    }

    public static final String b()
    {
        return String.format("https://graph.%s", new Object[] {
            s.e()
        });
    }

    public static final String c()
    {
        return String.format("https://graph-video.%s", new Object[] {
            s.e()
        });
    }

    public static final String d()
    {
        return "v2.3";
    }

}
