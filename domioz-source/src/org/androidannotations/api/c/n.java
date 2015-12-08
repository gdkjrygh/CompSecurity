// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.c;

import android.content.SharedPreferences;
import java.util.Set;

// Referenced classes of package org.androidannotations.api.c:
//            d, m, g, i, 
//            k, p, r

public abstract class n
{

    private final SharedPreferences sharedPreferences;

    public n(SharedPreferences sharedpreferences)
    {
        sharedPreferences = sharedpreferences;
    }

    protected d booleanField(String s, boolean flag)
    {
        return new d(sharedPreferences, s, Boolean.valueOf(flag));
    }

    public final void clear()
    {
        m.a(sharedPreferences.edit().clear());
    }

    protected g floatField(String s, float f)
    {
        return new g(sharedPreferences, s, Float.valueOf(f));
    }

    public final SharedPreferences getSharedPreferences()
    {
        return sharedPreferences;
    }

    protected i intField(String s, int j)
    {
        return new i(sharedPreferences, s, Integer.valueOf(j));
    }

    protected k longField(String s, long l)
    {
        return new k(sharedPreferences, s, Long.valueOf(l));
    }

    protected p stringField(String s, String s1)
    {
        return new p(sharedPreferences, s, s1);
    }

    protected r stringSetField(String s, Set set)
    {
        return new r(sharedPreferences, s, set);
    }
}
