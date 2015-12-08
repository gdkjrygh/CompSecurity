// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Set;

public final class ani
    implements ane
{

    public final jk b = new jk();

    public ani()
    {
    }

    public final Object a(anf anf1)
    {
        if (b.containsKey(anf1))
        {
            return b.get(anf1);
        } else
        {
            return anf1.a;
        }
    }

    public final void a(ani ani1)
    {
        b.a(ani1.b);
    }

    public final void a(MessageDigest messagedigest)
    {
        anf anf1;
        Object obj;
        anh anh1;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); anh1.a(anf1.d, obj, messagedigest))
        {
            obj = (java.util.Map.Entry)iterator.next();
            anf1 = (anf)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            anh1 = anf1.b;
            if (anf1.d == null)
            {
                anf1.d = anf1.c.getBytes(ane.a);
            }
        }

    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ani)
        {
            obj = (ani)obj;
            return b.equals(((ani) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("Options{values=");
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }
}
