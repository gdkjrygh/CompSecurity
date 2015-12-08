// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package kik.a.d:
//            y

public final class v extends y
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    public v(Map map, int i)
    {
        Object aobj[] = (new ArrayList(map.keySet())).toArray();
        Arrays.sort(aobj);
        ArrayList arraylist = new ArrayList(Arrays.asList(aobj));
        LinkedHashMap linkedhashmap = new LinkedHashMap(map);
        Object obj;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); linkedhashmap.put(obj, map.get(obj)))
        {
            obj = iterator.next();
        }

        int j = 0x8aed9ca3;
        byte byte0 = 7;
        if (i == a.a)
        {
            j = 0xed81daad;
            byte0 = 13;
        }
        a(j);
        b(byte0);
        do
        {
            if (linkedhashmap.isEmpty())
            {
                break;
            }
            map = new y(linkedhashmap);
            map.a(j);
            map.b(byte0);
            Iterator iterator1 = map.entrySet().iterator();
            if (iterator1.hasNext())
            {
                iterator1.next();
                int k = map.hashCode() % map.size();
                i = k;
                if (k < 0)
                {
                    i = k + map.size();
                }
                map = ((Map) (arraylist.remove(i)));
                put(map, linkedhashmap.get(map));
                linkedhashmap.remove(map);
            }
        } while (true);
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        Iterator iterator = entrySet().iterator();
        boolean flag = true;
        java.util.Map.Entry entry;
        for (; iterator.hasNext(); stringbuffer.append(entry.getKey().toString()).append("=\"").append(entry.getValue().toString()).append("\""))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (!flag)
            {
                stringbuffer.append(" ");
            }
            flag = false;
        }

        return stringbuffer.toString();
    }
}
