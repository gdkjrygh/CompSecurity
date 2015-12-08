// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            dt, ee, cm, ci

final class dz
    implements Runnable
{

    final cm a;
    final ci b;
    final dt c;

    dz(dt dt1, cm cm, ci ci)
    {
        c = dt1;
        a = cm;
        b = ci;
        super();
    }

    public final void run()
    {
        c.a.a(a, b);
    }
}
