// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class csx extends Exception
{

    public csx(int i)
    {
        super((new StringBuilder(43)).append("Encryption method ").append(i).append(" not supported").toString());
    }
}
