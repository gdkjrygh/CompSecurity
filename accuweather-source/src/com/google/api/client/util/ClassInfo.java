// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;

// Referenced classes of package com.google.api.client.util:
//            Preconditions, FieldInfo

public final class ClassInfo
{

    private static final Map CACHE = new WeakHashMap();
    private static final Map CACHE_IGNORE_CASE = new WeakHashMap();
    private final Class clazz;
    private final boolean ignoreCase;
    private final IdentityHashMap nameToFieldInfoMap = new IdentityHashMap();
    final List names;

    private ClassInfo(Class class1, boolean flag)
    {
        clazz = class1;
        ignoreCase = flag;
        TreeSet treeset;
        Field afield[];
        int i;
        int j;
        boolean flag1;
        if (!flag || !class1.isEnum())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, (new StringBuilder()).append("cannot ignore case on an enum: ").append(class1).toString());
        treeset = new TreeSet(new Comparator() {

            final ClassInfo this$0;

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((String)obj1, (String)obj2);
            }

            public int compare(String s3, String s4)
            {
                if (s3 == s4)
                {
                    return 0;
                }
                if (s3 == null)
                {
                    return -1;
                }
                if (s4 == null)
                {
                    return 1;
                } else
                {
                    return s3.compareTo(s4);
                }
            }

            
            {
                this$0 = ClassInfo.this;
                super();
            }
        });
        afield = class1.getDeclaredFields();
        j = afield.length;
        i = 0;
        while (i < j) 
        {
            Field field = afield[i];
            FieldInfo fieldinfo = FieldInfo.of(field);
            if (fieldinfo != null)
            {
                String s1 = fieldinfo.getName();
                String s = s1;
                if (flag)
                {
                    s = s1.toLowerCase().intern();
                }
                Object obj = (FieldInfo)nameToFieldInfoMap.get(s);
                boolean flag2;
                if (obj == null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag)
                {
                    s1 = "case-insensitive ";
                } else
                {
                    s1 = "";
                }
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((FieldInfo) (obj)).getField();
                }
                Preconditions.checkArgument(flag2, "two fields have the same %sname <%s>: %s and %s", new Object[] {
                    s1, s, field, obj
                });
                nameToFieldInfoMap.put(s, fieldinfo);
                treeset.add(s);
            }
            i++;
        }
        class1 = class1.getSuperclass();
        if (class1 != null)
        {
            class1 = of(class1, flag);
            treeset.addAll(((ClassInfo) (class1)).names);
            class1 = ((ClassInfo) (class1)).nameToFieldInfoMap.entrySet().iterator();
            do
            {
                if (!class1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)class1.next();
                String s2 = (String)entry.getKey();
                if (!nameToFieldInfoMap.containsKey(s2))
                {
                    nameToFieldInfoMap.put(s2, entry.getValue());
                }
            } while (true);
        }
        if (treeset.isEmpty())
        {
            class1 = Collections.emptyList();
        } else
        {
            class1 = Collections.unmodifiableList(new ArrayList(treeset));
        }
        names = class1;
    }

    public static ClassInfo of(Class class1)
    {
        return of(class1, false);
    }

    public static ClassInfo of(Class class1, boolean flag)
    {
        if (class1 == null)
        {
            return null;
        }
        Map map;
        ClassInfo classinfo;
        ClassInfo classinfo1;
        if (flag)
        {
            map = CACHE_IGNORE_CASE;
        } else
        {
            map = CACHE;
        }
        map;
        JVM INSTR monitorenter ;
        classinfo1 = (ClassInfo)map.get(class1);
        classinfo = classinfo1;
        if (classinfo1 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        classinfo = new ClassInfo(class1, flag);
        map.put(class1, classinfo);
        map;
        JVM INSTR monitorexit ;
        return classinfo;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public Field getField(String s)
    {
        s = getFieldInfo(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getField();
        }
    }

    public FieldInfo getFieldInfo(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (ignoreCase)
            {
                s1 = s.toLowerCase();
            }
            s1 = s1.intern();
        }
        return (FieldInfo)nameToFieldInfoMap.get(s1);
    }

    public Collection getFieldInfos()
    {
        return Collections.unmodifiableCollection(nameToFieldInfoMap.values());
    }

    public final boolean getIgnoreCase()
    {
        return ignoreCase;
    }

    public Collection getNames()
    {
        return names;
    }

    public Class getUnderlyingClass()
    {
        return clazz;
    }

    public boolean isEnum()
    {
        return clazz.isEnum();
    }

}
