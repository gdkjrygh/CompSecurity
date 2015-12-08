// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class aqp
{

    final aqh a;

    public aqp()
    {
        this(0x400000);
    }

    public aqp(int i)
    {
        a = new aqh(0x400000);
    }

    public void a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        a.a(abyte0, [B);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public byte[] a(int i)
    {
        return (byte[])a.a(i, [B);
    }
}
