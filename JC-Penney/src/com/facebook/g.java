// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ad, an, i, d

class g
    implements ad
{

    final i a;
    final d b;

    g(d d, i j)
    {
        b = d;
        a = j;
        super();
    }

    public void a(an an1)
    {
        an1 = an1.b();
        if (an1 == null)
        {
            return;
        } else
        {
            a.a = an1.optString("access_token");
            a.b = an1.optInt("expires_at");
            return;
        }
    }
}
