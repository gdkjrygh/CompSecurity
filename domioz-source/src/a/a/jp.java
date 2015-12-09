// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            im

final class jp
{

    static final int a[];

    static 
    {
        a = new int[im.a().length];
        try
        {
            a[im.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[im.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
