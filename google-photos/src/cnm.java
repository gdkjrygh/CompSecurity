// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;

public class cnm
    implements cnn
{

    private final cnq a[];
    private final long b[];
    private final cqo c[];
    private final long d;

    public cnm(cnq acnq[], long al[], long l, cqo acqo[])
    {
        boolean flag2 = true;
        super();
        b.a(acnq, "clips", null);
        b.a(al, "startTimesUs", null);
        b.a(acnq.length, "clips.length", al.length, null);
        int i = 1;
        while (i < acnq.length) 
        {
            boolean flag;
            if (al[i - 1] + acnq[i - 1].f.a() <= al[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "Next clip must not start sooner than the previous one finishes");
            i++;
        }
        b.a(acqo, "volumePoints", null);
        if (acnq.length > 0)
        {
            boolean flag1;
            if (acqo.length >= 2)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            b.a(flag1, "volumePoints must have at least two values");
            b.a(acqo[0].a, "volumePoints[0].timestampUs", 0L, "First volume point must specify the volume for the timestamp 0");
            b.a(acqo[acqo.length - 1].a, "volumePoints[volumePoints.length - 1].timestampUs", l, "Last volume point must specify the volume for the last possible timestamp (equal to the duration of the sequence)");
        }
        a = acnq;
        b = al;
        c = acqo;
        d = l;
    }

    public static cnm a(List list, long l)
    {
        b.a(list, "clips", null);
        cnq acnq[] = new cnq[list.size()];
        long al[] = new long[list.size()];
        long l1 = 0L;
        int i = 0;
        while (i < list.size()) 
        {
            cnq cnq1 = (cnq)list.get(i);
            boolean flag;
            if (cnq1.d == cnt.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "must be an audio clip");
            acnq[i] = cnq1;
            al[i] = l1;
            l1 += cnq1.f.a();
            i++;
        }
        return new cnm(acnq, al, l, new cqo[] {
            new cqo(0L, 1.0F), new cqo(l, 1.0F)
        });
    }

    public static cnm b(long l)
    {
        return new cnm(new cnq[0], new long[0], l, new cqo[0]);
    }

    public final float a(long l)
    {
        if (a.length == 0)
        {
            return 0.0F;
        }
        int i;
        for (i = 0; i < c.length - 2 && c[i + 1].a < l; i++) { }
        cqo cqo1 = c[i];
        cqo cqo2 = c[i + 1];
        long l1 = cqo2.a - cqo1.a;
        float f = (float)(cqo2.a - l) / (float)l1;
        float f1 = (float)(l - cqo1.a) / (float)l1;
        float f2 = cqo1.b;
        return cqo2.b * f1 + f2 * f;
    }

    public final int a()
    {
        return a.length;
    }

    public final cnq a(int i)
    {
        return a[i];
    }

    public final long b()
    {
        return d;
    }

    public final long b(int i)
    {
        return b[i];
    }

    public final long c(int i)
    {
        int j = 0;
        b.a(i, "index", 0, a.length - 1, null);
        long l = 0L;
        for (; j < i; j++)
        {
            l += a[j].f.a();
        }

        return l;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!(obj instanceof cnn))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (cnn)obj;
        flag = flag1;
        if (a.length != ((cnn) (obj)).a())
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (d != ((cnn) (obj)).b())
        {
            continue; /* Loop/switch isn't completed */
        }
        for (int i = 0; i < a.length; i++)
        {
            flag = flag1;
            if (!b.e(a[i], ((cnn) (obj)).a(i)))
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= a.length)
                {
                    break label1;
                }
                flag = flag1;
                if (b[j] != ((cnn) (obj)).b(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public String toString()
    {
        return b.a(cnm, new Object[] {
            Arrays.toString(a), Arrays.toString(b), Long.valueOf(d)
        });
    }
}
