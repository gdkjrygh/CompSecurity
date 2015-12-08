// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.text.TextUtils;
import com.mopub.common.Preconditions;

// Referenced classes of package com.mopub.mobileads:
//            f

final class e
{

    private f a;
    private String b;
    private String c;
    private String d;

    public e(f f1)
    {
        this(f1, null, null, null);
    }

    public e(f f1, String s, String s1, String s2)
    {
        Preconditions.checkNotNull(f1);
        a = f1;
        b = s;
        c = s1;
        d = s2;
    }

    static f a(e e1)
    {
        return e1.a;
    }

    static void a(e e1, f f1)
    {
        e1.a = f1;
    }

    static String b(e e1)
    {
        return e1.b;
    }

    static String c(e e1)
    {
        return e1.c;
    }

    static String d(e e1)
    {
        return e1.d;
    }

    static void e(e e1)
    {
        e1.c = null;
    }

    static void f(e e1)
    {
        e1.d = null;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof e)
            {
                obj = (e)obj;
                if (a.equals(((e) (obj)).a) && TextUtils.equals(b, ((e) (obj)).b) && TextUtils.equals(c, ((e) (obj)).c) && TextUtils.equals(d, ((e) (obj)).d))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = a.ordinal();
        int i;
        int j;
        if (b != null)
        {
            i = b.hashCode();
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.hashCode();
        } else
        {
            j = 0;
        }
        if (d != null)
        {
            k = d.hashCode();
        }
        return (j + (i + (l + 899) * 31) * 31) * 31 + k;
    }
}
