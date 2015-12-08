// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.at;


// Referenced classes of package p.at:
//            c, b

class e
    implements Runnable
{

    final b a;
    final c b;

    e(c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }

    public void run()
    {
        c.a(b, a);
    }
}
