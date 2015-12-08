// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hha extends adf
{

    private final int c;
    private hgz d;

    public hha(hgz hgz1, int i)
    {
        d = hgz1;
        super();
        c = i;
    }

    public final int a(int i)
    {
        int j = hgz.a(d).c(i).a(c);
        if (j == 0x80000000)
        {
            String s = String.valueOf(hgz.a(d).c(i));
            throw new IllegalStateException((new StringBuilder(String.valueOf(s).length() + 63)).append("Adapter item failed to supply span size: ").append(s).append(" position: ").append(i).toString());
        } else
        {
            return j;
        }
    }

    public final int a(int i, int j)
    {
        j = hgz.a(d).c(i).b(j);
        if (j == 0x80000000)
        {
            String s = String.valueOf(hgz.a(d).c(i));
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 64)).append("Adapter item failed to supply span index: ").append(s).append(" position: ").append(i).toString());
        } else
        {
            return j;
        }
    }
}
