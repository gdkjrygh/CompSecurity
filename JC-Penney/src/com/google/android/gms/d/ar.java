// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.d:
//            ab

public final class ar extends ab
{

    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;

    public ar()
    {
        this(false);
    }

    public ar(boolean flag)
    {
        this(flag, a());
    }

    public ar(boolean flag, int i)
    {
        u.a(i);
        b = i;
        g = flag;
    }

    static int a()
    {
        UUID uuid = UUID.randomUUID();
        int i = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (i == 0)
        {
            int j = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
            i = j;
            if (j == 0)
            {
                Log.e("GAv4", "UUID.randomUUID() returned 0.");
                return 0x7fffffff;
            }
        }
        return i;
    }

    private void e()
    {
        if (h)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public void a(int i)
    {
        e();
        b = i;
    }

    public void a(ab ab1)
    {
        a((ar)ab1);
    }

    public void a(ar ar1)
    {
        if (!TextUtils.isEmpty(a))
        {
            ar1.a(a);
        }
        if (b != 0)
        {
            ar1.a(b);
        }
        if (c != 0)
        {
            ar1.b(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            ar1.b(d);
        }
        if (!TextUtils.isEmpty(e))
        {
            ar1.c(e);
        }
        if (f)
        {
            ar1.b(f);
        }
        if (g)
        {
            ar1.a(g);
        }
    }

    public void a(String s)
    {
        e();
        a = s;
    }

    public void a(boolean flag)
    {
        e();
        g = flag;
    }

    public String b()
    {
        return a;
    }

    public void b(int i)
    {
        e();
        c = i;
    }

    public void b(String s)
    {
        e();
        d = s;
    }

    public void b(boolean flag)
    {
        e();
        f = flag;
    }

    public int c()
    {
        return b;
    }

    public void c(String s)
    {
        e();
        if (TextUtils.isEmpty(s))
        {
            e = null;
            return;
        } else
        {
            e = s;
            return;
        }
    }

    public String d()
    {
        return e;
    }

    public String toString()
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
