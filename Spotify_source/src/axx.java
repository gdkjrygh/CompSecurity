// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class axx
{

    public static final axx b = new axx(-1, -2);
    public static final axx c = new axx(320, 50);
    public static final axx d = new axx(300, 250);
    public static final axx e = new axx(468, 60);
    public static final axx f = new axx(728, 90);
    public static final axx g = new axx(160, 600);
    public final ber a;

    private axx(int i, int j)
    {
        this(new ber(i, j));
    }

    public axx(ber ber1)
    {
        a = ber1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof axx))
        {
            return false;
        } else
        {
            obj = (axx)obj;
            return a.equals(((axx) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }

}
