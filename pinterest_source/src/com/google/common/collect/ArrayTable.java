// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, ImmutableList, Table, ImmutableMap, 
//            ImmutableSet

public final class ArrayTable extends AbstractTable
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object array[][];
    private final ImmutableMap columnKeyToIndex;
    private final ImmutableList columnList;
    private transient ColumnMap columnMap;
    private final ImmutableMap rowKeyToIndex;
    private final ImmutableList rowList;
    private transient RowMap rowMap;

    private ArrayTable(ArrayTable arraytable)
    {
        rowList = arraytable.rowList;
        columnList = arraytable.columnList;
        rowKeyToIndex = arraytable.rowKeyToIndex;
        columnKeyToIndex = arraytable.columnKeyToIndex;
        Object aobj[][] = (Object[][])(Object[][])Array.newInstance(java/lang/Object, new int[] {
            rowList.size(), columnList.size()
        });
        array = aobj;
        eraseAll();
        for (int i = 0; i < rowList.size(); i++)
        {
            System.arraycopy(((Object) (arraytable.array[i])), 0, ((Object) (aobj[i])), 0, arraytable.array[i].length);
        }

    }

    private ArrayTable(Table table)
    {
        this(((Iterable) (table.rowKeySet())), ((Iterable) (table.columnKeySet())));
        putAll(table);
    }

    private ArrayTable(Iterable iterable, Iterable iterable1)
    {
        boolean flag1 = true;
        super();
        rowList = ImmutableList.copyOf(iterable);
        columnList = ImmutableList.copyOf(iterable1);
        boolean flag;
        if (!rowList.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (!columnList.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        rowKeyToIndex = index(rowList);
        columnKeyToIndex = index(columnList);
        array = (Object[][])(Object[][])Array.newInstance(java/lang/Object, new int[] {
            rowList.size(), columnList.size()
        });
        eraseAll();
    }

    public static ArrayTable create(Table table)
    {
        if (table instanceof ArrayTable)
        {
            return new ArrayTable((ArrayTable)table);
        } else
        {
            return new ArrayTable(table);
        }
    }

    public static ArrayTable create(Iterable iterable, Iterable iterable1)
    {
        return new ArrayTable(iterable, iterable1);
    }

    private static ImmutableMap index(List list)
    {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (int i = 0; i < list.size(); i++)
        {
            builder.put(list.get(i), Integer.valueOf(i));
        }

        return builder.build();
    }

    public final Object at(int i, int j)
    {
        Preconditions.checkElementIndex(i, rowList.size());
        Preconditions.checkElementIndex(j, columnList.size());
        return array[i][j];
    }

    final Iterator cellIterator()
    {
        return new _cls1(size());
    }

    public final Set cellSet()
    {
        return super.cellSet();
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public final Map column(Object obj)
    {
        Preconditions.checkNotNull(obj);
        obj = (Integer)columnKeyToIndex.get(obj);
        if (obj == null)
        {
            return ImmutableMap.of();
        } else
        {
            return new Column(((Integer) (obj)).intValue());
        }
    }

    public final ImmutableList columnKeyList()
    {
        return columnList;
    }

    public final ImmutableSet columnKeySet()
    {
        return columnKeyToIndex.keySet();
    }

    public final volatile Set columnKeySet()
    {
        return columnKeySet();
    }

    public final Map columnMap()
    {
        ColumnMap columnmap1 = columnMap;
        ColumnMap columnmap = columnmap1;
        if (columnmap1 == null)
        {
            columnmap = new ColumnMap(null);
            columnMap = columnmap;
        }
        return columnmap;
    }

    public final boolean contains(Object obj, Object obj1)
    {
        return containsRow(obj) && containsColumn(obj1);
    }

    public final boolean containsColumn(Object obj)
    {
        return columnKeyToIndex.containsKey(obj);
    }

    public final boolean containsRow(Object obj)
    {
        return rowKeyToIndex.containsKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        Object aobj[][];
        int i;
        int k;
        boolean flag1;
        flag1 = false;
        aobj = array;
        k = aobj.length;
        i = 0;
_L8:
        boolean flag = flag1;
        if (i >= k) goto _L2; else goto _L1
_L1:
        Object aobj1[];
        int j;
        int l;
        aobj1 = aobj[i];
        l = aobj1.length;
        j = 0;
_L6:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!Objects.equal(obj, aobj1[j])) goto _L4; else goto _L3
_L3:
        flag = true;
_L2:
        return flag;
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final Object erase(Object obj, Object obj1)
    {
        obj = (Integer)rowKeyToIndex.get(obj);
        obj1 = (Integer)columnKeyToIndex.get(obj1);
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return set(((Integer) (obj)).intValue(), ((Integer) (obj1)).intValue(), null);
        }
    }

    public final void eraseAll()
    {
        Object aobj[][] = array;
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Arrays.fill(aobj[i], null);
        }

    }

    public final Object get(Object obj, Object obj1)
    {
        obj = (Integer)rowKeyToIndex.get(obj);
        obj1 = (Integer)columnKeyToIndex.get(obj1);
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return at(((Integer) (obj)).intValue(), ((Integer) (obj1)).intValue());
        }
    }

    public final volatile int hashCode()
    {
        return super.hashCode();
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Object put(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Integer integer = (Integer)rowKeyToIndex.get(obj);
        boolean flag;
        if (integer != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Row %s not in %s", new Object[] {
            obj, rowList
        });
        obj = (Integer)columnKeyToIndex.get(obj1);
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Column %s not in %s", new Object[] {
            obj1, columnList
        });
        return set(integer.intValue(), ((Integer) (obj)).intValue(), obj2);
    }

    public final void putAll(Table table)
    {
        super.putAll(table);
    }

    public final Object remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final Map row(Object obj)
    {
        Preconditions.checkNotNull(obj);
        obj = (Integer)rowKeyToIndex.get(obj);
        if (obj == null)
        {
            return ImmutableMap.of();
        } else
        {
            return new Row(((Integer) (obj)).intValue());
        }
    }

    public final ImmutableList rowKeyList()
    {
        return rowList;
    }

    public final ImmutableSet rowKeySet()
    {
        return rowKeyToIndex.keySet();
    }

    public final volatile Set rowKeySet()
    {
        return rowKeySet();
    }

    public final Map rowMap()
    {
        RowMap rowmap1 = rowMap;
        RowMap rowmap = rowmap1;
        if (rowmap1 == null)
        {
            rowmap = new RowMap(null);
            rowMap = rowmap;
        }
        return rowmap;
    }

    public final Object set(int i, int j, Object obj)
    {
        Preconditions.checkElementIndex(i, rowList.size());
        Preconditions.checkElementIndex(j, columnList.size());
        Object obj1 = array[i][j];
        array[i][j] = obj;
        return obj1;
    }

    public final int size()
    {
        return rowList.size() * columnList.size();
    }

    public final Object[][] toArray(Class class1)
    {
        class1 = ((Class) ((Object[][])Array.newInstance(class1, new int[] {
            rowList.size(), columnList.size()
        })));
        for (int i = 0; i < rowList.size(); i++)
        {
            System.arraycopy(((Object) (array[i])), 0, class1[i], 0, array[i].length);
        }

        return class1;
    }

    public final volatile String toString()
    {
        return super.toString();
    }

    public final Collection values()
    {
        return super.values();
    }





    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class Column {}


    /* member class not found */
    class ColumnMap {}


    /* member class not found */
    class Row {}


    /* member class not found */
    class RowMap {}

}
