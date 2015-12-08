// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.roidapp.imagelib.f:
//            e, d, g, i, 
//            f

final class h extends DefaultHandler
{

    Picture a;
    Canvas b;
    Paint c;
    RectF d;
    RectF e;
    Path f;
    RectF g;
    Integer h;
    Integer i;
    boolean j;
    boolean k;
    HashMap l;
    HashMap m;
    e n;
    private boolean o;
    private int p;
    private boolean q;

    private h(Picture picture)
    {
        d = new RectF();
        e = null;
        f = null;
        g = new RectF((1.0F / 0.0F), (1.0F / 0.0F), (-1.0F / 0.0F), (-1.0F / 0.0F));
        h = null;
        i = null;
        j = false;
        k = false;
        l = new HashMap();
        m = new HashMap();
        n = null;
        o = false;
        p = 0;
        q = false;
        a = picture;
        c = new Paint();
        c.setAntiAlias(true);
    }

    h(Picture picture, byte byte0)
    {
        this(picture);
    }

    private static e a(boolean flag, Attributes attributes)
    {
        e e1 = new e((byte)0);
        e1.a = com.roidapp.imagelib.f.d.a("id", attributes);
        e1.c = flag;
        String s;
        if (flag)
        {
            e1.d = com.roidapp.imagelib.f.d.a("x1", attributes, Float.valueOf(0.0F)).floatValue();
            e1.f = com.roidapp.imagelib.f.d.a("x2", attributes, Float.valueOf(0.0F)).floatValue();
            e1.e = com.roidapp.imagelib.f.d.a("y1", attributes, Float.valueOf(0.0F)).floatValue();
            e1.g = com.roidapp.imagelib.f.d.a("y2", attributes, Float.valueOf(0.0F)).floatValue();
        } else
        {
            e1.h = com.roidapp.imagelib.f.d.a("cx", attributes, Float.valueOf(0.0F)).floatValue();
            e1.i = com.roidapp.imagelib.f.d.a("cy", attributes, Float.valueOf(0.0F)).floatValue();
            e1.j = com.roidapp.imagelib.f.d.a("r", attributes, Float.valueOf(0.0F)).floatValue();
        }
        s = com.roidapp.imagelib.f.d.a("gradientTransform", attributes);
        if (s != null)
        {
            e1.m = com.roidapp.imagelib.f.d.a(s);
        }
        s = com.roidapp.imagelib.f.d.a("href", attributes);
        if (s != null)
        {
            attributes = s;
            if (s.startsWith("#"))
            {
                attributes = s.substring(1);
            }
            e1.b = attributes;
        }
        return e1;
    }

    private void a()
    {
        if (k)
        {
            b.restore();
        }
    }

    private void a(float f1, float f2)
    {
        if (f1 < g.left)
        {
            g.left = f1;
        }
        if (f1 > g.right)
        {
            g.right = f1;
        }
        if (f2 < g.top)
        {
            g.top = f2;
        }
        if (f2 > g.bottom)
        {
            g.bottom = f2;
        }
    }

    private void a(Path path)
    {
        path.computeBounds(d, false);
        a(d.left, d.top);
        a(d.right, d.bottom);
    }

    private void a(g g1, Integer integer, boolean flag)
    {
        int j1 = 0xffffff & integer.intValue() | 0xff000000;
        int i1 = j1;
        if (h != null)
        {
            i1 = j1;
            if (h.intValue() == j1)
            {
                i1 = i.intValue();
            }
        }
        c.setColor(i1);
        Float float1 = g1.c("opacity");
        integer = float1;
        if (float1 == null)
        {
            if (flag)
            {
                integer = "fill-opacity";
            } else
            {
                integer = "stroke-opacity";
            }
            integer = g1.c(integer);
        }
        if (integer == null)
        {
            c.setAlpha(255);
            return;
        } else
        {
            c.setAlpha((int)(integer.floatValue() * 255F));
            return;
        }
    }

    private void a(Attributes attributes)
    {
        attributes = com.roidapp.imagelib.f.d.a("transform", attributes);
        boolean flag;
        if (attributes != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (k)
        {
            attributes = com.roidapp.imagelib.f.d.a(attributes);
            b.save();
            b.concat(attributes);
        }
    }

    private boolean a(g g1)
    {
        if (!j && !"none".equals(g1.a("display")))
        {
            Object obj = g1.b("stroke");
            if (obj != null)
            {
                a(g1, ((Integer) (obj)), false);
                obj = g1.c("stroke-width");
                if (obj != null)
                {
                    c.setStrokeWidth(((Float) (obj)).floatValue());
                }
                obj = g1.a("stroke-linecap");
                if ("round".equals(obj))
                {
                    c.setStrokeCap(android.graphics.Paint.Cap.ROUND);
                } else
                if ("square".equals(obj))
                {
                    c.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
                } else
                if ("butt".equals(obj))
                {
                    c.setStrokeCap(android.graphics.Paint.Cap.BUTT);
                }
                g1 = g1.a("stroke-linejoin");
                if ("miter".equals(g1))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.MITER);
                } else
                if ("round".equals(g1))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                } else
                if ("bevel".equals(g1))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
                }
                c.setStyle(android.graphics.Paint.Style.STROKE);
                return true;
            }
        }
        return false;
    }

    private boolean a(g g1, HashMap hashmap)
    {
        if ("none".equals(g1.a("display")))
        {
            return false;
        }
        if (j)
        {
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setColor(-1);
            return true;
        }
        String s = g1.a("fill");
        if (s != null && s.startsWith("url(#"))
        {
            g1 = (Shader)hashmap.get(s.substring(5, s.length() - 1));
            if (g1 != null)
            {
                c.setShader(g1);
                c.setStyle(android.graphics.Paint.Style.FILL);
                return true;
            } else
            {
                return false;
            }
        }
        c.setShader(null);
        hashmap = g1.b("fill");
        if (hashmap != null)
        {
            a(g1, ((Integer) (hashmap)), true);
            c.setStyle(android.graphics.Paint.Style.FILL);
            return true;
        }
        if (g1.a("fill") == null && g1.a("stroke") == null)
        {
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setColor(0xff000000);
            return true;
        } else
        {
            return false;
        }
    }

    public final void characters(char ac[], int i1, int j1)
    {
    }

    public final void endDocument()
    {
    }

    public final void endElement(String s, String s1, String s2)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        if (!s1.equals("svg")) goto _L2; else goto _L1
_L1:
        a.endRecording();
_L4:
        return;
_L2:
        if (!s1.equals("linearGradient"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (n.a != null)
        {
            if (n.b != null)
            {
                s = (e)m.get(n.b);
                if (s != null)
                {
                    n = s.a(n);
                }
            }
            s = new int[n.l.size()];
            for (int i1 = 0; i1 < s.length; i1++)
            {
                s[i1] = ((Integer)n.l.get(i1)).intValue();
            }

            s1 = new float[n.k.size()];
            for (int j1 = ((flag) ? 1 : 0); j1 < s1.length; j1++)
            {
                s1[j1] = ((Float)n.k.get(j1)).floatValue();
            }

            s = new LinearGradient(n.d, n.e, n.f, n.g, s, s1, android.graphics.Shader.TileMode.CLAMP);
            if (n.m != null)
            {
                s.setLocalMatrix(n.m);
            }
            l.put(n.a, s);
            m.put(n.a, n);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s1.equals("radialGradient"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (n.a == null) goto _L4; else goto _L5
_L5:
        if (n.b != null)
        {
            s = (e)m.get(n.b);
            if (s != null)
            {
                n = s.a(n);
            }
        }
        s = new int[n.l.size()];
        for (int k1 = 0; k1 < s.length; k1++)
        {
            s[k1] = ((Integer)n.l.get(k1)).intValue();
        }

        s1 = new float[n.k.size()];
        for (int l1 = ((flag1) ? 1 : 0); l1 < s1.length; l1++)
        {
            s1[l1] = ((Float)n.k.get(l1)).floatValue();
        }

        if (n.b != null)
        {
            s2 = (e)m.get(n.b);
            if (s2 != null)
            {
                n = s2.a(n);
            }
        }
        s = new RadialGradient(n.h, n.i, n.j, s, s1, android.graphics.Shader.TileMode.CLAMP);
        if (n.m != null)
        {
            s.setLocalMatrix(n.m);
        }
        l.put(n.a, s);
        m.put(n.a, n);
        return;
        if (!s1.equals("g")) goto _L4; else goto _L6
_L6:
        if (q)
        {
            q = false;
        }
        if (o)
        {
            p = p - 1;
            if (p == 0)
            {
                o = false;
            }
        }
        l.clear();
        return;
    }

    public final void startDocument()
    {
    }

    public final void startElement(String s, String s1, String s2, Attributes attributes)
    {
        c.setAlpha(255);
        if (q)
        {
            if (s1.equals("rect"))
            {
                s1 = com.roidapp.imagelib.f.d.b("x", attributes);
                s = s1;
                if (s1 == null)
                {
                    s = Float.valueOf(0.0F);
                }
                s2 = com.roidapp.imagelib.f.d.b("y", attributes);
                s1 = s2;
                if (s2 == null)
                {
                    s1 = Float.valueOf(0.0F);
                }
                s2 = com.roidapp.imagelib.f.d.b("width", attributes);
                com.roidapp.imagelib.f.d.b("height", attributes);
                e = new RectF(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + s2.floatValue());
            }
        } else
        {
            if (s1.equals("svg"))
            {
                int i1 = (int)Math.ceil(com.roidapp.imagelib.f.d.b("width", attributes).floatValue());
                int k1 = (int)Math.ceil(com.roidapp.imagelib.f.d.b("height", attributes).floatValue());
                b = a.beginRecording(i1, k1);
                return;
            }
            if (!s1.equals("defs"))
            {
                if (s1.equals("linearGradient"))
                {
                    n = a(true, attributes);
                    return;
                }
                if (s1.equals("radialGradient"))
                {
                    n = a(false, attributes);
                    return;
                }
                if (s1.equals("stop"))
                {
                    if (n != null)
                    {
                        float f1 = com.roidapp.imagelib.f.d.b("offset", attributes).floatValue();
                        s = new i(com.roidapp.imagelib.f.d.a("style", attributes), (byte)0);
                        s1 = s.a("stop-color");
                        float f2;
                        float f3;
                        float f4;
                        Float float1;
                        int j1;
                        if (s1 != null)
                        {
                            if (s1.startsWith("#"))
                            {
                                j1 = Integer.parseInt(s1.substring(1), 16);
                            } else
                            {
                                j1 = Integer.parseInt(s1, 16);
                            }
                        } else
                        {
                            j1 = 0xff000000;
                        }
                        s = s.a("stop-opacity");
                        if (s != null)
                        {
                            j1 |= Math.round(Float.parseFloat(s) * 255F) << 24;
                        } else
                        {
                            j1 |= 0xff000000;
                        }
                        n.k.add(Float.valueOf(f1));
                        n.l.add(Integer.valueOf(j1));
                        return;
                    }
                }
            }
            while (false) 
            {
                if (s1.equals("g"))
                {
                    if ("bounds".equalsIgnoreCase(com.roidapp.imagelib.f.d.a("id", attributes)))
                    {
                        q = true;
                    }
                    if (o)
                    {
                        p = p + 1;
                    }
                    if ("none".equals(com.roidapp.imagelib.f.d.a("display", attributes)) && !o)
                    {
                        o = true;
                        p = 1;
                        return;
                    }
                    continue;
                }
                if (!o && s1.equals("rect"))
                {
                    s = com.roidapp.imagelib.f.d.b("x", attributes);
                    if (s == null)
                    {
                        s = Float.valueOf(0.0F);
                    }
                    s1 = com.roidapp.imagelib.f.d.b("y", attributes);
                    if (s1 == null)
                    {
                        s1 = Float.valueOf(0.0F);
                    }
                    s2 = com.roidapp.imagelib.f.d.b("width", attributes);
                    float1 = com.roidapp.imagelib.f.d.b("height", attributes);
                    a(attributes);
                    attributes = new g(attributes, (byte)0);
                    if (a(attributes, l))
                    {
                        f1 = s.floatValue();
                        f2 = s1.floatValue();
                        f3 = s2.floatValue();
                        f4 = float1.floatValue();
                        a(f1, f2);
                        a(f1 + f3, f2 + f4);
                        b.drawRect(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue(), c);
                    }
                    if (a(attributes))
                    {
                        b.drawRect(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue(), c);
                    }
                    a();
                    return;
                }
                if (!o && s1.equals("line"))
                {
                    s = com.roidapp.imagelib.f.d.b("x1", attributes);
                    s1 = com.roidapp.imagelib.f.d.b("x2", attributes);
                    s2 = com.roidapp.imagelib.f.d.b("y1", attributes);
                    float1 = com.roidapp.imagelib.f.d.b("y2", attributes);
                    if (a(new g(attributes, (byte)0)))
                    {
                        a(attributes);
                        a(s.floatValue(), s2.floatValue());
                        a(s1.floatValue(), float1.floatValue());
                        b.drawLine(s.floatValue(), s2.floatValue(), s1.floatValue(), float1.floatValue(), c);
                        a();
                        return;
                    }
                    continue;
                }
                if (!o && s1.equals("circle"))
                {
                    s = com.roidapp.imagelib.f.d.b("cx", attributes);
                    s1 = com.roidapp.imagelib.f.d.b("cy", attributes);
                    s2 = com.roidapp.imagelib.f.d.b("r", attributes);
                    if (s != null && s1 != null && s2 != null)
                    {
                        a(attributes);
                        attributes = new g(attributes, (byte)0);
                        if (a(attributes, l))
                        {
                            a(s.floatValue() - s2.floatValue(), s1.floatValue() - s2.floatValue());
                            a(s.floatValue() + s2.floatValue(), s1.floatValue() + s2.floatValue());
                            b.drawCircle(s.floatValue(), s1.floatValue(), s2.floatValue(), c);
                        }
                        if (a(attributes))
                        {
                            b.drawCircle(s.floatValue(), s1.floatValue(), s2.floatValue(), c);
                        }
                        a();
                        return;
                    }
                    continue;
                }
                if (!o && s1.equals("ellipse"))
                {
                    s = com.roidapp.imagelib.f.d.b("cx", attributes);
                    s1 = com.roidapp.imagelib.f.d.b("cy", attributes);
                    s2 = com.roidapp.imagelib.f.d.b("rx", attributes);
                    float1 = com.roidapp.imagelib.f.d.b("ry", attributes);
                    if (s != null && s1 != null && s2 != null && float1 != null)
                    {
                        a(attributes);
                        attributes = new g(attributes, (byte)0);
                        d.set(s.floatValue() - s2.floatValue(), s1.floatValue() - float1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue());
                        if (a(attributes, l))
                        {
                            a(s.floatValue() - s2.floatValue(), s1.floatValue() - float1.floatValue());
                            a(s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue());
                            b.drawOval(d, c);
                        }
                        if (a(attributes))
                        {
                            b.drawOval(d, c);
                        }
                        a();
                        return;
                    }
                    continue;
                }
                if (o || !s1.equals("polygon") && !s1.equals("polyline"))
                {
                    continue;
                }
                s2 = com.roidapp.imagelib.f.d.c("points", attributes);
                if (s2 == null)
                {
                    continue;
                }
                s = new Path();
                s2 = com.roidapp.imagelib.f.f.a(s2);
                if (s2.size() > 1)
                {
                    a(attributes);
                    attributes = new g(attributes, (byte)0);
                    s.moveTo(((Float)s2.get(0)).floatValue(), ((Float)s2.get(1)).floatValue());
                    for (j1 = 2; j1 < s2.size(); j1 += 2)
                    {
                        s.lineTo(((Float)s2.get(j1)).floatValue(), ((Float)s2.get(j1 + 1)).floatValue());
                    }

                    if (s1.equals("polygon"))
                    {
                        s.close();
                    }
                    if (a(attributes, l))
                    {
                        a(s);
                        b.drawPath(s, c);
                    }
                    if (a(attributes))
                    {
                        b.drawPath(s, c);
                    }
                    a();
                    return;
                }
            }
        }
        do
        {
            return;
        } while (o || !s1.equals("path"));
        s = com.roidapp.imagelib.f.d.b(com.roidapp.imagelib.f.d.a("d", attributes));
        f = s;
        a(attributes);
        s1 = new g(attributes, (byte)0);
        if (a(s1, l))
        {
            a(s);
            b.drawPath(s, c);
        }
        if (a(s1))
        {
            b.drawPath(s, c);
        }
        a();
    }
}
