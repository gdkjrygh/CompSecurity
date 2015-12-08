// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class krs extends krw
{

    public krt a;

    public krs()
    {
    }

    private krs f()
    {
        krs krs1 = (krs)super.c();
        krv.a(this, krs1);
        return krs1;
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (a != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= a.b)
                {
                    break;
                }
                i += a.a[j].a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(krr krr)
    {
        if (a != null)
        {
            int i = 0;
            while (i < a.b) 
            {
                a.a[i].a(krr);
                i++;
            }
        }
    }

    protected final boolean a(krs krs1)
    {
        if (a == null || a.a())
        {
            return krs1.a == null || krs1.a.a();
        } else
        {
            return a.equals(krs1.a);
        }
    }

    protected final int b()
    {
        if (a == null || a.a())
        {
            return 0;
        } else
        {
            return a.hashCode();
        }
    }

    public final krw c()
    {
        return f();
    }

    public Object clone()
    {
        return f();
    }
}
