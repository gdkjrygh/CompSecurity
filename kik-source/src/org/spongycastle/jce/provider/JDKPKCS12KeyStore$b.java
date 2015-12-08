// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.jce.provider:
//            JDKPKCS12KeyStore

private static final class <init>
{

    private Hashtable a;
    private Hashtable b;

    public final Object a(String s)
    {
        s = (String)b.remove(Strings.c(s));
        if (s == null)
        {
            return null;
        } else
        {
            return a.remove(s);
        }
    }

    public final Enumeration a()
    {
        return a.keys();
    }

    public final void a(String s, Object obj)
    {
        String s1 = Strings.c(s);
        String s2 = (String)b.get(s1);
        if (s2 != null)
        {
            a.remove(s2);
        }
        b.put(s1, s);
        a.put(s, obj);
    }

    public final Object b(String s)
    {
        s = (String)b.get(Strings.c(s));
        if (s == null)
        {
            return null;
        } else
        {
            return a.get(s);
        }
    }

    public final Enumeration b()
    {
        return a.elements();
    }

    private ()
    {
        a = new Hashtable();
        b = new Hashtable();
    }

    b(byte byte0)
    {
        this();
    }
}
