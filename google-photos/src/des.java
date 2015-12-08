// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class des extends RuntimeException
{

    private int a;
    private int b;

    public des(int i, int j)
    {
        a = i;
        b = j;
    }

    public final String toString()
    {
        return String.format("Invalid version upgrade step: %s -> %s", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
