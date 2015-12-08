// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            dz, ek, cs, co

final class ef
    implements Runnable
{

    final cs a;
    final co b;
    final dz c;

    ef(dz dz1, cs cs, co co)
    {
        c = dz1;
        a = cs;
        b = co;
        super();
    }

    public final void run()
    {
        c.a.a(a, b);
    }
}
