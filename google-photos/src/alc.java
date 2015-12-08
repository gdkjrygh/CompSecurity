// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class alc
{

    private final int a;
    private final long b;

    public alc(int i, int j, long l)
    {
        a = j;
        b = l;
    }

    public String toString()
    {
        int i = Math.round((float)a / ((float)b / 1000F));
        return (new StringBuilder(15)).append(i).append(" FPS").toString();
    }
}
