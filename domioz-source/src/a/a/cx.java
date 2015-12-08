// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            cr, dd, bn, bj

final class cx
    implements Runnable
{

    final bn a;
    final bj b;
    final cr c;

    cx(cr cr1, bn bn, bj bj)
    {
        c = cr1;
        a = bn;
        b = bj;
        super();
    }

    public final void run()
    {
        cr.a(c).a(a, b);
    }
}
