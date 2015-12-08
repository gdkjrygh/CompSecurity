// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.z:
//            n, h

final class j extends n
    implements h, Serializable
{

    private static final long serialVersionUID = 0x6499de12a37d0a3dL;

    public j()
    {
    }

    private long d()
    {
        long l = d;
        n.a aa[] = c;
        long l1 = l;
        if (aa != null)
        {
            int k = aa.length;
            int i = 0;
            do
            {
                l1 = l;
                if (i >= k)
                {
                    break;
                }
                n.a a1 = aa[i];
                l1 = l;
                if (a1 != null)
                {
                    l1 = l + a1.a;
                }
                i++;
                l = l1;
            } while (true);
        }
        return l1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        e = 0;
        c = null;
        d = objectinputstream.readLong();
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeLong(d());
    }

    final long a(long l, long l1)
    {
        return l + l1;
    }

    public final void a()
    {
        a(1L);
    }

    public final void a(long l)
    {
        n.a aa[] = c;
        if (aa != null) goto _L2; else goto _L1
_L1:
        long l1 = d;
        if (b(l1, l1 + l)) goto _L3; else goto _L2
_L2:
        n.b b;
        int i;
        boolean flag;
        boolean flag1;
        flag1 = true;
        b = (n.b)a.get();
        i = b.a;
        flag = flag1;
        if (aa == null) goto _L5; else goto _L4
_L4:
        int k;
        k = aa.length;
        flag = flag1;
        if (k <= 0) goto _L5; else goto _L6
_L6:
        n.a a1;
        a1 = aa[i & k - 1];
        flag = flag1;
        if (a1 == null) goto _L5; else goto _L7
_L7:
        l1 = a1.a;
        flag = a1.a(l1, l1 + l);
        if (flag) goto _L3; else goto _L5
_L5:
        k = b.a;
        i = 0;
_L16:
        a1 = super.c;
        if (a1 == null) goto _L9; else goto _L8
_L8:
        int i1 = a1.length;
        if (i1 <= 0) goto _L9; else goto _L10
_L10:
        Object obj = a1[i1 - 1 & k];
        if (obj != null) goto _L12; else goto _L11
_L11:
        i1 = super.e;
        a1 = new n.a(l);
        i1 = super.e;
        if (!b()) goto _L14; else goto _L13
_L13:
        int j1 = 0;
        obj = super.c;
        i1 = j1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        int k1 = obj.length;
        i1 = j1;
        if (k1 > 0)
        {
            k1 = k1 - 1 & k;
            i1 = j1;
            if (obj[k1] == null)
            {
                obj[k1] = a1;
                i1 = 1;
            }
        }
        super.e = 0;
        if (i1 == 0) goto _L16; else goto _L15
_L15:
        b.a = k;
_L3:
        return;
        Exception exception;
        exception;
        super.e = 0;
        throw exception;
_L14:
        i = 0;
_L17:
        k = k << 13 ^ k;
        k ^= k >>> 17;
        k ^= k << 5;
        break; /* Loop/switch isn't completed */
_L12:
label0:
        {
            if (flag)
            {
                break label0;
            }
            flag = true;
        }
          goto _L17
        l1 = ((n.a) (obj)).a;
        if (((n.a) (obj)).a(l1, a(l1, l))) goto _L15; else goto _L18
_L18:
        if (i1 >= n.b || super.c != a1)
        {
            i = 0;
        } else
        {
label1:
            {
                if (i != 0)
                {
                    break label1;
                }
                i = 1;
            }
        }
          goto _L17
        j1 = super.e;
        if (!b()) goto _L17; else goto _L19
_L19:
        n.a aa1[];
        if (super.c == a1)
        {
            aa1 = new n.a[i1 << 1];
            break MISSING_BLOCK_LABEL_417;
        }
          goto _L20
_L22:
        super.c = aa1;
_L20:
        super.e = 0;
        i = 0;
        break; /* Loop/switch isn't completed */
        exception1;
        super.e = 0;
        throw exception1;
_L9:
        i1 = super.e;
        if (super.c != a1 || !b())
        {
            break MISSING_BLOCK_LABEL_533;
        }
        i1 = 0;
        if (super.c != a1)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        a1 = new n.a[2];
        a1[k & 1] = new n.a(l);
        super.c = a1;
        i1 = 1;
        super.e = 0;
        if (i1 != 0) goto _L15; else goto _L21
_L21:
        break; /* Loop/switch isn't completed */
        exception1;
        super.e = 0;
        throw exception1;
        l2 = super.d;
        if (!b(l2, a(l2, l))) goto _L16; else goto _L15
        Exception exception1;
        long l2;
        i = 0;
        while (i < i1) 
        {
            aa1[i] = a1[i];
            i++;
        }
          goto _L22
    }

    public final double doubleValue()
    {
        return (double)d();
    }

    public final float floatValue()
    {
        return (float)d();
    }

    public final int intValue()
    {
        return (int)d();
    }

    public final long longValue()
    {
        return d();
    }

    public final String toString()
    {
        return Long.toString(d());
    }
}
