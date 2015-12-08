// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jnx
{

    public final String a;
    public final boolean b;

    public jnx(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public final String toString()
    {
        return (new StringBuilder("{")).append(a).append("}").append(b).toString();
    }
}
