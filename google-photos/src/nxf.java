// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nxf extends Exception
{

    public nxf(nxd nxd)
    {
        nxd = String.valueOf(nxd);
        super((new StringBuilder(String.valueOf(nxd).length() + 27)).append("Resource loading canceled: ").append(nxd).toString());
    }
}
