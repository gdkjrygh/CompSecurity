// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, FragmentActivity

class b
    implements Runnable
{

    final int a;
    final int b;
    final FragmentManagerImpl c;

    public void run()
    {
        c.a(c.o.a, null, a, b);
    }

    (FragmentManagerImpl fragmentmanagerimpl, int i, int j)
    {
        c = fragmentmanagerimpl;
        a = i;
        b = j;
        super();
    }
}
