// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.Collection;

public abstract class cax
{

    final String a;
    final Object b;

    private cax(String s, Object obj)
    {
        a = s;
        b = obj;
        bkv.m().a.add(this);
    }

    cax(String s, Object obj, byte byte0)
    {
        this(s, obj);
    }

    public static cax a(String s)
    {
        s = a(s, ((String) (null)));
        bkv.m().b.add(s);
        return s;
    }

    public static cax a(String s, int i)
    {
        return new cax(s, Integer.valueOf(i)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Integer.valueOf(sharedpreferences.getInt(a, ((Integer)b).intValue()));
            }

        };
    }

    public static cax a(String s, long l)
    {
        return new cax(s, Long.valueOf(l)) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Long.valueOf(sharedpreferences.getLong(a, ((Long)b).longValue()));
            }

        };
    }

    public static cax a(String s, Boolean boolean1)
    {
        return new cax(s, boolean1) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return Boolean.valueOf(sharedpreferences.getBoolean(a, ((Boolean)b).booleanValue()));
            }

        };
    }

    public static cax a(String s, String s1)
    {
        return new cax(s, s1) {

            public final Object a(SharedPreferences sharedpreferences)
            {
                return sharedpreferences.getString(a, (String)b);
            }

        };
    }

    public static cax b(String s)
    {
        s = a(s, ((String) (null)));
        bkv.m().c.add(s);
        return s;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);
}
