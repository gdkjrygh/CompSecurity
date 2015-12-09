// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;


// Referenced classes of package p.aq:
//            d, a

class f
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[d.values().length];
        try
        {
            b[d.d.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[d.c.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[d.b.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[d.a.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[p.aq.a.values().length];
        try
        {
            a[a.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[a.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[a.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
