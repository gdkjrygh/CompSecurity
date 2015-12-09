// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bcu
{

    private static final int b[] = {
        128, 64, 32, 16, 8, 4, 2, 1
    };
    int a;
    private final byte c[] = new byte[8];
    private int d;

    public bcu()
    {
    }

    public final long a(bby bby1, boolean flag, boolean flag1)
    {
label0:
        {
            if (d != 0)
            {
                break label0;
            }
            if (!bby1.a(c, 0, 1, flag))
            {
                return -1L;
            }
            byte byte0 = c[0];
            a = -1;
            int i = 0;
label1:
            do
            {
label2:
                {
                    if (i < 8)
                    {
                        if ((b[i] & (byte0 & 0xff)) == 0)
                        {
                            break label2;
                        }
                        a = i + 1;
                    }
                    if (a == -1)
                    {
                        throw new IllegalStateException("No valid varint length mask found");
                    }
                    break label1;
                }
                i++;
            } while (true);
            d = 1;
        }
        bby1.b(c, 1, a - 1);
        if (flag1)
        {
            bby1 = c;
            bby1[0] = (byte)(bby1[0] & ~b[a - 1]);
        }
        long l = 0L;
        for (int j = 0; j < a; j++)
        {
            l = l << 8 | (long)(c[j] & 0xff);
        }

        d = 0;
        return l;
    }

    public final void a()
    {
        d = 0;
        a = 0;
    }

}
