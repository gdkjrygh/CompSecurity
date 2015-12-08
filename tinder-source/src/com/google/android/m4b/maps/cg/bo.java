// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.SharedPreferences;
import com.google.android.m4b.maps.ay.a;
import com.google.android.m4b.maps.ay.t;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bt

public final class bo extends com.google.android.m4b.maps.ay.a
{
    public static interface a
    {

        public abstract void a();
    }


    public SharedPreferences a;
    public a b;
    public bt c;
    private long d;

    public bo(bt bt, SharedPreferences sharedpreferences, a a1)
    {
        d = 0L;
        c = bt;
        a = sharedpreferences;
        b = a1;
    }

    public final void a(t t)
    {
        long l = System.currentTimeMillis();
        if (l - d > TimeUnit.HOURS.toMillis(1L))
        {
            a.edit().putLong("LAST_FETCH_PERSISTENT_TAG", l).commit();
            d = l;
        }
    }
}
