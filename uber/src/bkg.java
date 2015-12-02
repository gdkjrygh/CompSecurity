// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public final class bkg extends bkd
{

    private final blg a = new blg();

    public bkg()
    {
    }

    private static bkd a(Object obj)
    {
        if (obj == null)
        {
            return bkf.a;
        } else
        {
            return new bkj(obj);
        }
    }

    public final bkd a(String s)
    {
        return (bkd)a.get(s);
    }

    public final void a(String s, bkd bkd1)
    {
        Object obj = bkd1;
        if (bkd1 == null)
        {
            obj = bkf.a;
        }
        a.put(s, obj);
    }

    public final void a(String s, Boolean boolean1)
    {
        a(s, a(boolean1));
    }

    public final void a(String s, Number number)
    {
        a(s, a(number));
    }

    public final void a(String s, String s1)
    {
        a(s, a(s1));
    }

    public final bkg b(String s)
    {
        return (bkg)a.get(s);
    }

    public final boolean equals(Object obj)
    {
        return obj == this || (obj instanceof bkg) && ((bkg)obj).a.equals(a);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final Set o()
    {
        return a.entrySet();
    }
}
