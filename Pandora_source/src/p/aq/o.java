// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;


// Referenced classes of package p.aq:
//            b

class o
    implements Runnable
{

    final com.comscore.utils.o a;
    final b b;

    o(b b1, com.comscore.utils.o o1)
    {
        b = b1;
        a = o1;
        super();
    }

    public void run()
    {
        p.aq.b.a(b, a);
    }
}
