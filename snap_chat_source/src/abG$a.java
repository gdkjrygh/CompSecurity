// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class a
    implements Comparable
{

    public final aez a;
    public final int b;

    public final int a(le le)
    {
        if (b < le.b)
        {
            return -1;
        }
        if (b > le.b)
        {
            return 1;
        } else
        {
            return a.a(le.a);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof )
        {
            flag = flag1;
            if (a((a)obj) == 0)
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

    public (aez aez1, int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("handler < 0");
        }
        if (aez1 == null)
        {
            throw new NullPointerException("exceptionType == null");
        } else
        {
            b = i;
            a = aez1;
            return;
        }
    }
}
