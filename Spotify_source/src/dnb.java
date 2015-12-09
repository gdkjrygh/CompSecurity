// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public final class dnb
{

    private List a;

    public dnb(String s, String s1)
    {
        a = new LinkedList();
        a.add(s);
        a.add(s1);
    }

    private String a(Hashtable hashtable)
    {
        LinkedList linkedlist = new LinkedList();
        java.util.Map.Entry entry;
        for (hashtable = hashtable.entrySet().iterator(); hashtable.hasNext(); linkedlist.add((new StringBuilder()).append(b(entry.getKey())).append(":").append(b(entry.getValue())).toString()))
        {
            entry = (java.util.Map.Entry)hashtable.next();
        }

        return TextUtils.join(",", linkedlist);
    }

    private String b(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof Long)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Double)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof Boolean)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof byte[])
        {
            return gds.a((byte[])obj);
        }
        if (obj instanceof Vector)
        {
            Object obj1 = (Vector)obj;
            obj = new LinkedList();
            for (obj1 = ((Vector) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(b(((Iterator) (obj1)).next()))) { }
            return TextUtils.join(",", ((Iterable) (obj)));
        }
        if (obj instanceof Hashtable)
        {
            return a((Hashtable)obj);
        } else
        {
            Assertion.a("Invalid type for message field.");
            return null;
        }
    }

    public final dnb a(Object obj)
    {
        a.add(b(obj));
        return this;
    }

    public final String a()
    {
        return TextUtils.join("\t", a);
    }
}
