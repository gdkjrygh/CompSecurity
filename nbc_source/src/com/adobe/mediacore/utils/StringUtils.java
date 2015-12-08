// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class StringUtils
{

    public StringUtils()
    {
    }

    public static Metadata extractFromString(String s, String s1, String s2)
    {
        MetadataNode metadatanode = new MetadataNode();
        s1 = s.split(s1);
        int j = s1.length;
        int i = 0;
        while (i < j) 
        {
            s = s1[i];
            if (s.contains(s2))
            {
                s = s.split(s2);
                String s3 = s[0].trim();
                if (s.length > 1)
                {
                    s = s[1].trim();
                } else
                {
                    s = "";
                }
                metadatanode.setValue(s3, s);
            }
            i++;
        }
        return metadatanode;
    }

    public static String getFileExtension(String s)
    {
        String s1;
        int i;
        try
        {
            s = (new URL(s)).getFile();
            i = s.lastIndexOf(".");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        if (i == -1) goto _L2; else goto _L1
_L1:
        s = s.substring(i + 1).trim();
_L4:
        s1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s1 = s;
        if (s.contains("?"))
        {
            s1 = s.substring(0, s.lastIndexOf("?")).trim();
        }
        return s1;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String[] getReunion(String as[], String as1[])
    {
        HashSet hashset = new HashSet();
        if (as != null)
        {
            hashset.addAll(Arrays.asList(as));
        }
        if (as1 != null)
        {
            hashset.addAll(Arrays.asList(as1));
        }
        return (String[])(String[])hashset.toArray(new String[hashset.size()]);
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.trim().length() == 0;
    }

    public static String trimQuotes(String s)
    {
        String s1 = s;
        if (s.startsWith("\""))
        {
            s1 = s.substring(1, s.length());
        }
        s = s1;
        if (s1.endsWith("\""))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        return s;
    }
}
