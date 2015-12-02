// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, FragmentActivity

class b
    implements Runnable
{

    final String a;
    final int b;
    final FragmentManagerImpl c;

    public void run()
    {
        c.a(c.o.a, a, -1, b);
    }

    (FragmentManagerImpl fragmentmanagerimpl, String s, int i)
    {
        c = fragmentmanagerimpl;
        a = s;
        b = i;
        super();
    }
}
