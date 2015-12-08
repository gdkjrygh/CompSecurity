// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


// Referenced classes of package a.a:
//            cr, dd, bn

final class cv
    implements Runnable
{

    final bn a;
    final cr b;

    cv(cr cr1, bn bn)
    {
        b = cr1;
        a = bn;
        super();
    }

    public final void run()
    {
        cr.a(b).b(a);
    }
}
