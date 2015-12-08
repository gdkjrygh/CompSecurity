// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.c.b;
import org.c.c;

public final class bf
{

    private static b a = org.c.c.a("UrlTools");

    public static String a(String s, String s1)
    {
        int i1;
        URI uri;
        String s2;
        try
        {
            uri = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Malformed Url:")).append(s.getMessage());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Invalid Uri:")).append(s.getMessage());
            return null;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        if (s1.length() != 0)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new MalformedURLException((new StringBuilder("invalid base for relative url: ")).append(s).toString());
        s = uri;
        if (uri.isAbsolute()) goto _L2; else goto _L1
_L1:
        s = URI.create(s1);
        s2 = s.getHost();
        i1 = s.getPort();
        if (s == null || s2 == null) goto _L4; else goto _L3
_L3:
        if (s1.endsWith("/") || !s1.endsWith(s2) && !s1.endsWith((new StringBuilder()).append(s2).append(":").append(i1).toString())) goto _L4; else goto _L5
_L7:
        if (!i1)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        s = URI.create((new StringBuilder()).append(s1).append("/").toString());
        s = s.resolve(uri);
_L2:
        s = s.toString();
        return s;
_L4:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(String s, boolean flag)
    {
        if (s == null)
        {
            return "";
        }
        s = Uri.parse(s);
        if (s.getScheme() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(s.getScheme().toLowerCase());
            if (flag)
            {
                s = ":";
            } else
            {
                s = "";
            }
            return stringbuilder.append(s).toString();
        } else
        {
            return "";
        }
    }

    private static String a(String s, boolean flag, boolean flag1)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (!s.equals("conversations"))
            {
                StringBuilder stringbuilder = new StringBuilder();
                Object obj = Uri.parse(s);
                String s2 = ((Uri) (obj)).getScheme();
                String s3 = ((Uri) (obj)).getUserInfo();
                String s4 = ((Uri) (obj)).getHost();
                int i1 = ((Uri) (obj)).getPort();
                String s5 = a(((Uri) (obj)).getPathSegments());
                s = ((Uri) (obj)).getEncodedQuery();
                obj = ((Uri) (obj)).getFragment();
                if (s == null)
                {
                    s = "";
                }
                if (obj == null)
                {
                    obj = "";
                } else
                {
                    obj = h(((String) (obj)));
                }
                if (!flag1 && s2 != null && s2.length() > 0)
                {
                    stringbuilder.append(s2.toLowerCase()).append("://");
                }
                if (s3 != null)
                {
                    stringbuilder.append(s3).append('@');
                }
                if (s4 != null)
                {
                    stringbuilder.append(s4.toLowerCase());
                }
                if (i1 >= 0 && (!s2.equals("https") || i1 != 443) && (s2.equals("https") || i1 != 80))
                {
                    stringbuilder.append(':').append(i1);
                }
                stringbuilder.append(s5);
                if (s != null && s.length() != 0)
                {
                    stringbuilder.append('?').append(s);
                }
                if (!flag && obj != null && ((String) (obj)).length() != 0)
                {
                    stringbuilder.append('#').append(((String) (obj)));
                }
                return stringbuilder.toString();
            }
        }
        return s1;
    }

    private static String a(List list)
    {
        StringBuilder stringbuilder;
        Object obj = new ArrayList();
        stringbuilder = new StringBuilder();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (s.equals(".."))
            {
                if (!((List) (obj)).isEmpty())
                {
                    ((List) (obj)).remove(((List) (obj)).size() - 1);
                }
            } else
            if (!s.equals(".") && s.trim().length() != 0)
            {
                ((List) (obj)).add(s);
            }
        } while (true);
        obj = ((List) (obj)).iterator();
        list = null;
        for (; ((Iterator) (obj)).hasNext(); stringbuilder.append(h(list)))
        {
            list = (String)((Iterator) (obj)).next();
            stringbuilder.append("/");
        }

        if (stringbuilder.length() != 0) goto _L2; else goto _L1
_L1:
        stringbuilder.append("/");
_L4:
        return stringbuilder.toString();
_L2:
        if (list != null && list.indexOf('.') < 0)
        {
            stringbuilder.append("/");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(String s)
    {
        while (s == null || !s.toLowerCase().startsWith("https://")) 
        {
            return false;
        }
        return true;
    }

    public static boolean a(String s, String as[])
    {
        if (s != null)
        {
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s1 = as[i1];
                if (s.equals(s1) || s.endsWith((new StringBuilder(".")).append(s1).toString()))
                {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    public static String b(String s)
    {
        return a(s, false, false);
    }

    public static boolean b(String s, String s1)
    {
        if (s != null || s1 != null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (s == null || s1 == null)
        {
            return false;
        }
        s = l(s);
        s1 = l(s1);
        if (s == null || s1 == null)
        {
            return false;
        }
        int i1;
        boolean flag;
        if (s == null || s1 == null)
        {
            i1 = 0;
        } else
        {
            int j1 = s.getPort();
            int k1 = s1.getPort();
            i1 = j1;
            if (j1 < 0)
            {
                i1 = s.getDefaultPort();
            }
            j1 = k1;
            if (k1 < 0)
            {
                j1 = s1.getDefaultPort();
            }
            if (i1 == j1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
        }
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s == null || s1 == null)
        {
            flag = false;
        } else
        if (s.getHost() == null || s1.getHost() == null)
        {
            flag = false;
        } else
        {
            flag = s.getHost().toLowerCase().equals(s1.getHost().toLowerCase());
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s == null || s1 == null)
        {
            flag = false;
        } else
        if (s.getProtocol() == null || s1.getProtocol() == null)
        {
            flag = false;
        } else
        {
            flag = s.getProtocol().equals(s1.getProtocol());
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static String c(String s)
    {
        return a(s, true, false);
    }

    public static String d(String s)
    {
        return a(s, true, true);
    }

    public static String e(String s)
    {
        ArrayList arraylist;
        if (s == null)
        {
            return null;
        }
        arraylist = new ArrayList();
        for (StringTokenizer stringtokenizer = new StringTokenizer(s, "/"); stringtokenizer.hasMoreElements(); arraylist.add(stringtokenizer.nextToken())) { }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = Uri.parse(s);
        if (s.getScheme() == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = (new StringBuilder()).append(s.getScheme().toLowerCase()).append("://").toString();
_L1:
        if (arraylist.size() < 2 || s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(s).append((String)arraylist.get(1)).toString();
        }
        s = "";
          goto _L1
    }

    public static boolean f(String s)
    {
        s = a(s, true);
        return "https:".equals(s) || "http:".equals(s);
    }

    public static String g(String s)
    {
        int i1;
        if (s != null)
        {
            if ((s = Uri.parse(s).getLastPathSegment()) != null && (i1 = s.lastIndexOf('.')) > 0)
            {
                return s.toLowerCase().substring(i1 + 1);
            }
        }
        return null;
    }

    public static String h(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        int i1 = 0;
        int j1 = s.length();
        while (i1 < j1) 
        {
            char c1 = s.charAt(i1);
            if (c1 >= 'A' && c1 <= 'Z' || c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9' || c1 == '-' || c1 == '.' || c1 == '_' || c1 == '~')
            {
                stringbuilder.append(c1);
            } else
            if (c1 <= '\377')
            {
                stringbuilder.append(Uri.encode(String.valueOf(c1)));
            } else
            {
                stringbuilder.append(c1);
            }
            i1++;
        }
        return stringbuilder.toString();
    }

    public static String i(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s.getHost().toLowerCase();
    }

    public static String j(String s)
    {
        String s1 = i(s);
        int i1 = m(s);
        s = new StringBuilder();
        s.append(s1);
        if (i1 >= 0)
        {
            s.append(':').append(i1);
        }
        return s.toString();
    }

    public static String k(String s)
    {
        int i1 = s.lastIndexOf('#');
        String s1 = s;
        if (i1 >= 0)
        {
            s1 = s.substring(0, i1);
        }
        return s1;
    }

    private static URL l(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static int m(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return s.getPort();
    }

}
