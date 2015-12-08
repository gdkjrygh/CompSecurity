// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public final class cag
    implements caf
{

    private final cae a;
    private final HashSet b = new HashSet();

    public cag(cae cae1)
    {
        a = cae1;
    }

    public final void a()
    {
        java.util.AbstractMap.SimpleEntry simpleentry;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a.b((String)simpleentry.getKey(), (cdi)simpleentry.getValue()))
        {
            simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
            bka.d((new StringBuilder("Unregistering eventhandler: ")).append(((cdi)simpleentry.getValue()).toString()).toString());
        }

        b.clear();
    }

    public final void a(String s, cdi cdi1)
    {
        a.a(s, cdi1);
        b.add(new java.util.AbstractMap.SimpleEntry(s, cdi1));
    }

    public final void a(String s, String s1)
    {
        a.a(s, s1);
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public final void b(String s, cdi cdi1)
    {
        a.b(s, cdi1);
        b.remove(new java.util.AbstractMap.SimpleEntry(s, cdi1));
    }

    public final void b(String s, JSONObject jsonobject)
    {
        a.b(s, jsonobject);
    }
}
