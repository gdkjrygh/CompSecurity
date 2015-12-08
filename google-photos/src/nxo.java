// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nxo extends Exception
{

    public nxo(nxd nxd, int i, int j)
    {
        nxd = String.valueOf(nxd);
        String s = String.valueOf(nxb.c(i));
        super((new StringBuilder(String.valueOf(nxd).length() + 57 + String.valueOf(s).length())).append("Error obtaining resource ").append(nxd).append(" status: ").append(s).append(" httpError: ").append(j).toString());
    }
}
