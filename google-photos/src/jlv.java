// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jlv extends jlp
{

    private final jnl b = new jnl(4);
    private final jni c = new jni();
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public jlv(jkq jkq1)
    {
        super(jkq1);
        d = 0;
        b.a[0] = -1;
    }

    public final void a()
    {
        d = 0;
        e = 0;
        g = false;
    }

    public final void a(jnl jnl1, long l, boolean flag)
    {
        if (flag)
        {
            j = l;
        }
label0:
        do
        {
            if (jnl1.b() <= 0)
            {
                break;
            }
            switch (d)
            {
            default:
                break;

            case 0: // '\0'
                byte abyte0[] = jnl1.a;
                int k = jnl1.b;
                int k1 = jnl1.c;
                do
                {
                    if (k >= k1)
                    {
                        break;
                    }
                    boolean flag1;
                    if ((abyte0[k] & 0xff) == 255)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (g && (abyte0[k] & 0xe0) == 224)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    g = flag;
                    if (flag1)
                    {
                        jnl1.b(k + 1);
                        g = false;
                        b.a[1] = abyte0[k];
                        e = 2;
                        d = 1;
                        continue label0;
                    }
                    k++;
                } while (true);
                jnl1.b(k1);
                break;

            case 1: // '\001'
                int i1 = Math.min(jnl1.b(), 4 - e);
                jnl1.a(b.a, e, i1);
                e = i1 + e;
                if (e >= 4)
                {
                    b.b(0);
                    if (!jni.a(b.h(), c))
                    {
                        e = 0;
                        d = 1;
                    } else
                    {
                        i = c.c;
                        if (!f)
                        {
                            h = (0xf4240L * (long)c.g) / (long)c.d;
                            jjh jjh1 = jjh.a(-1, c.b, -1, 4096, -1L, c.e, c.d, null, null);
                            a.a(jjh1);
                            f = true;
                        }
                        b.b(0);
                        a.a(b, 4);
                        d = 2;
                    }
                }
                break;

            case 2: // '\002'
                int j1 = Math.min(jnl1.b(), i - e);
                a.a(jnl1, j1);
                e = j1 + e;
                if (e >= i)
                {
                    a.a(j, 1, i, 0, null);
                    j = j + h;
                    e = 0;
                    d = 0;
                }
                break;
            }
        } while (true);
    }

    public final void b()
    {
    }
}
