// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class muk extends njv
{

    int a;
    private int l;

    public muk(mui mui)
    {
    }

    protected final String a()
    {
        String s = super.a();
        switch (a)
        {
        default:
            return s;

        case 0: // '\0'
            return String.valueOf(s).concat("-normal");

        case 1: // '\001'
            return String.valueOf(s).concat("-rounded");

        case 2: // '\002'
            return String.valueOf(s).concat("-roundedcorners");
        }
    }

    public final void a(int i, njr njr, int j, int k, int i1)
    {
        super.a(i, njr, 0, j, j, k, null, null);
        a = i1;
        l = 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof muk))
        {
            return false;
        }
        muk muk1 = (muk)obj;
        if (a != muk1.a)
        {
            return false;
        } else
        {
            return super.equals(obj);
        }
    }

    public final int hashCode()
    {
        if (l == 0)
        {
            l = a + super.hashCode() * 31;
        }
        return l;
    }
}
