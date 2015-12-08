// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import com.google.android.m4b.maps.aa.ae;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ak.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.c;
import com.google.android.m4b.maps.bn.e;
import com.google.android.m4b.maps.bn.g;
import com.google.android.m4b.maps.bn.i;
import com.google.android.m4b.maps.bn.m;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.bm;
import com.google.android.m4b.maps.bo.k;
import com.google.android.m4b.maps.bo.s;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ag;
import com.google.android.m4b.maps.bx.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            d

public final class j extends com.google.android.m4b.maps.cc.d
{
    public static final class a
    {

        ArrayList a;
        final String b[];
        private final ac c;

        public final void a(com.google.android.m4b.maps.bo.ap.b b1)
        {
            c c1 = null;
            do
            {
                if (!b1.hasNext())
                {
                    break;
                }
                Object obj = b1.a();
                if (!(obj instanceof bm))
                {
                    break;
                }
                obj = (bm)obj;
                if (c1 != null && c1.a.equals(((bm) (obj)).b))
                {
                    c1.a(((bm) (obj)));
                } else
                {
                    c1 = new c(((bm) (obj)), b);
                    a.add(c1);
                }
                b1.next();
            } while (true);
        }

        public final j[] a()
        {
            ArrayList arraylist3 = new ArrayList();
            Iterator iterator = a.iterator();
            ArrayList arraylist = new ArrayList();
            b b2 = new b();
            HashSet hashset = new HashSet();
            ArrayList arraylist1 = new ArrayList();
            b b3 = new b();
            HashSet hashset1 = new HashSet();
            e e1 = null;
label0:
            do
            {
                c c1;
label1:
                {
label2:
                    {
                        if (!iterator.hasNext())
                        {
                            break label0;
                        }
                        c1 = (c)iterator.next();
                        if (c1.e != null)
                        {
                            b b1 = new b();
                            com.google.android.m4b.maps.cc.j.a(c1.a, b1);
                            arraylist3.add(new j(c, b1, ae.a(c1), c1.d, (byte)0));
                            continue;
                        }
                        if (c1.b() <= 1)
                        {
                            break label1;
                        }
                        e e2 = new e(c1);
                        HashSet hashset2;
                        ArrayList arraylist2;
                        boolean flag;
                        if (e1 != null && !e2.equals(e1))
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (com.google.android.m4b.maps.cc.j.a(c1.a, b3))
                        {
                            arraylist2 = arraylist1;
                            hashset2 = hashset1;
                            if (!flag)
                            {
                                break label2;
                            }
                        }
                        arraylist3.add(new j(c, b3, arraylist1, hashset1, (byte)0));
                        arraylist2 = new ArrayList();
                        b3.a();
                        com.google.android.m4b.maps.cc.j.a(c1.a, b3);
                        hashset2 = new HashSet();
                    }
                    arraylist2.add(c1);
                    hashset2.addAll(c1.d);
                    e1 = e2;
                    arraylist1 = arraylist2;
                    hashset1 = hashset2;
                    continue;
                }
                if (!com.google.android.m4b.maps.cc.j.a(c1.a, b2))
                {
                    arraylist3.add(new j(c, b2, arraylist, hashset, (byte)0));
                    arraylist = new ArrayList();
                    b2.a();
                    com.google.android.m4b.maps.cc.j.a(c1.a, b2);
                    hashset = new HashSet();
                }
                arraylist.add(c1);
                hashset.addAll(c1.d);
            } while (true);
            if (!arraylist.isEmpty())
            {
                arraylist3.add(new j(c, b2, arraylist, hashset, (byte)0));
            }
            if (!arraylist1.isEmpty())
            {
                arraylist3.add(new j(c, b3, arraylist1, hashset1, (byte)0));
            }
            if (arraylist3.isEmpty())
            {
                return null;
            } else
            {
                return (j[])arraylist3.toArray(new j[arraylist3.size()]);
            }
        }

        public a(ac ac1, String as[])
        {
            a = new ArrayList();
            c = ac1;
            b = as;
        }
    }

    static final class b
    {

        int a;
        int b;

        public final void a()
        {
            b = 0;
            a = 0;
        }

        b()
        {
        }
    }

    public static final class c
    {

        final k a;
        final ArrayList b;
        final ArrayList c;
        final HashSet d;
        com.google.android.m4b.maps.ak.a e;
        private final String f[];

        public final float a()
        {
            Iterator iterator = b.iterator();
            float f1 = 0.0F;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d1 = (d)iterator.next();
                float f2 = Math.abs(d1.a);
                f2 = d1.b / 2.0F + f2;
                if (f2 > f1)
                {
                    f1 = f2;
                }
            } while (true);
            iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                d d2 = (d)iterator.next();
                float f3 = Math.abs(d2.a);
                f3 = d2.b / 2.0F + f3;
                if (f3 > f1)
                {
                    f1 = f3;
                }
            } while (true);
            return f1 * 2.0F;
        }

        public final void a(bm bm1)
        {
            float f1;
            t t1;
            int ai[] = bm1.g;
            int j1 = ai.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                int k1 = ai[i1];
                if (k1 >= 0 && k1 < f.length)
                {
                    d.add(f[k1]);
                }
            }

            t1 = bm1.d;
            f1 = bm1.e;
            if (t1.b() != 1) goto _L2; else goto _L1
_L1:
            c.add(new d(f1, t1, 0));
_L4:
            if (bm1.f)
            {
                e = bm1.a;
            }
            return;
_L2:
            if (t1.b() > 1)
            {
                b.add(new d(f1, t1, 0));
                c.add(new d(f1, t1, 1));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final int b()
        {
            int k1;
            int k3;
            k1 = 1;
            k3 = b.size() + c.size();
            if (k3 != 0) goto _L2; else goto _L1
_L1:
            return k1;
_L2:
            int ai[] = new int[k3];
            k1 = 0;
            while (k1 < k3) 
            {
                d d1;
                int i1;
                if (k1 < b.size())
                {
                    d1 = (d)b.get(k1);
                } else
                {
                    d1 = (d)c.get(k1 - b.size());
                }
                if (d1.d == null)
                {
                    i1 = 1;
                } else
                {
                    int ai1[] = d1.d;
                    int j2 = ai1.length;
                    int l1 = 0;
                    int l2;
                    for (i1 = 0; l1 < j2; i1 = l2 + i1)
                    {
                        l2 = ai1[l1];
                        l1++;
                    }

                    if (d1.d.length % 2 == 1)
                    {
                        i1 *= 2;
                    }
                }
                ai[k1] = i1;
                k1++;
            }
            int j1 = ai[0];
            int k2 = 1;
            do
            {
                k1 = j1;
                if (k2 >= k3)
                {
                    continue;
                }
                int i2;
                int i3;
label0:
                {
                    i3 = ai[k2];
                    if (j1 > 0)
                    {
                        k1 = i3;
                        i2 = j1;
                        if (i3 > 0)
                        {
                            break label0;
                        }
                    }
                    throw new IllegalArgumentException("Greatest common divisor should be computed on numbers greater than zero.");
                }
                int j3;
                do
                {
                    j3 = i2;
                    if (k1 == 0)
                    {
                        break;
                    }
                    i2 = k1;
                    k1 = j3 % k1;
                } while (true);
                j1 = (j1 * i3) / j3;
                k2++;
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        private c()
        {
            b = new ArrayList(2);
            c = new ArrayList(2);
            d = new HashSet();
            a = null;
            f = null;
        }

        public c(bm bm1, String as[])
        {
            b = new ArrayList(2);
            c = new ArrayList(2);
            d = new HashSet();
            a = bm1.b;
            f = as;
            a(bm1);
        }
    }

    static final class d
    {

        final float a;
        final float b;
        final int c;
        final int d[];
        private final int e;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (d)obj;
                if (c != ((d) (obj)).c)
                {
                    return false;
                }
                if (Float.compare(((d) (obj)).a, a) != 0)
                {
                    return false;
                }
                if (Float.compare(((d) (obj)).b, b) != 0)
                {
                    return false;
                }
                if (!Arrays.equals(d, ((d) (obj)).d))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return e;
        }

        public final String toString()
        {
            int i1 = c;
            float f1 = b;
            float f2 = a;
            String s1 = String.valueOf(Arrays.toString(d));
            return (new StringBuilder(String.valueOf(s1).length() + 52)).append("c:").append(i1).append(" w:").append(f1).append(" s:").append(f2).append(" d:").append(s1).toString();
        }

        public d(float f1, t t1, int i1)
        {
            Object obj = null;
            super();
            a = f1;
            b = t1.c[i1].b;
            c = t1.c[i1].a;
            int j1;
            int l1;
            int i2;
            if (t1.d())
            {
                if (t1.b() > i1)
                {
                    t1 = t1.c[i1].c;
                    if (t1.length == 0)
                    {
                        t1 = obj;
                    }
                    d = t1;
                } else
                {
                    if (com.google.android.m4b.maps.ay.ab.a("GLLineGroup", 6))
                    {
                        int k1 = t1.b();
                        Log.e("GLLineGroup", (new StringBuilder(67)).append("Invalid stroke index : ").append(i1).append("  available strokes : ").append(k1).toString());
                    }
                    d = null;
                }
            } else
            {
                d = null;
            }
            j1 = Float.floatToIntBits(a);
            l1 = Float.floatToIntBits(b);
            i2 = c;
            if (d != null)
            {
                i1 = Arrays.hashCode(d);
            } else
            {
                i1 = 0;
            }
            e = i1 + ((j1 * 31 + l1) * 31 + i2) * 31;
        }
    }

    static final class e
    {

        private final List a;
        private final List b;
        private final int c;
        private final float d;
        private final int e;

        private int a()
        {
            return ((a.hashCode() * 31 + b.hashCode()) * 31 + c) * 31 + Float.floatToIntBits(d);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (e)obj;
                if (Float.compare(((e) (obj)).d, d) != 0)
                {
                    return false;
                }
                if (c != ((e) (obj)).c)
                {
                    return false;
                }
                if (!a.equals(((e) (obj)).a))
                {
                    return false;
                }
                if (!b.equals(((e) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return e;
        }

        public e(c c1)
        {
            a = new ArrayList();
            b = new ArrayList();
            d = 0.0F;
            c = 0;
            b.addAll(c1.b);
            a.addAll(c1.c);
            e = a();
        }

        public e(List list, float f1, int i1, boolean flag)
        {
            a = new ArrayList();
            b = new ArrayList();
            d = f1;
            c = i1;
            if (flag)
            {
                list = (c)list.get(0);
                b.addAll(((c) (list)).b);
                a.addAll(((c) (list)).c);
            } else
            {
                list = list.iterator();
                while (list.hasNext()) 
                {
                    c c1 = (c)list.next();
                    b.addAll(c1.b);
                    a.addAll(c1.c);
                }
            }
            e = a();
        }
    }


    private static float c = 1.0F;
    private static final Map q = new WeakHashMap();
    private final ac d;
    private final List e;
    private final com.google.android.m4b.maps.bn.k f;
    private final com.google.android.m4b.maps.bn.c g;
    private final g h;
    private com.google.android.m4b.maps.bm.j i;
    private final int j;
    private final int k;
    private final boolean l;
    private final float m;
    private int n;
    private com.google.android.m4b.maps.ak.a o;
    private final e p;

    private j(ac ac1, b b1, List list, Set set)
    {
        super(set);
        d = ac1;
        f = new m(b1.a, (byte)0);
        g = new com.google.android.m4b.maps.bn.e(b1.b, (byte)0);
        h = new i(b1.a, (byte)0);
        e = list;
        int i1 = 0;
        float f1 = 1.0F;
        int j1 = ((c)e.get(0)).b();
        boolean flag;
        if (j1 > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (l)
        {
            i1 = (int)Math.ceil(j1 / 16);
            f1 = Math.max(1.0F, ((c)e.get(0)).a());
            i1 = i1 * 2 + 0;
            break MISSING_BLOCK_LABEL_152;
        }
        c c1;
        k k1;
        com.google.android.m4b.maps.bo.g g1;
        int l1;
        for (b1 = e.iterator(); b1.hasNext();)
        {
            set = (c)b1.next();
            j1 = set.b();
            f1 = Math.max(f1, set.a());
            i1 += j1;
        }

        j1 = 0;
          goto _L1
_L3:
        for (j1 = 0; 1 << j1 < i1; j1++) { }
        j = j1;
        f1 = (float)Math.ceil(c * f1) + 2.0F;
        k = com.google.android.m4b.maps.bm.j.a((int)f1, 8);
        m = (float)k / f1;
        p = new e(e, m, j, l);
        f1 = ((f1 * (float)ac1.d().f()) / 256F) * 0.5F;
        b1 = com.google.android.m4b.maps.bm.e.a();
        i1 = 0;
        while (i1 < list.size()) 
        {
            set = ac1.d();
            c1 = (c)list.get(i1);
            k1 = c1.a;
            j1 = k1.a.length / 3;
            if (j1 >= 2)
            {
                o = c1.e;
                g1 = set.c();
                l1 = set.f();
                if (!l)
                {
                    b1.a(k1, f1, true, g1, l1, 1.0F, f, g, null);
                    l1 = j;
                    set = h;
                    com.google.android.m4b.maps.bm.e.a(j1, l1, new int[] {
                        i1
                    }, set);
                } else
                {
                    b1.a(k1, f1, true, g1, l1, 2048F / (float)c1.b(), f, g, h);
                }
            }
            i1++;
        }
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    j(ac ac1, b b1, List list, Set set, byte byte0)
    {
        this(ac1, b1, list, set);
    }

    private static com.google.android.m4b.maps.bm.j a(com.google.android.m4b.maps.bm.d d1, e e1)
    {
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorenter ;
        d1 = (Map)q.get(d1);
        if (d1 != null) goto _L2; else goto _L1
_L1:
        d1 = null;
_L4:
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorexit ;
        return d1;
_L2:
        d1 = (com.google.android.m4b.maps.bm.j)d1.get(e1);
        if (true) goto _L4; else goto _L3
_L3:
        d1;
        throw d1;
    }

    public static void a(float f1)
    {
        c = f1;
    }

    public static void a(com.google.android.m4b.maps.bm.d d1)
    {
        GL10 gl10 = d1.a;
        d1.c();
        gl10.glBlendFunc(1, 771);
        gl10.glTexEnvx(8960, 8704, 8448);
        d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
    }

    private static void a(com.google.android.m4b.maps.bm.d d1, e e1, com.google.android.m4b.maps.bm.j j1)
    {
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorenter ;
        Map map = (Map)q.get(d1);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        obj = ax.b();
        q.put(d1, obj);
        ((Map) (obj)).put(e1, j1);
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    private static void a(ArrayList arraylist, Canvas canvas, Paint paint, float f1, float f2, float f3, int i1)
    {
        float f6 = (float)canvas.getHeight() / (float)i1;
        int l1 = 0;
        while (l1 < arraylist.size()) 
        {
            d d1 = (d)arraylist.get(l1);
            float f7 = f1 + d1.a * f3;
            float f8 = d1.b * f3 * 0.5F;
            paint.setColor(d1.c);
            int ai[] = d1.d;
            if (ai == null)
            {
                if (i1 == 1)
                {
                    canvas.drawLine(f7 - f8, f2 + 0.5F, f7 + f8, f2 + 0.5F, paint);
                } else
                {
                    canvas.drawRect(f7 - f8, 0.0F, f7 + f8, canvas.getHeight(), paint);
                }
            } else
            {
                int j1 = 0;
                int k1 = 1;
                float f4 = f2;
                while (j1 < i1) 
                {
                    int i2 = 0;
                    boolean flag = k1;
                    k1 = j1;
                    j1 = ((flag) ? 1 : 0);
                    int j2;
                    for (; i2 <= ai.length % 2; i2 = j2)
                    {
                        int i3 = ai.length;
                        j2 = 0;
                        int k2 = j1;
                        j1 = k1;
                        k1 = k2;
                        while (j2 < i3) 
                        {
                            int l2 = ai[j2];
                            float f5 = f4 + ((float)l2 / 16F) * (f6 * 16F);
                            if (k1 != 0)
                            {
                                canvas.drawRect(f7 - f8, f4, f7 + f8, f5, paint);
                            }
                            if (k1 == 0)
                            {
                                k1 = 1;
                            } else
                            {
                                k1 = 0;
                            }
                            j1 += l2;
                            j2++;
                            f4 = f5;
                        }
                        j2 = i2 + 1;
                        i2 = j1;
                        j1 = k1;
                        k1 = i2;
                    }

                    i2 = k1;
                    k1 = j1;
                    j1 = i2;
                }
            }
            l1++;
        }
    }

    static boolean a(k k1, b b1)
    {
        byte byte0 = 0;
        boolean flag = false;
        int i1 = k1.a.length / 3 - 1;
        if (i1 <= 0)
        {
            flag = true;
        } else
        {
            int j1 = i1 * 5;
            if (b1.a <= 0 || b1.a + j1 <= 16384)
            {
                b1.a = j1 + b1.a;
                j1 = b1.b;
                if (k1.d())
                {
                    byte0 = 3;
                }
                b1.b = byte0 + (i1 * 3 - 1) * 3 + j1;
                return true;
            }
        }
        return flag;
    }

    private static void b(com.google.android.m4b.maps.bm.d d1, e e1)
    {
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorenter ;
        d1 = (Map)q.get(d1);
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        d1.remove(e1);
        com/google/android/m4b/maps/cc/j;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }

    private void d(com.google.android.m4b.maps.bm.d d1)
    {
        if (i != null)
        {
            i.c();
            if (i.l == 0)
            {
                b(d1, p);
            }
            i = null;
        }
    }

    public final int a()
    {
        int j1 = f.c() + g.c() + h.b();
        int i1 = j1;
        if (i != null)
        {
            i1 = j1 + i.h;
        }
        return i1;
    }

    public final void a(com.google.android.m4b.maps.bm.d d1, com.google.android.m4b.maps.bi.b b1, ab ab1)
    {
        if (ab1.c.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.google.android.m4b.maps.ak.a a1;
        if (o == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ab1 = ab1.c;
        a1 = o;
        if ((h)((ag) (ab1)).c.get(a1) == null) goto _L1; else goto _L3
_L3:
        int k1 = Math.max(0, Math.round((b1.b.b - (float)d.a) / 0.5F));
        if (i == null)
        {
            i = a(d1, p);
            float f4;
            if (i == null)
            {
                b1 = Bitmap.createBitmap(k, 1 << j, android.graphics.Bitmap.Config.ARGB_4444);
                b1.eraseColor(0);
                ab1 = e;
                float f1 = m;
                boolean flag = l;
                Canvas canvas = new Canvas(b1);
                Paint paint = new Paint();
                paint.setStrokeWidth(1.0F);
                paint.setAntiAlias(true);
                float f3 = (float)b1.getWidth() * 0.5F;
                int i1;
                int j1;
                if (flag)
                {
                    i1 = 1;
                } else
                {
                    i1 = ab1.size();
                }
                for (j1 = 0; j1 < i1; j1++)
                {
                    c c1 = (c)ab1.get(j1);
                    int l1 = c1.b();
                    float f5 = j1;
                    a(c1.b, canvas, paint, f3, f5, f1, l1);
                    a(c1.c, canvas, paint, f3, f5, f1, l1);
                }

                i = new com.google.android.m4b.maps.bm.j(d1);
                a(d1, p, i);
                i.d = true;
                i.c = true;
                i.b(b1);
                b1.recycle();
            } else
            {
                i.b();
            }
        }
        n = k1;
        if (k1 != 0)
        {
            d1.a.glMatrixMode(5890);
            d1.a.glLoadIdentity();
            d1.a.glTranslatef(0.5F, 0.5F, 0.0F);
            b1 = d1.a;
            f4 = k1;
            float f2;
            if (l)
            {
                f2 = (float)k1 + 1.0F;
            } else
            {
                f2 = 1.0F;
            }
            b1.glScalef(1.0F + f4, f2, 0.0F);
            d1.a.glTranslatef(-0.5F, -0.5F, 0.0F);
            d1.a.glMatrixMode(5888);
        }
        i.a(d1.a);
        f.d(d1);
        h.d(d1);
        g.a(d1, 4);
        if (k1 != 0)
        {
            d1.a.glMatrixMode(5890);
            d1.a.glLoadIdentity();
            d1.a.glMatrixMode(5888);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int b()
    {
        Iterator iterator = e.iterator();
        c c1;
        int i1;
        int j1;
        int k1;
        for (i1 = 608; iterator.hasNext(); i1 = (c1.c.size() + k1) * 24 + j1 + i1)
        {
            c1 = (c)iterator.next();
            j1 = 208;
            if (c1.a != null)
            {
                j1 = c1.a.f() + 208;
            }
            k1 = c1.b.size();
        }

        return f.d() + g.d() + h.c() + i1;
    }

    public final void b(com.google.android.m4b.maps.bm.d d1)
    {
        d(d1);
        f.b(d1);
        g.b(d1);
        h.b(d1);
    }

    public final void c(com.google.android.m4b.maps.bm.d d1)
    {
        d(d1);
        f.c(d1);
        g.c(d1);
        h.c(d1);
    }

}
