// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            i, aa, a, c, 
//            ab, h, al, l, 
//            e, aj, n

public class z
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/z$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("None", 0);
            b = new a("Color", 1);
            c = new a("Asset", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        private static final b j[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/z$b, s);
        }

        public static b[] values()
        {
            return (b[])j.clone();
        }

        static 
        {
            a = new b("Normal", 0);
            b = new b("ScrubLeft", 1);
            c = new b("ScrubRight", 2);
            d = new b("ScrubFreeLeft", 3);
            e = new b("ScrubFreeRight", 4);
            f = new b("SwipeLeft", 5);
            g = new b("SwipeRight", 6);
            h = new b("SwipeFreeLeft", 7);
            i = new b("SwipeFreeRight", 8);
            j = (new b[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/tremorvideo/sdk/android/richmedia/z$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("Normal", 0);
            b = new c("HTML5", 1);
            c = new c("VideoOnly", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int k)
        {
            super(s, k);
        }
    }


    private int a;
    private long b;
    private i c;
    private List d;
    private com.tremorvideo.sdk.android.richmedia.a e;
    private c f;
    private a g;
    private Object h;
    private int i;
    private b j;

    public z(com.tremorvideo.sdk.android.richmedia.a a1)
    {
        e = a1;
        c = new i();
    }

    private void a(aa aa1)
    {
        if (g == a.b)
        {
            Paint paint = new Paint();
            paint.setColor(((Integer)h).intValue());
            int k = Math.round(aa1.d() / -2F);
            int i1 = Math.round(aa1.e() / -2F);
            int j1 = -k;
            int k1 = -i1;
            aa1.c().drawRect(k, i1, j1, k1, paint);
        } else
        if (g == a.c)
        {
            Bitmap bitmap = e.p().a(((Integer)h).intValue());
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect1 = new Rect(Math.round(aa1.d() / -2F), Math.round(aa1.e() / -2F), Math.round(aa1.d() / 2.0F), Math.round(aa1.e() / 2.0F));
            Paint paint1 = new Paint();
            paint1.setFilterBitmap(true);
            aa1.c().drawBitmap(bitmap, rect, rect1, paint1);
            return;
        }
    }

    private void a(aa aa1, ab ab1, long l1, h h1)
    {
        while (!aa1.g && ab1.a() || !a(ab1)) 
        {
            return;
        }
        if (h1 == null)
        {
            ab1.a(aa1, l1);
            return;
        }
        if (ab1 == h1.b())
        {
            h1.a(aa1);
            return;
        } else
        {
            ab1.a(aa1, l1);
            return;
        }
    }

    public int a()
    {
        boolean flag = false;
        int k = 0;
        do
        {
label0:
            {
                int i1 = ((flag) ? 1 : 0);
                if (k < d.size())
                {
                    if (!(d.get(k) instanceof al))
                    {
                        break label0;
                    }
                    i1 = k + 1;
                }
                return i1;
            }
            k++;
        } while (true);
    }

    public Rect a(aa aa1, long l1)
    {
        Rect rect = new Rect(0, 0, 0, 0);
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            l l2 = ((ab)iterator.next()).b(aa1, l1);
            rect.left = Math.min(rect.left, Math.round(l2.a));
            rect.top = Math.min(rect.top, Math.round(l2.b));
            rect.right = Math.max(rect.right, Math.round(l2.a + l2.f));
            int k = rect.bottom;
            float f1 = l2.b;
            rect.bottom = Math.max(k, Math.round(l2.g + f1));
        }

        return rect;
    }

    public ab a(int k)
    {
        if (k == 254)
        {
            return e.l();
        } else
        {
            return (ab)d.get(k);
        }
    }

    public i.a a(aa aa1, int k, int i1, long l1)
    {
        int j1;
        byte byte0;
        int k1;
        if (e.e() > 1)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        if (e.e() > 1)
        {
            j1 = d.size() - 1;
        } else
        {
            j1 = 0;
        }
        if (e.e() > 1)
        {
            k1 = -1;
        } else
        {
            k1 = d.size();
        }
        for (; j1 != k1; j1 += byte0)
        {
            ab ab1 = (ab)d.get(j1);
            if (!ab1.d() || !a(ab1))
            {
                continue;
            }
            l l2 = ab1.b(aa1, l1);
            if (l2.a >= (float)k || l2.b >= (float)i1 || l2.f + l2.a < (float)k || l2.g + l2.b < (float)i1)
            {
                continue;
            }
            if (ab1.a(Math.round((float)k - l2.a), Math.round((float)i1 - l2.b)))
            {
                return null;
            } else
            {
                return ab1.g();
            }
        }

        return null;
    }

    public i.a a(i.c c1)
    {
        return c.a(c1);
    }

    public void a(aa aa1, long l1, h h1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); a(aa1, (ab)iterator.next(), l1, h1)) { }
    }

    public void a(e e1)
    {
        a = e1.a();
        f = c.values()[e1.b()];
        b = e1.a();
        j = b.values()[e1.b()];
        i = e1.b();
        if (i == 255)
        {
            i = -1;
        }
        g = a.values()[e1.b()];
        if (g != a.b) goto _L2; else goto _L1
_L1:
        h = new Integer(e1.a());
_L5:
        int i1;
        c.a(e1, e.e());
        i1 = e1.b();
        d = new ArrayList(i1);
        int k = 0;
_L3:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        ab ab1 = ab.a(this, e1.a());
        ab1.a(e1);
        d.add(ab1);
        k++;
        if (true) goto _L3; else goto _L2
_L2:
        if (g != a.c) goto _L5; else goto _L4
_L4:
        h = new Integer(e1.b());
          goto _L5
        e1;
    }

    public void a(n n, long l1)
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ab)iterator.next()).a(n, l1)) { }
    }

    public boolean a(ab ab1)
    {
        return e.r() || !(ab1 instanceof aj);
    }

    public RectF b(aa aa1, long l1)
    {
        RectF rectf = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            l l2 = ((ab)iterator.next()).b(aa1, l1);
            rectf.left = Math.min(rectf.left, l2.a);
            rectf.top = Math.min(rectf.top, l2.b);
            rectf.right = Math.max(rectf.right, l2.a + l2.f);
            float f1 = rectf.bottom;
            float f2 = l2.b;
            rectf.bottom = Math.max(f1, l2.g + f2);
        }

        return rectf;
    }

    public i.a b(aa aa1, int k, int i1, long l1)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ab ab1 = (ab)iterator.next();
            if (ab1.e())
            {
                boolean flag1 = false;
                l l2 = ab1.b(aa1, l1);
                boolean flag = flag1;
                if (l2.a < (float)k)
                {
                    flag = flag1;
                    if (l2.b < (float)i1)
                    {
                        flag = flag1;
                        if (l2.f + l2.a >= (float)k)
                        {
                            float f1 = l2.g;
                            flag = flag1;
                            if (l2.b + f1 >= (float)i1)
                            {
                                flag = true;
                            }
                        }
                    }
                }
                ab1.b(flag);
            }
        } while (true);
        return null;
    }

    public void b()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ab)iterator.next()).f()) { }
    }

    public void b(aa aa1, long l1, h h1)
    {
        a(aa1);
        int i1 = a();
        for (int k = 0; k < i1; k++)
        {
            a(aa1, (ab)d.get(k), l1, h1);
        }

    }

    public long c()
    {
        return b;
    }

    public i.a c(aa aa1, int k, int i1, long l1)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ab ab1 = (ab)iterator.next();
            if (ab1.e())
            {
                boolean flag1 = false;
                l l2 = ab1.b(aa1, l1);
                boolean flag = flag1;
                if (l2.a < (float)k)
                {
                    flag = flag1;
                    if (l2.b < (float)i1)
                    {
                        flag = flag1;
                        if (l2.f + l2.a >= (float)k)
                        {
                            float f1 = l2.g;
                            flag = flag1;
                            if (l2.b + f1 >= (float)i1)
                            {
                                flag = true;
                            }
                        }
                    }
                }
                ab1.c(flag);
            }
        } while (true);
        return null;
    }

    public void c(aa aa1, long l1, h h1)
    {
        for (int k = a(); k < d.size(); k++)
        {
            a(aa1, (ab)d.get(k), l1, h1);
        }

    }

    public i.a d(aa aa1, int k, int i1, long l1)
    {
        int j1;
        byte byte0;
        boolean flag;
        float f1;
        Object obj;
        l l2;
        int k1;
        if (e.e() > 1)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        if (e.e() > 1)
        {
            j1 = d.size() - 1;
        } else
        {
            j1 = 0;
        }
        if (e.e() > 1)
        {
            k1 = -1;
        } else
        {
            k1 = d.size();
        }
        if (j1 == k1) goto _L2; else goto _L1
_L1:
        obj = (ab)d.get(j1);
        if (!((ab) (obj)).d() || !a(((ab) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = ((ab) (obj)).b(aa1, l1);
        if (l2.a >= (float)k || l2.b >= (float)i1 || l2.f + l2.a < (float)k)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        f1 = l2.g;
        if (l2.b + f1 < (float)i1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        flag = true;
_L4:
        obj = ((ab) (obj)).a(flag);
        if (obj != null)
        {
            return ((i.a) (obj));
        }
        j1 += byte0;
        break MISSING_BLOCK_LABEL_52;
_L2:
        return null;
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List d()
    {
        return d;
    }

    public b e()
    {
        return j;
    }

    public com.tremorvideo.sdk.android.richmedia.a f()
    {
        return e;
    }

    public int g()
    {
        return i;
    }
}
