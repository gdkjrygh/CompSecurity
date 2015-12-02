// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

public class UDPPrimingDNSInfo
{

    private static final UDPPrimingDNSInfo a = new UDPPrimingDNSInfo();
    private SharedPreferences b;
    private volatile byte c[];
    private volatile long d;
    private volatile byte e[];
    private volatile long f;

    private UDPPrimingDNSInfo()
    {
        c = null;
        d = 0L;
        e = null;
        f = 0L;
    }

    public static UDPPrimingDNSInfo a()
    {
        return a;
    }

    private static boolean a(long l, long l1)
    {
        return System.currentTimeMillis() - l1 > l;
    }

    private boolean b()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = b;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        obj = b.getString("UDP_PRIMING_DNS/DEFAULT_HOST", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        c = Base64.decode(((String) (obj)), 0);
        d = b.getLong("UDP_PRIMING_DNS/DEFAULT_HOST_TIMESTAMP", 0L);
        obj = b.getString("UDP_PRIMING_DNS/B_HOST", null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        e = Base64.decode(((String) (obj)), 0);
        f = b.getLong("UDP_PRIMING_DNS/B_HOST_TIMESTAMP", 0L);
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s, byte abyte0[])
    {
        if (s != null && abyte0 != null)
        {
            if ("graph.facebook.com".equals(s))
            {
                c = abyte0;
                d = System.currentTimeMillis();
                if (b != null)
                {
                    android.content.SharedPreferences.Editor editor = b.edit();
                    editor.putString("UDP_PRIMING_DNS/DEFAULT_HOST", Base64.encodeToString(c, 0));
                    editor.putLong("UDP_PRIMING_DNS/DEFAULT_HOST_TIMESTAMP", d);
                    editor.commit();
                }
            }
            if ("b-graph.facebook.com".equals(s))
            {
                e = abyte0;
                f = System.currentTimeMillis();
                if (b != null)
                {
                    s = b.edit();
                    s.putString("UDP_PRIMING_DNS/B_HOST", Base64.encodeToString(e, 0));
                    s.putLong("UDP_PRIMING_DNS/B_HOST_TIMESTAMP", f);
                    s.commit();
                    return;
                }
            }
        }
    }

    public final boolean a(Context context)
    {
        b = context.getSharedPreferences("UDP_PRIMING_DNS_INFO_STORAGE", 0);
        return b();
    }

    public final boolean a(String s)
    {
        while ("graph.facebook.com".equals(s) && a(d, 0x6ddd00L) || "b-graph.facebook.com".equals(s) && a(f, 0x6ddd00L)) 
        {
            return true;
        }
        return false;
    }

    public final byte[] b(String s)
    {
        if ("graph.facebook.com".equals(s) && !a(d, 0x44aa200L))
        {
            return c;
        }
        if ("b-graph.facebook.com".equals(s) && !a(f, 0x44aa200L))
        {
            return e;
        } else
        {
            return null;
        }
    }

}
