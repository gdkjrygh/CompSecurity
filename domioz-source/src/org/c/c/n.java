// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.c.d.a;
import org.c.d.d;
import org.c.d.h;
import org.c.d.m;

// Referenced classes of package org.c.c:
//            o, p

public final class n
    implements Comparable
{

    public static final n ALL = valueOf("*/*");
    public static final String ALL_VALUE = "*/*";
    public static final n APPLICATION_ATOM_XML = valueOf("application/atom+xml");
    public static final String APPLICATION_ATOM_XML_VALUE = "application/atom+xml";
    public static final n APPLICATION_FORM_URLENCODED = valueOf("application/x-www-form-urlencoded");
    public static final String APPLICATION_FORM_URLENCODED_VALUE = "application/x-www-form-urlencoded";
    public static final n APPLICATION_JSON = valueOf("application/json");
    public static final String APPLICATION_JSON_VALUE = "application/json";
    public static final n APPLICATION_OCTET_STREAM = valueOf("application/octet-stream");
    public static final String APPLICATION_OCTET_STREAM_VALUE = "application/octet-stream";
    public static final n APPLICATION_RSS_XML = valueOf("application/rss+xml");
    public static final String APPLICATION_RSS_XML_VALUE = "application/rss+xml";
    public static final n APPLICATION_WILDCARD_XML = valueOf("application/*+xml");
    public static final String APPLICATION_WILDCARD_XML_VALUE = "application/*+xml";
    public static final n APPLICATION_XHTML_XML = valueOf("application/xhtml+xml");
    public static final String APPLICATION_XHTML_XML_VALUE = "application/xhtml+xml";
    public static final n APPLICATION_XML = valueOf("application/xml");
    public static final String APPLICATION_XML_VALUE = "application/xml";
    public static final n IMAGE_GIF = valueOf("image/gif");
    public static final String IMAGE_GIF_VALUE = "image/gif";
    public static final n IMAGE_JPEG = valueOf("image/jpeg");
    public static final String IMAGE_JPEG_VALUE = "image/jpeg";
    public static final n IMAGE_PNG = valueOf("image/png");
    public static final String IMAGE_PNG_VALUE = "image/png";
    public static final n MULTIPART_FORM_DATA = valueOf("multipart/form-data");
    public static final String MULTIPART_FORM_DATA_VALUE = "multipart/form-data";
    public static final Comparator QUALITY_VALUE_COMPARATOR = new p();
    public static final Comparator SPECIFICITY_COMPARATOR = new o();
    public static final n TEXT_HTML = valueOf("text/html");
    public static final String TEXT_HTML_VALUE = "text/html";
    public static final n TEXT_PLAIN = valueOf("text/plain");
    public static final String TEXT_PLAIN_VALUE = "text/plain";
    public static final n TEXT_XML = valueOf("text/xml");
    public static final String TEXT_XML_VALUE = "text/xml";
    private static final BitSet a;
    private final String b;
    private final String c;
    private final Map d;

    public n(String s)
    {
        this(s, "*");
    }

    public n(String s, String s1)
    {
        this(s, s1, Collections.emptyMap());
    }

    public n(String s, String s1, double d1)
    {
        this(s, s1, Collections.singletonMap("q", Double.toString(d1)));
    }

    public n(String s, String s1, Charset charset)
    {
        this(s, s1, Collections.singletonMap("charset", charset.displayName()));
    }

    public n(String s, String s1, Map map)
    {
        org.c.d.a.hasLength(s, "'type' must not be empty");
        org.c.d.a.hasLength(s1, "'subtype' must not be empty");
        a(s);
        a(s1);
        b = s.toLowerCase(Locale.ENGLISH);
        c = s1.toLowerCase(Locale.ENGLISH);
        if (!org.c.d.d.isEmpty(map))
        {
            s = new h(map.size(), Locale.ENGLISH);
            s1 = map.entrySet().iterator();
            while (s1.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)s1.next();
                map = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
                org.c.d.a.hasLength(map, "parameter attribute must not be empty");
                org.c.d.a.hasLength(((String) (obj)), "parameter value must not be empty");
                a(map);
                if ("q".equals(map))
                {
                    String s2 = c(((String) (obj)));
                    double d1 = Double.parseDouble(s2);
                    boolean flag;
                    if (d1 >= 0.0D && d1 <= 1.0D)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    org.c.d.a.isTrue(flag, (new StringBuilder("Invalid quality value \"")).append(s2).append("\": should be between 0.0 and 1.0").toString());
                } else
                if ("charset".equals(map))
                {
                    Charset.forName(c(((String) (obj))));
                } else
                if (!b(((String) (obj))))
                {
                    a(((String) (obj)));
                }
                s.put(map, obj);
            }
            d = Collections.unmodifiableMap(s);
            return;
        } else
        {
            d = Collections.emptyMap();
            return;
        }
    }

    public n(n n1, Map map)
    {
        this(n1.getType(), n1.getSubtype(), map);
    }

    static Map a(n n1)
    {
        return n1.d;
    }

    private static void a(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c1 = s.charAt(i);
            if (!a.get(c1))
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid token character '")).append(c1).append("' in token \"").append(s).append("\"").toString());
            }
        }

    }

    private void a(StringBuilder stringbuilder)
    {
        stringbuilder.append(b);
        stringbuilder.append('/');
        stringbuilder.append(c);
        java.util.Map.Entry entry;
        for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            stringbuilder.append(';');
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append('=');
        }

    }

    private static boolean b(String s)
    {
        return s.length() > 1 && s.startsWith("\"") && s.endsWith("\"");
    }

    private static String c(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (b(s))
            {
                return s.substring(1, s.length() - 1);
            }
        }
        return s1;
    }

    public static n parseMediaType(String s)
    {
        org.c.d.a.hasLength(s, "'mediaType' must not be empty");
        String as[] = m.tokenizeToStringArray(s, ";");
        String s2 = as[0].trim();
        String s1 = s2;
        if ("*".equals(s2))
        {
            s1 = "*/*";
        }
        int i = s1.indexOf('/');
        if (i == -1)
        {
            throw new IllegalArgumentException((new StringBuilder("\"")).append(s).append("\" does not contain '/'").toString());
        }
        if (i == s1.length() - 1)
        {
            throw new IllegalArgumentException((new StringBuilder("\"")).append(s).append("\" does not contain subtype after '/'").toString());
        }
        s2 = s1.substring(0, i);
        s1 = s1.substring(i + 1, s1.length());
        if ("*".equals(s2) && !"*".equals(s1))
        {
            throw new IllegalArgumentException("A wildcard type is legal only in '*/*' (all media types).");
        }
        s = null;
        if (as.length > 1)
        {
            s = new LinkedHashMap(as.length - 1);
            for (int j = 1; j < as.length; j++)
            {
                String s3 = as[j];
                int k = s3.indexOf('=');
                if (k != -1)
                {
                    s.put(s3.substring(0, k), s3.substring(k + 1, s3.length()));
                }
            }

        }
        return new n(s2, s1, s);
    }

    public static List parseMediaTypes(String s)
    {
        if (m.hasLength(s)) goto _L2; else goto _L1
_L1:
        s = Collections.emptyList();
_L4:
        return s;
_L2:
        String as[] = s.split(",\\s*");
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        int i = 0;
        do
        {
            s = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(parseMediaType(as[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void sortByQualityValue(List list)
    {
        org.c.d.a.notNull(list, "'mediaTypes' must not be null");
        if (list.size() > 1)
        {
            Collections.sort(list, QUALITY_VALUE_COMPARATOR);
        }
    }

    public static void sortBySpecificity(List list)
    {
        org.c.d.a.notNull(list, "'mediaTypes' must not be null");
        if (list.size() > 1)
        {
            Collections.sort(list, SPECIFICITY_COMPARATOR);
        }
    }

    public static String toString(Collection collection)
    {
        StringBuilder stringbuilder = new StringBuilder();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            ((n)collection.next()).a(stringbuilder);
            if (collection.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static n valueOf(String s)
    {
        return parseMediaType(s);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((n)obj);
    }

    public final int compareTo(n n1)
    {
        int i = b.compareToIgnoreCase(n1.b);
        if (i == 0)
        {
            int k = c.compareToIgnoreCase(n1.c);
            i = k;
            if (k == 0)
            {
                int l = d.size() - n1.d.size();
                i = l;
                if (l == 0)
                {
                    TreeSet treeset1 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    treeset1.addAll(d.keySet());
                    TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    treeset.addAll(n1.d.keySet());
                    Iterator iterator = treeset1.iterator();
                    Iterator iterator1 = treeset.iterator();
                    while (iterator.hasNext()) 
                    {
                        String s1 = (String)iterator.next();
                        String s = (String)iterator1.next();
                        int j = s1.compareToIgnoreCase(s);
                        if (j != 0)
                        {
                            return j;
                        }
                        String s2 = (String)d.get(s1);
                        s1 = (String)n1.d.get(s);
                        s = s1;
                        if (s1 == null)
                        {
                            s = "";
                        }
                        j = s2.compareTo(s);
                        if (j != 0)
                        {
                            return j;
                        }
                    }
                    return 0;
                }
            }
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof n))
            {
                return false;
            }
            obj = (n)obj;
            if (!b.equalsIgnoreCase(((n) (obj)).b) || !c.equalsIgnoreCase(((n) (obj)).c) || !d.equals(((n) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final Charset getCharSet()
    {
        String s = getParameter("charset");
        if (s != null)
        {
            return Charset.forName(c(s));
        } else
        {
            return null;
        }
    }

    public final String getParameter(String s)
    {
        return (String)d.get(s);
    }

    public final Map getParameters()
    {
        return d;
    }

    public final double getQualityValue()
    {
        String s = getParameter("q");
        if (s != null)
        {
            return Double.parseDouble(c(s));
        } else
        {
            return 1.0D;
        }
    }

    public final String getSubtype()
    {
        return c;
    }

    public final String getType()
    {
        return b;
    }

    public final int hashCode()
    {
        return (b.hashCode() * 31 + c.hashCode()) * 31 + d.hashCode();
    }

    public final boolean includes(n n1)
    {
        if (n1 != null)
        {
            if (isWildcardType())
            {
                return true;
            }
            if (b.equals(n1.b))
            {
                if (c.equals(n1.c) || isWildcardSubtype())
                {
                    return true;
                }
                int i = c.indexOf('+');
                int j = n1.c.indexOf('+');
                if (i != -1 && j != -1)
                {
                    String s = c.substring(0, i);
                    if (c.substring(i + 1).equals(n1.c.substring(j + 1)) && "*".equals(s))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isCompatibleWith(n n1)
    {
        if (n1 != null)
        {
            if (isWildcardType() || n1.isWildcardType())
            {
                return true;
            }
            if (b.equals(n1.b))
            {
                if (c.equals(n1.c) || isWildcardSubtype() || n1.isWildcardSubtype())
                {
                    return true;
                }
                int i = c.indexOf('+');
                int j = n1.c.indexOf('+');
                if (i != -1 && j != -1)
                {
                    String s = c.substring(0, i);
                    String s1 = n1.c.substring(0, j);
                    if (c.substring(i + 1).equals(n1.c.substring(j + 1)) && ("*".equals(s) || "*".equals(s1)))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isConcrete()
    {
        return !isWildcardType() && !isWildcardSubtype();
    }

    public final boolean isWildcardSubtype()
    {
        return "*".equals(c);
    }

    public final boolean isWildcardType()
    {
        return "*".equals(b);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder);
        return stringbuilder.toString();
    }

    static 
    {
        BitSet bitset = new BitSet(128);
        for (int i = 0; i <= 31; i++)
        {
            bitset.set(i);
        }

        bitset.set(127);
        BitSet bitset1 = new BitSet(128);
        bitset1.set(40);
        bitset1.set(41);
        bitset1.set(60);
        bitset1.set(62);
        bitset1.set(64);
        bitset1.set(44);
        bitset1.set(59);
        bitset1.set(58);
        bitset1.set(92);
        bitset1.set(34);
        bitset1.set(47);
        bitset1.set(91);
        bitset1.set(93);
        bitset1.set(63);
        bitset1.set(61);
        bitset1.set(123);
        bitset1.set(125);
        bitset1.set(32);
        bitset1.set(9);
        BitSet bitset2 = new BitSet(128);
        a = bitset2;
        bitset2.set(0, 128);
        a.andNot(bitset);
        a.andNot(bitset1);
    }
}
