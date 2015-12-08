// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gvm
{

    final int a;
    final int b;

    public gvm(int i, int j)
    {
        a = i;
        b = j;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        return (new StringBuilder(23)).append(i).append("x").append(j).toString();
    }
}
