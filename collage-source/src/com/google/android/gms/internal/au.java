// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            av, ax

public abstract class au
{

    private final String a;
    private final Object b;

    private au(String s, Object obj)
    {
        a = s;
        b = obj;
        zzp.zzbF().a(this);
    }


    public static au a(String s)
    {
        s = a(s, (String)null);
        zzp.zzbF().b(s);
        return s;
    }

    public static au a(String s, int i)
    {
        return new au(s, Integer.valueOf(i)) {

            public Object a(SharedPreferences sharedpreferences)
            {
                return b(sharedpreferences);
            }

            public Integer b(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(a(), ((Integer)b()).intValue()));
            }

        };
    }

    public static au a(String s, long l)
    {
        return new au(s, Long.valueOf(l)) {

            public Object a(SharedPreferences sharedpreferences)
            {
                return b(sharedpreferences);
            }

            public Long b(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(a(), ((Long)b()).longValue()));
            }

        };
    }

    public static au a(String s, Boolean boolean1)
    {
        return new au(s, boolean1) {

            public Object a(SharedPreferences sharedpreferences)
            {
                return b(sharedpreferences);
            }

            public Boolean b(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(a(), ((Boolean)b()).booleanValue()));
            }

        };
    }

    public static au a(String s, String s1)
    {
        return new au(s, s1) {

            public Object a(SharedPreferences sharedpreferences)
            {
                return b(sharedpreferences);
            }

            public String b(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(a(), (String)b());
            }

        };
    }

    public static au b(String s)
    {
        s = a(s, (String)null);
        zzp.zzbF().c(s);
        return s;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);

    public String a()
    {
        return a;
    }

    public Object b()
    {
        return b;
    }

    public Object c()
    {
        return zzp.zzbG().a(this);
    }
}
