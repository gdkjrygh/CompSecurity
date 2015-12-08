// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts;

import android.text.TextUtils;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.internal.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.sts:
//            f

public final class b
    implements Serializable
{

    private final String a;
    private final String b;
    private String c;
    private f d;
    private byte e[];
    private String f;
    private long g;
    private boolean h;
    private boolean i;
    private Set j;
    private String k;
    private String l;

    public b(String s, String s1, String s2, f f1)
    {
        o.a(s2, "username");
        a = s;
        b = s1;
        h = false;
        i = true;
        c = s2;
        d = f1;
        e = null;
        l = null;
        j = new HashSet();
    }

    public final void a(long l1)
    {
        g = l1;
    }

    public final void a(f f1)
    {
        com.microsoft.onlineid.internal.k.a(f1, "token");
        d = f1;
    }

    public final void a(String s)
    {
        f = s;
    }

    public final boolean a()
    {
        return TextUtils.isEmpty(a);
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return b;
    }

    public final f e()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj != null && (obj instanceof b))
            {
                if (!com.microsoft.onlineid.internal.k.a(a, ((b) (obj = (b)obj)).a) || h != ((b) (obj)).h || !com.microsoft.onlineid.internal.k.a(c, ((b) (obj)).c) || !com.microsoft.onlineid.internal.k.a(d, ((b) (obj)).d) || !Arrays.equals(e, ((b) (obj)).e))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final String f()
    {
        return f;
    }

    public final String g()
    {
        return k;
    }

    public final int hashCode()
    {
        return com.microsoft.onlineid.internal.k.a(a);
    }
}
