// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.cg.ar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            u, d

public final class l
{
    public static final class a
    {

        public final float a;
        public final float b;
        public final float c;
        private float d;

        public final float a(float f1, float f2, float f3)
        {
            return d / (a * f1 + b * f2 + c * f3);
        }

        public final boolean a()
        {
            return Math.abs(c) >= 0.9F;
        }

        public a(float f1, float f2, float f3, float f4)
        {
            a = f1;
            b = f2;
            c = f3;
            d = f4;
        }
    }

    public static final class b
    {

        public final float a;
        public final float b;

        public b(float f1, float f2)
        {
            a = f1;
            b = f2;
        }
    }


    final byte a[];
    final byte b[];
    byte c[];
    String d[];
    b e[];
    int f;
    private byte g[];
    private a h[];
    private int i;
    private boolean j;

    protected l()
    {
        a = null;
        b = null;
    }

    public l(byte abyte0[], byte abyte1[])
    {
        a = abyte0;
        if (!d())
        {
            throw new IOException();
        }
        b = abyte1;
        if (!e())
        {
            throw new IOException();
        } else
        {
            j = true;
            return;
        }
    }

    private static int a(float f1, int k)
    {
        int j1 = (int)f1;
        int i1;
        if (j1 >= k)
        {
            i1 = j1 - k;
        } else
        {
            i1 = j1;
            if (j1 < 0)
            {
                return j1 + k;
            }
        }
        return i1;
    }

    private static u a(byte abyte0[])
    {
        return new u(new InflaterInputStream(new ByteArrayInputStream(abyte0)));
    }

    private boolean d()
    {
        Object obj;
        if (a == null)
        {
            return false;
        }
        obj = a(a);
        if (((u) (obj)).readUnsignedByte() == 8)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        com.google.android.m4b.maps.bv.d.b("Depth map has unexpected header size");
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        int i1;
        i1 = ((u) (obj)).readUnsignedShort();
        f = ((u) (obj)).readUnsignedShort();
        i = ((u) (obj)).readUnsignedShort();
        if (((u) (obj)).readUnsignedByte() == 8)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        com.google.android.m4b.maps.bv.d.b("Unexpected plane indices offset");
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        g = new byte[f * i];
        ((u) (obj)).readFully(g);
        h = new a[i1];
        int k = 0;
_L2:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        float f1 = ((u) (obj)).readFloat();
        float f2 = ((u) (obj)).readFloat();
        float f3 = ((u) (obj)).readFloat();
        float f4 = ((u) (obj)).readFloat();
        h[k] = new a(f1, f2, f3, f4);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        try
        {
            ((u) (obj)).close();
        }
        catch (IOException ioexception) { }
        return true;
        obj1;
        com.google.android.m4b.maps.bv.d.a("Unable to decompress depth map", ((Throwable) (obj1)));
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        obj1;
        try
        {
            ((u) (obj)).close();
        }
        catch (IOException ioexception1) { }
        throw obj1;
    }

    private boolean e()
    {
        Object obj;
        if (b == null)
        {
            return false;
        }
        obj = a(b);
        if (((u) (obj)).readUnsignedByte() == 8)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        com.google.android.m4b.maps.bv.d.b("SV map has unexpected header size");
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        int j1;
        j1 = ((u) (obj)).readUnsignedShort();
        int k = ((u) (obj)).readUnsignedShort();
        int k1 = ((u) (obj)).readUnsignedShort();
        if (f == k && i == k1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        com.google.android.m4b.maps.bv.d.b("SV matrix dimensions don't match plane matrix.");
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        if (((u) (obj)).readUnsignedByte() == 8)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        com.google.android.m4b.maps.bv.d.b("Unexpected SV indices offset");
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        byte abyte0[];
        c = new byte[f * i];
        ((u) (obj)).readFully(c);
        d = new String[j1];
        d[0] = null;
        abyte0 = new byte[22];
        int i1 = 1;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((u) (obj)).readFully(abyte0);
        d[i1] = new String(abyte0);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        e = new b[j1];
        e[0] = null;
        i1 = 1;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        float f1 = ((u) (obj)).readFloat();
        float f2 = ((u) (obj)).readFloat();
        e[i1] = new b(f1, f2);
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        try
        {
            ((u) (obj)).close();
        }
        catch (IOException ioexception) { }
        return true;
        obj1;
        com.google.android.m4b.maps.bv.d.a("Unable to decompress SV map", ((Throwable) (obj1)));
        try
        {
            ((u) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return false;
        obj1;
        try
        {
            ((u) (obj)).close();
        }
        catch (IOException ioexception1) { }
        throw obj1;
    }

    public final float a(float f1, float f2, float af[])
    {
        c();
        a a1 = a(f1, f2);
        if (a1 == null)
        {
            return 0.0F;
        }
        if (af != null && af.length >= 3)
        {
            af[0] = a1.a;
            af[1] = -a1.c;
            af[2] = a1.b;
        }
        af = new float[3];
        ar.a(f1, f2, af);
        return a1.a(af[0], -af[2], af[1]);
    }

    final int a(float f1)
    {
        return a((float)f * f1, f);
    }

    public final a a(float f1, float f2)
    {
        c();
        c();
        int k = a(f1);
        int i1 = b(f2);
        k = g[k + i1 * f] & 0xff;
        if (k != 0)
        {
            return h[k];
        } else
        {
            return null;
        }
    }

    public final b a(String s)
    {
        c();
        for (int k = 1; k < d.length; k++)
        {
            if (s.equals(d[k]))
            {
                return e[k];
            }
        }

        return null;
    }

    public final boolean a()
    {
        if (j)
        {
            return false;
        } else
        {
            d();
            e();
            j = true;
            return true;
        }
    }

    final int b(float f1)
    {
        return a((1.0F - 2.0F * f1) * (float)i, i);
    }

    public final boolean b()
    {
        if (!j)
        {
            return false;
        } else
        {
            g = null;
            h = null;
            c = null;
            d = null;
            e = null;
            j = false;
            return true;
        }
    }

    final void c()
    {
        if (!j)
        {
            throw new IllegalArgumentException("Depth map must be decompressed");
        } else
        {
            return;
        }
    }
}
