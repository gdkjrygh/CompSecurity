// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package b.a:
//            fo

public final class fn
{

    private static final Comparator a = new fo((byte)0);

    private static int a(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return j >= i ? 0 : 1;
    }

    public static int a(Comparable comparable, Comparable comparable1)
    {
        return comparable.compareTo(comparable1);
    }

    public static int a(List list, List list1)
    {
        int j;
        boolean flag;
        flag = false;
        j = a(list.size(), list1.size());
        if (j == 0) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        int i = 0;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= list.size())
            {
                continue;
            }
            j = a.compare(list.get(i), list1.get(i));
            if (j != 0)
            {
                return j;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int a(Map map, Map map1)
    {
        int i = a(map.size(), map1.size());
        if (i != 0)
        {
            return i;
        }
        TreeMap treemap = new TreeMap(a);
        treemap.putAll(map);
        map = treemap.entrySet().iterator();
        treemap = new TreeMap(a);
        treemap.putAll(map1);
        for (map1 = treemap.entrySet().iterator(); map.hasNext() && map1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            java.util.Map.Entry entry1 = (java.util.Map.Entry)map1.next();
            int j = a.compare(entry.getKey(), entry1.getKey());
            if (j != 0)
            {
                return j;
            }
            j = a.compare(entry.getValue(), entry1.getValue());
            if (j != 0)
            {
                return j;
            }
        }

        return 0;
    }

    public static int a(Set set, Set set1)
    {
        int i = a(set.size(), set1.size());
        if (i != 0)
        {
            return i;
        }
        TreeSet treeset = new TreeSet(a);
        treeset.addAll(set);
        set = new TreeSet(a);
        set.addAll(set1);
        set1 = treeset.iterator();
        for (set = set.iterator(); set1.hasNext() && set.hasNext();)
        {
            int j = a.compare(set1.next(), set.next());
            if (j != 0)
            {
                return j;
            }
        }

        return 0;
    }

    public static int a(byte abyte0[], byte abyte1[])
    {
        int i;
        boolean flag;
        flag = false;
        i = a(abyte0.length, abyte1.length);
        if (i == 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        int j = 0;
        do
        {
            i = ((flag) ? 1 : 0);
            if (j >= abyte0.length)
            {
                continue;
            }
            i = abyte0[j];
            byte byte0 = abyte1[j];
            if (i < byte0)
            {
                i = -1;
            } else
            if (byte0 < i)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                return i;
            }
            j++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void a(ByteBuffer bytebuffer, StringBuilder stringbuilder)
    {
        byte abyte0[] = bytebuffer.array();
        int i = bytebuffer.arrayOffset();
        int k = i + bytebuffer.position();
        int l = bytebuffer.limit() + i;
        int j;
        if (l - k > 128)
        {
            i = k + 128;
        } else
        {
            i = l;
        }
        for (j = k; j < i; j++)
        {
            if (j > k)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(Integer.toHexString((abyte0[j] | 0x100) & 0x1ff).toUpperCase().substring(1));
        }

        if (l != i)
        {
            stringbuilder.append("...");
        }
    }

}
