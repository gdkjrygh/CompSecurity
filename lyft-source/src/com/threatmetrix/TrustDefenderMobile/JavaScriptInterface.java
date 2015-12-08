// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class JavaScriptInterface
    implements ValueCallback
{

    private static final String d = StringUtils.a(com/threatmetrix/TrustDefenderMobile/JavaScriptInterface);
    CountDownLatch a;
    public String b;
    public final ArrayList c = new ArrayList();

    JavaScriptInterface(CountDownLatch countdownlatch)
    {
        a = null;
        a(countdownlatch);
    }

    private void a(String s, String s1)
    {
        CountDownLatch countdownlatch = a;
        Object obj;
        long l;
        if (s == null)
        {
            obj = "null";
        } else
        {
            obj = s;
        }
        l = 0L;
        if (countdownlatch == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        l = countdownlatch.getCount();
        Log.d(d, (new StringBuilder()).append("in ").append(s1).append("(").append(((String) (obj))).append(") count = ").append(l).toString());
        b = s;
        if (s != null) goto _L2; else goto _L1
_L1:
        c.add("");
_L4:
        if (countdownlatch == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        Log.d(d, (new StringBuilder()).append("countdown latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
        countdownlatch.countDown();
        s = s1;
        if (s1 == null)
        {
            s = "null";
        }
        if (countdownlatch != null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        try
        {
            Log.d(d, (new StringBuilder()).append("in ").append(s).append("() with null latch").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d(d, "Swallowing: ", s);
        }
        break; /* Loop/switch isn't completed */
_L2:
        c.add(s);
        if (true) goto _L4; else goto _L3
_L3:
        return;
        s1 = d;
        obj = (new StringBuilder()).append("in ").append(s).append("() count = ").append(countdownlatch.getCount()).append(" and ");
        if (countdownlatch == a)
        {
            s = "latch constant";
        } else
        {
            s = "latch changed";
        }
        Log.d(s1, ((StringBuilder) (obj)).append(s).toString());
        return;
        Log.e(d, (new StringBuilder()).append("in ").append(s1).append("() latch == null").toString());
        return;
    }

    public void a(String s)
    {
        a(s, "getString");
    }

    public void a(CountDownLatch countdownlatch)
    {
        if (a != null)
        {
            Log.d(d, (new StringBuilder()).append("existing latch: ").append(a.hashCode()).append(" with count: ").append(a.getCount()).toString());
            Log.d(d, "Setting latch when latch already has non-null value");
        }
        a = countdownlatch;
        if (a != null)
        {
            Log.d(d, (new StringBuilder()).append("new latch: ").append(countdownlatch.hashCode()).append(" with count: ").append(countdownlatch.getCount()).toString());
        }
    }

    public void b(String s)
    {
        String s1 = s;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() != 2 || !s.equals("\"\"")) goto _L4; else goto _L3
_L3:
        s1 = "";
_L2:
        a(s1, "onReceiveValue");
        return;
_L4:
        s1 = s;
        if (s.length() > 1)
        {
            s1 = s.substring(1, s.length() - 1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onReceiveValue(Object obj)
    {
        b((String)obj);
    }

}
