// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nmf extends nmc
{

    private static final long serialVersionUID = 0x7db2efa319c55ac7L;

    public nmf(String s, boolean flag)
    {
        super((new StringBuilder(String.valueOf(s).length() + 40)).append("Invalid content-type: ").append(s).append(", permanent: ").append(flag).toString());
    }
}
