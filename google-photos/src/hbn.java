// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class hbn
{

    public final har a;
    public final hbo b;
    public final List c;
    private final boolean d;
    private int e;
    private final hbg f;
    private hbn g;

    public hbn(hbo hbo1, har har, List list, int i, hbg hbg1, boolean flag)
    {
        b = hbo1;
        a = har;
        c = list;
        e = i;
        f = hbg1;
        d = flag;
    }

    public static hbo a(List list, Point point)
    {
        Object obj;
        obj = null;
        double d2 = 1.7976931348623157E+308D;
        Iterator iterator = list.iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                Iterator iterator1 = ((hbp)iterator.next()).a.iterator();
                double d1 = d2;
                list = ((List) (obj));
                do
                {
                    obj = list;
                    d2 = d1;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = (hbo)iterator1.next();
                    if (((hbo) (obj)).d.e == c.dO || ((hbo) (obj)).d.e == c.dP)
                    {
                        double d3 = Math.sqrt(Math.pow(((hbo) (obj)).c.centerX() - point.x, 2D) + Math.pow(((hbo) (obj)).c.centerY() - point.y, 2D));
                        if (d3 < d1)
                        {
                            list = ((List) (obj));
                            d1 = d3;
                        }
                    }
                } while (true);
            }
        } while (true);
        return ((hbo) (obj));
    }

    private void a(hbn hbn1, boolean flag, int i, int j)
    {
        float f1;
        float f2;
        hbp hbp1;
        hbp hbp4;
        int k;
        int l;
        int i1;
        int l1;
        byte byte0;
        int l4;
        int i5;
        if (flag)
        {
            int j2;
            boolean flag1;
            int i4;
            boolean flag2;
            if (((hbp)c.get(i)).b == hbq.a && ((hbp)hbn1.c.get(j)).b == hbq.a)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            p.a(flag2);
        } else
        {
            boolean flag3;
            if (((hbp)c.get(i + 1)).b == hbq.a && ((hbp)c.get(i + 1)).e != null && ((hbp)hbn1.c.get(j + 1)).b == hbq.a && ((hbp)hbn1.c.get(j + 1)).e != null)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            p.a(flag3);
        }
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        i5 = hbn1.f.a();
        l4 = f.a();
        k = f.d;
        l = hbn1.f.d;
        f1 = (float)k / (float)l;
        f2 = 1.0F / f1;
        l = 0;
        flag1 = false;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = ((hbp)c.get(i + 1)).e.c;
        }
        if (flag)
        {
            k = 0;
        } else
        {
            k = ((hbp)hbn1.c.get(j + 1)).e.c;
        }
        l1 = k;
        j2 = j;
        k = ((flag1) ? 1 : 0);
        j = i;
        i = j2;
_L8:
        if (j < 0 || j >= c.size() || i < 0 || i >= hbn1.c.size())
        {
            break MISSING_BLOCK_LABEL_1114;
        }
        hbp1 = (hbp)c.get(j);
        hbp4 = (hbp)hbn1.c.get(i);
        if (hbp1.b != hbp4.b) goto _L2; else goto _L1
_L1:
        hbp1.e = hbp4;
        hbp4.e = hbp1;
        int k2 = 0;
        i1 = 0;
        l1 = 0;
        int k3 = 0;
        while (k3 < hbp1.a.size() && k2 < hbp4.a.size()) 
        {
            hbo hbo1 = (hbo)hbp1.a.get(k3);
            hbo hbo4 = (hbo)hbp4.a.get(k2);
            hbo1.e.set(hbo4.c);
            hbo4.e.set(hbo1.c);
            hbo1.f = hbo4;
            hbo4.f = hbo1;
            if (d)
            {
                i1 = hbo1.e.left;
            } else
            {
                i1 = hbo1.e.right;
            }
            if (d)
            {
                l1 = hbo4.e.left;
            } else
            {
                l1 = hbo4.e.right;
            }
            k3++;
            i4 = k2 + 1;
            k2 = l1;
            l1 = i1;
            i1 = k2;
            k2 = i4;
        }
        int j4 = hbp4.c;
        if (d)
        {
            l1 -= i5;
        } else
        {
            l1 += i5;
        }
        a(hbp1, k3, j4, l1, f2, i5);
        l1 = hbp1.c;
        if (d)
        {
            i1 -= l4;
        } else
        {
            i1 += l4;
        }
        a(hbp4, k2, l1, i1, f1, l4);
        if (flag)
        {
            l1 = ((hbo)hbp1.a.get(0)).e.bottom + l4;
            i1 = ((hbo)hbp4.a.get(0)).e.bottom + i5;
        } else
        {
            l1 = ((hbo)hbp1.a.get(0)).e.top - l4;
            i1 = ((hbo)hbp4.a.get(0)).e.top - i5;
        }
        j += byte0;
        i += byte0;
        k2 = i1;
        i1 = l1;
        l1 = k2;
_L4:
        if (((hbo)hbp1.a.get(0)).e.right > l)
        {
            l = ((hbo)hbp1.a.get(0)).e.right;
        }
        if (((hbo)hbp4.a.get(0)).e.right > k)
        {
            k = ((hbo)hbp4.a.get(0)).e.right;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (hbp1.b == hbq.b)
        {
            hbo hbo2 = (hbo)hbp1.a.get(0);
            int l2 = i1 - hbp1.d / 2;
            hbo2.e.set(hbo2.c.left, l2, hbo2.c.right, hbp1.d + l2);
            j += byte0;
        } else
        if (hbp4.b == hbq.b)
        {
            hbo hbo3 = (hbo)hbp4.a.get(0);
            int i3 = l1 - hbp4.d / 2;
            hbo3.e.set(hbo3.c.left, i3, hbo3.c.right, hbp4.d + i3);
            i += byte0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_1114;
_L6:
        while (l >= 0 && l < hbn1.c.size()) 
        {
            hbp hbp3;
            if (d)
            {
                i = k;
            } else
            {
                i = 0;
            }
            hbp3 = (hbp)hbn1.c.get(l);
            i2 = (int)((float)hbp3.d * f1);
            if (flag)
            {
                k1 = 0;
            } else
            {
                k1 = i2;
            }
            a(hbp3, 0, j - k1, i, f1, l4);
            if (hbp3.b == hbq.a)
            {
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = -1;
                }
                i = i * (i2 + l4) + j;
            } else
            {
                i = j;
            }
            l += byte0;
            j = i;
        }
        return;
        int k1;
        int i2;
        int j3;
        if (flag)
        {
            int j1 = ((hbp)hbn1.c.get(i - 1)).c;
            i2 = ((hbp)hbn1.c.get(i - 1)).d + j1 + i5;
        } else
        {
            i2 = ((hbp)hbn1.c.get(i + 1)).c - i5;
        }
        if (flag)
        {
            k1 = ((hbp)c.get(j - 1)).c;
            k1 = ((hbp)c.get(j - 1)).d + k1 + l4;
            j3 = j;
        } else
        {
            k1 = ((hbp)c.get(j + 1)).c - l4;
            j3 = j;
        }
        while (j3 >= 0 && j3 < c.size()) 
        {
            hbp hbp2;
            int l3;
            int k4;
            if (d)
            {
                j = l;
            } else
            {
                j = 0;
            }
            hbp2 = (hbp)c.get(j3);
            k4 = (int)((float)hbp2.d * f2);
            if (flag)
            {
                l3 = 0;
            } else
            {
                l3 = k4;
            }
            a(hbp2, 0, i2 - l3, j, f2, i5);
            if (hbp2.b == hbq.a)
            {
                if (flag)
                {
                    j = 1;
                } else
                {
                    j = -1;
                }
                j = j * (k4 + i5) + i2;
            } else
            {
                j = i2;
            }
            j3 += byte0;
            i2 = j;
        }
        j = k1;
        l = i;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(hbp hbp1, int i, int j, int k, float f1, int l)
    {
        while (i < hbp1.a.size()) 
        {
            Object obj = hbp1.a;
            int i1 = i + 1;
            obj = (hbo)((List) (obj)).get(i);
            if (d)
            {
                i = (int)((float)((hbo) (obj)).c.width() * f1);
                ((hbo) (obj)).e.set(k - i, j, k, (int)((float)((hbo) (obj)).c.height() * f1) + j);
                k = ((hbo) (obj)).e.left - l;
                i = i1;
            } else
            {
                i = (int)((float)((hbo) (obj)).c.width() * f1);
                ((hbo) (obj)).e.set(k, j, i + k, (int)((float)((hbo) (obj)).c.height() * f1) + j);
                k = ((hbo) (obj)).e.right + l;
                i = i1;
            }
        }
    }

    public final void a(hbn hbn1, hbo hbo1, hbo hbo2)
    {
        int i;
        int j;
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Target is already configured");
        g = hbn1;
        hbn1.g = this;
        if (hbo1 == null)
        {
            i = -1;
        } else
        {
            i = c.indexOf(hbo1.a);
        }
        if (hbo2 == null)
        {
            j = -1;
        } else
        {
            j = hbn1.c.indexOf(hbo2.a);
        }
        if (i == -1 || j == -1)
        {
            if (Log.isLoggable("PhotoGridZoomState", 5))
            {
                Log.w("PhotoGridZoomState", "Couldn't find corresponding photo rows to animate between.");
            }
            return;
        } else
        {
            a(hbn1, true, i, j);
            a(hbn1, false, i - 1, j - 1);
            return;
        }
    }

    public final void a(boolean flag, boolean flag1, float f1)
    {
        float f2;
        float f6;
        float f7;
        Object obj;
        int i;
        int k;
        int i1;
        if (flag)
        {
            obj = f;
        } else
        {
            obj = g.f;
        }
        f2 = ((hbg) (obj)).a();
        if (flag)
        {
            obj = g.f;
        } else
        {
            obj = f;
        }
        i1 = Math.round(((float)((hbg) (obj)).a() - f2) * f1 + f2);
        if (flag)
        {
            f6 = f1;
        } else
        {
            f6 = 1.0F - f1;
        }
        f7 = g.e - e;
        obj = c.iterator();
        k = 0;
        i = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            Object obj1 = (hbp)((Iterator) (obj)).next();
            int l = 0;
            int j = 0;
            float f4 = 0.0F;
            float f5 = 0.0F;
            obj1 = ((hbp) (obj1)).a.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                hbo hbo1 = (hbo)((Iterator) (obj1)).next();
                float f3;
                boolean flag2;
                if (hbo1.a.b == hbq.b)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    float f8;
                    if (flag)
                    {
                        if (f1 < 0.5F)
                        {
                            f3 = 1.0F - 2.0F * f1;
                        } else
                        {
                            f3 = 0.0F;
                        }
                    } else
                    if (f1 > 0.5F)
                    {
                        f3 = 2.0F * (f1 - 0.5F);
                    } else
                    {
                        f3 = 0.0F;
                    }
                    hbo1.g = f3;
                } else
                {
                    if (flag == flag1 && hbo1.f != null)
                    {
                        f3 = 1.0F;
                    } else
                    if (flag)
                    {
                        f3 = 1.0F - f1;
                    } else
                    {
                        f3 = f1;
                    }
                    hbo1.g = f3;
                }
                if (flag2)
                {
                    hbo1.h = 1.0F;
                    hbo1.i = 1.0F;
                } else
                {
                    f9 = (float)hbo1.e.width() / (float)hbo1.c.width();
                    if (flag)
                    {
                        f3 = f1;
                    } else
                    {
                        f3 = 1.0F - f1;
                    }
                    hbo1.h = f3 * (f9 - 1.0F) + 1.0F;
                    f9 = (float)hbo1.e.height() / (float)hbo1.c.height();
                    if (flag)
                    {
                        f3 = f1;
                    } else
                    {
                        f3 = 1.0F - f1;
                    }
                    hbo1.i = f3 * (f9 - 1.0F) + 1.0F;
                }
                if (flag2)
                {
                    f3 = f6 * f7;
                } else
                {
                    if (flag)
                    {
                        f3 = f1;
                    } else
                    {
                        f3 = 1.0F - f1;
                    }
                    f3 *= hbo1.e.left - hbo1.c.left;
                }
                hbo1.j = f3;
                if (flag)
                {
                    f3 = f1;
                } else
                {
                    f3 = 1.0F - f1;
                }
                hbo1.k = f3 * (float)(hbo1.e.top - hbo1.c.top);
                if (l == 0)
                {
                    f4 = (float)hbo1.c.top + hbo1.k;
                    f8 = Math.round(hbo1.i * (float)hbo1.c.height() + f4);
                    if (k > 0)
                    {
                        if (Math.round(Math.abs(f4 - (float)i)) < 2)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        if (flag2)
                        {
                            f3 = i;
                        } else
                        {
                            f3 = f4;
                        }
                        f3 -= hbo1.c.top;
                    } else
                    {
                        f3 = hbo1.k;
                    }
                    f5 = (f8 - f4) / (float)hbo1.c.height();
                    i = (int)f8 + i1;
                    f4 = f3;
                    f3 = f5;
                } else
                {
                    f3 = f5;
                }
                hbo1.k = f4;
                hbo1.i = f3;
                if (d)
                {
                    float f9 = Math.round((float)hbo1.c.left + hbo1.j);
                    if (l > 0)
                    {
                        f5 = j;
                    } else
                    {
                        f5 = hbo1.h * (float)hbo1.c.width() + f9;
                    }
                    hbo1.j = f9 - (float)hbo1.c.left;
                    hbo1.h = (f5 - f9) / (float)hbo1.c.width();
                    j = (int)f9 - i1;
                } else
                {
                    float f10 = Math.round((float)hbo1.c.left + hbo1.j + hbo1.h * (float)hbo1.c.width());
                    if (l > 0)
                    {
                        f5 = j;
                        hbo1.j = j - hbo1.c.left;
                    } else
                    {
                        f5 = (float)hbo1.c.left + hbo1.j;
                    }
                    hbo1.h = (f10 - f5) / (float)hbo1.c.width();
                    j = (int)f10 + i1;
                }
                l++;
                f5 = f3;
            }
            k++;
        }
    }
}
