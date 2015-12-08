// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Set;

final class mnx
    implements mmx
{

    private final String a;
    private mnn b;

    mnx(mnn mnn1, int i)
    {
        this(mnn1, Integer.toString(i));
    }

    private mnx(mnn mnn1, String s)
    {
        b = mnn1;
        super();
        a = String.valueOf(s).concat(".");
    }

    private String e(String s)
    {
        String s1 = String.valueOf(a);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public final int a(String s, int i)
    {
        s = e(s);
        return mnn.b(b).getInt(s, i);
    }

    public final long a(String s, long l)
    {
        s = e(s);
        return mnn.b(b).getLong(s, l);
    }

    public final String a(String s, String s1)
    {
        s = e(s);
        return mnn.b(b).getString(s, s1);
    }

    public final Set a(String s, Set set)
    {
        s = e(s);
        s = mnn.b(b).getStringSet(s, set);
        if (s == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableSet(s);
        }
    }

    public final boolean a()
    {
        return a("logged_in", false);
    }

    public final boolean a(String s)
    {
        s = e(s);
        return mnn.b(b).contains(s);
    }

    public final boolean a(String s, boolean flag)
    {
        s = e(s);
        return mnn.b(b).getBoolean(s, flag);
    }

    public final String b(String s)
    {
        return a(s, ((String) (null)));
    }

    public final boolean b()
    {
        return a("logged_out", false);
    }

    public final boolean c(String s)
    {
        return a(s, false);
    }

    public final mmx d(String s)
    {
        mnn mnn1 = b;
        String s1 = String.valueOf(a);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return new mnx(mnn1, s);
    }
}
