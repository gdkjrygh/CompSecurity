// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import com.google.android.apps.unveil.env.i;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            c

public final class d
{

    public int a;
    public long b;
    float c;
    final c d;

    d(c c1)
    {
        d = c1;
        super();
        a = 0;
        b = 0L;
        c = 0.0F;
    }

    public final String toString()
    {
        if (d.i)
        {
            int j = a;
            long l = b;
            String s = i.a(c);
            return (new StringBuilder(String.valueOf(s).length() + 54)).append("[").append(j).append(" frames] [").append(l).append("ms total] [").append(s).append("]").toString();
        } else
        {
            return "[DISABLED]";
        }
    }
}
