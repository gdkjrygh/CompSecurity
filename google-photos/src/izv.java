// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izv extends Exception
{

    public izv(long l, long l1)
    {
        super((new StringBuilder(98)).append("File size ").append(l).append(" bytes is too big for trash. Trash limit ").append(l1).append(" bytes.").toString());
    }
}
