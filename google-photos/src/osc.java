// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class osc
{

    public final List a = new ArrayList();
    public ose b;
    private final int c = 147;
    private final osi d = osi.a(2);
    private final ByteArrayOutputStream e = new ByteArrayOutputStream();
    private final DataOutputStream f;
    private final osd g;
    private long h;

    public osc(int i, int j, osd osd1, long l)
    {
        f = new DataOutputStream(e);
        b = ose.a;
        h = 0x7fffffffffffffffL;
        p.a(true, "Invalid samplesPerSec (%s)", new Object[] {
            Integer.valueOf(48000)
        });
        g = (osd)p.a(osd1);
        h = (0x6baa80L * l) / 0xf4240L;
    }

    private static short a(float f1)
    {
        return (short)Math.round(Math.max(-32768F, Math.min(32767F, f1)));
    }

    private void a(int i)
    {
        if (!d.a()) goto _L2; else goto _L1
_L1:
        int j = 0;
          goto _L3
_L12:
        float f1;
        float f2;
        int k;
        if (k >= a.size())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        osf osf1 = (osf)a.get(k);
        f2 += osf1.a(osh.a);
        f1 += osf1.a(osh.b);
        osf1.a(c);
        k++;
        continue; /* Loop/switch isn't completed */
        Object obj;
        IOException ioexception;
        try
        {
            f.writeShort(a(f2));
            f.writeShort(a(f1));
        }
        catch (IOException ioexception1)
        {
            orw.a("Exception while mixing audio", ioexception1);
            return;
        }
        j++;
          goto _L3
_L10:
        if (k >= a.size())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        obj = (osf)a.get(k);
        f1 += ((osf) (obj)).a.a() * ((osf) (obj)).b;
        ((osf) (obj)).a(c);
        k++;
        continue; /* Loop/switch isn't completed */
        f.writeShort(a(f1));
        j++;
          goto _L4
_L7:
        h = h - (long)(c * i);
        f.flush();
_L5:
        if (e.size() > 0)
        {
            obj = ByteBuffer.wrap(e.toByteArray()).asShortBuffer();
            g.a(((java.nio.ShortBuffer) (obj)), 0x6baa80 / c, d.a);
            e.reset();
            return;
        }
        break; /* Loop/switch isn't completed */
        ioexception;
        orw.a("Exception while flushing mixed audio", ioexception);
        if (true) goto _L5; else goto _L3
_L3:
        if (j >= i) goto _L7; else goto _L6
_L6:
        k = 0;
        f1 = 0.0F;
        f2 = 0.0F;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 0;
_L4:
        if (j >= i) goto _L7; else goto _L8
_L8:
        k = 0;
        f1 = 0.0F;
        if (true) goto _L10; else goto _L9
_L9:
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private int b()
    {
        long l = Math.min(h, c * 4096);
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            l = Math.min(l, ((osf)iterator.next()).a.b());
        }

        return (int)(l / (long)c);
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
_L14:
        if (b == ose.c) goto _L2; else goto _L1
_L1:
        Iterator iterator = a.iterator();
_L9:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (osf)iterator.next();
        if (!((osf) (obj)).c) goto _L6; else goto _L5
_L5:
        obj = ((osf) (obj)).a;
        Exception exception;
        int i;
        if (((osg) (obj)).b() < (long)((osg) (obj)).a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L7
_L10:
        if (i == 0) goto _L9; else goto _L8
_L8:
        iterator.remove();
        i = a.size();
        orw.d((new StringBuilder(47)).append("Removed finished source, ").append(i).append(" remaining.").toString());
          goto _L9
        exception;
        throw exception;
_L6:
        i = 0;
          goto _L10
_L4:
        if (h < (long)c)
        {
            g.a();
            b = ose.c;
        }
_L2:
        if (b != ose.b) goto _L12; else goto _L11
_L11:
        i = b();
        if (i <= 0) goto _L12; else goto _L13
_L13:
        a(i);
          goto _L14
_L12:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        if (i == 0) goto _L6; else goto _L15
_L15:
        i = 1;
          goto _L10
    }
}
