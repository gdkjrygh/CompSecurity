// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;

public final class bdg
    implements bdb
{

    private final bdt a;
    private final bee b;
    private long c;
    private long d;
    private long e;
    private int f;

    public bdg()
    {
        this((byte)0);
    }

    private bdg(byte byte0)
    {
        this(((bdt) (new beg())));
    }

    private bdg(bdt bdt1)
    {
        this(bdt1, (byte)0);
    }

    private bdg(bdt bdt1, byte byte0)
    {
        a = bdt1;
        b = new bee();
        e = -1L;
    }

    public final long a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = e;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        c = c + (long)i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (f == 0)
        {
            d = a.a();
        }
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        float f1;
        bef abef[];
        Object obj;
        Object obj1;
        bef abef1[];
        int i;
        int k;
        long l2;
        boolean flag;
        if (f > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        l2 = a.a();
        i = (int)(l2 - d);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        f1 = (c * 8000L) / (long)i;
        obj1 = b;
        i = (int)Math.sqrt(c);
        if (((bee) (obj1)).f != 1)
        {
            Collections.sort(((bee) (obj1)).d, bee.a);
            obj1.f = 1;
        }
        if (((bee) (obj1)).i <= 0) goto _L4; else goto _L3
_L3:
        abef = ((bee) (obj1)).e;
        k = ((bee) (obj1)).i - 1;
        obj1.i = k;
        obj = abef[k];
_L6:
        int l = ((bee) (obj1)).g;
        obj1.g = l + 1;
        obj.a = l;
        obj.b = i;
        obj.c = f1;
        ((bee) (obj1)).d.add(obj);
        obj1.h = ((bee) (obj1)).h + i;
_L5:
        do
        {
            if (((bee) (obj1)).h <= ((bee) (obj1)).c)
            {
                break MISSING_BLOCK_LABEL_331;
            }
            i = ((bee) (obj1)).h - ((bee) (obj1)).c;
            obj = (bef)((bee) (obj1)).d.get(0);
            if (((bef) (obj)).b > i)
            {
                break MISSING_BLOCK_LABEL_306;
            }
            obj1.h = ((bee) (obj1)).h - ((bef) (obj)).b;
            ((bee) (obj1)).d.remove(0);
        } while (((bee) (obj1)).i >= 5);
        abef1 = ((bee) (obj1)).e;
        i = ((bee) (obj1)).i;
        obj1.i = i + 1;
        abef1[i] = ((bef) (obj));
          goto _L5
        obj;
        throw obj;
_L4:
        obj = new bef((byte)0);
          goto _L6
        obj.b = ((bef) (obj)).b - i;
        obj1.h = ((bee) (obj1)).h - i;
          goto _L5
        obj = b;
        if (((bee) (obj)).f != 0)
        {
            Collections.sort(((bee) (obj)).d, bee.b);
            obj.f = 0;
        }
        f1 = ((bee) (obj)).h;
        i = 0;
_L11:
        if (i >= ((bee) (obj)).d.size()) goto _L8; else goto _L7
_L7:
        obj1 = (bef)((bee) (obj)).d.get(i);
        j += ((bef) (obj1)).b;
        if ((float)j < 0.5F * f1) goto _L10; else goto _L9
_L9:
        f1 = ((bef) (obj1)).c;
_L12:
        long l1;
        if (Float.isNaN(f1))
        {
            l1 = -1L;
        } else
        {
            l1 = (long)f1;
        }
        e = l1;
_L2:
        f = f - 1;
        if (f > 0)
        {
            d = l2;
        }
        c = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
_L10:
        i++;
          goto _L11
_L8:
        if (!((bee) (obj)).d.isEmpty())
        {
            break MISSING_BLOCK_LABEL_491;
        }
        f1 = (0.0F / 0.0F);
          goto _L12
        f1 = ((bef)((bee) (obj)).d.get(((bee) (obj)).d.size() - 1)).c;
          goto _L12
    }
}
