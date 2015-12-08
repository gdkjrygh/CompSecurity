// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bf;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.aa;
import com.google.android.m4b.maps.bo.ac;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bf:
//            c

final class <init>
    implements d
{

    private c a;

    public final void a(ac ac, int i, aa aa)
    {
        if (i != 3)
        {
            if ((aa = c.a(a, ac, i, aa)) != null)
            {
                Long long1 = (Long)c.c(a).remove(ac);
                if (long1 == null)
                {
                    if (ab.a("TileFetcher", 6))
                    {
                        ac = String.valueOf(ac);
                        Log.e("TileFetcher", (new StringBuilder(String.valueOf(ac).length() + 25)).append("Received an unknown tile ").append(ac).toString());
                        return;
                    }
                } else
                {
                    SystemClock.elapsedRealtime();
                    long1.longValue();
                    c.a(a, ac, aa);
                    return;
                }
            }
        }
    }

    private (c c1)
    {
        a = c1;
        super();
    }

    a(c c1, byte byte0)
    {
        this(c1);
    }
}
