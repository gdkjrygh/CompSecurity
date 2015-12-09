// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.artfulbits.aiCharts.Enums.Alignment;
import java.util.Hashtable;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            x, e, d, v, 
//            z

public abstract class k extends x
{

    private static final Integer a = Integer.valueOf(4);
    private static final Alignment b;
    protected static final int c = 0;
    protected static final int d = 1;
    private static final Alignment e;
    private static final Point f = null;
    private static final Paint g;
    private static final Paint h = null;
    private z A;
    private Float B;
    private k i;
    private Hashtable j;
    private Integer k;
    private Drawable l;
    private Boolean m;
    private Drawable n;
    private Drawable o;
    private Integer p;
    private Integer q;
    private String r;
    private Boolean s;
    private Alignment t;
    private Alignment u;
    private Point v;
    private Integer w;
    private Object x;
    private Paint y;
    private Paint z;

    public k()
    {
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
    }

    public k(k k1)
    {
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        i = k1.i;
        k = k1.k;
        l = k1.l;
        m = k1.m;
        n = k1.n;
        o = k1.o;
        p = k1.p;
        q = k1.q;
        r = k1.r;
        s = k1.s;
        t = k1.t;
        u = k1.u;
        v = k1.v;
        w = k1.w;
        x = k1.x;
        y = k1.y;
        A = k1.A;
        B = k1.B;
        z = k1.z;
        if (k1.j != null)
        {
            j = new Hashtable(k1.j);
        }
    }

    private static void a(Drawable drawable, e e1)
    {
label0:
        {
            if (drawable != null)
            {
                if (e1 == null)
                {
                    break label0;
                }
                drawable.setCallback(e1.l);
            }
            return;
        }
        drawable.setCallback(null);
    }

    public boolean A()
    {
        if (m == null)
        {
            if (i != null)
            {
                return i.A();
            } else
            {
                return false;
            }
        } else
        {
            return m.booleanValue();
        }
    }

    public void B()
    {
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        y = null;
        A = null;
        x = null;
        z = null;
    }

    public Object a(d d1)
    {
        if (j == null || !j.containsKey(d1))
        {
            if (i != null)
            {
                return i.a(d1);
            } else
            {
                return d1.d;
            }
        } else
        {
            return j.get(d1);
        }
    }

    protected void a(int i1, Object obj, Object obj1)
    {
    }

    protected void a(Resources resources, String s1, int i1, AttributeSet attributeset)
    {
        if (!"background".equalsIgnoreCase(s1)) goto _L2; else goto _L1
_L1:
        i1 = attributeset.getAttributeResourceValue(i1, -1);
        if (i1 != -1 && resources != null)
        {
            a(resources.getDrawable(i1));
        }
_L4:
        return;
_L2:
        if ("filter".equalsIgnoreCase(s1))
        {
            m = Boolean.valueOf(attributeset.getAttributeBooleanValue(i1, false));
            return;
        }
        if (!"marker".equalsIgnoreCase(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = attributeset.getAttributeResourceValue(i1, -1);
        if (i1 != -1 && resources != null)
        {
            c(resources.getDrawable(i1));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("markersize".equalsIgnoreCase(s1))
        {
            resources = attributeset.getAttributeValue(i1).split(",");
            s1 = new Point();
            if (resources.length > 1)
            {
                s1.x = Integer.parseInt(resources[0].trim());
                s1.y = Integer.parseInt(resources[1].trim());
            } else
            {
                i1 = Integer.parseInt(resources[0].trim());
                s1.y = i1;
                s1.x = i1;
            }
            a(((Point) (s1)));
            return;
        }
        if ("showlabel".equalsIgnoreCase(s1))
        {
            a(Boolean.valueOf(attributeset.getAttributeBooleanValue(i1, false)));
            return;
        }
        if ("color".equalsIgnoreCase(s1))
        {
            a(Integer.valueOf(Color.parseColor(attributeset.getAttributeValue(i1))));
            return;
        }
        if ("border".equalsIgnoreCase(s1))
        {
            c(Integer.valueOf(attributeset.getAttributeIntValue(i1, 0)));
            return;
        }
        if ("linewidth".equalsIgnoreCase(s1))
        {
            d(Integer.valueOf(attributeset.getAttributeIntValue(i1, 0)));
            return;
        }
        if ("halign".equalsIgnoreCase(s1))
        {
            a(Alignment.valueOf(attributeset.getAttributeValue(i1)));
            return;
        }
        if ("valign".equalsIgnoreCase(s1))
        {
            b(Alignment.valueOf(attributeset.getAttributeValue(i1)));
            return;
        }
        resources = com.artfulbits.aiCharts.Base.d.a(s1);
        if (resources != null)
        {
            a(((d) (resources)), resources.b(attributeset.getAttributeValue(i1)));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(Paint paint)
    {
        if (y != paint)
        {
            y = paint;
            a(1, null, null);
        }
    }

    public void a(PathEffect patheffect)
    {
        Paint paint;
        if (z == null)
        {
            paint = new Paint();
        } else
        {
            paint = z;
        }
        paint.setPathEffect(patheffect);
        c(paint);
    }

    public void a(Point point)
    {
        if (v != point)
        {
            v = point;
            a(1, null, null);
        }
    }

    public void a(Drawable drawable)
    {
        if (l != drawable)
        {
            a(l, ((e) (null)));
            l = drawable;
            a(l, l());
            a(1, null, null);
        }
    }

    public void a(d d1, Object obj)
    {
        if (j == null)
        {
            j = new Hashtable();
        }
        j.put(d1, obj);
        a(1, null, obj);
    }

    protected void a(e e1)
    {
        a(l, e1);
        a(o, e1);
        a(n, e1);
    }

    protected void a(k k1)
    {
        i = k1;
        a(1, null, null);
    }

    public void a(Alignment alignment)
    {
        if (t != alignment)
        {
            t = alignment;
            a(1, null, null);
        }
    }

    public void a(Boolean boolean1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(s, boolean1))
        {
            s = boolean1;
            a(1, null, null);
        }
    }

    public void a(Float float1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(B, float1))
        {
            B = float1;
            a(1, null, null);
        }
    }

    public void a(Integer integer)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(k, integer))
        {
            k = integer;
            a(1, null, null);
        }
    }

    public void a(Object obj)
    {
        x = obj;
    }

    public void b(Paint paint)
    {
        if (y != paint)
        {
            y = paint;
            a(1, null, null);
        }
    }

    public void b(Drawable drawable)
    {
        if (o != drawable)
        {
            a(o, ((e) (null)));
            o = drawable;
            a(o, l());
            a(1, null, null);
        }
    }

    public void b(d d1)
    {
        if (j != null)
        {
            j.remove(d1);
            a(1, null, null);
        }
    }

    public void b(Alignment alignment)
    {
        if (u != alignment)
        {
            u = alignment;
            a(1, null, null);
        }
    }

    public void b(Boolean boolean1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(m, boolean1))
        {
            m = boolean1;
            a(1, null, null);
        }
    }

    public void b(Integer integer)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(w, integer))
        {
            w = integer;
            a(1, null, null);
        }
    }

    public void c(Paint paint)
    {
        if (z != paint)
        {
            z = paint;
            a(1, null, null);
        }
    }

    public void c(Drawable drawable)
    {
        if (n != drawable)
        {
            a(n, ((e) (null)));
            n = drawable;
            a(n, l());
            a(1, null, null);
        }
    }

    public void c(Integer integer)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(p, integer))
        {
            p = integer;
            a(1, null, null);
        }
    }

    public void c(String s1)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(r, s1))
        {
            r = s1;
            a(1, null, null);
        }
    }

    public void d(Integer integer)
    {
        if (!com.artfulbits.aiCharts.Base.v.a(q, integer))
        {
            q = integer;
            a(1, null, null);
        }
    }

    public void d(String s1)
    {
        if (s1 == null)
        {
            A = null;
        } else
        {
            A = new z(s1);
        }
        a(1, null, null);
    }

    protected Integer e()
    {
        return k;
    }

    protected String f()
    {
        z z1 = z();
        if (z1 != null)
        {
            return z1.a(this);
        } else
        {
            return r;
        }
    }

    public int g()
    {
        Integer integer = e();
        if (integer == null)
        {
            if (i != null)
            {
                return i.g();
            } else
            {
                return -1;
            }
        } else
        {
            return integer.intValue();
        }
    }

    public Object h()
    {
        return x;
    }

    public Drawable i()
    {
        if (l == null)
        {
            if (i != null)
            {
                return i.i();
            } else
            {
                return null;
            }
        } else
        {
            return l;
        }
    }

    public Drawable j()
    {
        if (o == null)
        {
            if (i != null)
            {
                return i.j();
            } else
            {
                return null;
            }
        } else
        {
            return o;
        }
    }

    public Integer k()
    {
        if (w == null)
        {
            if (i != null)
            {
                return i.k();
            } else
            {
                return a;
            }
        } else
        {
            return w;
        }
    }

    public Paint m()
    {
        if (y == null)
        {
            if (i != null)
            {
                return i.m();
            } else
            {
                return g;
            }
        } else
        {
            return y;
        }
    }

    public Paint n()
    {
        if (z == null)
        {
            if (i != null)
            {
                return i.n();
            } else
            {
                return null;
            }
        } else
        {
            return z;
        }
    }

    public Drawable o()
    {
        if (n == null)
        {
            if (i != null)
            {
                return i.o();
            } else
            {
                return null;
            }
        } else
        {
            return n;
        }
    }

    public Point p()
    {
        if (v == null)
        {
            if (i != null)
            {
                return i.p();
            } else
            {
                return null;
            }
        } else
        {
            return v;
        }
    }

    public Float q()
    {
        if (B == null)
        {
            if (i != null)
            {
                return i.q();
            } else
            {
                return Float.valueOf(0.0F);
            }
        } else
        {
            return B;
        }
    }

    public Alignment r()
    {
        if (t == null)
        {
            if (i != null)
            {
                return i.r();
            } else
            {
                return b;
            }
        } else
        {
            return t;
        }
    }

    public Alignment s()
    {
        if (u == null)
        {
            if (i != null)
            {
                return i.s();
            } else
            {
                return e;
            }
        } else
        {
            return u;
        }
    }

    public int t()
    {
        if (p == null)
        {
            if (i != null)
            {
                return i.t();
            } else
            {
                return 0;
            }
        } else
        {
            return p.intValue();
        }
    }

    public int u()
    {
        if (q == null)
        {
            if (i != null)
            {
                return i.u();
            } else
            {
                return 2;
            }
        } else
        {
            return q.intValue();
        }
    }

    public PathEffect v()
    {
        Paint paint = n();
        if (paint == null)
        {
            return null;
        } else
        {
            return paint.getPathEffect();
        }
    }

    public boolean w()
    {
        if (s == null)
        {
            if (i != null)
            {
                return i.w();
            } else
            {
                return false;
            }
        } else
        {
            return s.booleanValue();
        }
    }

    public String x()
    {
        if (r == null)
        {
            if (i != null)
            {
                return i.x();
            } else
            {
                return null;
            }
        } else
        {
            return r;
        }
    }

    public String y()
    {
        z z1 = z();
        if (z1 == null)
        {
            return null;
        } else
        {
            return z1.a;
        }
    }

    protected z z()
    {
        if (A == null)
        {
            if (i != null)
            {
                return i.z();
            } else
            {
                return null;
            }
        } else
        {
            return A;
        }
    }

    static 
    {
        b = Alignment.b;
        e = Alignment.b;
        g = new Paint();
        g.setColor(-1);
        g.setAntiAlias(true);
    }
}
