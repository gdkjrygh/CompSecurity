// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

class r
    implements ValueCallback
{

    CountDownLatch a;
    public String b;
    public final ArrayList c = new ArrayList();
    private final String d = com/threatmetrix/TrustDefenderMobile/r.getName();

    r(CountDownLatch countdownlatch)
    {
        a = null;
        a(countdownlatch);
    }

    private void a(String s, String s1)
    {
        CountDownLatch countdownlatch = a;
        String s2;
        String s3;
        long l;
        if (s == null)
        {
            s2 = "null";
        } else
        {
            s2 = s;
        }
        l = 0L;
        if (countdownlatch == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        l = countdownlatch.getCount();
        s3 = d;
        (new StringBuilder("in ")).append(s1).append("(").append(s2).append(") count = ").append(l);
        b = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        c.add("");
_L4:
        if (countdownlatch == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        s = d;
        (new StringBuilder("countdown latch: ")).append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount());
        countdownlatch.countDown();
        s = s1;
        if (s1 == null)
        {
            s = "null";
        }
        if (countdownlatch != null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        try
        {
            s1 = d;
            (new StringBuilder("in ")).append(s).append("() with null latch");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = d;
        }
        break; /* Loop/switch isn't completed */
_L2:
        c.add(s);
        if (true) goto _L4; else goto _L3
_L3:
        return;
        s1 = d;
        s1 = (new StringBuilder("in ")).append(s).append("() count = ").append(countdownlatch.getCount()).append(" and ");
        if (countdownlatch == a)
        {
            s = "latch constant";
        } else
        {
            s = "latch changed";
        }
        s1.append(s);
        return;
        Log.e(d, (new StringBuilder("in ")).append(s1).append("() latch == null").toString());
        return;
    }

    public final void a(String s)
    {
        a(s, "getString");
    }

    public final void a(CountDownLatch countdownlatch)
    {
        if (a != null)
        {
            String s = d;
            (new StringBuilder("existing latch: ")).append(a.hashCode()).append(" with count: ").append(a.getCount());
            s = d;
        }
        a = countdownlatch;
        if (a != null)
        {
            String s1 = d;
            (new StringBuilder("new latch: ")).append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount());
        }
    }

    public void onReceiveValue(Object obj)
    {
        String s;
        s = (String)obj;
        obj = s;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() != 2 || !s.equals("\"\"")) goto _L4; else goto _L3
_L3:
        obj = "";
_L2:
        a(((String) (obj)), "onReceiveValue");
        return;
_L4:
        obj = s;
        if (s.length() > 1)
        {
            obj = s.substring(1, s.length() - 1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
