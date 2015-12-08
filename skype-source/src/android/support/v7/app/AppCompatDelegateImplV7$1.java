// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class a
    implements Runnable
{

    final AppCompatDelegateImplV7 a;

    public final void run()
    {
        if ((AppCompatDelegateImplV7.a(a) & 1) != 0)
        {
            AppCompatDelegateImplV7.a(a, 0);
        }
        if ((AppCompatDelegateImplV7.a(a) & 0x1000) != 0)
        {
            AppCompatDelegateImplV7.a(a, 108);
        }
        AppCompatDelegateImplV7.b(a);
        AppCompatDelegateImplV7.c(a);
    }

    (AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }
}
