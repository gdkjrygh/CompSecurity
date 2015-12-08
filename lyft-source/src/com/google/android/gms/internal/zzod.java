// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzod extends zznq
{

    private String a;
    private int b;
    private int c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private boolean h;

    public zzod()
    {
        this(false);
    }

    public zzod(boolean flag)
    {
        this(flag, a());
    }

    public zzod(boolean flag, int i)
    {
        zzu.a(i);
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

    public void a(zznq zznq1)
    {
        a((zzod)zznq1);
    }

    public void a(zzod zzod1)
    {
        if (!TextUtils.isEmpty(a))
        {
            zzod1.a(a);
        }
        if (b != 0)
        {
            zzod1.a(b);
        }
        if (c != 0)
        {
            zzod1.b(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            zzod1.b(d);
        }
        if (!TextUtils.isEmpty(e))
        {
            zzod1.c(e);
        }
        if (f)
        {
            zzod1.b(f);
        }
        if (g)
        {
            zzod1.a(g);
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
