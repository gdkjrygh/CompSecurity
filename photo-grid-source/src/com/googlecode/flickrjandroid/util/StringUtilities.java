// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class StringUtilities
{

    public static final Pattern getterPattern = Pattern.compile("^is|^get");

    private StringUtilities()
    {
    }

    public static String join(Collection collection, String s)
    {
        return join(collection, s, false);
    }

    public static String join(Collection collection, String s, boolean flag)
    {
        StringBuffer stringbuffer = new StringBuffer();
        collection = collection.iterator();
        do
        {
            do
            {
                if (!collection.hasNext())
                {
                    return stringbuffer.toString();
                }
                if (flag)
                {
                    stringbuffer.append((new StringBuilder("\"")).append((String)collection.next()).append("\"").toString());
                } else
                {
                    stringbuffer.append((String)collection.next());
                }
            } while (!collection.hasNext());
            stringbuffer.append(s);
        } while (true);
    }

    public static String join(String as[], String s)
    {
        return join(as, s, false);
    }

    public static String join(String as[], String s, boolean flag)
    {
        return join(((Collection) (Arrays.asList(as))), s, flag);
    }

    public static String[] split(String s, String s1)
    {
        int j = s.indexOf(s1);
        if (j == -1)
        {
            return (new String[] {
                s
            });
        }
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (j == -1)
            {
                if (i != s.length())
                {
                    arraylist.add(s.substring(i));
                }
                return (String[])arraylist.toArray(new String[arraylist.size()]);
            }
            arraylist.add(s.substring(i, j));
            i = s1.length() + j;
            j = s.indexOf(s1, i);
        } while (true);
    }

}
