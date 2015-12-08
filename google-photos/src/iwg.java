// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class iwg
    implements iwj
{

    private final List a = new ArrayList();

    public iwg()
    {
    }

    public static iwg a(iwj iwj1)
    {
        iwg iwg1 = new iwg();
        iwg1.a.add(iwj1);
        return iwg1;
    }

    public final Object a(Object obj)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            obj = ((iwj)iterator.next()).a(obj);
        }

        return obj;
    }

    public final iwg b(iwj iwj1)
    {
        iwg iwg1 = new iwg();
        iwg1.a.addAll(a);
        iwg1.a.add(iwj1);
        return iwg1;
    }
}
