// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hnf
{

    static final int a[];

    static 
    {
        a = new int[hnp.a().length];
        try
        {
            a[hnp.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[hnp.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[hnp.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[hnp.d - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
