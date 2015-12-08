// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.b;


// Referenced classes of package kik.android.b:
//            a

static final class eldError
{

    static final int a[];

    static 
    {
        a = new int[com.kik.n.a.c.values().length];
        try
        {
            a[com.kik.n.a.c.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.kik.n.a.c.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
