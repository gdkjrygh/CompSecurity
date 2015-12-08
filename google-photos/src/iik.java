// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iik
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[esm.values().length];
        try
        {
            b[esm.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[esm.d.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[esm.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[exb.a().length];
        try
        {
            a[exb.c - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[exb.a - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[exb.b - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
