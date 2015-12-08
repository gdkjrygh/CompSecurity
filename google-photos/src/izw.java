// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izw extends Exception
{

    public izw(long l, long l1)
    {
        super((new StringBuilder(123)).append("Not sufficient remaining space for trash. File size ").append(l).append(", ").append(l1).append(" bytes trash space remaining.").toString());
    }
}
