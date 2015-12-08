// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;


// Referenced classes of package b.a.a.a.a.c:
//            a

static final class FieldError
{

    static final int a[];

    static 
    {
        a = new int[a().length];
        try
        {
            a[b - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[c - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
