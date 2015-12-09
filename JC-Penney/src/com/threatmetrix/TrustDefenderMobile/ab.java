// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            NativeGatherer

class ab
{

    private static final String a;
    private static final char b[];
    private static final MessageDigest c;
    private static final MessageDigest d;

    ab()
    {
    }

    static String a()
    {
        String s = a;
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.a(32);
        } else
        {
            return UUID.randomUUID().toString().toLowerCase(Locale.US).replaceAll("-", "");
        }
    }

    static String a(String s)
    {
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.d(s);
        }
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(a, "Failed url encoding", s);
            return null;
        }
        return s;
    }

    static String a(String s, String s1)
    {
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.a(s, s1);
        }
        String s2 = (new StringBuilder()).append(s.length()).append("&").toString();
        byte abyte0[] = new byte[s.length() + s2.length()];
        int i1 = s1.length();
        int k = 0;
        int i = 0;
        int j = 0;
        while (k < s2.length()) 
        {
            byte byte0 = (byte)s2.charAt(k);
            int l = j + 1;
            abyte0[i] = (byte)((byte)s1.charAt(j) & 0xa ^ byte0);
            if (l >= i1)
            {
                j = 0;
            } else
            {
                j = l;
            }
            k++;
            i++;
        }
        k = 0;
        l = j;
        j = i;
        while (k < s.length()) 
        {
            byte0 = (byte)s.charAt(k);
            i = l + 1;
            abyte0[j] = (byte)((byte)s1.charAt(l) & 0xa ^ byte0);
            if (i >= i1)
            {
                i = 0;
            }
            k++;
            j++;
            l = i;
        }
        return a(abyte0);
    }

    static String a(List list, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            if (!s1.isEmpty())
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(s);
                }
                stringbuilder.append(s1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    private static String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i = 0; i < abyte0.length; i++)
        {
            int j = abyte0[i] & 0xff;
            ac[i * 2] = b[j >>> 4];
            ac[i * 2 + 1] = b[j & 0xf];
        }

        return new String(ac);
    }

    static String b(String s)
    {
        if (s == null || s.isEmpty())
        {
            return "";
        }
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.b(s);
        }
        if (c != null)
        {
            synchronized (c)
            {
                c.update(s.getBytes());
                s = c.digest();
                c.reset();
                s = a(s);
            }
            return s;
        } else
        {
            return "";
        }
    }

    static List b(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        do
        {
            int i = s.indexOf(s1);
            if (i == -1)
            {
                if (!s.isEmpty())
                {
                    arraylist.add(s);
                }
                return arraylist;
            }
            if (i > 1)
            {
                arraylist.add(s.substring(0, i));
            }
            s = s.substring(i + s1.length());
        } while (true);
    }

    static String c(String s)
    {
        if (s == null || s.isEmpty())
        {
            return "";
        }
        if (NativeGatherer.a.a())
        {
            return NativeGatherer.a.c(s);
        }
        if (d != null)
        {
            synchronized (d)
            {
                d.update(s.getBytes());
                s = d.digest();
                d.reset();
                s = a(s);
            }
            return s;
        } else
        {
            return "";
        }
    }

    static Map d(String s)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        for (s = b(s, "&").iterator(); s.hasNext();)
        {
            String s1 = (String)s.next();
            int i = s1.indexOf("=");
            try
            {
                linkedhashmap.put(URLDecoder.decode(s1.substring(0, i), "UTF-8"), URLDecoder.decode(s1.substring(i + 1), "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                unsupportedencodingexception = a;
            }
        }

        return linkedhashmap;
    }

    static 
    {
        Object obj1;
        obj1 = null;
        a = com/threatmetrix/TrustDefenderMobile/ab.getSimpleName();
        b = "0123456789abcdef".toCharArray();
        if (NativeGatherer.a.a())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        String s = a;
        Object obj = MessageDigest.getInstance("SHA1");
_L1:
        d = ((MessageDigest) (obj));
        obj = obj1;
        if (!NativeGatherer.a.a())
        {
            obj = a;
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                nosuchalgorithmexception = a;
                nosuchalgorithmexception = obj1;
            }
        }
        c = ((MessageDigest) (obj));
        return;
        obj;
        obj = a;
        obj = null;
          goto _L1
    }
}
