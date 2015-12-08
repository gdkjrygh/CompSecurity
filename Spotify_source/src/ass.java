// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.trace.enums.InterfaceActivityDirection;

public abstract class ass
{

    asu a;
    private Object b;

    public ass(asu asu1)
    {
        a = null;
        b = new Object();
        if (asu1 == null)
        {
            throw new IllegalArgumentException("Provided protocol listener interface reference is null");
        } else
        {
            a = asu1;
            return;
        }
    }

    protected static void a(asv asv1, byte abyte0[], asy asy1)
    {
        axg.a(InterfaceActivityDirection.b, asv1, abyte0, 0, abyte0.length, "42baba60-eb57-11df-98cf-0800200c9a66");
        asy1.a(asv1, abyte0);
    }

    private void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    private void b(byte byte0)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.b(byte0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public abstract void a(byte byte0);

    protected final void a(asv asv1, byte abyte0[], int i, int j)
    {
        axg.a(InterfaceActivityDirection.a, asv1, abyte0, i, j, "42baba60-eb57-11df-98cf-0800200c9a66");
        b(asv1.f);
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        byte byte0 = asv1.a;
        byte abyte1[];
        int k;
        byte byte1;
        byte byte2;
        byte byte3;
        if (asv1.b)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        byte1 = ((axs) (asv1.c)).h;
        byte2 = ((axs) (asv1.d)).h;
        byte3 = asv1.e;
        k = asv1.f & 0xff | ((((k | (byte0 & 0xf | 0) << 1) << 3 | byte1 & 7) << 8 | byte2 & 0xff) << 8 | byte3 & 0xff) << 8;
        if (asv1.a != 1) goto _L2; else goto _L1
_L1:
        abyte1 = new byte[8];
        System.arraycopy(axr.a(k), 0, abyte1, 0, 4);
        System.arraycopy(axr.a(asv1.g), 0, abyte1, 4, 4);
        asv1 = abyte1;
_L4:
        a(((byte []) (asv1)), 0, asv1.length);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        a(abyte0, i, j);
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (asv1.a <= 1)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        abyte1 = new byte[12];
        System.arraycopy(axr.a(k), 0, abyte1, 0, 4);
        System.arraycopy(axr.a(asv1.g), 0, abyte1, 4, 4);
        System.arraycopy(axr.a(asv1.h), 0, abyte1, 8, 4);
        asv1 = abyte1;
        continue; /* Loop/switch isn't completed */
        asv1;
        obj;
        JVM INSTR monitorexit ;
        throw asv1;
        asv1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract void a(asw asw);

    public abstract void a(atc atc);

    public abstract void a(atc atc, byte byte0);

    protected final void a(atc atc, byte byte0, String s)
    {
        a.a(atc, byte0, s);
    }

    protected final void a(String s, Exception exception)
    {
        a.a(s, exception);
    }

    public abstract void a(byte abyte0[], int i);

    protected final void b(asw asw)
    {
        a.a(asw);
    }
}
