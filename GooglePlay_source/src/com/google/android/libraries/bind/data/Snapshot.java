// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.libraries.bind.data:
//            Data, DataException

public final class Snapshot
{

    static final List INVALID_LIST = Collections.unmodifiableList(Collections.emptyList());
    private static final Map INVALID_MAP = Collections.emptyMap();
    final DataException exception;
    public final List list;
    public final int primaryKey;
    final Map primaryKeyIndex;

    Snapshot(int i)
    {
        primaryKey = i;
        list = INVALID_LIST;
        primaryKeyIndex = INVALID_MAP;
        exception = null;
    }

    public Snapshot(int i, DataException dataexception)
    {
        primaryKey = i;
        exception = dataexception;
        list = INVALID_LIST;
        primaryKeyIndex = INVALID_MAP;
    }

    public Snapshot(int i, List list1)
    {
        this(i, list1, indexByKey(list1, i));
    }

    private Snapshot(int i, List list1, Map map)
    {
        primaryKey = i;
        list = Collections.unmodifiableList(list1);
        primaryKeyIndex = map;
        exception = null;
        for (list1 = list1.iterator(); list1.hasNext();)
        {
            ((Data)list1.next()).frozen = true;
        }

    }

    private static Map indexByKey(List list1, int i)
    {
        if (list1 != null) goto _L2; else goto _L1
_L1:
        Object obj = INVALID_MAP;
_L4:
        return ((Map) (obj));
_L2:
        if (list1.size() == 0)
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        int j = 0;
        do
        {
            obj = hashmap;
            if (j >= list1.size())
            {
                continue;
            }
            obj = (Data)list1.get(j);
            if (obj == null)
            {
                throw new IllegalStateException(String.format("Entry %d has no data", new Object[] {
                    Integer.valueOf(j)
                }));
            }
            obj = ((Data) (obj)).get(i);
            if (obj == null)
            {
                throw new IllegalStateException(String.format("Entry %d has an empty primary key %s - %s", new Object[] {
                    Integer.valueOf(j), Data.keyName(i), ((Data)list1.get(j)).toString()
                }));
            }
            Object obj1 = hashmap.put(obj, Integer.valueOf(j));
            if (obj1 != null)
            {
                throw new IllegalStateException(String.format("Duplicate entries for primary key %s, value %s (class %s), positions %s and %s", new Object[] {
                    Data.keyName(i), obj, obj.getClass().getSimpleName(), obj1, Integer.valueOf(j)
                }));
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int getCount()
    {
        return list.size();
    }

    public final boolean hasException()
    {
        return exception != null;
    }

    public final boolean isInvalidPosition(int i)
    {
        return i < 0 || i >= list.size();
    }

    public final String toString()
    {
        Locale locale = Locale.US;
        String s1 = getClass().getSimpleName();
        String s2 = Data.keyName(primaryKey);
        int i = getCount();
        String s;
        if (hasException())
        {
            s = exception.getMessage();
        } else
        {
            s = "no";
        }
        return String.format(locale, "%s - primaryKey: %s, size: %d, exception: %s", new Object[] {
            s1, s2, Integer.valueOf(i), s
        });
    }

}
