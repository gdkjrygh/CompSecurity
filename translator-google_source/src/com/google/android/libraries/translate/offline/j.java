// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ac, PackageType

public final class j
{

    public ac a;
    String b;
    public String c;
    String d;
    public OfflinePackage.Status e;
    PackageType f;
    int g;
    int h;
    int i;
    long j;
    public long k;
    long l;

    public j(ac ac1, int i1, String s, String s1, PackageType packagetype)
    {
        j = 0x7fffffffffffffffL;
        k = -1L;
        l = -1L;
        a = ac1;
        g = a.b();
        h = ac1.b();
        i = i1;
        b = s;
        c = s1;
        a.f(this);
        e = null;
        f = packagetype;
    }

    public final j a(long l1)
    {
        if (l1 < 0L)
        {
            return this;
        } else
        {
            k = l1;
            return this;
        }
    }

    public final j a(Context context, int i1)
    {
        e = OfflinePackage.Status.ERROR;
        d = context.getString(i1);
        c();
        return this;
    }

    public final String a()
    {
        if (d == null)
        {
            return "";
        } else
        {
            return d;
        }
    }

    public final j b(long l1)
    {
        if (l1 < 0L)
        {
            return this;
        } else
        {
            l = l1;
            return this;
        }
    }

    public final boolean b()
    {
        return j != 0x7fffffffffffffffL;
    }

    public final void c()
    {
        a.d(this);
    }

    public final void d()
    {
        a.e(this);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (j)obj;
        if (c == null)
        {
            if (((j) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((j) (obj)).c))
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((j) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((j) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i1;
        if (c == null)
        {
            i1 = 0;
        } else
        {
            i1 = c.hashCode();
        }
        if (b != null)
        {
            j1 = b.hashCode();
        }
        return (i1 + 31) * 31 + j1;
    }
}
