// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.NoSuchElementException;

public class ddx
{

    public Object a[];
    private int b;

    public ddx(Object aobj[])
    {
        a = (Object[])b.a(((Object) (aobj)), "objects", null);
        b = 0;
    }

    public final Object a()
    {
        if (b == a.length)
        {
            b();
        }
        Object obj = a[b];
        a[b] = null;
        b = b + 1;
        return obj;
    }

    public final void a(Object obj)
    {
        if (b <= 0)
        {
            throw new IllegalStateException("Pool has had more releases than acquires");
        } else
        {
            Object aobj[] = a;
            int i = b - 1;
            b = i;
            aobj[i] = obj;
            return;
        }
    }

    protected void b()
    {
        throw new NoSuchElementException("Pool out of objects");
    }
}
