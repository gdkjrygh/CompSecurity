// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ast
{

    byte a;
    int b;
    int c;
    int d;
    byte e[];
    byte f[];

    public ast()
    {
    }

    public static ast a(byte abyte0[])
    {
        ast ast1 = new ast();
        ast1.a = (byte)(abyte0[0] >>> 4);
        ast1.b = axr.a(abyte0, 0) & 0xfffffff;
        ast1.c = axr.a(abyte0, 4);
        int i = axr.a(abyte0, 8);
        ast1.d = i;
        if (i > 0)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 12, abyte1, 0, i);
            ast1.e = new byte[ast1.d];
            System.arraycopy(abyte1, 0, ast1.e, 0, ast1.d);
        }
        if (abyte0.length - i - 12 > 0)
        {
            byte abyte2[] = new byte[abyte0.length - i - 12];
            System.arraycopy(abyte0, i + 12, abyte2, 0, abyte2.length);
            ast1.f = abyte2;
        }
        return ast1;
    }
}
