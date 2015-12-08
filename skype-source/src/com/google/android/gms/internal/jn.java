// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            jc

public final class jn extends jc
{

    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;

    public jn()
    {
        this(false);
    }

    public jn(boolean flag)
    {
        UUID uuid;
        int j;
        uuid = UUID.randomUUID();
        j = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (j == 0) goto _L2; else goto _L1
_L1:
        this(flag, j);
        return;
_L2:
        int k = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
        j = k;
        if (k == 0)
        {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            j = 0x7fffffff;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public jn(boolean flag, int j)
    {
        if (j == 0)
        {
            throw new IllegalArgumentException("Given Integer is zero");
        } else
        {
            b = j;
            g = flag;
            return;
        }
    }

    private void i()
    {
        if (h)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public final String a()
    {
        return a;
    }

    public final void a(int j)
    {
        i();
        c = j;
    }

    public final void a(jc jc1)
    {
        jc1 = (jn)jc1;
        if (!TextUtils.isEmpty(a))
        {
            jc1.a(a);
        }
        if (b != 0)
        {
            int j = b;
            jc1.i();
            jc1.b = j;
        }
        if (c != 0)
        {
            jc1.a(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            jc1.b(d);
        }
        if (!TextUtils.isEmpty(e))
        {
            String s = e;
            jc1.i();
            boolean flag;
            if (TextUtils.isEmpty(s))
            {
                jc1.e = null;
            } else
            {
                jc1.e = s;
            }
        }
        if (f)
        {
            jc1.a(f);
        }
        if (g)
        {
            flag = g;
            jc1.i();
            jc1.g = flag;
        }
    }

    public final void a(String s)
    {
        i();
        a = s;
    }

    public final void a(boolean flag)
    {
        i();
        f = flag;
    }

    public final int b()
    {
        return b;
    }

    public final void b(String s)
    {
        i();
        d = s;
    }

    public final int c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final boolean f()
    {
        return !h;
    }

    public final void g()
    {
        h = true;
    }

    public final boolean h()
    {
        return f;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", a);
        hashmap.put("interstitial", Boolean.valueOf(f));
        hashmap.put("automatic", Boolean.valueOf(g));
        hashmap.put("screenId", Integer.valueOf(b));
        hashmap.put("referrerScreenId", Integer.valueOf(c));
        hashmap.put("referrerScreenName", d);
        hashmap.put("referrerUri", e);
        return a(hashmap);
    }
}
