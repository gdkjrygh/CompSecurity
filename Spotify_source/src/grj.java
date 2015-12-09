// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class grj
{

    private static final char g[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    public final String a;
    final String b;
    public final String c;
    public final int d;
    public final List e;
    public final String f;
    private final String h;

    private grj(grk grk1)
    {
        a = grk1.a;
        h = e(grk1.b);
        b = e(grk1.c);
        c = grk1.d;
        d = grk1.a();
        a(grk1.f);
        List list;
        if (grk1.g != null)
        {
            list = a(grk1.g);
        } else
        {
            list = null;
        }
        e = list;
        if (grk1.h != null)
        {
            e(grk1.h);
        }
        f = grk1.toString();
    }

    grj(grk grk1, byte byte0)
    {
        this(grk1);
    }

    static int a(char c1)
    {
        if (c1 >= '0' && c1 <= '9')
        {
            return c1 - 48;
        }
        if (c1 >= 'a' && c1 <= 'f')
        {
            return (c1 - 97) + 10;
        }
        if (c1 >= 'A' && c1 <= 'F')
        {
            return (c1 - 65) + 10;
        } else
        {
            return -1;
        }
    }

    public static int a(String s)
    {
        if (s.equals("http"))
        {
            return 80;
        }
        return !s.equals("https") ? -1 : 443;
    }

    public static int a(String s, int i, int j, String s1)
    {
        do
        {
label0:
            {
                int k = j;
                if (i < j)
                {
                    if (s1.indexOf(s.charAt(i)) == -1)
                    {
                        break label0;
                    }
                    k = i;
                }
                return k;
            }
            i++;
        } while (true);
    }

    public static grj a(URL url)
    {
        return d(url.toString());
    }

    static String a(grj grj1)
    {
        return grj1.a;
    }

    static String a(String s, int i, int j)
    {
        int k = i;
_L11:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s.charAt(k) != '%') goto _L2; else goto _L1
_L1:
        hch hch1;
        hch1 = new hch();
        hch1.a(s, i, k);
        i = k;
_L9:
        if (i >= j) goto _L4; else goto _L3
_L3:
        k = s.codePointAt(i);
        if (k != 37 || i + 2 >= j) goto _L6; else goto _L5
_L5:
        int l;
        int i1;
        l = a(s.charAt(i + 1));
        i1 = a(s.charAt(i + 2));
        if (l == -1 || i1 == -1) goto _L6; else goto _L7
_L7:
        hch1.b((l << 4) + i1);
        i += 2;
_L8:
        i += Character.charCount(k);
        continue; /* Loop/switch isn't completed */
_L6:
        hch1.a(k);
        if (true) goto _L8; else goto _L4
_L4:
        return hch1.p();
        if (true) goto _L9; else goto _L2
_L2:
        k++;
        if (true) goto _L11; else goto _L10
_L10:
        return s.substring(i, j);
    }

    static String a(String s, int i, int j, String s1, boolean flag, boolean flag1)
    {
        int l;
        for (int k = i; k < j; k += Character.charCount(l))
        {
            l = s.codePointAt(k);
            if (l < 32 || l >= 127 || s1.indexOf(l) != -1 || l == 37 && !flag || flag1 && l == 43)
            {
                hch hch1 = new hch();
                hch1.a(s, i, k);
                a(hch1, s, k, j, s1, flag, flag1);
                return hch1.p();
            }
        }

        return s.substring(i, j);
    }

    static String a(String s, String s1)
    {
        return a(s, 0, s.length(), s1, true, true);
    }

    private static List a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            list = (String)iterator.next();
            if (list != null)
            {
                list = e(list);
            } else
            {
                list = null;
            }
            arraylist.add(list);
        }
        return Collections.unmodifiableList(arraylist);
    }

    static void a(hch hch1, String s, int i, int j, String s1, boolean flag, boolean flag1)
    {
        Object obj = null;
_L2:
        hch hch3;
        int k;
label0:
        {
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_258;
            }
            k = s.codePointAt(i);
            if (flag)
            {
                hch3 = obj;
                if (k == 9)
                {
                    break label0;
                }
                hch3 = obj;
                if (k == 10)
                {
                    break label0;
                }
                hch3 = obj;
                if (k == 12)
                {
                    break label0;
                }
                hch3 = obj;
                if (k == 13)
                {
                    break label0;
                }
            }
            if (!flag1 || k != 43)
            {
                break; /* Loop/switch isn't completed */
            }
            String s2;
            if (flag)
            {
                s2 = "%20";
            } else
            {
                s2 = "%2B";
            }
            hch1.a(s2);
            hch3 = obj;
        }
_L4:
        i += Character.charCount(k);
        obj = hch3;
        if (true) goto _L2; else goto _L1
_L1:
        hch hch2;
        if (k >= 32 && k < 127 && s1.indexOf(k) == -1 && (k != 37 || flag))
        {
            break MISSING_BLOCK_LABEL_244;
        }
        hch2 = obj;
        if (obj == null)
        {
            hch2 = new hch();
        }
        hch2.a(k);
_L5:
        hch3 = hch2;
        if (hch2.e()) goto _L4; else goto _L3
_L3:
        int l = hch2.g() & 0xff;
        hch1.b(37);
        hch1.b(g[l >> 4 & 0xf]);
        hch1.b(g[l & 0xf]);
          goto _L5
        hch1.a(k);
        hch3 = obj;
          goto _L4
    }

    static void a(StringBuilder stringbuilder, List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append('/');
            stringbuilder.append((String)list.get(i));
        }

    }

    static int b(String s, int i, int j, String s1)
    {
        return a(s, i, j, s1);
    }

    static String b(grj grj1)
    {
        return grj1.c;
    }

    static List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i <= s.length()) 
        {
            int k = s.indexOf('&', i);
            int j = k;
            if (k == -1)
            {
                j = s.length();
            }
            k = s.indexOf('=', i);
            if (k == -1 || k > j)
            {
                arraylist.add(s.substring(i, j));
                arraylist.add(null);
            } else
            {
                arraylist.add(s.substring(i, k));
                arraylist.add(s.substring(k + 1, j));
            }
            i = j + 1;
        }
        return arraylist;
    }

    public static void b(StringBuilder stringbuilder, List list)
    {
        int j = list.size();
        for (int i = 0; i < j; i += 2)
        {
            String s = (String)list.get(i);
            String s1 = (String)list.get(i + 1);
            if (i > 0)
            {
                stringbuilder.append('&');
            }
            stringbuilder.append(s);
            if (s1 != null)
            {
                stringbuilder.append('=');
                stringbuilder.append(s1);
            }
        }

    }

    static int c(grj grj1)
    {
        return grj1.d;
    }

    public static grj d(String s)
    {
        return (new grk()).a(null, s);
    }

    private static String e(String s)
    {
        return a(s, 0, s.length());
    }

    public final URL a()
    {
        URL url;
        try
        {
            url = new URL(f);
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException(malformedurlexception);
        }
        return url;
    }

    public final URI b()
    {
        URI uri;
        try
        {
            uri = new URI(f);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IllegalStateException((new StringBuilder("not valid as a java.net.URI: ")).append(f).toString());
        }
        return uri;
    }

    public final grj c(String s)
    {
        return (new grk()).a(this, s);
    }

    public final String c()
    {
        if (h.isEmpty())
        {
            return "";
        } else
        {
            int i = a.length() + 3;
            int j = a(f, i, f.length(), ":@");
            return f.substring(i, j);
        }
    }

    public final List d()
    {
        int i = f.indexOf('/', a.length() + 3);
        int j = a(f, i, f.length(), "?#");
        ArrayList arraylist = new ArrayList();
        while (i < j) 
        {
            int k = i + 1;
            i = a(f, k, j, "/");
            arraylist.add(f.substring(k, i));
        }
        return arraylist;
    }

    public final String e()
    {
        if (e == null)
        {
            return null;
        } else
        {
            int i = f.indexOf('?') + 1;
            int j = a(f, i + 1, f.length(), "#");
            return f.substring(i, j);
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof grj) && ((grj)obj).f.equals(f);
    }

    public final int hashCode()
    {
        return f.hashCode();
    }

    public final String toString()
    {
        return f;
    }

}
