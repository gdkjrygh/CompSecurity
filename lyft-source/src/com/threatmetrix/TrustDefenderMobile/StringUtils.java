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

class StringUtils
{

    private static final String a;
    private static final char b[];
    private static final MessageDigest c;
    private static final MessageDigest d;

    StringUtils()
    {
    }

    static String a()
    {
        Log.d(a, "getting UUID");
        if (NativeGatherer.a().b())
        {
            return NativeGatherer.a().a(32);
        } else
        {
            return UUID.randomUUID().toString().toLowerCase(Locale.US).replaceAll("-", "");
        }
    }

    static String a(Class class1)
    {
        String s = (new StringBuilder()).append("c.t.tdm.").append(class1.getSimpleName()).toString();
        class1 = s;
        if (s.length() > 23)
        {
            class1 = s.substring(0, 23);
        }
        return class1;
    }

    static String a(String s)
    {
        if (NativeGatherer.a().b())
        {
            return NativeGatherer.a().e(s);
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
        if (NativeGatherer.a().b())
        {
            return NativeGatherer.a().b(s, s1);
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
        return a(list, s, false);
    }

    static String a(List list, String s, boolean flag)
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
        if (flag && stringbuilder.length() > 0)
        {
            stringbuilder.append(s);
        }
        return stringbuilder.toString();
    }

    static String a(byte abyte0[])
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
            s = "";
        } else
        if (NativeGatherer.a().b())
        {
            String s1 = NativeGatherer.a().b(s);
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        } else
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
        return s;
        s;
        messagedigest;
        JVM INSTR monitorexit ;
        throw s;
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
            s = "";
        } else
        if (NativeGatherer.a().b())
        {
            String s1 = NativeGatherer.a().d(s);
            s = s1;
            if (s1 == null)
            {
                return "";
            }
        } else
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
        return s;
        s;
        messagedigest;
        JVM INSTR monitorexit ;
        throw s;
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
                Log.d(a, "Unsupported encoding", unsupportedencodingexception);
            }
        }

        return linkedhashmap;
    }

    static 
    {
        Object obj1;
        obj1 = null;
        a = a(com/threatmetrix/TrustDefenderMobile/StringUtils);
        b = "0123456789abcdef".toCharArray();
        if (NativeGatherer.a().b())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Log.d(a, "Getting SHA1 digest");
        Object obj = MessageDigest.getInstance("SHA1");
_L1:
        d = ((MessageDigest) (obj));
        obj = obj1;
        if (!NativeGatherer.a().b())
        {
            Log.d(a, "Getting MD5 digest");
            try
            {
                obj = MessageDigest.getInstance("MD5");
            }
            catch (NoSuchAlgorithmException nosuchalgorithmexception)
            {
                Log.v(a, "MD5 digest failed", nosuchalgorithmexception);
                nosuchalgorithmexception = obj1;
            }
        }
        c = ((MessageDigest) (obj));
        return;
        obj;
        Log.v(a, "SHA1 digest failed", ((Throwable) (obj)));
        obj = null;
          goto _L1
    }
}
