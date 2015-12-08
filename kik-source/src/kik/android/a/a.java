// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.a;

import android.content.SharedPreferences;
import com.kik.d.f;

public final class a extends f
{

    private final int b = 1;
    private final int c = 20;
    private SharedPreferences d;

    public a(com.kik.d.a a1, com.kik.d.a.a a2, SharedPreferences sharedpreferences)
    {
        super(a1, a2);
        d = sharedpreferences;
        if (sharedpreferences.contains("BatchModifiableTracker.batchSizeToUse") && sharedpreferences.getInt("BatchModifiableTracker.batchSizeToUse", 0) == 1)
        {
            d();
        }
    }

    public final void d()
    {
        d.edit().putInt("BatchModifiableTracker.batchSizeToUse", 1).commit();
        a(b);
        if (a() >= b)
        {
            b();
        }
    }

    public final void e()
    {
        d.edit().putInt("BatchModifiableTracker.batchSizeToUse", 0).commit();
        a(c);
        if (a() >= c)
        {
            b();
        }
    }

    public final boolean f()
    {
        return d.getInt("BatchModifiableTracker.batchSizeToUse", 0) == 1;
    }
}
