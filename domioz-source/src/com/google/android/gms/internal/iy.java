// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nj, nh, ix

public final class iy extends nj
{

    public boolean a;
    public String b;
    public long c;
    public double d;
    public ix e;

    public iy()
    {
        a = false;
        b = "";
        c = 0L;
        d = 0.0D;
        e = null;
        o = null;
        p = -1;
    }

    protected final int a()
    {
        int j = super.a();
        int i = j;
        if (a)
        {
            i = j + (nh.b(1) + 1);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + nh.b(2, b);
        }
        i = j;
        if (c != 0L)
        {
            i = j + nh.b(3, c);
        }
        j = i;
        if (Double.doubleToLongBits(d) != Double.doubleToLongBits(0.0D))
        {
            j = i + (nh.b(4) + 8);
        }
        i = j;
        if (e != null)
        {
            i = j + nh.b(5, e);
        }
        return i;
    }

    public final void a(nh nh1)
    {
        if (a)
        {
            nh1.a(1, a);
        }
        if (!b.equals(""))
        {
            nh1.a(2, b);
        }
        if (c != 0L)
        {
            nh1.a(3, c);
        }
        if (Double.doubleToLongBits(d) != Double.doubleToLongBits(0.0D))
        {
            nh1.a(4, d);
        }
        if (e != null)
        {
            nh1.a(5, e);
        }
        super.a(nh1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof iy)) goto _L4; else goto _L3
_L3:
        obj = (iy)obj;
        flag = flag1;
        if (a != ((iy) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((iy) (obj)).b != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (c != ((iy) (obj)).c) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (Double.doubleToLongBits(d) != Double.doubleToLongBits(((iy) (obj)).d)) goto _L4; else goto _L10
_L10:
        if (e != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        flag = flag1;
        if (((iy) (obj)).e != null) goto _L4; else goto _L11
_L11:
        return a(((nj) (obj)));
_L7:
        if (!b.equals(((iy) (obj)).b))
        {
            return false;
        }
          goto _L8
        if (!e.equals(((iy) (obj)).e))
        {
            return false;
        }
          goto _L11
    }

    public final int hashCode()
    {
        int j = 0;
        char c1;
        int i;
        int k;
        int l;
        long l1;
        if (a)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        k = (int)(c ^ c >>> 32);
        l1 = Double.doubleToLongBits(d);
        l = (int)(l1 ^ l1 >>> 32);
        if (e != null)
        {
            j = e.hashCode();
        }
        return ((((i + (c1 + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + c();
    }
}
