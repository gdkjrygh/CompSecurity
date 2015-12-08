// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            RetryPolicy, VolleyError

public class DefaultRetryPolicy
    implements RetryPolicy
{

    public static final float DEFAULT_BACKOFF_MULT = 1F;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private int a;
    private int b;
    private final int c;
    private final float d;

    public DefaultRetryPolicy()
    {
        this(2500, 1, 1.0F);
    }

    public DefaultRetryPolicy(int i, int j, float f)
    {
        a = i;
        c = j;
        d = f;
    }

    public float getBackoffMultiplier()
    {
        return d;
    }

    public int getCurrentRetryCount()
    {
        return b;
    }

    public int getCurrentTimeout()
    {
        return a;
    }

    public void retry(VolleyError volleyerror)
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        boolean flag;
        if (b <= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw volleyerror;
        } else
        {
            return;
        }
    }
}
