// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cpz
{

    public final int a;
    public final int b;

    private cpz(int i, int j)
    {
        a = i;
        b = j;
    }

    public static cpz a(int i)
    {
        return new cpz(-1, i);
    }

    public static cpz a(int i, int j)
    {
        return new cpz(i, j);
    }

    public final boolean a()
    {
        return a != -1;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        return (new StringBuilder(39)).append("LayoutPosition[").append(i).append("/").append(j).append("]").toString();
    }
}
