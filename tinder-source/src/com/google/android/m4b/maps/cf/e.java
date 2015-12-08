// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cf;

import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cf:
//            o

public class e
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/cf/e$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("PERSPECTIVE", 0);
            b = new a("ORTHOGRAPHIC", 1);
            c = new a("USER_SET", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int k)
        {
            super(s1, k);
        }
    }


    private volatile float a[];
    private float b[];
    private float c[];
    private int d;
    private boolean e;
    private final float f = -1F;
    private final float g = 1.0F;
    private final float h = 0.0F;
    private final a i;
    private List j;
    o q;
    float r[];
    float s[];
    boolean t;
    byte u;

    public e(float af[])
    {
        a = new float[16];
        b = new float[16];
        r = new float[16];
        c = new float[16];
        s = new float[16];
        t = false;
        d = 0;
        e = false;
        j = new ArrayList();
        q = null;
        u = 0;
        i = a.c;
        System.arraycopy(af, 0, a, 0, 16);
        t = true;
    }

    private void a()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    final void a(int k, int l)
    {
        float f1 = 1.0F;
        float af[] = s;
        af;
        JVM INSTR monitorenter ;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[i.ordinal()];
        JVM INSTR tableswitch 1 3: default 437
    //                   1 104
    //                   2 292
    //                   3 270;
           goto _L1 _L2 _L3 _L4
_L1:
        String s1 = String.valueOf(i);
        throw new IllegalStateException((new StringBuilder(String.valueOf(s1).length() + 30)).append("Unimplemented projection type ").append(s1).toString());
        Exception exception;
        exception;
        af;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        float af1[] = s;
        if (l != 0) goto _L6; else goto _L5
_L5:
        float f2 = (float)Math.tan(Math.toRadians(0.0D) / 2D) * -1F;
        float f3 = -f2;
        float f4;
        f4 = -f2 / f1;
        f1 = f2 / f1;
        af1[0] = -2F / (f2 - f3);
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = 0.0F;
        af1[4] = 0.0F;
        af1[5] = -2F / (f1 - f4);
        af1[6] = 0.0F;
        af1[7] = 0.0F;
        af1[8] = (f2 + f3) / (f2 - f3);
        af1[9] = (f1 + f4) / (f1 - f4);
        af1[10] = 0.0F;
        af1[11] = -1F;
        af1[12] = 0.0F;
        af1[13] = 0.0F;
        af1[14] = 1.0F;
        af1[15] = 0.0F;
_L4:
        t = true;
        a();
        af;
        JVM INSTR monitorexit ;
        return;
_L6:
        f1 = (float)k / (float)l;
          goto _L5
_L3:
        af1 = s;
        f1 = k;
        f2 = l;
        if (0.0F == f1 || f2 == 0.0F) goto _L4; else goto _L7
_L7:
        af1[0] = 2.0F / (f1 - 0.0F);
        af1[1] = 0.0F;
        af1[2] = 0.0F;
        af1[3] = 0.0F;
        af1[4] = 0.0F;
        af1[5] = 2.0F / (f2 - 0.0F);
        af1[6] = 0.0F;
        af1[7] = 0.0F;
        af1[8] = 0.0F;
        af1[9] = 0.0F;
        af1[10] = -1F;
        af1[11] = 0.0F;
        af1[12] = -(f1 + 0.0F) / (f1 - 0.0F);
        af1[13] = -(f2 + 0.0F) / (f2 - 0.0F);
        af1[14] = 0.0F;
        af1[15] = 1.0F;
          goto _L4
    }

    final boolean a(f.a a1)
    {
        if (a1.d == e && !a1.e)
        {
            return false;
        }
        e = a1.d;
        if (e)
        {
            o o1 = q;
            synchronized (o1.f)
            {
                o1.f.add(this);
            }
            a(q.b, q.c);
        } else
        {
            o o2 = q;
            synchronized (o2.f)
            {
                o2.f.remove(this);
            }
        }
        obj = q;
        if (a1.d != ((o) (obj)).e || a1.e)
        {
            obj.e = a1.d;
        }
        return true;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
        a1;
        list;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void m()
    {
        Matrix.multiplyMM(c, 0, r, 0, a, 0);
        d = d + 1;
    }
}
