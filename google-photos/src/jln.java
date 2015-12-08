// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jln
    implements jkd
{

    private static final int a = jno.c("ID3");
    private final long b;
    private final jnl c;
    private jlo d;
    private boolean e;

    public jln()
    {
        this(0L);
    }

    private jln(long l)
    {
        b = 0L;
        c = new jnl(200);
        e = true;
    }

    public final int a(jke jke1, jkk jkk)
    {
        int i = jke1.a(c.a, 0, 200);
        if (i == -1)
        {
            return -1;
        } else
        {
            c.b(0);
            c.a(i);
            d.a(c, b, e);
            e = false;
            return 0;
        }
    }

    public final void a(jkf jkf1)
    {
        d = new jlo(jkf1.c(0));
        jkf1.g();
        jkf1.a(jko.a);
    }

    public final boolean a(jke jke1)
    {
        jnl jnl1 = new jnl(10);
        jnk jnk1 = new jnk(jnl1.a);
        int i = 0;
        do
        {
            jke1.c(jnl1.a, 0, 10);
            jnl1.b(0);
            if (jnl1.f() != a)
            {
                break;
            }
            int j = (jnl1.a[6] & 0x7f) << 21 | (jnl1.a[7] & 0x7f) << 14 | (jnl1.a[8] & 0x7f) << 7 | jnl1.a[9] & 0x7f;
            i += j + 10;
            jke1.b(j);
        } while (true);
        jke1.a();
        jke1.b(i);
        int l = 0;
        int k = 0;
        int i1 = i;
        do
        {
            jke1.c(jnl1.a, 0, 2);
            jnl1.b(0);
            if ((jnl1.e() & 0xfff6) != 65520)
            {
                jke1.a();
                i1++;
                if (i1 - i >= 8192)
                {
                    return false;
                }
                jke1.b(i1);
                k = 0;
                l = 0;
            } else
            {
                l++;
                if (l >= 4 && k > 188)
                {
                    return true;
                }
                jke1.c(jnl1.a, 0, 4);
                jnk1.a(14);
                int j1 = jnk1.c(13);
                jke1.b(j1 - 6);
                k += j1;
            }
        } while (true);
    }

    public final void b()
    {
        e = true;
        d.a();
    }

}
