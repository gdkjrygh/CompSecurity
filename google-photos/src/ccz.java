// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ccz
{

    static final int a[];

    static 
    {
        a = new int[cda.a().length];
        try
        {
            a[cda.c - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[cda.d - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[cda.b - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[cda.a - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
