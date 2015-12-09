// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            x

final class z
    implements Runnable
{

    final x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        x x1 = a;
        FragmentActivity fragmentactivity = a.o;
        x1.a(null, -1, 0);
    }
}
