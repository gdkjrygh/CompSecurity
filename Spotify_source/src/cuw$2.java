// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends cug
{

    private Object a[];
    private int b;

    protected final Object a(int i)
    {
        return a[b + i];
    }

    (int i, int j, Object aobj[], int k)
    {
        a = aobj;
        b = k;
        super(i, j);
    }
}
