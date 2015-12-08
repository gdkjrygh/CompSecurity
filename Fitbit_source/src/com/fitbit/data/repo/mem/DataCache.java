// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DataCache
{
    public static final class DataType extends Enum
    {

        public static final DataType a;
        public static final DataType b;
        public static final DataType c;
        private static final DataType d[];

        public static DataType valueOf(String s)
        {
            return (DataType)Enum.valueOf(com/fitbit/data/repo/mem/DataCache$DataType, s);
        }

        public static DataType[] values()
        {
            return (DataType[])d.clone();
        }

        static 
        {
            a = new DataType("ACTIVITY_SUMMARY_ITEM", 0);
            b = new DataType("DEVICE_TYPES", 1);
            c = new DataType("FOOD_LOG_ENTRY", 2);
            d = (new DataType[] {
                a, b, c
            });
        }

        private DataType(String s, int i)
        {
            super(s, i);
        }
    }


    private static DataCache a;
    private final Map b = new HashMap();
    private boolean c;

    private DataCache()
    {
        g();
    }

    public static DataCache a()
    {
        com/fitbit/data/repo/mem/DataCache;
        JVM INSTR monitorenter ;
        DataCache datacache;
        if (a == null)
        {
            a = new DataCache();
        }
        datacache = a;
        com/fitbit/data/repo/mem/DataCache;
        JVM INSTR monitorexit ;
        return datacache;
        Exception exception;
        exception;
        throw exception;
    }

    private void g()
    {
        DataType adatatype[] = (DataType[])com/fitbit/data/repo/mem/DataCache$DataType.getEnumConstants();
        int j = adatatype.length;
        for (int i = 0; i < j; i++)
        {
            DataType datatype = adatatype[i];
            b.put(datatype, new ArrayList());
        }

    }

    public void a(List list)
    {
        b.put(DataType.b, list);
    }

    public List b()
    {
        List list = (List)b.get(DataType.a);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(DataType.a, obj);
        }
        return ((List) (obj));
    }

    public void b(List list)
    {
        b.put(DataType.c, list);
    }

    public List c()
    {
        return (List)b.get(DataType.b);
    }

    public List d()
    {
        return (List)b.get(DataType.c);
    }

    public boolean e()
    {
        if (!c)
        {
            for (Iterator iterator = b.values().iterator(); iterator.hasNext();)
            {
                if (!((List)iterator.next()).isEmpty())
                {
                    c = true;
                    return true;
                }
            }

            c = false;
            return false;
        } else
        {
            return c;
        }
    }

    public void f()
    {
        g();
    }
}
