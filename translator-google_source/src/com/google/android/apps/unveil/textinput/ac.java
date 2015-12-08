// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.graphics.Point;
import com.google.android.apps.unveil.env.Size;
import com.google.android.goggles.a;
import com.google.bionics.goggles.api2.b;
import com.google.bionics.goggles.api2.o;
import java.util.List;

// Referenced classes of package com.google.android.apps.unveil.textinput:
//            ad, ae

public abstract class ac
    implements a
{

    public long a;
    public final ae b;
    private ad c;
    private Point d;
    private float e;

    public ac(ae ae)
    {
        a = -1L;
        d = new Point(0, 0);
        e = 1.0F;
        b = ae;
    }

    public static com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText c(List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            o o1 = (o)list.get(i);
            if (o1.b != null && o1.b.a != null)
            {
                return (com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText)o1.b.a.getExtension(com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.a);
            }
        }

        return null;
    }

    public final com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox a(com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox)
    {
        if (boundingbox != null)
        {
            com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox boundingbox1 = new com.google.bionics.goggles.api2.GogglesCommonProtos.BoundingBox();
            boundingbox1.setX((int)((float)boundingbox.getX() * e + (float)d.x));
            boundingbox1.setY((int)((float)boundingbox.getY() * e + (float)d.y));
            boundingbox1.setWidth((int)((float)boundingbox.getWidth() * e));
            boundingbox1.setHeight((int)((float)boundingbox.getHeight() * e));
            return boundingbox1;
        } else
        {
            return null;
        }
    }

    public final void a(long l, Point point)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == l)
        {
            d = point;
            e = 1.0F;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        point;
        throw point;
    }

    public abstract void a(long l, Size size);

    public abstract void a(List list);

    public final boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = a;
        boolean flag;
        if (l == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        a = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.b(list);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        throw list;
    }

    public final long c()
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        a = System.nanoTime();
        c = new ad(this, a);
        l = a;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        boolean flag = c.a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null)
        {
            c.e();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long f()
    {
        this;
        JVM INSTR monitorenter ;
        long l = a;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
