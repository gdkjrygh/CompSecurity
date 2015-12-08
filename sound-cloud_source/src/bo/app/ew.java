// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            ev

final class ew extends ev
{

    final String b;
    final ev c;

    ew(ev ev1, ev ev2, String s)
    {
        c = ev1;
        b = s;
        super(ev2, (byte)0);
    }

    final CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return b;
        } else
        {
            return c.a(obj);
        }
    }

    public final ev b()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    public final ev b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
