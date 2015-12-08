// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            dz, ek, cs

final class ed
    implements Runnable
{

    final cs a;
    final dz b;

    ed(dz dz1, cs cs)
    {
        b = dz1;
        a = cs;
        super();
    }

    public final void run()
    {
        b.a.b(a);
    }
}
