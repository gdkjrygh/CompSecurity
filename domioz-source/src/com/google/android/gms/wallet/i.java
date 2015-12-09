// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.Locale;

// Referenced classes of package com.google.android.gms.wallet:
//            h

public final class i
{

    private int a;
    private int b;

    public i()
    {
        a = 0;
        b = 0;
    }

    static int a(i j)
    {
        return j.a;
    }

    static int b(i j)
    {
        return j.b;
    }

    public final i a()
    {
        b = 1;
        return this;
    }

    public final i a(int j)
    {
        if (j == 0 || j == 2 || j == 1)
        {
            a = j;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                Integer.valueOf(j)
            }));
        }
    }

    public final h b()
    {
        return new h(this, (byte)0);
    }
}
