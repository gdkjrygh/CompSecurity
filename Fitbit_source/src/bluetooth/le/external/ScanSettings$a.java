// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;


// Referenced classes of package bluetooth.le.external:
//            ScanSettings

public static final class c
{

    private int a;
    private long b;
    private long c;

    public c a(int i)
    {
        if (i < 0 || i > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid scan mode ").append(i).toString());
        } else
        {
            a = i;
            return this;
        }
    }

    public a a(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("reportDelay must be > 0");
        } else
        {
            b = l;
            return this;
        }
    }

    public ScanSettings a()
    {
        return new ScanSettings(a, b, c, null);
    }

    public c b(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException("timoutMillis must be > 0");
        } else
        {
            c = l;
            return this;
        }
    }

    public ()
    {
        a = 0;
        b = 0L;
        c = 0L;
    }
}
