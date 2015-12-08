// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.p;

// Referenced classes of package com.google.android.gms.internal:
//            av

public abstract class au
{

    private final String a;
    private final Object b;

    private au(String s, Object obj)
    {
        a = s;
        b = obj;
        p.m().a(this);
    }

    au(String s, Object obj, byte byte0)
    {
        this(s, obj);
    }

    public static au a(String s)
    {
        s = a(s, ((String) (null)));
        p.m().b(s);
        return s;
    }

    public static au a(String s, int i)
    {
        return new au(s, Integer.valueOf(i)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(a(), ((Integer)b()).intValue()));
            }

        };
    }

    public static au a(String s, long l)
    {
        return new au(s, Long.valueOf(l)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(a(), ((Long)b()).longValue()));
            }

        };
    }

    public static au a(String s, Boolean boolean1)
    {
        return new au(s, boolean1) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(a(), ((Boolean)b()).booleanValue()));
            }

        };
    }

    public static au a(String s, String s1)
    {
        return new au(s, s1) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(a(), (String)b());
            }

        };
    }

    public static au b(String s)
    {
        s = a(s, ((String) (null)));
        p.m().c(s);
        return s;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);

    public final String a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }
}
