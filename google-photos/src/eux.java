// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eux
    implements euw
{

    private final aqp a = new aqp(0x400000);

    eux()
    {
    }

    public final void a(byte abyte0[])
    {
        a.a(abyte0);
    }

    public final byte[] a(int i)
    {
        byte abyte1[] = a.a(i);
        byte abyte0[] = abyte1;
        if (abyte1.length != i)
        {
            a.a(abyte1);
            abyte0 = new byte[i];
        }
        return abyte0;
    }
}
