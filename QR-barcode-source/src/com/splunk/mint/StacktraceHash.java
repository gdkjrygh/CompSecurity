// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StacktraceHash
{

    StacktraceHash()
    {
    }

    public static final HashMap manipulateStacktrace(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        Object obj = null;
        String as1[] = s1.split("\n\t");
        String as[] = as1;
        if (as1.length == 1)
        {
            as = s1.split("\n");
        }
        Object obj1 = removeFirstDate(as[0]);
        try
        {
            s1 = ((String) (obj1)).substring(0, ((String) (obj1)).indexOf(":"));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1 = ((String) (obj1));
        }
        hashmap.put("message", ((String) (obj1)).replaceAll("Caused by:", ""));
        hashmap.put("klass", s1);
        s1 = s;
        if (s.contains("."))
        {
            s = s.split("\\.");
            int i;
            int l;
            if (s[0].length() > 3)
            {
                s1 = s[0];
            } else
            {
                s1 = s[1];
            }
        }
        obj1 = new StringBuilder();
        l = as.length;
        for (i = 0; i < l; i++)
        {
            s = as[i];
            if (s.indexOf(s1) != -1 && s.indexOf(s1) <= 20)
            {
                ((StringBuilder) (obj1)).append(s);
                ((StringBuilder) (obj1)).append("\n");
            }
        }

        if (((StringBuilder) (obj1)).length() == 0)
        {
            int i1 = as.length;
            for (int j = 0; j < i1; j++)
            {
                s = as[j];
                if (s.length() > 10 && s.trim().startsWith("at ") && !s.contains("...") && !s.contains(".java.") && !s.substring(0, 10).contains("android") && !s.contains("org.apache") && !s.contains("org.acra") && !s.contains("dalvik") && !s.contains(".acra."))
                {
                    ((StringBuilder) (obj1)).append(s);
                    ((StringBuilder) (obj1)).append("\n");
                }
            }

        }
        if (((StringBuilder) (obj1)).length() == 0)
        {
            int j1 = as.length;
            for (int k = 0; k < j1; k++)
            {
                s = as[k];
                if (s.length() > 10 && s.trim().startsWith("at ") && (s.contains(".java") || s.contains("Unknown")))
                {
                    ((StringBuilder) (obj1)).append(s);
                    ((StringBuilder) (obj1)).append("\n");
                }
            }

        }
        if (((StringBuilder) (obj1)).length() != 0);
        String s2 = ((StringBuilder) (obj1)).toString().split("\n")[0];
        s = obj;
        if (!s2.contains(s1))
        {
            s = s2.split("\\.")[1];
        }
        hashmap.put("library", s);
        if (s2.contains("("))
        {
            s = s2.substring(s2.indexOf("(") + 1, s2.indexOf(")"));
        } else
        {
            s = "Unknown";
        }
        hashmap.put("where", s);
        ((StringBuilder) (obj1)).toString().replaceAll("@\\w+", "");
        hashmap.put("errorHash", md5(((StringBuilder) (obj1)).toString().replaceAll("$\\w+", "")));
        return hashmap;
    }

    private static String md5(String s)
    {
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.reset();
        messagedigest.update(s.getBytes());
        s = (new BigInteger(1, messagedigest.digest())).toString(16);
_L2:
        String s1 = s;
        if (s.length() >= 32)
        {
            break; /* Loop/switch isn't completed */
        }
        s = (new StringBuilder()).append("0").append(s).toString();
        if (true) goto _L2; else goto _L1
        s;
        s.printStackTrace();
        s1 = "";
_L1:
        return s1;
    }

    private static String removeFirstDate(String s)
    {
        String s1 = s;
        if (s.contains("\n"))
        {
            String as[] = s.split("\\n");
            s1 = s;
            if (Pattern.compile("[\\d]{2}:[\\d]{2}:[\\d]{2}").matcher(s).find())
            {
                s1 = as[1];
            }
        }
        return s1;
    }
}
