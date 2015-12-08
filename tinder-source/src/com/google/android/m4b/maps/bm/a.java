// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.ab;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            d, j

public final class com.google.android.m4b.maps.bm.a
{
    static final class a
    {

        public int a;
        public int b;

        a()
        {
        }
    }


    private j a;
    private boolean b;
    private final Bitmap c;
    private final Map d = ax.c();

    public com.google.android.m4b.maps.bm.a()
    {
        a = null;
        b = true;
        c = Bitmap.createBitmap(256, 1, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        java.util.Map.Entry entry;
        for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); c.setPixel(((Integer)entry.getValue()).intValue() % 256, ((Integer)entry.getValue()).intValue() / 256, ((Integer)entry.getKey()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_100;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public static void c(d d1)
    {
        d1.a.glMatrixMode(5890);
        d1.a.glLoadIdentity();
        d1.a.glScalex(1, 1, 0);
        d1.a.glMatrixMode(5888);
    }

    public static void d(d d1)
    {
        d1.a.glMatrixMode(5890);
        d1.a.glLoadIdentity();
        d1.a.glMatrixMode(5888);
    }

    public final j a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        b(d1);
        d1 = a;
        this;
        JVM INSTR monitorexit ;
        return d1;
        d1;
        throw d1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.c();
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(int i, a a1)
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer1 = (Integer)d.get(Integer.valueOf(i));
        Integer integer = integer1;
        if (integer1 != null) goto _L2; else goto _L1
_L1:
        integer = Integer.valueOf(d.size());
        if (integer.intValue() < 256) goto _L4; else goto _L3
_L3:
        if (ab.a("ColorPalette", 6))
        {
            Log.e("ColorPalette", "Color texture is full");
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        d.put(Integer.valueOf(i), integer);
        b = true;
_L2:
        a1.a = ((integer.intValue() % 256) * 0x10000 + 32768) / 256;
        a1.b = ((integer.intValue() / 256) * 0x10000 + 32768) / 1;
        if (true) goto _L6; else goto _L5
_L5:
        a1;
        throw a1;
    }

    public final void b(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b || a == null)
        {
            b();
            if (a != null && d1.a != a.a().a)
            {
                a();
            }
            if (a == null)
            {
                a = new j(d1);
                a.d = false;
            }
            a.b(c);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d1;
        throw d1;
    }
}
