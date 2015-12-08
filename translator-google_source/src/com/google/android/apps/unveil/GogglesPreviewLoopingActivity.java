// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil;

import android.content.Intent;
import android.graphics.Matrix;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.OrientationEventListener;
import com.google.android.apps.unveil.env.af;
import com.google.android.apps.unveil.env.gl.GLCameraPreview;
import com.google.android.apps.unveil.nonstop.f;
import com.google.android.apps.unveil.sensors.aa;
import com.google.android.apps.unveil.sensors.w;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.apps.unveil:
//            PreviewLoopingActivity, k, UnveilSettings

public abstract class GogglesPreviewLoopingActivity extends PreviewLoopingActivity
{

    private static final af g = new af();
    public k a;
    public aa b;
    private w h;

    public GogglesPreviewLoopingActivity()
    {
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        boolean flag = d.a;
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        h.b();
        aa aa1 = b;
        aa1.a.unregisterListener(aa1);
        aa1.d.disable();
        super.a();
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(int i)
    {
        Intent intent = getIntent();
        if (intent.hasExtra("UnveilSettings"))
        {
            intent.getExtras().get("UnveilSettings");
        }
        super.a(i);
        h = a.a();
        b = a.b();
    }

    protected final void a(Matrix matrix)
    {
        if (d == null)
        {
            super.a(matrix);
            if (f != null && a.i().useGLES2Overlay)
            {
                d.a(f.getFrameLoader(), 0);
                return;
            }
        }
    }

    protected final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        boolean flag2 = d.a;
        if (!flag2) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        w w1 = h;
        if (!w1.a()) goto _L5; else goto _L4
_L4:
        w1.a.b("Google location not available, not requesting location.", new Object[0]);
        w1.c();
_L16:
        aa aa1 = b;
        if (aa1.b != null)
        {
            aa1.a.registerListener(aa1, aa1.b, 3);
        }
        if (aa1.c != null)
        {
            aa1.a.registerListener(aa1, aa1.c, 3);
        }
        aa1.d.enable();
        super.b();
          goto _L2
        Object obj;
        obj;
        throw obj;
_L5:
        if (!w1.c.isProviderEnabled("gps")) goto _L7; else goto _L6
_L6:
        w1.c.requestLocationUpdates("gps", 0L, 0.0F, w1);
        boolean flag = true;
_L10:
        if (!w1.c.isProviderEnabled("network")) goto _L9; else goto _L8
_L8:
        w1.c.requestLocationUpdates("network", 0L, 0.0F, w1);
        boolean flag1 = true;
_L11:
        for (Iterator iterator = w1.e.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_282;
_L7:
        w1.a.a("GPS location provider disabled.", new Object[0]);
        flag = false;
          goto _L10
        iterator;
        w1.a.d("No GPS location provider; are you in the emulator?", new Object[0]);
        flag = false;
          goto _L10
_L9:
        w1.a.a("Wireless network location provider disabled.", new Object[0]);
        flag1 = false;
          goto _L11
        iterator;
        w1.a.d("No network location provider; are you in the emulator?", new Object[0]);
        flag1 = false;
          goto _L11
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        Object obj1 = w1.c.getLastKnownLocation("gps");
_L23:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        Location location = w1.c.getLastKnownLocation("network");
_L22:
        if (obj1 == null || location == null) goto _L13; else goto _L12
_L12:
        if (((Location) (obj1)).getTime() <= location.getTime()) goto _L15; else goto _L14
_L14:
        w1.d = ((Location) (obj1));
_L17:
        obj1 = w1.b.e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_363;
        }
        if (w1.d != null)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        w1.d = ((Location) (obj1));
_L21:
        if (w1.d != null)
        {
            if (System.currentTimeMillis() - w1.d.getTime() <= 60000L)
            {
                break MISSING_BLOCK_LABEL_439;
            }
            w1.d = null;
        }
          goto _L16
_L15:
        w1.d = location;
          goto _L17
_L13:
        if (obj1 == null) goto _L19; else goto _L18
_L18:
        w1.d = ((Location) (obj1));
          goto _L17
_L19:
        if (location == null) goto _L17; else goto _L20
_L20:
        w1.d = location;
          goto _L17
        w1.d.set(((Location) (obj1)));
          goto _L21
        obj1 = w1.e.iterator();
        while (((Iterator) (obj1)).hasNext()) 
        {
            ((Iterator) (obj1)).next();
        }
          goto _L16
        location = null;
          goto _L22
        obj1 = null;
          goto _L23
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = (k)getApplicationContext();
    }

}
