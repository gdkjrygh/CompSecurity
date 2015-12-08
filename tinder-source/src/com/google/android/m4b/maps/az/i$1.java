// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.az;

import android.util.Log;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bd.b;
import com.google.android.m4b.maps.bo.bh;

// Referenced classes of package com.google.android.m4b.maps.az:
//            i

final class a
    implements b
{

    private i a;

    public final void a(com.google.android.m4b.maps.ak.a a1, int j, bh bh)
    {
        if (j == 2)
        {
            if (ab.a("IndoorState", 3))
            {
                a1 = String.valueOf(a1);
                Log.d("IndoorState", (new StringBuilder(String.valueOf(a1).length() + 22)).append("Building id ").append(a1).append(" not found").toString());
            }
        } else
        if (j == 0)
        {
            i.a(a, bh);
            return;
        }
    }

    (i j)
    {
        a = j;
        super();
    }
}
