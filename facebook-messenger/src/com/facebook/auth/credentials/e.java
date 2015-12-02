// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.credentials;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.facebook.auth.credentials:
//            SessionCookie

class e
{

    final SessionCookie a;
    private List b;

    public e(SessionCookie sessioncookie)
    {
        a = sessioncookie;
        super();
        b = new ArrayList();
    }

    public e a(String s)
    {
        b.add(s);
        return this;
    }

    public e a(String s, String s1)
    {
        b.add((new StringBuilder()).append(s).append("=").append(s1).toString());
        return this;
    }

    public String a()
    {
        return Joiner.on("; ").join(b);
    }
}
