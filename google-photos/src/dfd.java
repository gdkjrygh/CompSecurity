// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class dfd
    implements dfk
{

    private dfn a;

    dfd(dfc dfc, dfn dfn1)
    {
        a = dfn1;
        super();
    }

    public final ExecutorService a(int i, Class class1, String s)
    {
        dfn dfn1 = a;
        dff dff1 = (dff)dfn1.a.get(class1);
        s = dff1;
        if (dff1 == null)
        {
            s = new dff(dfn1.b, class1, null);
            dfn1.a.put(class1, s);
        }
        return Executors.newFixedThreadPool(i, s);
    }

    public final ExecutorService a(Class class1, String s)
    {
        dfn dfn1 = a;
        dff dff1 = (dff)dfn1.a.get(class1);
        s = dff1;
        if (dff1 == null)
        {
            s = new dff(dfn1.b, class1, null);
            dfn1.a.put(class1, s);
        }
        return Executors.newSingleThreadExecutor(s);
    }

    public final ExecutorService b(Class class1, String s)
    {
        dfn dfn1 = a;
        dff dff1 = (dff)dfn1.a.get(class1);
        s = dff1;
        if (dff1 == null)
        {
            s = new dff(dfn1.b, class1, null);
            dfn1.a.put(class1, s);
        }
        return Executors.newCachedThreadPool(s);
    }
}
