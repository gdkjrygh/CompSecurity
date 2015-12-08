// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.g;


// Referenced classes of package rx.g:
//            e

static final class a
{
    static final class a
    {

        final Object a;
        volatile a b;

        a(Object obj)
        {
            a = obj;
        }
    }


    final a a = new a(null);
    a b;
    int c;

    public final Object a()
    {
        if (a.b == null)
        {
            throw new IllegalStateException("Empty!");
        }
        a a1 = a.b;
        a.b = a1.b;
        if (a.b == null)
        {
            b = a;
        }
        c = c - 1;
        return a1.a;
    }

    public final void a(Object obj)
    {
        a a1 = b;
        obj = new a(obj);
        a1.b = ((a) (obj));
        b = ((a) (obj));
        c = c + 1;
    }

    .Object()
    {
        b = a;
    }
}
