// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class x
    implements Runnable
{

    final AppCompatDelegateImplV7 a;

    x(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void run()
    {
        if ((a.w & 1) != 0)
        {
            AppCompatDelegateImplV7.a(a, 0);
        }
        if ((a.w & 0x1000) != 0)
        {
            AppCompatDelegateImplV7.a(a, 108);
        }
        a.v = false;
        a.w = 0;
    }
}
