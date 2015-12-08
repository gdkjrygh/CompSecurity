// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class btt
{

    public btt()
    {
    }

    public abstract long a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public String toString()
    {
        return (new StringBuilder()).append(a()).append("\t").append(b()).append("\t").append(c()).append(d()).toString();
    }
}
