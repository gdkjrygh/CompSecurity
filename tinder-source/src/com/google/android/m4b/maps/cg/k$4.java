// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            k, cg, d

final class a
    implements Runnable
{

    private cg a;
    private k b;

    public final void run()
    {
        if (k.f(b) != null)
        {
            com.google.android.m4b.maps.ak.c c = k.f(b).a(a.a());
            if (ab.a("INDOOR", 3))
            {
                String s = String.valueOf(a);
                String s1 = String.valueOf(c);
                Log.d("INDOOR", (new StringBuilder(String.valueOf(s).length() + 26 + String.valueOf(s1).length())).append("onIndoorLevelActivated: ").append(s).append(", ").append(s1).toString());
            }
            if (k.a(k.g(b), a))
            {
                k.a(b, k.g(b), c);
            }
        }
    }

    (k k1, cg cg1)
    {
        b = k1;
        a = cg1;
        super();
    }
}
