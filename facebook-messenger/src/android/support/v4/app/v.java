// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            s, p

class v
    implements Runnable
{

    final String a;
    final int b;
    final s c;

    v(s s1, String s2, int i)
    {
        c = s1;
        a = s2;
        b = i;
        super();
    }

    public void run()
    {
        c.a(c.o.b(), a, -1, b);
    }
}
