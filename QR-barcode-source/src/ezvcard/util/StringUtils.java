// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class StringUtils
{
    public static interface JoinCallback
    {

        public abstract void handle(StringBuilder stringbuilder, Object obj);
    }

    public static interface JoinMapCallback
    {

        public abstract void handle(StringBuilder stringbuilder, Object obj, Object obj1);
    }


    public static final String NEWLINE = System.getProperty("line.separator");

    private StringUtils()
    {
    }

    public static String join(Collection collection, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        join(collection, s, stringbuilder);
        return stringbuilder.toString();
    }

    public static String join(Collection collection, String s, JoinCallback joincallback)
    {
        StringBuilder stringbuilder = new StringBuilder();
        join(collection, s, stringbuilder, joincallback);
        return stringbuilder.toString();
    }

    public static String join(Map map, String s, JoinMapCallback joinmapcallback)
    {
        return join(((Collection) (map.entrySet())), s, new JoinCallback(joinmapcallback) {

            final JoinMapCallback val$join;

            public volatile void handle(StringBuilder stringbuilder, Object obj)
            {
                handle(stringbuilder, (java.util.Map.Entry)obj);
            }

            public void handle(StringBuilder stringbuilder, java.util.Map.Entry entry)
            {
                join.handle(stringbuilder, entry.getKey(), entry.getValue());
            }

            
            {
                join = joinmapcallback;
                super();
            }
        });
    }

    public static void join(Collection collection, String s, StringBuilder stringbuilder)
    {
        join(collection, s, stringbuilder, new JoinCallback() {

            public void handle(StringBuilder stringbuilder1, Object obj)
            {
                stringbuilder1.append(obj);
            }

        });
    }

    public static void join(Collection collection, String s, StringBuilder stringbuilder, JoinCallback joincallback)
    {
        boolean flag = true;
        collection = collection.iterator();
        while (collection.hasNext()) 
        {
            Object obj = collection.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(s);
            }
            joincallback.handle(stringbuilder, obj);
        }
    }

    public static String ltrim(String s)
    {
        if (s == null)
        {
            return null;
        }
        int i;
        for (i = 0; i < s.length() && Character.isWhitespace(s.charAt(i)); i++) { }
        if (i == s.length())
        {
            return "";
        } else
        {
            return s.substring(i);
        }
    }

    public static String rtrim(String s)
    {
        if (s == null)
        {
            return null;
        }
        int i;
        for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); i--) { }
        if (i == 0)
        {
            return "";
        } else
        {
            return s.substring(0, i + 1);
        }
    }

}
