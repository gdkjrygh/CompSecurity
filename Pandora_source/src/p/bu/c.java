// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;


public class c
{

    private final long a;
    private final long b;
    private long c;

    public c(long l)
    {
        a = l;
        b = 0L;
    }

    public c(long l, long l1)
    {
        a = l;
        b = l1;
    }

    static c a(String s)
    {
        int i;
label0:
        {
            if (s.length() > 6)
            {
                s = s.substring(6);
                i = s.indexOf('-');
                if (i != -1)
                {
                    break label0;
                }
            }
            return null;
        }
        if (i == 0)
        {
            return new c(Long.parseLong(s));
        }
        long l;
        long l1;
        l1 = Long.parseLong(s.substring(0, i));
        if (i >= s.length() - 1)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        l = Long.parseLong(s.substring(i + 1, s.length()));
_L1:
        s = new c(l1, l);
        return s;
        l = 0L;
          goto _L1
        s;
        return null;
    }

    public long a()
    {
        if (a < 0L)
        {
            return c + a;
        } else
        {
            return a;
        }
    }

    public void a(long l)
    {
        if (l <= a || l <= b)
        {
            throw new IllegalArgumentException("Invalid length");
        } else
        {
            c = l;
            return;
        }
    }

    public String b()
    {
        if (a < 0L)
        {
            if (c <= 0L)
            {
                throw new IllegalArgumentException("No content length set for suffix-byte-range-spec Range");
            } else
            {
                return String.format("bytes %d-%d/%d", new Object[] {
                    Long.valueOf(c + a), Long.valueOf(c - 1L), Long.valueOf(c)
                });
            }
        }
        if (b <= 0L)
        {
            if (c <= 0L)
            {
                throw new IllegalArgumentException("No content length set for byte-range-spec Range");
            } else
            {
                return String.format("bytes %d-%d/%d", new Object[] {
                    Long.valueOf(a), Long.valueOf(c - 1L), Long.valueOf(c)
                });
            }
        }
        if (c <= 0L)
        {
            return String.format("bytes %d-%d/*", new Object[] {
                Long.valueOf(a), Long.valueOf(b)
            });
        } else
        {
            return String.format("bytes %d-%d/%d", new Object[] {
                Long.valueOf(a), Long.valueOf(b), Long.valueOf(c)
            });
        }
    }
}
