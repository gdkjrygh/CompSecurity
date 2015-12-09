// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class epj
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    int j;
    public ArrayList k;
    public final epk l;
    public final epf m;
    private epg n = new epg() {

        private epj a;

        public final void a(Object obj)
        {
            int j1;
            j1 = 1;
            obj = (fip)obj;
            if (a.j == 0x80000000 || obj == null) goto _L2; else goto _L1
_L1:
            epj epj1;
            int l1;
            epj1 = a;
            int i1 = ((fip) (obj)).getUnrangedLength();
            boolean flag;
            if (epj1.a != i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (i1 < epj1.a)
                {
                    if (i1 == 0)
                    {
                        epj1.a();
                    } else
                    if (epj1.b + epj1.k.size() > i1)
                    {
                        epj1.c((epj1.b + epj1.k.size()) - i1);
                    }
                }
                epj1.a = i1;
                if (epj1.c != 0x80000000)
                {
                    epj1.g = true;
                }
            }
            obj = ((Object) (((fip) (obj)).getItems()));
            if (obj.length <= 0) goto _L4; else goto _L3
_L3:
            epj1 = a;
            l1 = a.j;
            if (epj1.b != 0x80000000 && obj.length + l1 >= epj1.b && l1 <= epj1.b + epj1.k.size()) goto _L6; else goto _L5
_L5:
            epj1.k.clear();
            epj1.k.addAll(Arrays.asList(((Object []) (obj))));
            epj1.b = l1;
            epj1.c = l1;
            epj1.d = obj.length + l1;
_L4:
            if (a.h || flag)
            {
                if (a.a == 0 || a.e >= a.b && a.e < a.b + a.k.size())
                {
                    a.h = false;
                }
                a.l.a();
            }
_L2:
            a.i = false;
            if (a.a > 0)
            {
                a.b();
            }
            return;
_L6:
            boolean flag1;
            int k1;
            int i2;
            flag1 = j1;
            if (epj1.c != 0x80000000)
            {
                if (obj.length + l1 >= epj1.c && l1 <= epj1.d)
                {
                    flag1 = j1;
                } else
                {
                    flag1 = false;
                }
            }
            j1 = obj.length;
            k1 = Math.max(epj1.b - l1, 0);
            j1 = (Math.max((j1 + l1) - epj1.b - epj1.k.size(), 0) + k1 + epj1.k.size()) - 10000;
            if (j1 <= 0) goto _L8; else goto _L7
_L7:
            if (l1 < epj1.b) goto _L10; else goto _L9
_L9:
            epj1.b(j1);
            epj1.b = j1 + epj1.b;
            if (epj1.c != 0x80000000)
            {
                epj1.c = Math.max(epj1.c, epj1.b);
            }
_L8:
            k1 = Math.max(0, epj1.b - l1);
            i2 = Math.max(0, (obj.length + l1) - epj1.b - epj1.k.size());
            for (j1 = k1; j1 < obj.length - i2; j1++)
            {
                epj1.k.set((l1 + j1) - epj1.b, obj[j1]);
            }

            break; /* Loop/switch isn't completed */
_L10:
            epj1.c(j1);
            if (epj1.c != 0x80000000)
            {
                epj1.d = Math.min(epj1.d, epj1.b + epj1.k.size());
            }
            if (true) goto _L8; else goto _L11
_L11:
            if (k1 > 0)
            {
                epj1.k.addAll(0, Arrays.asList(((Object []) (obj))).subList(0, k1));
            }
            if (i2 > 0)
            {
                epj1.k.addAll(Arrays.asList(((Object []) (obj))).subList(obj.length - i2, obj.length));
            }
            epj1.b = Math.min(epj1.b, l1);
            if (flag1)
            {
                if (epj1.c == 0x80000000)
                {
                    epj1.c = l1;
                    epj1.d = obj.length + l1;
                } else
                {
                    epj1.c = Math.min(epj1.c, l1);
                    epj1.d = Math.max(epj1.d, obj.length + l1);
                }
            }
            if (true) goto _L4; else goto _L12
_L12:
        }

        public final void a(String s)
        {
            Logger.c("Failed loading items: %s", new Object[] {
                s
            });
        }

            
            {
                a = epj.this;
                super();
            }
    };

    public epj(epk epk, epf epf1)
    {
        this(epk, epf1, (byte)0);
    }

    private epj(epk epk, epf epf1, byte byte0)
    {
        b = 0x80000000;
        c = 0x80000000;
        e = 0x80000000;
        k = new ArrayList();
        l = epk;
        m = epf1;
    }

    private static transient int a(int ai[])
    {
        int i1 = 0x7fffffff;
        for (int j1 = 0; j1 < 4; j1++)
        {
            int k1 = ai[j1];
            if (k1 < i1)
            {
                i1 = k1;
            }
        }

        return i1;
    }

    private void a(int i1, int j1)
    {
        if (j1 > 0)
        {
            i = true;
            j = i1;
            m.a(Integer.valueOf(i1), Integer.valueOf(j1));
            m.a(n);
        }
    }

    private void a(boolean flag, int i1)
    {
        int i3 = b + k.size();
        int j1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (flag)
        {
            l2 = c;
            j2 = d;
            i2 = Math.max(0, e - c);
            l1 = Math.max(0, d - e);
            boolean flag1;
            if (c != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (d != a)
            {
                j1 = 1;
                k2 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 0;
                k2 = ((flag1) ? 1 : 0);
            }
        } else
        {
            l2 = b;
            i2 = Math.max(0, e - b);
            l1 = Math.max(0, i3 - e);
            boolean flag2;
            if (b != 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (i3 != a)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            j2 = i3;
            k2 = j1;
            j1 = ((flag2) ? 1 : 0);
        }
        if (k2 != 0 && (j1 == 0 || i2 < l1))
        {
            if (i3 == a)
            {
                j1 = 10000 - k.size();
            } else
            {
                j1 = 0;
            }
            j1 = Math.max(j1, 5000 - i2);
            i1 = a(new int[] {
                (i1 + 16) - i2, l2, d(i2), j1
            });
            if (i1 > 0 && (i1 >= 16 || i1 == l2))
            {
                a(l2 - i1, i1);
            }
        } else
        if (j1 != 0)
        {
            int k1;
            if (b == 0)
            {
                k1 = 10000 - k.size();
            } else
            {
                k1 = 0;
            }
            k1 = Math.max(k1, 5000 - l1);
            i1 = a(new int[] {
                (i1 + 16) - l1, a - j2, d(l1), k1
            });
            if (i1 > 0 && (i1 >= 16 || i1 + j2 == a))
            {
                a(j2, i1);
                return;
            }
        }
    }

    private static int d(int i1)
    {
        return Math.max(Math.min(i1 / 16 + 1 << 4, 512), 16);
    }

    public final Object a(int i1)
    {
        if (i1 < b || i1 >= b + k.size()) goto _L2; else goto _L1
_L1:
        Object obj;
label0:
        {
            Object obj1 = k.get(i1 - b);
            if (c != 0x80000000 && i1 >= c)
            {
                obj = obj1;
                if (i1 < d)
                {
                    break label0;
                }
            }
            h = true;
            obj = obj1;
        }
_L4:
        e = i1;
        if (f)
        {
            b();
        }
        return obj;
_L2:
        h = true;
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        c = 0x80000000;
        b = 0x80000000;
        j = 0x80000000;
        k.clear();
    }

    public final void b()
    {
        if (!i)
        {
            if (g)
            {
                g = false;
                c = 0x80000000;
                h = true;
            }
            if (e == 0x80000000)
            {
                e = 0;
            }
            if (c != 0x80000000 && (e < c - 16 || e >= d + 16))
            {
                c = 0x80000000;
            }
            if (c == 0x80000000)
            {
                int i1 = Math.max(e - 8, 0);
                if (a < 16)
                {
                    a(i1, 16);
                } else
                {
                    i1 = Math.min(i1, Math.max(a - 16, 0));
                    a(i1, Math.min(16, a - i1));
                }
            }
            if (!i)
            {
                a(true, 8);
            }
            if (!i)
            {
                a(false, 10000);
            }
            if (!i)
            {
                a(true, 64);
                return;
            }
        }
    }

    public final void b(int i1)
    {
        k.subList(0, i1).clear();
    }

    public final void c(int i1)
    {
        k.subList(k.size() - i1, k.size()).clear();
    }
}
