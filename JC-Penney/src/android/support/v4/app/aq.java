// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            am, ai

class aq
    implements Runnable
{

    final int a;
    final int b;
    final am c;

    aq(am am1, int i, int j)
    {
        c = am1;
        a = i;
        b = j;
        super();
    }

    public void run()
    {
        c.a(c.o.h(), null, a, b);
    }
}
