// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jp

final class kr
{

    static final int a[];

    static 
    {
        a = new int[jp.a().length];
        try
        {
            a[jp.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[jp.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
