// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.google.common.a.hq;
import com.google.common.a.ik;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.facebook.http.protocol:
//            j, y, l

public abstract class a
    implements j
{

    private List a;
    private List b;
    private Map c;
    private Map d;

    public a()
    {
        a = hq.a();
        b = hq.a();
        c = ik.a();
        d = ik.a();
    }

    public Object a(int i)
    {
        return b.get(i);
    }

    public Object a(String s)
    {
        return c.get(s);
    }

    protected List a()
    {
        return a;
    }

    public void a(y y)
    {
        a.add(y);
    }

    public abstract void a(String s, l l);

    protected void a(String s, Exception exception)
    {
        if (s != null)
        {
            d.put(s, exception);
        }
    }

    protected void a(String s, Object obj)
    {
        b.add(obj);
        if (s != null)
        {
            c.put(s, obj);
        }
    }

    public void b(String s)
    {
        a(s, ((l) (null)));
    }
}
