// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lrw
{

    static final int a[];

    static 
    {
        a = new int[lrx.a().length];
        try
        {
            a[lrx.b - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[lrx.c - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[lrx.a - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
