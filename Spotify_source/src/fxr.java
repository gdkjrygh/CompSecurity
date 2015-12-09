// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class fxr
{

    public final String a;
    public final String b;

    fxr(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public static fxr a(String s, String s1)
    {
        return new fxs(s, s1);
    }

    public static fxr a(String s, String s1, Object obj)
    {
        return new fxq(s, s1, obj);
    }

    public abstract boolean a();

    public abstract Object b();

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fxr)obj;
            if (!b.equals(((fxr) (obj)).b))
            {
                return false;
            }
            if (!a.equals(((fxr) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a.hashCode() * 31 + b.hashCode();
    }
}
