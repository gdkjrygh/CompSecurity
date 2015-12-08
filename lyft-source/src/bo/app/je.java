// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            jb, ks

final class je
    implements Runnable
{

    final jb a;

    je(jb jb1)
    {
        a = jb1;
        super();
    }

    public final void run()
    {
        Object obj = a.e;
        obj = a.b;
        a.c.d();
    }
}
