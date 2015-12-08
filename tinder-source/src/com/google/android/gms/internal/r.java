// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.d;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.internal:
//            s

public abstract class r
{

    final String a;
    final Object b;

    private r(String s1, Object obj)
    {
        a = s1;
        b = obj;
        d.h().a.add(this);
    }

    r(String s1, Object obj, byte byte0)
    {
        this(s1, obj);
    }

    public static r a(String s1)
    {
        s1 = a(s1, ((String) (null)));
        d.h().b.add(s1);
        return s1;
    }

    public static r a(String s1, int i)
    {
        return new r(s1, Integer.valueOf(i)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(a, ((Integer)b).intValue()));
            }

        };
    }

    public static r a(String s1, long l)
    {
        return new r(s1, Long.valueOf(l)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(a, ((Long)b).longValue()));
            }

        };
    }

    public static r a(String s1, Boolean boolean1)
    {
        return new r(s1, boolean1) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(a, ((Boolean)b).booleanValue()));
            }

        };
    }

    public static r a(String s1, String s2)
    {
        return new r(s1, s2) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(a, (String)b);
            }

        };
    }

    public static r b(String s1)
    {
        s1 = a(s1, ((String) (null)));
        d.h().c.add(s1);
        return s1;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);
}
