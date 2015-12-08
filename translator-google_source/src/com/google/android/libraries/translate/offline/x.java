// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;


// Referenced classes of package com.google.android.libraries.translate.offline:
//            PackageType

public final class x
{

    public int a;
    public int b;
    int c;
    private PackageType d;

    public x(int i, int j, int k, PackageType packagetype)
    {
        a = -1;
        b = -1;
        c = -1;
        d = null;
        a = i;
        b = j;
        c = k;
        d = packagetype;
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder("_");
        stringbuilder.append(a);
        stringbuilder.append("_");
        stringbuilder.append(b);
        return stringbuilder.toString();
    }

    public final boolean a(x x1)
    {
        if (x1 != null)
        {
            if (x1.d != d)
            {
                return false;
            }
            if (x1.a >= a && (x1.a != a || x1.b >= b))
            {
                return false;
            }
        }
        return true;
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
        obj = (x)obj;
        if (a != ((x) (obj)).a)
        {
            return false;
        }
        if (b != ((x) (obj)).b)
        {
            return false;
        }
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((x) (obj)).d == null) goto _L1; else goto _L3
_L3:
        return false;
        if (d.equals(((x) (obj)).d)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = a;
        int k = b;
        int i;
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.hashCode();
        }
        return i + ((j + 31) * 31 + k) * 31;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("mv=");
        stringbuilder.append(a);
        stringbuilder.append(",rv=");
        stringbuilder.append(b);
        stringbuilder.append(",pmv=");
        stringbuilder.append(c);
        stringbuilder.append(",type=");
        stringbuilder.append(d);
        return stringbuilder.toString();
    }
}
