// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class owb
{

    public static final int a[];
    public static final int b[];
    public static final int c[];

    static 
    {
        c = new int[owd.a().length];
        try
        {
            c[owd.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[owd.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        b = new int[oru.values().length];
        try
        {
            b[oru.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[oru.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[owg.values().length];
        try
        {
            a[owg.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[owg.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[owg.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
