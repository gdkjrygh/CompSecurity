// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

static final class d
    implements aoq
{

    boolean a;
    private final aoo b;
    private final String c;
    private final String d;
    private final Thread e = Thread.currentThread();

    public final void a(int i, Exception exception)
    {
        anR.a(e, Thread.currentThread(), "Must be called on the same thread");
        a = true;
        if (i == 10001)
        {
            b.a(exception);
            return;
        } else
        {
            b.a(i);
            return;
        }
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        anR.a(e, Thread.currentThread(), "Must be called on the same thread");
        a = true;
        b.a(new aon(c, ((List) (obj)), d));
    }

    public (aoo aoo1, String s, String s1)
    {
        b = aoo1;
        c = s;
        d = s1;
    }
}
