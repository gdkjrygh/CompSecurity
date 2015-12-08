// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKPKCS12KeyStore

private static class <init>
{

    private Hashtable keys;
    private Hashtable orig;

    public Enumeration elements()
    {
        return orig.elements();
    }

    public Object get(String s)
    {
        s = (String)keys.get(Strings.toLowerCase(s));
        if (s == null)
        {
            return null;
        } else
        {
            return orig.get(s);
        }
    }

    public Enumeration keys()
    {
        return orig.keys();
    }

    public void put(String s, Object obj)
    {
        String s1 = Strings.toLowerCase(s);
        String s2 = (String)keys.get(s1);
        if (s2 != null)
        {
            orig.remove(s2);
        }
        keys.put(s1, s);
        orig.put(s, obj);
    }

    public Object remove(String s)
    {
        s = (String)keys.remove(Strings.toLowerCase(s));
        if (s == null)
        {
            return null;
        } else
        {
            return orig.remove(s);
        }
    }

    private ()
    {
        orig = new Hashtable();
        keys = new Hashtable();
    }

    keys(keys keys1)
    {
        this();
    }
}
