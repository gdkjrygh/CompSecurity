// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.os.Build;
import android.util.Log;
import com.dominos.android.sdk.common.StringHelper;
import com.google.a.a.aa;
import com.google.a.a.w;
import java.net.URI;
import java.util.List;
import java.util.Locale;
import org.c.c.a.h;
import org.c.c.a.i;
import org.c.c.f;
import org.c.c.k;

public class PowerHeaderInterceptor
    implements h
{

    public PowerHeaderInterceptor()
    {
    }

    private static String getUserAgent()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Dominos");
        stringbuilder.append("/1.0");
        stringbuilder.append((new StringBuilder(" (Android ")).append(android.os.Build.VERSION.RELEASE).toString());
        stringbuilder.append((new StringBuilder("; ")).append(Build.MANUFACTURER).toString());
        stringbuilder.append((new StringBuilder("/")).append(Build.MODEL).toString());
        stringbuilder.append((new StringBuilder("; ")).append(Locale.getDefault().getLanguage()).toString());
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    public i intercept(k k1, byte abyte0[], org.c.c.a.f f1)
    {
        f f2 = k1.getHeaders();
        f2.add("User-Agent", getUserAgent());
        f2.set("Connection", "Close");
        String s = k1.getURI().getPath();
        if (StringHelper.containsIgnoreCase(s, "login") || StringHelper.containsIgnoreCase(s, "oauth"))
        {
            List list = f2.get("Authorization");
            if (list != null && list.size() > 0)
            {
                Log.wtf("PowerHeaderInterceptor", String.format("Authorization header in request: [%s][%s][%s][%s]", new Object[] {
                    k1.getMethod(), k1.getURI(), w.a(":").c("=").a(f2), new String(abyte0)
                }));
            }
        }
        return f1.execute(k1, abyte0);
    }
}
