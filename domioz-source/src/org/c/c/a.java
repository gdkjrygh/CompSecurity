// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;

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
import org.c.d.d;
import org.c.d.h;
import org.c.d.m;

// Referenced classes of package org.c.c:
//            b

public final class a
    implements Comparable
{

    public static final a ALL = valueOf("*");
    public static final String ALL_VALUE = "*";
    public static final a GZIP = valueOf("gzip");
    public static final String GZIP_VALUE = "gzip";
    public static final a IDENTITY = valueOf("identity");
    public static final String IDENTITY_VALUE = "identity";
    public static final Comparator QUALITY_VALUE_COMPARATOR = new b();
    private static final BitSet a;
    private final String b;
    private final Map c;

    public a(String s)
    {
        this(s, Collections.emptyMap());
    }

    public a(String s, double d1)
    {
        this(s, Collections.singletonMap("q", Double.toString(d1)));
    }

    public a(String s, Map map)
    {
        org.c.d.a.hasLength(s, "'type' must not be empty");
        a(s);
        b = s.toLowerCase(Locale.ENGLISH);
        if (!d.isEmpty(map))
        {
            s = new h(map.size(), Locale.ENGLISH);
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)map.next();
                String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (String)((java.util.Map.Entry) (obj)).getValue();
                org.c.d.a.hasLength(s1, "parameter attribute must not be empty");
                org.c.d.a.hasLength(((String) (obj)), "parameter value must not be empty");
                a(s1);
                if ("q".equals(s1))
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
                if (!b(((String) (obj))))
                {
                    a(((String) (obj)));
                }
                s.put(s1, c(((String) (obj))));
            }
            c = Collections.unmodifiableMap(s);
            return;
        } else
        {
            c = Collections.emptyMap();
            return;
        }
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
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); stringbuilder.append((String)entry.getValue()))
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

    public static a parseCodingType(String s)
    {
        int i = 1;
        org.c.d.a.hasLength(s, "'codingType' must not be empty");
        String as[] = m.tokenizeToStringArray(s, ";");
        String s1 = as[0].trim();
        if (as.length > 1)
        {
            s = new LinkedHashMap(as.length - 1);
            for (; i < as.length; i++)
            {
                String s2 = as[i];
                int j = s2.indexOf('=');
                if (j != -1)
                {
                    s.put(s2.substring(0, j), s2.substring(j + 1, s2.length()));
                }
            }

        } else
        {
            s = null;
        }
        return new a(s1, s);
    }

    public static List parseCodingTypes(String s)
    {
        if (m.hasLength(s)) goto _L2; else goto _L1
_L1:
        s = Collections.emptyList();
_L4:
        return s;
_L2:
        String as[] = s.split(",");
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
            arraylist.add(parseCodingType(as[i]));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void sortByQualityValue(List list)
    {
        org.c.d.a.notNull(list, "'codingTypes' must not be null");
        if (list.size() > 1)
        {
            Collections.sort(list, QUALITY_VALUE_COMPARATOR);
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
            ((a)collection.next()).a(stringbuilder);
            if (collection.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static a valueOf(String s)
    {
        return parseCodingType(s);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((a)obj);
    }

    public final int compareTo(a a1)
    {
        int i = b.compareToIgnoreCase(a1.b);
        if (i == 0)
        {
            int k = c.size() - a1.c.size();
            i = k;
            if (k == 0)
            {
                TreeSet treeset1 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeset1.addAll(c.keySet());
                TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeset.addAll(a1.c.keySet());
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
                    String s2 = (String)c.get(s1);
                    s1 = (String)a1.c.get(s);
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
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (!b.equalsIgnoreCase(((a) (obj)).b) || !c.equals(((a) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public final String getParameter(String s)
    {
        return (String)c.get(s);
    }

    public final double getQualityValue()
    {
        String s = getParameter("q");
        if (s != null)
        {
            return Double.parseDouble(s);
        } else
        {
            return 1.0D;
        }
    }

    public final String getType()
    {
        return b;
    }

    public final int hashCode()
    {
        return b.hashCode() * 31 + c.hashCode();
    }

    public final boolean includes(a a1)
    {
        if (a1 != null)
        {
            if (isWildcardType())
            {
                return true;
            }
            if (b.equals(a1.b))
            {
                return true;
            }
        }
        return false;
    }

    public final boolean isCompatibleWith(a a1)
    {
        if (a1 != null)
        {
            if (isWildcardType() || a1.isWildcardType())
            {
                return true;
            }
            if (b.equals(a1.b))
            {
                return true;
            }
        }
        return false;
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
