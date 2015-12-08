// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jb, ks

final class jc
    implements Runnable
{

    final int a;
    final int b;
    final jb c;

    jc(jb jb1, int i, int j)
    {
        c = jb1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        Object obj = c.f;
        obj = c.b;
        c.c.d();
        int i = a;
        i = b;
    }
}
