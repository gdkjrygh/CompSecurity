// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Table, Sets

public final class Tables
{
    static abstract class AbstractCell
        implements Table.Cell
    {

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof Table.Cell)
                {
                    if (!Objects.equal(getRowKey(), ((Table.Cell) (obj = (Table.Cell)obj)).getRowKey()) || !Objects.equal(getColumnKey(), ((Table.Cell) (obj)).getColumnKey()) || !Objects.equal(getValue(), ((Table.Cell) (obj)).getValue()))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                getRowKey(), getColumnKey(), getValue()
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("(").append(getRowKey()).append(",").append(getColumnKey()).append(")=").append(getValue()).toString();
        }

        AbstractCell()
        {
        }
    }

    private static class ImmutableCell extends AbstractCell
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object columnKey;
        final Object rowKey;
        final Object value;

        public Object getColumnKey()
        {
            return columnKey;
        }

        public Object getRowKey()
        {
            return rowKey;
        }

        public Object getValue()
        {
            return value;
        }

        ImmutableCell(Object obj, Object obj1, Object obj2)
        {
            rowKey = obj;
            columnKey = obj1;
            value = obj2;
        }
    }

    private static class TransposeTable
        implements Table
    {

        private static final Function TRANSPOSE_CELL = new Function() {

            public Table.Cell apply(Table.Cell cell)
            {
                return Tables.immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
            }

            public volatile Object apply(Object obj)
            {
                return apply((Table.Cell)obj);
            }

        };
        CellSet cellSet;
        final Table original;

        public Set cellSet()
        {
            CellSet cellset1 = cellSet;
            CellSet cellset = cellset1;
            if (cellset1 == null)
            {
                cellset = new CellSet();
                cellSet = cellset;
            }
            return cellset;
        }

        public void clear()
        {
            original.clear();
        }

        public Map column(Object obj)
        {
            return original.row(obj);
        }

        public Set columnKeySet()
        {
            return original.rowKeySet();
        }

        public Map columnMap()
        {
            return original.rowMap();
        }

        public boolean contains(Object obj, Object obj1)
        {
            return original.contains(obj1, obj);
        }

        public boolean containsColumn(Object obj)
        {
            return original.containsRow(obj);
        }

        public boolean containsRow(Object obj)
        {
            return original.containsColumn(obj);
        }

        public boolean containsValue(Object obj)
        {
            return original.containsValue(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof Table)
            {
                obj = (Table)obj;
                return cellSet().equals(((Table) (obj)).cellSet());
            } else
            {
                return false;
            }
        }

        public Object get(Object obj, Object obj1)
        {
            return original.get(obj1, obj);
        }

        public int hashCode()
        {
            return cellSet().hashCode();
        }

        public boolean isEmpty()
        {
            return original.isEmpty();
        }

        public Object put(Object obj, Object obj1, Object obj2)
        {
            return original.put(obj1, obj, obj2);
        }

        public void putAll(Table table)
        {
            original.putAll(Tables.transpose(table));
        }

        public Object remove(Object obj, Object obj1)
        {
            return original.remove(obj1, obj);
        }

        public Map row(Object obj)
        {
            return original.column(obj);
        }

        public Set rowKeySet()
        {
            return original.columnKeySet();
        }

        public Map rowMap()
        {
            return original.columnMap();
        }

        public int size()
        {
            return original.size();
        }

        public String toString()
        {
            return rowMap().toString();
        }

        public Collection values()
        {
            return original.values();
        }



        TransposeTable(Table table)
        {
            original = (Table)Preconditions.checkNotNull(table);
        }
    }

    class TransposeTable.CellSet extends Collections2.TransformedCollection
        implements Set
    {

        final TransposeTable this$0;

        public boolean contains(Object obj)
        {
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                return original.cellSet().contains(Tables.immutableCell(((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getRowKey(), ((Table.Cell) (obj)).getValue()));
            } else
            {
                return false;
            }
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof Set)
                {
                    obj = (Set)obj;
                    flag = flag1;
                    if (((Set) (obj)).size() == size())
                    {
                        return containsAll(((Collection) (obj)));
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Sets.hashCodeImpl(this);
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof Table.Cell)
            {
                obj = (Table.Cell)obj;
                return original.cellSet().remove(Tables.immutableCell(((Table.Cell) (obj)).getColumnKey(), ((Table.Cell) (obj)).getRowKey(), ((Table.Cell) (obj)).getValue()));
            } else
            {
                return false;
            }
        }

        TransposeTable.CellSet()
        {
            this$0 = TransposeTable.this;
            super(original.cellSet(), TransposeTable.TRANSPOSE_CELL);
        }
    }


    private Tables()
    {
    }

    public static Table.Cell immutableCell(Object obj, Object obj1, Object obj2)
    {
        return new ImmutableCell(obj, obj1, obj2);
    }

    public static Table transpose(Table table)
    {
        if (table instanceof TransposeTable)
        {
            return ((TransposeTable)table).original;
        } else
        {
            return new TransposeTable(table);
        }
    }
}
