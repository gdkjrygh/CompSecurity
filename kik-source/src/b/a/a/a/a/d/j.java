// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;


// Referenced classes of package b.a.a.a.a.d:
//            f, n

final class j
    implements Runnable
{

    final f a;

    j(f f1)
    {
        a = f1;
        super();
    }

    public final void run()
    {
        try
        {
            n n1 = a.c;
            a.c = a.a();
            n1.c();
            return;
        }
        catch (Exception exception)
        {
            b.a.a.a.a.b.j.a(a.a, "Failed to disable events.");
        }
    }
}
