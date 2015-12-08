// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Strings
{

    private static final int DEFAULT_BUFFER_SIZE = 4096;

    public Strings()
    {
    }

    public static String capitalize(String s)
    {
        String s1 = toString(s);
        if (s1.length() >= 2)
        {
            s = (new StringBuilder()).append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1)).toString();
        } else
        {
            s = s1;
            if (s1.length() >= 1)
            {
                return s1.toUpperCase();
            }
        }
        return s;
    }

    public static String[] chunk(String s, int i)
    {
        if (!isEmpty(s) && i != 0) goto _L2; else goto _L1
_L1:
        String as[] = new String[0];
_L4:
        return as;
_L2:
        int l = s.length();
        int i1 = (l - 1) / i + 1;
        String as1[] = new String[i1];
        int j = 0;
        do
        {
            as = as1;
            if (j >= i1)
            {
                continue;
            }
            int k;
            if (j * i + i < l)
            {
                k = j * i + i;
            } else
            {
                k = l;
            }
            as1[j] = s.substring(j * i, k);
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int copy(Reader reader, Writer writer)
    {
        long l = copyLarge(reader, writer);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static long copyLarge(Reader reader, Writer writer)
        throws RuntimeException
    {
        long l;
        char ac[];
        int i;
        try
        {
            ac = new char[4096];
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new RuntimeException(reader);
        }
        l = 0L;
        i = reader.read(ac);
        if (-1 == i)
        {
            break; /* Loop/switch isn't completed */
        }
        writer.write(ac, 0, i);
        l += i;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_9;
_L1:
        return l;
    }

    public static boolean equals(Object obj, Object obj1)
    {
        return toString(obj).equals(toString(obj1));
    }

    public static boolean equalsIgnoreCase(Object obj, Object obj1)
    {
        return toString(obj).toLowerCase().equals(toString(obj1).toLowerCase());
    }

    public static boolean isEmpty(Object obj)
    {
        return toString(obj).trim().length() == 0;
    }

    public static String join(String s, Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return "";
        }
        collection = collection.iterator();
        StringBuilder stringbuilder = new StringBuilder(toString(collection.next()));
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Object obj = collection.next();
            if (notEmpty(obj))
            {
                stringbuilder.append(s).append(toString(obj));
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static transient String join(String s, Object aobj[])
    {
        return join(s, ((Collection) (Arrays.asList(aobj))));
    }

    public static String joinAnd(String s, String s1, Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return "";
        }
        Iterator iterator = collection.iterator();
        StringBuilder stringbuilder = new StringBuilder(toString(iterator.next()));
        int i = 1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = iterator.next();
            if (notEmpty(obj))
            {
                i++;
                String s2;
                if (i == collection.size())
                {
                    s2 = s1;
                } else
                {
                    s2 = s;
                }
                stringbuilder.append(s2).append(toString(obj));
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static transient String joinAnd(String s, String s1, Object aobj[])
    {
        return joinAnd(s, s1, ((Collection) (Arrays.asList(aobj))));
    }

    public static String md5(String s)
    {
        StringBuilder stringbuilder;
        int i;
        String s1;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
            stringbuilder = new StringBuilder();
            j = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1 = Integer.toHexString(s[i]);
        if (s1.length() == 1)
        {
            stringbuilder.append('0');
            stringbuilder.append(s1.charAt(s1.length() - 1));
            break MISSING_BLOCK_LABEL_110;
        }
        stringbuilder.append(s1.substring(s1.length() - 2));
        break MISSING_BLOCK_LABEL_110;
        s = stringbuilder.toString();
        return s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String namedFormat(String s, Map map)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            s = s.replace((new StringBuilder()).append('$').append(s1).toString(), (CharSequence)map.get(s1));
        }

        return s;
    }

    public static transient String namedFormat(String s, Object aobj[])
    {
        if (aobj.length % 2 != 0)
        {
            throw new InvalidParameterException("You must include one value for each parameter");
        }
        HashMap hashmap = new HashMap(aobj.length / 2);
        for (int i = 0; i < aobj.length; i += 2)
        {
            hashmap.put(toString(aobj[i]), toString(aobj[i + 1]));
        }

        return namedFormat(s, ((Map) (hashmap)));
    }

    public static boolean notEmpty(Object obj)
    {
        return toString(obj).trim().length() != 0;
    }

    public static String toString(InputStream inputstream)
    {
        StringWriter stringwriter = new StringWriter();
        copy(new InputStreamReader(inputstream), stringwriter);
        return stringwriter.toString();
    }

    public static String toString(Reader reader)
    {
        StringWriter stringwriter = new StringWriter();
        copy(reader, stringwriter);
        return stringwriter.toString();
    }

    public static String toString(Object obj)
    {
        return toString(obj, "");
    }

    public static String toString(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        }
        if (obj instanceof InputStream)
        {
            return toString((InputStream)obj);
        }
        if (obj instanceof Reader)
        {
            return toString((Reader)obj);
        }
        if (obj instanceof Object[])
        {
            return join(", ", (Object[])(Object[])obj);
        }
        if (obj instanceof Collection)
        {
            return join(", ", (Collection)obj);
        } else
        {
            return obj.toString();
        }
    }
}
