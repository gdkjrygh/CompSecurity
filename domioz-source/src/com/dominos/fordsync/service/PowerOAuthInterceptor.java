// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.content.SharedPreferences;
import com.dominos.App;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.Json;
import java.util.Map;
import org.c.c.a.h;
import org.c.c.a.i;
import org.c.c.f;
import org.c.c.k;

public class PowerOAuthInterceptor
    implements h
{

    public PowerOAuthInterceptor()
    {
    }

    public i intercept(k k1, byte abyte0[], org.c.c.a.f f1)
    {
        String s = App.settings().getString("ANDROID_OAUTH_JWT", "");
        f f2 = k1.getHeaders();
        if (StringHelper.isNotEmpty(s))
        {
            Map map = Json.parse(s);
            s = null;
            if (map != null)
            {
                s = (String)map.get("access_token");
            }
            f2.add("Authorization", (new StringBuilder("Bearer ")).append(s).toString());
        }
        return f1.execute(k1, abyte0);
    }
}
