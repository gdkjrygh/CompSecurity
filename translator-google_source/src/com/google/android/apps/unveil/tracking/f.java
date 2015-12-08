// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.apps.unveil.env.Size;
import com.google.android.apps.unveil.env.a;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.v;
import com.google.android.apps.unveil.nonstop.b;
import com.google.android.apps.unveil.nonstop.c;
import com.google.android.apps.unveil.nonstop.d;
import com.google.android.apps.unveil.nonstop.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

// Referenced classes of package com.google.android.apps.unveil.tracking:
//            h, VisionGyro, ObjectTracker, e, 
//            g

public final class f extends c
    implements b, com.google.android.apps.unveil.ui.c
{

    final af a = new af();
    final Paint j = new Paint();
    final a k = new a(40F);
    final Resources l;
    private final HashMap m;
    private final HashMap n = new HashMap();
    private final HashMap o = new HashMap();
    private final HashMap p = new HashMap();
    private final BufferedWriter q = null;
    private float r;
    private int s;
    private int t;
    private VisionGyro u;
    private ObjectTracker v;
    private final g w;
    private final String x;

    public f(Resources resources, String s1, g g1)
    {
        r = 0.0F;
        s = 0;
        t = 0;
        l = resources;
        resources = s1.split("/");
        x = resources[resources.length - 1];
        m = a(s1);
        w = g1;
    }

    private static float a(RectF rectf)
    {
        return rectf.width() * rectf.height();
    }

    private HashMap a(String s1)
    {
        HashMap hashmap;
        String s2;
        hashmap = new HashMap();
        s2 = String.valueOf("objects.txt");
        s2 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length())).append(s1).append("/").append(s2).toString();
        Object obj;
        boolean flag;
        flag = com.google.android.apps.unveil.env.v.a(s2);
        obj = com.google.android.apps.unveil.env.v.b(s2);
        String s3 = String.valueOf(obj);
        if (s3.length() == 0)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        "Loading file from ".concat(s3);
_L3:
        obj = new BufferedReader(new InputStreamReader(com.google.android.apps.unveil.env.v.a(l, flag, ((String) (obj)))));
_L2:
        String s4 = ((BufferedReader) (obj)).readLine();
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        if (!s4.startsWith("object")) goto _L2; else goto _L1
_L1:
        (new StringBuilder(String.valueOf(s4).length() + 10)).append("Object! '").append(s4).append("'");
        String as[] = s4.split(" ");
        String s5 = (new StringTokenizer(as[1], ".")).nextToken();
        String s6 = String.valueOf(String.format("track_%s.txt", new Object[] {
            s5
        }));
        s6 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s6).length())).append(s1).append("/").append(s6).toString();
        int i1 = Integer.parseInt(as[2]);
        int j1 = Integer.parseInt(as[3]);
        a.b("object %s, Start frame: %d, End frame: %d", new Object[] {
            s5, Integer.valueOf(i1), Integer.valueOf(j1)
        });
        hashmap.put(s5, new h(this, s6, i1, j1));
          goto _L2
        try
        {
            new String("Loading file from ");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf("gt.txt");
            s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(obj).length())).append(s1).append("/").append(((String) (obj))).toString();
            a.c("Couldn't find file %s, trying to load %s instead.", new Object[] {
                s2, s1
            });
            hashmap.put("gt", new h(this, s1, 0, -1));
            return hashmap;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s1 = "Exception reading ".concat(s1);
            } else
            {
                s1 = new String("Exception reading ");
            }
            throw new RuntimeException(s1);
        }
          goto _L3
        ((BufferedReader) (obj)).close();
        return hashmap;
    }

    public final void a(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        if (t == 0) goto _L2; else goto _L1
_L1:
        Object obj = v;
        if (obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setStrokeWidth(6F);
        obj = o.keySet().iterator();
_L5:
        Object obj1;
        RectF rectf;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        obj1 = (String)((Iterator) (obj)).next();
        rectf = (RectF)o.get(obj1);
        if (rectf == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        j.setColor(0xffff0000);
        rectf = new RectF(rectf);
        super.e.mapRect(rectf);
        canvas.drawRect(rectf, j);
        obj1 = (RectF)n.get(obj1);
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        j.setColor(0xff00ff00);
        obj1 = new RectF(((RectF) (obj1)));
        super.e.mapRect(((RectF) (obj1)));
        canvas.drawRect(((RectF) (obj1)), j);
          goto _L5
        canvas;
        throw canvas;
        float f1;
        f1 = 0.0F + k.b;
        obj1 = k;
        obj = String.valueOf(x);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj = "sequence: ".concat(((String) (obj)));
_L6:
        ((a) (obj1)).a(canvas, 0.0F, f1, ((String) (obj)));
        f1 = k.b + f1;
        k.a(canvas, 0.0F, f1, super.b.toString());
        float f2 = k.b;
        obj = k;
        float f3 = h();
        int i1 = t;
        ((a) (obj)).a(canvas, 0.0F, f1 + f2, (new StringBuilder(50)).append("Average score: ").append(f3).append(", frame: ").append(i1).toString());
          goto _L2
        obj = new String("sequence: ");
          goto _L6
    }

    protected final void a(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        if (v == null)
        {
            u = new VisionGyro();
            v = com.google.android.apps.unveil.tracking.ObjectTracker.a(m1.b(), m1.c(), m1.d());
        }
        com.google.android.apps.unveil.env.c c1 = m1.a();
        float af1[] = u.a(c1.a, m1.b(), m1.c());
        v.a(c1.a, m1.b, af1, false);
        o.clear();
        n.clear();
        iterator = m.keySet().iterator();
        int i1 = 0;
_L14:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        h h1;
        String s1;
        s1 = (String)iterator.next();
        h1 = (h)m.get(s1);
        if (t < h1.a || t > h1.b) goto _L4; else goto _L3
_L3:
        byte abyte0[];
        int j1;
        abyte0 = m1.a().a;
        j1 = t - h1.a;
        if (j1 < h1.c.size() && j1 >= 0) goto _L6; else goto _L5
_L15:
        float f2;
        e e2;
        RectF rectf;
        Object obj1;
        o.put(s1, obj);
        if (t == h1.a)
        {
            a.b("Track [%s] starting at %d: %s", new Object[] {
                s1, Integer.valueOf(t), obj
            });
            e e1 = v.a(((RectF) (obj)), abyte0);
            p.put(s1, e1);
        }
        e2 = (e)p.get(s1);
        rectf = e2.b();
        n.put(s1, rectf);
        obj1 = super.c;
        obj1 = new RectF(0.0F, 0.0F, ((Size) (obj1)).width, ((Size) (obj1)).height);
        f2 = r;
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (RectF.intersects(((RectF) (obj)), ((RectF) (obj1)))) goto _L9; else goto _L8
_L20:
        if (rectf == null) goto _L11; else goto _L10
_L10:
        if (RectF.intersects(rectf, ((RectF) (obj1)))) goto _L12; else goto _L11
_L16:
        float f1;
        r = f1 + f2;
        s = s + 1;
        if (t != h1.b) goto _L4; else goto _L13
_L13:
        a.b("Track [%s] ending at %d: %s", new Object[] {
            s1, Integer.valueOf(t), obj
        });
        p.remove(s1);
        e2.d();
        synchronized (e2.c)
        {
            e2.b = true;
            com.google.android.apps.unveil.tracking.ObjectTracker.a(e2.c, e2.a);
            com.google.android.apps.unveil.tracking.ObjectTracker.b(e2.c).remove(e2.a);
        }
_L4:
        i1 = Math.max(i1, h1.b);
          goto _L14
_L6:
        obj = (RectF)h1.c.get(j1);
          goto _L15
_L23:
        ((RectF) (obj)).intersect(((RectF) (obj1)));
        rectf.intersect(((RectF) (obj1)));
        obj1 = new RectF(((RectF) (obj)));
        if (((RectF) (obj1)).intersect(rectf))
        {
            break MISSING_BLOCK_LABEL_609;
        }
        f1 = 0.0F;
          goto _L16
        float f3;
        float f4;
        f1 = a(((RectF) (obj1)));
        f3 = a(((RectF) (obj)));
        f4 = a(rectf);
        f1 = (f1 * 2.0F) / (f3 + f4);
          goto _L16
        m1;
        obj;
        JVM INSTR monitorexit ;
        throw m1;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
_L2:
        if (t < i1) goto _L18; else goto _L17
_L17:
        m1 = q;
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_678;
        }
        q.close();
_L19:
        v.a();
        v = null;
        w.h();
_L18:
        t = t + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        m1;
        a.f("Exception!", new Object[0]);
          goto _L19
_L5:
        obj = null;
          goto _L15
_L8:
        boolean flag = true;
          goto _L20
_L11:
        boolean flag1 = true;
_L21:
        if (!flag || !flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        f1 = 1.0F;
          goto _L16
_L9:
        flag = false;
          goto _L20
_L12:
        flag1 = false;
          goto _L21
        if (!flag && !flag1) goto _L23; else goto _L22
_L22:
        f1 = 0.0F;
          goto _L16
    }

    public final void b(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        if (v != null)
        {
            v.a(canvas, super.e);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
    }

    protected final void f()
    {
        if (v != null)
        {
            v.a();
            v = null;
        }
    }

    public final float h()
    {
        return r / (float)s;
    }

    public final void i()
    {
        if (v != null)
        {
            v.a(super.d, super.g);
        }
    }
}
