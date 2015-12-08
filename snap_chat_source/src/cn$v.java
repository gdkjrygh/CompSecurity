// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class c
    implements lang.Object
{

    int a;
    private byte b[];
    private float c[];
    private int d;

    private void a(int i)
    {
        if (c.length < d + i)
        {
            float af[] = new float[c.length << 1];
            System.arraycopy(c, 0, af, 0, c.length);
            c = af;
        }
    }

    public final void a()
    {
        a((byte)8);
    }

    final void a(byte byte0)
    {
        if (a == b.length)
        {
            byte abyte0[] = new byte[b.length << 1];
            System.arraycopy(b, 0, abyte0, 0, b.length);
            b = abyte0;
        }
        byte abyte1[] = b;
        int i = a;
        a = i + 1;
        abyte1[i] = byte0;
    }

    public final void a(float f, float f1)
    {
        a((byte)0);
        a(2);
        float af[] = c;
        int i = d;
        d = i + 1;
        af[i] = f;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f1;
    }

    public final void a(float f, float f1, float f2, float f3)
    {
        a((byte)3);
        a(4);
        float af[] = c;
        int i = d;
        d = i + 1;
        af[i] = f;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f1;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f2;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f3;
    }

    public final void a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        a((byte)2);
        a(6);
        float af[] = c;
        int i = d;
        d = i + 1;
        af[i] = f;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f1;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f2;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f3;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f4;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f5;
    }

    public final void a(float f, float f1, float f2, boolean flag, boolean flag1, float f3, float f4)
    {
        boolean flag2 = false;
        float af[];
        int i;
        if (flag)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (flag1)
        {
            flag2 = true;
        }
        a((byte)(flag2 | (i | 4)));
        a(5);
        af = c;
        i = d;
        d = i + 1;
        af[i] = f;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f1;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f2;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f3;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f4;
    }

    public final void a(d d1)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
label4:
                        {
                            int j = 0;
                            int i = 0;
label5:
                            do
                            {
                                {
                                    if (j >= a)
                                    {
                                        break label0;
                                    }
                                    int k = b[j];
                                    switch (k)
                                    {
                                    case 4: // '\004'
                                    case 5: // '\005'
                                    case 6: // '\006'
                                    case 7: // '\007'
                                    default:
                                        float f;
                                        float f1;
                                        float f2;
                                        float f3;
                                        float af[];
                                        boolean flag;
                                        boolean flag1;
                                        if ((k & 2) != 0)
                                        {
                                            flag = true;
                                        } else
                                        {
                                            flag = false;
                                        }
                                        if ((k & 1) != 0)
                                        {
                                            flag1 = true;
                                        } else
                                        {
                                            flag1 = false;
                                        }
                                        af = c;
                                        k = i + 1;
                                        f = af[i];
                                        af = c;
                                        i = k + 1;
                                        f1 = af[k];
                                        af = c;
                                        k = i + 1;
                                        f2 = af[i];
                                        af = c;
                                        i = k + 1;
                                        d1.a(f, f1, f2, flag, flag1, af[k], c[i]);
                                        i++;
                                        break;

                                    case 0: // '\0'
                                        break label5;

                                    case 1: // '\001'
                                        break label4;

                                    case 2: // '\002'
                                        break label3;

                                    case 3: // '\003'
                                        break label2;

                                    case 8: // '\b'
                                        break label1;
                                    }
                                }
                                j++;
                            } while (true);
                            af = c;
                            k = i + 1;
                            f = af[i];
                            af = c;
                            i = k + 1;
                            d1.a(f, af[k]);
                            break MISSING_BLOCK_LABEL_195;
                        }
                        af = c;
                        k = i + 1;
                        f = af[i];
                        af = c;
                        i = k + 1;
                        d1.b(f, af[k]);
                        break MISSING_BLOCK_LABEL_195;
                    }
                    af = c;
                    k = i + 1;
                    f = af[i];
                    af = c;
                    i = k + 1;
                    f1 = af[k];
                    af = c;
                    k = i + 1;
                    f2 = af[i];
                    af = c;
                    i = k + 1;
                    f3 = af[k];
                    af = c;
                    k = i + 1;
                    d1.a(f, f1, f2, f3, af[i], c[k]);
                    i = k + 1;
                    break MISSING_BLOCK_LABEL_195;
                }
                af = c;
                k = i + 1;
                f = af[i];
                af = c;
                i = k + 1;
                f1 = af[k];
                af = c;
                k = i + 1;
                f2 = af[i];
                af = c;
                i = k + 1;
                d1.a(f, f1, f2, af[k]);
                break MISSING_BLOCK_LABEL_195;
            }
            d1.a();
            break MISSING_BLOCK_LABEL_195;
        }
    }

    public final void b(float f, float f1)
    {
        a((byte)1);
        a(2);
        float af[] = c;
        int i = d;
        d = i + 1;
        af[i] = f;
        af = c;
        i = d;
        d = i + 1;
        af[i] = f1;
    }

    public >()
    {
        b = null;
        a = 0;
        c = null;
        d = 0;
        b = new byte[8];
        c = new float[16];
    }
}
