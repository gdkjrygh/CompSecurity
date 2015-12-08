// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            k, d, cg

final class a
    implements Runnable
{

    private k a;

    public final void run()
    {
        if (k.f(a) != null)
        {
            k k1 = a;
            d d1 = k.f(a);
            cg cg1 = d1.c();
            com.google.android.m4b.maps.ak.c c = null;
            if (cg1 != null)
            {
                c = d1.a(cg1.a());
            }
            if (ab.a("INDOOR", 3))
            {
                String s = String.valueOf(cg1);
                String s1 = String.valueOf(c);
                Log.d("INDOOR", (new StringBuilder(String.valueOf(s).length() + 27 + String.valueOf(s1).length())).append("onIndoorBuildingFocused: ").append(s).append(", ").append(s1).toString());
            }
            k1.a(cg1, c);
        }
    }

    (k k1)
    {
        a = k1;
        super();
    }
}
