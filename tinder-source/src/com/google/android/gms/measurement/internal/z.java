// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, j, w, ac

final class z extends af
{
    public final class a
    {

        final z a;
        private final String b;
        private final long c = 0L;
        private boolean d;
        private long e;

        public final long a()
        {
            if (!d)
            {
                d = true;
                e = z.a(a).getLong(b, c);
            }
            return e;
        }

        public final void a(long l1)
        {
            android.content.SharedPreferences.Editor editor = z.a(a).edit();
            editor.putLong(b, l1);
            editor.apply();
            e = l1;
        }

        public a(String s)
        {
            a = z.this;
            super();
            u.a(s);
            b = s;
        }
    }

    public final class b
    {

        final String a;
        final String b;
        final String c;
        final long d;
        final z e;

        final void a()
        {
            e.e();
            long l1 = e.h().a();
            android.content.SharedPreferences.Editor editor = z.a(e).edit();
            editor.remove(b);
            editor.remove(c);
            editor.putLong(a, l1);
            editor.apply();
        }

        final long b()
        {
            return z.b(e).getLong(a, 0L);
        }

        private b(String s, long l1)
        {
            e = z.this;
            super();
            u.a(s);
            boolean flag;
            if (l1 > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b(flag);
            a = (new StringBuilder()).append(s).append(":start").toString();
            b = (new StringBuilder()).append(s).append(":count").toString();
            c = (new StringBuilder()).append(s).append(":value").toString();
            d = l1;
        }

        b(String s, long l1, byte byte0)
        {
            this(s, l1);
        }
    }


    static final Pair a = new Pair("", Long.valueOf(0L));
    public final b b = new b("health_monitor", com.google.android.gms.measurement.internal.j.E(), (byte)0);
    public final a c = new a("last_upload");
    public final a d = new a("last_upload_attempt");
    public final a e = new a("backoff");
    public final a f = new a("last_delete_stale");
    private SharedPreferences g;
    private String j;
    private boolean k;
    private long l;

    z(ac ac)
    {
        super(ac);
    }

    static SharedPreferences a(z z1)
    {
        return z1.g;
    }

    private static MessageDigest a(String s)
    {
        int i = 0;
_L3:
        if (i >= 2) goto _L2; else goto _L1
_L1:
        MessageDigest messagedigest = MessageDigest.getInstance(s);
        if (messagedigest != null)
        {
            return messagedigest;
        }
        continue; /* Loop/switch isn't completed */
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        i++;
          goto _L3
_L2:
        return null;
    }

    static SharedPreferences b(z z1)
    {
        return z1.q();
    }

    static String p()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    protected final void a()
    {
        g = i().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    }

    final Pair b()
    {
        e();
        long l1 = h().b();
        if (j != null && l1 < l)
        {
            return new Pair(j, Boolean.valueOf(k));
        }
        l = l1 + com.google.android.gms.measurement.internal.j.u();
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(i());
            j = info.getId();
            k = info.isLimitAdTrackingEnabled();
        }
        catch (Throwable throwable)
        {
            l().f.a("Unable to get advertising id", throwable);
            j = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(j, Boolean.valueOf(k));
    }

    final String o()
    {
        String s = (String)b().first;
        MessageDigest messagedigest = a("MD5");
        if (messagedigest == null)
        {
            return null;
        } else
        {
            return String.format(Locale.US, "%032X", new Object[] {
                new BigInteger(1, messagedigest.digest(s.getBytes()))
            });
        }
    }

    final SharedPreferences q()
    {
        e();
        t();
        return g;
    }

    final Boolean r()
    {
        e();
        if (!q().contains("use_service"))
        {
            return null;
        } else
        {
            return Boolean.valueOf(q().getBoolean("use_service", false));
        }
    }

}
