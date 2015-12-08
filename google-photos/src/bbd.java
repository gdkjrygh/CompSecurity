// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bbd
{

    public int a;
    public int b;

    public bbd(int i, int j)
    {
        a = i;
        b = j;
    }

    public final String toString()
    {
        String s = String.valueOf("Entry{count=");
        int i = a;
        int j = b;
        return (new StringBuilder(String.valueOf(s).length() + 32)).append(s).append(i).append(", offset=").append(j).append("}").toString();
    }
}
