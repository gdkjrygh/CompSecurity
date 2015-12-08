// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            am, ai

class ap
    implements Runnable
{

    final String a;
    final int b;
    final am c;

    ap(am am1, String s, int i)
    {
        c = am1;
        a = s;
        b = i;
        super();
    }

    public void run()
    {
        c.a(c.o.h(), a, -1, b);
    }
}
