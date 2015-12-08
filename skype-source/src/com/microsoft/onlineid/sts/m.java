// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.net.Uri;
import android.util.Base64;
import com.microsoft.onlineid.internal.o;
import java.security.SecureRandom;
import java.util.Date;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.microsoft.onlineid.sts:
//            o, f, e

public final class m
{

    private final Date a;
    private final SecureRandom b = new SecureRandom();
    private final com.microsoft.onlineid.sts.o c;
    private final f d;

    public m(Date date, f f1)
    {
        d = f1;
        a = date;
        c = new com.microsoft.onlineid.sts.o(f1.b());
    }

    public final String a(String s)
    {
        byte abyte0[] = new byte[32];
        b.nextBytes(abyte0);
        s = (new android.net.Uri.Builder()).appendQueryParameter("ct", Long.toString(a.getTime() / 1000L)).appendQueryParameter("hashalg", "SHA256").appendQueryParameter("bver", "11").appendQueryParameter("appid", s).appendQueryParameter("da", d.a()).appendQueryParameter("nonce", Base64.encodeToString(abyte0, 2));
        return s.appendQueryParameter("hash", Base64.encodeToString(e.a(new SecretKeySpec(c.a(o.a.a, abyte0), "HmacSHA256")).doFinal(s.build().getEncodedQuery().getBytes(o.a)), 2)).build().getEncodedQuery();
    }
}
