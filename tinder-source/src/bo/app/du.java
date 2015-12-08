// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            dt, ee, cm

final class du
    implements Runnable
{

    final cm a;
    final dt b;

    du(dt dt1, cm cm)
    {
        b = dt1;
        a = cm;
        super();
    }

    public final void run()
    {
        b.a.a(a);
    }
}
