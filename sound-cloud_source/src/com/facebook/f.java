// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            D, c

final class f
    implements GraphRequest.b
{

    final c.a a;
    final c b;

    f(c c, c.a a1)
    {
        b = c;
        a = a1;
        super();
    }

    public final void a(D d)
    {
        d = d.a;
        if (d == null)
        {
            return;
        } else
        {
            a.a = d.optString("access_token");
            a.b = d.optInt("expires_at");
            return;
        }
    }
}
