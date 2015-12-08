// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mzy
{

    public int a[];
    public int b;

    public mzy()
    {
        a = new int[8];
        b = 0;
    }

    public final void a(int i)
    {
        if (a.length == b)
        {
            int ai[] = new int[b + b];
            System.arraycopy(a, 0, ai, 0, b);
            a = ai;
        }
        int ai1[] = a;
        int j = b;
        b = j + 1;
        ai1[j] = i;
    }
}
