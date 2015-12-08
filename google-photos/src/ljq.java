// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class ljq extends liz
{

    public String a;
    public int b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    private boolean h;

    public ljq()
    {
        this(false);
    }

    public ljq(boolean flag)
    {
        UUID uuid;
        int i;
        uuid = UUID.randomUUID();
        i = (int)(uuid.getLeastSignificantBits() & 0x7fffffffL);
        if (i == 0) goto _L2; else goto _L1
_L1:
        this(flag, i);
        return;
_L2:
        int j = (int)(uuid.getMostSignificantBits() & 0x7fffffffL);
        i = j;
        if (j == 0)
        {
            Log.e("GAv4", "UUID.randomUUID() returned 0.");
            i = 0x7fffffff;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public ljq(boolean flag, int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Given Integer is zero");
        } else
        {
            b = i;
            h = flag;
            return;
        }
    }

    private void a()
    {
        if (g)
        {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        } else
        {
            return;
        }
    }

    public final void a(int i)
    {
        a();
        c = i;
    }

    public final void a(String s)
    {
        a();
        a = s;
    }

    public final void a(liz liz1)
    {
        liz1 = (ljq)liz1;
        if (!TextUtils.isEmpty(a))
        {
            liz1.a(a);
        }
        if (b != 0)
        {
            int i = b;
            liz1.a();
            liz1.b = i;
        }
        if (c != 0)
        {
            liz1.a(c);
        }
        if (!TextUtils.isEmpty(d))
        {
            liz1.b(d);
        }
        if (!TextUtils.isEmpty(e))
        {
            String s = e;
            liz1.a();
            boolean flag;
            if (TextUtils.isEmpty(s))
            {
                liz1.e = null;
            } else
            {
                liz1.e = s;
            }
        }
        if (f)
        {
            liz1.a(f);
        }
        if (h)
        {
            flag = h;
            liz1.a();
            liz1.h = flag;
        }
    }

    public final void a(boolean flag)
    {
        a();
        f = flag;
    }

    public final void b(String s)
    {
        a();
        d = s;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("screenName", a);
        hashmap.put("interstitial", Boolean.valueOf(f));
        hashmap.put("automatic", Boolean.valueOf(h));
        hashmap.put("screenId", Integer.valueOf(b));
        hashmap.put("referrerScreenId", Integer.valueOf(c));
        hashmap.put("referrerScreenName", d);
        hashmap.put("referrerUri", e);
        return a(hashmap);
    }
}
