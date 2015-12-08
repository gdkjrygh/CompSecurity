// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Base64;
import com.microsoft.onlineid.a.a;
import com.microsoft.onlineid.a.b;
import com.microsoft.onlineid.internal.a.f;
import com.microsoft.onlineid.sts.e;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.microsoft.onlineid.internal:
//            l, e

public final class d
{

    public static String a(Context context, String s)
    {
        int i = 0;
        MessageDigest messagedigest = e.b();
        context = com.microsoft.onlineid.internal.l.a(context, s);
        byte abyte0[];
        boolean flag;
        if (context.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        abyte0 = messagedigest.digest(context[0].toByteArray());
        if (f.b("isCertificateTelemetryNeeded"))
        {
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            for (int j = context.length; i < j; i++)
            {
                byte abyte1[] = messagedigest.digest(context[i].toByteArray());
                linkedhashmap.put(Base64.encodeToString(abyte1, 2), abyte1);
            }

            com.microsoft.onlineid.a.a.a().a(linkedhashmap);
            f.a("isCertificateTelemetryNeeded", "false");
        }
        context = e.a(abyte0);
        return (new StringBuilder("android-app://")).append(s).append(".").append(context).toString();
    }
}
