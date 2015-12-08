// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            di, az, dw, bk, 
//            br, bx, cv, df, 
//            bb

final class nit> extends di
{

    final Throwable a;
    final long b;
    final az c;

    public final void a()
    {
        if (!c.f.b())
        {
            bk bk1 = new bk(a, b);
            bk1.a("current_session", c.k);
            bk1.d = "he";
            if (c.h.a(bk1))
            {
                az.a.a(new bx(bk1.b, bk1.c));
                if (c.q.a())
                {
                    df df1 = new df(c.c);
                    df1.a(c.h, new <init>(), c.v.b(), "/android_v2/handle_exceptions", null, az.a, new <init>());
                    df1.a(c.r, c.s);
                    c.q.b();
                    return;
                }
            }
        }
    }

    (az az1, Throwable throwable, long l)
    {
        c = az1;
        a = throwable;
        b = l;
        super();
    }
}
