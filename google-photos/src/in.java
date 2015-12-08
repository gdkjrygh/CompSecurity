// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class in extends RuntimeException
{

    public in()
    {
        this(null);
    }

    private in(String s)
    {
        super("The operation has been canceled.");
    }
}
