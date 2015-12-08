// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;


// Referenced classes of package b.a.a.a.a.e:
//            b, c

static final class FieldError
{

    static final int a[];

    static 
    {
        a = new int[c.a().length];
        try
        {
            a[c.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[c.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[c.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[c.d - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
