// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            eu

final class ev extends eu
{

    final String b;
    final eu c;

    ev(eu eu1, eu eu2, String s)
    {
        c = eu1;
        b = s;
        super(eu2, (byte)0);
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

    public final eu b()
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    public final eu b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
