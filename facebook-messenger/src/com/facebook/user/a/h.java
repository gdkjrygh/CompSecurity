// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import com.google.common.a.fi;
import com.google.common.base.Joiner;
import java.util.Locale;
import javax.inject.a;

// Referenced classes of package com.facebook.user.a:
//            g

public final class h
{

    private final a a;

    public h(a a1)
    {
        a = a1;
    }

    public String a(String s, String s1)
    {
        String s2 = ((Locale)a.b()).getLanguage();
        Joiner joiner;
        if (g.c.contains(s2))
        {
            joiner = Joiner.on("");
        } else
        {
            joiner = Joiner.on(" ");
        }
        if (com.facebook.user.a.g.a.contains(s2))
        {
            return joiner.join(s1, s, new Object[0]);
        } else
        {
            return joiner.join(s, s1, new Object[0]);
        }
    }
}
