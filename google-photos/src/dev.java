// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dev extends RuntimeException
{

    private int a;

    public dev(int i)
    {
        a = i;
    }

    public final String toString()
    {
        return String.format("Version upgrade step out of order: %s", new Object[] {
            Integer.valueOf(a)
        });
    }
}
