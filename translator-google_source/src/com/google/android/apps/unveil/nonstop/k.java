// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.text.TextUtils;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.d;
import com.google.android.apps.unveil.env.i;
import com.google.android.apps.unveil.sensors.CameraManager;
import com.google.android.apps.unveil.sensors.aa;
import com.google.android.apps.unveil.sensors.y;
import com.google.android.apps.unveil.sensors.z;
import com.google.android.apps.unveil.ui.GlOverlay;
import java.util.Set;
import java.util.Vector;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            c, m, DebugView, l

public final class k extends c
{

    private static final af a = new af();
    private final CameraManager j;
    private final aa k = null;
    private final DebugView l;
    private final GlOverlay m;
    private final Vector n = new Vector();
    private float o[];
    private z p;
    private d q;

    public k(CameraManager cameramanager, DebugView debugview, GlOverlay gloverlay)
    {
        q = new d();
        j = cameramanager;
        l = debugview;
        m = gloverlay;
    }

    static float[] a(k k1, float af1[])
    {
        k1.o = af1;
        return af1;
    }

    protected final void a(m m1)
    {
        this;
        JVM INSTR monitorenter ;
        d d1;
        long l1;
        d1 = q;
        l1 = m1.b;
        d1.f = (d1.d - 1) % d1.a.length;
        if (d1.d <= 0) goto _L2; else goto _L1
_L1:
        int i1 = (int)(l1 - d1.c);
        if (i1 <= 0) goto _L2; else goto _L3
_L3:
        if (d1.d <= d1.a.length) goto _L5; else goto _L4
_L4:
        int j1;
        int k1;
        j1 = d1.a[d1.f];
        k1 = 1000 / j1;
        if (k1 > 40) goto _L7; else goto _L6
_L6:
        m1 = d1.b;
        m1[k1] = m1[k1] - 1;
_L10:
        d1.e = d1.e - j1;
_L5:
        d1.a[d1.f] = i1;
        j1 = 1000 / i1;
        if (j1 > 40) goto _L9; else goto _L8
_L8:
        m1 = d1.b;
        m1[j1] = m1[j1] + 1;
_L11:
        d1.e = i1 + d1.e;
        d1.g = null;
_L2:
        d1.c = l1;
        d1.d = d1.d + 1;
        boolean flag;
        if (d1.f == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        af.a();
        if (l.getVisibility() == 0)
        {
            l.invalidate();
            if (m != null)
            {
                m.requestRender();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        m1 = d1.b;
        m1[40] = m1[40] - 1;
          goto _L10
        m1;
        throw m1;
_L9:
        m1 = d1.b;
        m1[40] = m1[40] + 1;
          goto _L11
    }

    protected final void d()
    {
        if (k != null)
        {
            p = new l(this);
            k.g.a(p);
        }
    }

    protected final void e()
    {
        if (k != null)
        {
            com.google.android.apps.unveil.sensors.x x = k.g;
            z z = p;
            ((y) (x)).a.remove(z);
        }
    }

    public final Vector g()
    {
        int j1 = 0;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        n.clear();
        obj1 = n;
        obj = q;
        if (((d) (obj)).g == null) goto _L2; else goto _L1
_L1:
        obj = ((d) (obj)).g;
_L5:
        ((Vector) (obj1)).add(obj);
        obj = n;
        obj1 = String.valueOf(super.d);
        String s = String.valueOf(super.c);
        ((Vector) (obj)).add((new StringBuilder(String.valueOf(obj1).length() + 19 + String.valueOf(s).length())).append("Screen: ").append(((String) (obj1))).append(", Preview: ").append(s).toString());
        obj1 = n;
        obj = String.valueOf(j.getStateName());
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "Camera state: ".concat(((String) (obj)));
_L8:
        ((Vector) (obj1)).add(obj);
        if (o != null)
        {
            obj = n;
            float f = o[0];
            float f1 = o[1];
            float f2 = o[2];
            ((Vector) (obj)).add((new StringBuilder(71)).append("azimuth: ").append(f).append(", pitch: ").append(f1).append(", roll: ").append(f2).toString());
        }
        obj = n;
        this;
        JVM INSTR monitorexit ;
        return ((Vector) (obj));
_L2:
        int j2 = Math.min(((d) (obj)).d, ((d) (obj)).a.length);
label0:
        {
            if (j2 != 0)
            {
                break label0;
            }
            obj = "";
        }
          goto _L5
        Integer ainteger[] = new Integer[5];
        int i1 = 0;
_L7:
        if (i1 >= 5)
        {
            break; /* Loop/switch isn't completed */
        }
        ainteger[i1] = Integer.valueOf(-1);
        i1++;
        if (true) goto _L7; else goto _L6
_L9:
        int k1;
        int l1;
        int i2;
        if (k1 > 40)
        {
            break MISSING_BLOCK_LABEL_403;
        }
        l1 = i1;
        i2 = j1;
        if (((d) (obj)).b[k1] == 0)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        j1 += ((d) (obj)).b[k1];
        l1 = i1;
        i2 = j1;
        if (j1 < (i1 * j2) / 4)
        {
            break MISSING_BLOCK_LABEL_566;
        }
        ainteger[i1] = Integer.valueOf(k1);
        l1 = i1 + 1;
        i2 = j1;
        break MISSING_BLOCK_LABEL_566;
        String s1 = i.a(1000F / ((float)((d) (obj)).e / (float)j2));
        String s2 = String.valueOf(TextUtils.join(",", ainteger));
        i1 = ((d) (obj)).f;
        j1 = ((d) (obj)).a.length;
        obj.g = (new StringBuilder(String.valueOf(s1).length() + 28 + String.valueOf(s2).length())).append(s1).append("  [").append(s2).append("] ").append(i1).append("/").append(j1).toString();
        obj = ((d) (obj)).g;
          goto _L5
_L4:
        obj = new String("Camera state: ");
          goto _L8
        Exception exception;
        exception;
        throw exception;
_L6:
        k1 = 0;
        l1 = 0;
        i1 = j1;
        j1 = l1;
          goto _L9
        k1++;
        i1 = l1;
        j1 = i2;
          goto _L9
    }

}
