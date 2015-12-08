// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import b.a.a.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class JsonExtractionException extends Exception
{

    private static final long serialVersionUID = 0xb047251a40bf8d5fL;

    public JsonExtractionException(String s, String s1, Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(s).append(": ").toString();
        }
        s1 = stringbuilder.append(s).append(s1);
        if (obj == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder(": ")).append(summarizeValue(obj)).toString();
        }
        super(s1.append(s).toString());
    }

    private static String summarizeValue(Object obj)
    {
        if (obj instanceof Map)
        {
            StringBuilder stringbuilder = new StringBuilder();
            obj = (Map)obj;
            stringbuilder.append("{");
            Iterator iterator = ((Map) (obj)).entrySet().iterator();
            obj = "";
            for (; iterator.hasNext(); stringbuilder.append("..."))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append(((String) (obj)));
                obj = ", ";
                stringbuilder.append(d.a(entry.getKey()));
                stringbuilder.append(" = ");
            }

            stringbuilder.append("}");
            return stringbuilder.toString();
        }
        if (obj instanceof List)
        {
            obj = (List)obj;
            if (((List) (obj)).isEmpty())
            {
                return "[]";
            }
            if (((List) (obj)).size() == 1)
            {
                return (new StringBuilder("[")).append(summarizeValue(((List) (obj)).get(0))).append("]").toString();
            } else
            {
                return (new StringBuilder("[")).append(summarizeValue(((List) (obj)).get(0))).append(", ...] (").append(((List) (obj)).size()).append(" elements)").toString();
            }
        } else
        {
            return d.a(obj);
        }
    }
}
