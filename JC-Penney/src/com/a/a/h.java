// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

// Referenced classes of package com.a.a:
//            f, d, g, e

class h extends DefaultHandler
{

    Picture a;
    Canvas b;
    Paint c;
    RectF d;
    RectF e;
    RectF f;
    Integer g;
    Integer h;
    boolean i;
    HashMap j;
    f k;
    private boolean l;
    private int m;
    private boolean n;

    private h(Picture picture)
    {
        d = new RectF();
        e = null;
        f = new RectF((1.0F / 0.0F), (1.0F / 0.0F), (-1.0F / 0.0F), (-1.0F / 0.0F));
        g = null;
        h = null;
        i = false;
        j = new HashMap();
        k = null;
        l = false;
        m = 0;
        n = false;
        a = picture;
        c = new Paint();
        c.setAntiAlias(true);
    }

    h(Picture picture, e e1)
    {
        this(picture);
    }

    private f a(boolean flag, Attributes attributes)
    {
        f f1 = new f(null);
        f1.a = com.a.a.d.a("id", attributes);
        f1.b = flag;
        if (flag)
        {
            f1.c = com.a.a.d.c("x1", attributes).floatValue();
            f1.e = com.a.a.d.c("x2", attributes).floatValue();
            f1.d = com.a.a.d.c("y1", attributes).floatValue();
            f1.f = com.a.a.d.c("y2", attributes).floatValue();
        } else
        {
            f1.g = com.a.a.d.c("cx", attributes).floatValue();
            f1.h = com.a.a.d.c("cy", attributes).floatValue();
            f1.i = com.a.a.d.c("r", attributes).floatValue();
        }
        attributes = com.a.a.d.a("gradientTransform", attributes);
        if (attributes != null)
        {
            f1.l = com.a.a.d.a(attributes);
        }
        return f1;
    }

    private void a(float f1, float f2)
    {
        if (f1 < f.left)
        {
            f.left = f1;
        }
        if (f1 > f.right)
        {
            f.right = f1;
        }
        if (f2 < f.top)
        {
            f.top = f2;
        }
        if (f2 > f.bottom)
        {
            f.bottom = f2;
        }
    }

    private void a(float f1, float f2, float f3, float f4)
    {
        a(f1, f2);
        a(f1 + f3, f2 + f4);
    }

    private void a(Path path)
    {
        path.computeBounds(d, false);
        a(d.left, d.top);
        a(d.right, d.bottom);
    }

    private void a(Attributes attributes, Integer integer)
    {
        int j1 = 0xffffff & integer.intValue() | 0xff000000;
        int i1 = j1;
        if (g != null)
        {
            i1 = j1;
            if (g.intValue() == j1)
            {
                i1 = h.intValue();
            }
        }
        c.setColor(i1);
        attributes = com.a.a.d.c("opacity", attributes);
        if (attributes == null)
        {
            c.setAlpha(255);
            return;
        } else
        {
            c.setAlpha((int)(attributes.floatValue() * 255F));
            return;
        }
    }

    private boolean a(Attributes attributes)
    {
        if (!i && !"none".equals(com.a.a.d.a("display", attributes)))
        {
            Object obj = com.a.a.d.b("stroke", attributes);
            if (obj != null)
            {
                a(attributes, ((Integer) (obj)));
                obj = com.a.a.d.c("stroke-width", attributes);
                if (obj != null)
                {
                    c.setStrokeWidth(((Float) (obj)).floatValue());
                }
                obj = com.a.a.d.a("stroke-linecap", attributes);
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
                attributes = com.a.a.d.a("stroke-linejoin", attributes);
                if ("miter".equals(attributes))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.MITER);
                } else
                if ("round".equals(attributes))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.ROUND);
                } else
                if ("bevel".equals(attributes))
                {
                    c.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
                }
                c.setStyle(android.graphics.Paint.Style.STROKE);
                return true;
            }
        }
        return false;
    }

    private boolean a(Attributes attributes, HashMap hashmap)
    {
        if ("none".equals(com.a.a.d.a("display", attributes)))
        {
            return false;
        }
        if (i)
        {
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setColor(-1);
            return true;
        }
        String s = com.a.a.d.a("fill", attributes);
        if (s != null && s.startsWith("url(#"))
        {
            attributes = (Shader)hashmap.get(s.substring("url(#".length(), s.length() - 1));
            if (attributes != null)
            {
                c.setShader(attributes);
                c.setStyle(android.graphics.Paint.Style.FILL);
                return true;
            } else
            {
                return false;
            }
        }
        c.setShader(null);
        hashmap = com.a.a.d.b("fill", attributes);
        if (hashmap != null)
        {
            a(attributes, ((Integer) (hashmap)));
            c.setStyle(android.graphics.Paint.Style.FILL);
            return true;
        }
        if (com.a.a.d.a("fill", attributes) == null && com.a.a.d.a("stroke", attributes) == null)
        {
            c.setStyle(android.graphics.Paint.Style.FILL);
            c.setColor(0xff000000);
            return true;
        } else
        {
            return false;
        }
    }

    public void a(Integer integer, Integer integer1)
    {
        g = integer;
        h = integer1;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void characters(char ac[], int i1, int j1)
    {
    }

    public void endDocument()
    {
    }

    public void endElement(String s, String s1, String s2)
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
        if (k.a != null)
        {
            s = new int[k.k.size()];
            for (int i1 = 0; i1 < s.length; i1++)
            {
                s[i1] = ((Integer)k.k.get(i1)).intValue();
            }

            s1 = new float[k.j.size()];
            for (int j1 = ((flag) ? 1 : 0); j1 < s1.length; j1++)
            {
                s1[j1] = ((Float)k.j.get(j1)).floatValue();
            }

            s = new LinearGradient(k.c, k.d, k.e, k.f, s, s1, android.graphics.Shader.TileMode.CLAMP);
            if (k.l != null)
            {
                s.setLocalMatrix(k.l);
            }
            j.put(k.a, s);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s1.equals("radialGradient"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k.a == null) goto _L4; else goto _L5
_L5:
        s = new int[k.k.size()];
        for (int k1 = 0; k1 < s.length; k1++)
        {
            s[k1] = ((Integer)k.k.get(k1)).intValue();
        }

        s1 = new float[k.j.size()];
        for (int l1 = ((flag1) ? 1 : 0); l1 < s1.length; l1++)
        {
            s1[l1] = ((Float)k.j.get(l1)).floatValue();
        }

        s = new RadialGradient(k.g, k.h, k.i, s, s1, android.graphics.Shader.TileMode.CLAMP);
        if (k.l != null)
        {
            s.setLocalMatrix(k.l);
        }
        j.put(k.a, s);
        return;
        if (!s1.equals("g")) goto _L4; else goto _L6
_L6:
        if (n)
        {
            n = false;
        }
        if (l)
        {
            m = m - 1;
            if (m == 0)
            {
                l = false;
            }
        }
        j.clear();
        return;
    }

    public void startDocument()
    {
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
    {
        if (!n) goto _L2; else goto _L1
_L1:
        if (s1.equals("rect"))
        {
            s1 = com.a.a.d.c("x", attributes);
            s = s1;
            if (s1 == null)
            {
                s = Float.valueOf(0.0F);
            }
            s2 = com.a.a.d.c("y", attributes);
            s1 = s2;
            if (s2 == null)
            {
                s1 = Float.valueOf(0.0F);
            }
            s2 = com.a.a.d.c("width", attributes);
            com.a.a.d.c("height", attributes);
            e = new RectF(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + s2.floatValue());
        }
_L4:
        return;
_L2:
        if (s1.equals("svg"))
        {
            int i1 = (int)Math.ceil(com.a.a.d.c("width", attributes).floatValue());
            int l1 = (int)Math.ceil(com.a.a.d.c("height", attributes).floatValue());
            b = a.beginRecording(i1, l1);
            return;
        }
        if (s1.equals("defs"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s1.equals("linearGradient"))
        {
            k = a(true, attributes);
            return;
        }
        if (s1.equals("radialGradient"))
        {
            k = a(false, attributes);
            return;
        }
        if (!s1.equals("stop"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (k != null)
        {
            float f1 = com.a.a.d.c("offset", attributes).floatValue();
            s = com.a.a.d.a("style", attributes);
            if (s.startsWith("stop-color:#"))
            {
                int j1 = Integer.parseInt(s.substring("stop-color:#".length()), 16);
                k.j.add(Float.valueOf(f1));
                k.k.add(Integer.valueOf(j1 | 0xff000000));
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!s1.equals("g"))
        {
            break; /* Loop/switch isn't completed */
        }
        if ("bounds".equalsIgnoreCase(com.a.a.d.a("id", attributes)))
        {
            n = true;
        }
        if (l)
        {
            m = m + 1;
        }
        if ("none".equals(com.a.a.d.a("display", attributes)) && !l)
        {
            l = true;
            m = 1;
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (l || !s1.equals("rect"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.a.a.d.c("x", attributes);
        if (s == null)
        {
            s = Float.valueOf(0.0F);
        }
        s1 = com.a.a.d.c("y", attributes);
        if (s1 == null)
        {
            s1 = Float.valueOf(0.0F);
        }
        s2 = com.a.a.d.c("width", attributes);
        Float float1 = com.a.a.d.c("height", attributes);
        if (a(attributes, j))
        {
            a(s.floatValue(), s1.floatValue(), s2.floatValue(), float1.floatValue());
            b.drawRect(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue(), c);
        }
        if (a(attributes))
        {
            b.drawRect(s.floatValue(), s1.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float1.floatValue(), c);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (l || !s1.equals("line"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.a.a.d.c("x1", attributes);
        s1 = com.a.a.d.c("x2", attributes);
        s2 = com.a.a.d.c("y1", attributes);
        Float float2 = com.a.a.d.c("y2", attributes);
        if (a(attributes))
        {
            a(s.floatValue(), s2.floatValue());
            a(s1.floatValue(), float2.floatValue());
            b.drawLine(s.floatValue(), s2.floatValue(), s1.floatValue(), float2.floatValue(), c);
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (l || !s1.equals("circle"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.a.a.d.c("cx", attributes);
        s1 = com.a.a.d.c("cy", attributes);
        s2 = com.a.a.d.c("r", attributes);
        if (s != null && s1 != null && s2 != null)
        {
            if (a(attributes, j))
            {
                a(s.floatValue() - s2.floatValue(), s1.floatValue() - s2.floatValue());
                a(s.floatValue() + s2.floatValue(), s1.floatValue() + s2.floatValue());
                b.drawCircle(s.floatValue(), s1.floatValue(), s2.floatValue(), c);
            }
            if (a(attributes))
            {
                b.drawCircle(s.floatValue(), s1.floatValue(), s2.floatValue(), c);
                return;
            }
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (l || !s1.equals("ellipse"))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.a.a.d.c("cx", attributes);
        s1 = com.a.a.d.c("cy", attributes);
        s2 = com.a.a.d.c("rx", attributes);
        Float float3 = com.a.a.d.c("ry", attributes);
        if (s != null && s1 != null && s2 != null && float3 != null)
        {
            d.set(s.floatValue() - s2.floatValue(), s1.floatValue() - float3.floatValue(), s.floatValue() + s2.floatValue(), s1.floatValue() + float3.floatValue());
            if (a(attributes, j))
            {
                a(s.floatValue() - s2.floatValue(), s1.floatValue() - float3.floatValue());
                a(s.floatValue() + s2.floatValue(), s1.floatValue() + float3.floatValue());
                b.drawOval(d, c);
            }
            if (a(attributes))
            {
                b.drawOval(d, c);
                return;
            }
        }
        if (true) goto _L4; else goto _L9
_L9:
        if (l || !s1.equals("polygon") && !s1.equals("polyline"))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = com.a.a.d.d("points", attributes);
        if (s2 != null)
        {
            s = new Path();
            s2 = com.a.a.g.a(s2);
            if (s2.size() > 1)
            {
                s.moveTo(((Float)s2.get(0)).floatValue(), ((Float)s2.get(1)).floatValue());
                for (int k1 = 2; k1 < s2.size(); k1 += 2)
                {
                    s.lineTo(((Float)s2.get(k1)).floatValue(), ((Float)s2.get(k1 + 1)).floatValue());
                }

                if (s1.equals("polygon"))
                {
                    s.close();
                }
                if (a(attributes, j))
                {
                    a(s);
                    b.drawPath(s, c);
                }
                if (a(attributes))
                {
                    b.drawPath(s, c);
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L10
_L10:
        if (l || !s1.equals("path"))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = com.a.a.d.b(com.a.a.d.a("d", attributes));
        if (a(attributes, j))
        {
            a(s);
            b.drawPath(s, c);
        }
        if (!a(attributes)) goto _L4; else goto _L11
_L11:
        b.drawPath(s, c);
        return;
        if (l) goto _L4; else goto _L12
_L12:
        Log.d("SVGAndroid", (new StringBuilder()).append("UNRECOGNIZED SVG COMMAND: ").append(s1).toString());
        return;
    }
}
