// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.aq.b;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cq.c;
import com.google.android.m4b.maps.model.LatLng;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            t, l, d, ad

public final class q
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new q(parcel);
        }

        public final Object[] newArray(int i1)
        {
            return new q[i1];
        }

    };
    public static final long a;
    public float A;
    public int B;
    long C;
    private float D;
    private float E[];
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public LatLng j;
    public int k;
    public String l;
    public String m;
    public String n;
    public int o;
    public boolean p;
    public boolean q;
    public int r;
    public List s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public t y[];
    public l z;

    public q(Parcel parcel)
    {
        p = false;
        q = false;
        C = System.currentTimeMillis();
        if (parcel.readInt() != 6)
        {
            throw new IllegalArgumentException("unknown version");
        }
        byte abyte0[];
        int i1;
        int j1;
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = parcel.readInt();
        d = 0;
        e = parcel.readInt();
        f = parcel.readInt();
        g = parcel.readInt();
        h = parcel.readInt();
        i = parcel.readString();
        i1 = parcel.readInt();
        j1 = parcel.readInt();
        j = new LatLng((double)i1 * 9.9999999999999995E-07D, (double)j1 * 9.9999999999999995E-07D);
        k = parcel.readInt();
        l = parcel.readString();
        m = parcel.readString();
        n = parcel.readString();
        o = parcel.readInt();
        r = parcel.readInt();
        t = parcel.readFloat();
        u = parcel.readFloat();
        v = parcel.readFloat();
        w = parcel.readFloat();
        x = parcel.readFloat();
        y = (t[])parcel.createTypedArray(t.CREATOR);
        C = parcel.readLong();
        abyte0 = parcel.createByteArray();
        parcel = parcel.createByteArray();
        try
        {
            z = new l(abyte0, parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            z = null;
        }
        d();
    }

    public q(a a1)
    {
        float f2;
        a a2;
        a a5;
        p = false;
        q = false;
        C = System.currentTimeMillis();
        a a3 = a1.f(1);
        a5 = a1.f(33);
        a2 = a1.f(49);
        a1 = a1.f(58);
        b = a3.b(2);
        c = a3.d(3);
        d = a(a3, 17, 0, 0x186a0);
        if (c != 0)
        {
            int i1 = c;
            int k1 = d;
            com.google.android.m4b.maps.bv.d.a((new StringBuilder(44)).append("infoLevel=").append(i1).append(", infoValue=").append(k1).toString());
        }
        e = a(a3, 4, 1, 32768);
        f = a(a3, 5, 1, 32768);
        g = a(a3, 6, 1, 2880);
        h = a(a3, 7, 1, 2880);
        i = a3.g(8);
        k = a(a3, 9, 1, 14);
        a a6 = a3.f(10);
        j = new LatLng((double)a6.d(1) * 9.9999999999999995E-07D, (double)a6.d(2) * 9.9999999999999995E-07D);
        l = a3.g(11);
        m = a3.g(12);
        n = a3.g(13);
        o = a3.d(61);
        t = a(a5.d(34));
        u = a(a5.d(35));
        f2 = (float)a5.d(36) * 1E-06F;
        if (f2 >= -89.9F) goto _L2; else goto _L1
_L1:
        float f1 = -89.9F;
_L9:
        v = f1;
        r = 0;
        if (!a5.i(38)) goto _L4; else goto _L3
_L3:
        a5.d(38);
        JVM INSTR tableswitch 3 4: default 404
    //                   3 539
    //                   4 547;
           goto _L4 _L5 _L6
_L4:
        w = a(a5, 40, 0xfaa2b580);
        x = a(a5, 41, 0x55d4a80);
        if (w > x)
        {
            f1 = w;
            w = x;
            x = f1;
        }
        int l1 = a2.j(52);
        y = new t[l1];
        for (int j1 = 0; j1 < l1; j1++)
        {
            a a4 = a2.c(52, j1);
            y[j1] = new t(a4);
        }

        break; /* Loop/switch isn't completed */
_L2:
        f1 = f2;
        if (f2 > 89.9F)
        {
            f1 = 89.9F;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        r = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        r = 1;
        if (true) goto _L4; else goto _L7
_L7:
        if (a1 != null && a1.i(59) && a1.i(60))
        {
            try
            {
                z = new l(a1.c(59), a1.c(60));
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                z = null;
            }
        }
        d();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static float a(int i1)
    {
        return (float)(i1 % 0x15752a00) * 1E-06F;
    }

    private static float a(a a1, int i1, int j1)
    {
        i1 = a(a1, i1, 0xfaa2b580, 0x55d4a80);
        if (i1 != 0)
        {
            j1 = i1;
        }
        return (float)j1 * 1E-06F;
    }

    private static int a(a a1, int i1, int j1, int k1)
    {
        i1 = a1.d(i1);
        if (i1 < j1)
        {
            return j1;
        }
        if (i1 > k1)
        {
            return k1;
        } else
        {
            return i1;
        }
    }

    public static int a(t at[], float f1)
    {
        float f2;
        int i1;
        byte byte0;
        i1 = -1;
        f2 = 120F;
        byte0 = i1;
        if (at == null) goto _L2; else goto _L1
_L1:
        int j1;
        int k1;
        k1 = at.length;
        j1 = 0;
_L4:
        byte0 = i1;
        if (j1 >= k1) goto _L2; else goto _L3
_L3:
        float f4 = ar.b(f1 - at[j1].a);
        float f3 = f4;
        if (f4 > 180F)
        {
            f3 = 360F - f4;
        }
        if (f3 < f2)
        {
            i1 = j1;
        } else
        {
            f3 = f2;
        }
        j1++;
        f2 = f3;
        if (true) goto _L4; else goto _L2
_L2:
        return byte0;
    }

    public static q a(InputStream inputstream)
    {
        SystemClock.uptimeMillis();
        a a1 = new a(c.a);
        a1.a(inputstream);
        return new q(a1);
    }

    public static String a(String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return "config_".concat(s1);
        } else
        {
            return new String("config_");
        }
    }

    private void d()
    {
        D = ar.p(u);
        if (D < 0.0F)
        {
            D = D + 6.283185F;
        }
        A = ar.p(v);
        B = ar.a(e, f, g, h);
        s = new ArrayList();
        switch (r)
        {
        default:
            throw new IllegalStateException("Unrecognized projection type.");

        case 0: // '\0'
            s.add(new ad(i, 0, 0, -1, 0));
            return;

        case 1: // '\001'
            s.add(new ad(i, 0, 0, 1, 0));
            break;
        }
        s.add(new ad(i, 0, 0, 2, 0));
        s.add(new ad(i, 0, 0, 3, 0));
        s.add(new ad(i, 0, 0, 4, 0));
        s.add(new ad(i, 0, 0, 5, 0));
        s.add(new ad(i, 0, 0, 6, 0));
    }

    public final void a(float f1, float f2, float f3, float af[])
    {
        int i1 = 0;
        float af1[] = new float[4];
        af1[0] = f1;
        af1[1] = f2;
        af1[2] = f3;
        af1[3] = 1.0F;
        float af2[] = new float[16];
        Matrix.setRotateM(af2, 0, t + 180F, 0.0F, 1.0F, 0.0F);
        Matrix.multiplyMM(af2, 0, af2, 0, c(), 0);
        Matrix.multiplyMV(af1, 0, af2, 0, af1, 0);
        for (; i1 < 3; i1++)
        {
            af[i1] = af1[i1];
        }

    }

    public final void a(float f1, float f2, float af[])
    {
        af[0] = f1 - ar.m(t) - 0.5F;
        af[1] = f2 - (float)Math.cos(ar.l(f1) - ar.p(u)) * ar.k(A);
    }

    public final boolean a()
    {
        return (c & 0x40) != 0;
    }

    public final boolean b()
    {
        return (c & 0x41) != 0;
    }

    public final float[] c()
    {
        if (E == null)
        {
            E = new float[16];
            float f1 = u - t;
            Matrix.setRotateM(E, 0, f1, 0.0F, 1.0F, 0.0F);
            Matrix.rotateM(E, 0, v, 1.0F, 0.0F, 0.0F);
            Matrix.rotateM(E, 0, -f1, 0.0F, 1.0F, 0.0F);
        }
        return E;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        String s1 = i;
        String s2 = m;
        return (new StringBuilder(String.valueOf(s1).length() + 8 + String.valueOf(s2).length())).append(s1).append(" text=\"").append(s2).append("\"").toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(6);
        int j1;
        if (b)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeInt(c);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
        parcel.writeInt(h);
        parcel.writeString(i);
        parcel.writeInt(com.google.android.m4b.maps.aq.b.a(j.b));
        parcel.writeInt(com.google.android.m4b.maps.aq.b.a(j.c));
        parcel.writeInt(k);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeInt(o);
        parcel.writeInt(r);
        parcel.writeFloat(t);
        parcel.writeFloat(u);
        parcel.writeFloat(v);
        parcel.writeFloat(w);
        parcel.writeFloat(x);
        parcel.writeTypedArray(y, i1);
        parcel.writeLong(C);
        if (z != null)
        {
            parcel.writeByteArray(z.a);
            parcel.writeByteArray(z.b);
            return;
        } else
        {
            parcel.writeByteArray(new byte[0]);
            parcel.writeByteArray(new byte[0]);
            return;
        }
    }

    static 
    {
        a = TimeUnit.HOURS.toMillis(2L);
    }
}
