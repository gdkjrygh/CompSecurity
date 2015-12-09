// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bcp
{

    public int a;
    public int b;
    public int c[];
    public int d[];
    public long e[];
    public boolean f[];
    public boolean g;
    public boolean h[];
    public int i;
    public bec j;
    public boolean k;

    bcp()
    {
    }

    public final void a(int l)
    {
        if (j == null || j.c < l)
        {
            j = new bec(l);
        }
        i = l;
        g = true;
        k = true;
    }
}
