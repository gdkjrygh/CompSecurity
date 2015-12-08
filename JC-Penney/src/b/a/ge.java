// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            op

public final class ge
    implements Comparable
{

    public final op a;
    public final int b;

    public ge(op op1, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("handler < 0");
        }
        if (op1 == null)
        {
            throw new NullPointerException("exceptionType == null");
        } else
        {
            b = i;
            a = op1;
            return;
        }
    }

    public final int a(ge ge1)
    {
        if (b < ge1.b)
        {
            return -1;
        }
        if (b > ge1.b)
        {
            return 1;
        } else
        {
            return a.a(ge1.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((ge)obj);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ge)
        {
            flag = flag1;
            if (a((ge)obj) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b * 31 + a.hashCode();
    }
}
