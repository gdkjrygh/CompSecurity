// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;

import android.text.TextUtils;
import com.soundcloud.propeller.schema.Column;
import com.soundcloud.propeller.schema.Table;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.soundcloud.propeller.query:
//            WhereDelegate, Filter, ColumnFunction, ColumnFunctions, 
//            Where, QueryHelper

public final class Query extends WhereDelegate
{
    private static class Join
    {

        private final String joinType;
        private final String table;
        private final String where;




        Join(String s, String s1, Where where1)
        {
            this(s, s1, QueryHelper.resolveArguments(where1.build(), where1.getArguments()));
        }

        Join(String s, String s1, String s2)
        {
            table = s;
            joinType = s1;
            where = s2;
        }
    }

    public static final class Order extends Enum
    {

        private static final Order $VALUES[];
        public static final Order ASC;
        public static final Order DESC;

        public static Order valueOf(String s)
        {
            return (Order)Enum.valueOf(com/soundcloud/propeller/query/Query$Order, s);
        }

        public static Order[] values()
        {
            return (Order[])$VALUES.clone();
        }

        static 
        {
            ASC = new Order("ASC", 0);
            DESC = new Order("DESC", 1);
            $VALUES = (new Order[] {
                ASC, DESC
            });
        }

        private Order(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String EQ = " = ";
    private static final String INNER_JOIN = "INNER JOIN";
    private static final String LEFT_JOIN = "LEFT JOIN";
    private static final int NOT_SET = -1;
    private String groupBy[];
    private final List joins;
    private int limit;
    private int offset;
    private StringBuilder order;
    private Object projection[];
    private final String tables[];

    public Query(Table atable[])
    {
        super(Filter.filter());
        joins = new ArrayList();
        offset = -1;
        tables = new String[atable.length];
        for (int i = 0; i < atable.length; i++)
        {
            tables[i] = atable[i].name();
        }

    }

    private transient Query(String as[])
    {
        super(Filter.filter());
        joins = new ArrayList();
        offset = -1;
        tables = as;
    }

    public static Query apply(ColumnFunction columnfunction)
    {
        return (new Query(new String[0])).select(new Object[] {
            columnfunction
        });
    }

    private void buildGroupByClause(StringBuilder stringbuilder)
    {
        if (groupBy != null && groupBy.length > 0)
        {
            stringbuilder.append(" GROUP BY ").append(TextUtils.join(",", groupBy));
        }
    }

    private void buildJoinClause(StringBuilder stringbuilder)
    {
        Join join;
        for (Iterator iterator = joins.iterator(); iterator.hasNext(); stringbuilder.append(' ').append(join.joinType).append(' ').append(join.table).append(" ON ").append(join.where))
        {
            join = (Join)iterator.next();
        }

    }

    private void buildLimitClause(StringBuilder stringbuilder)
    {
        String s = resolveLimit();
        if (s != null)
        {
            stringbuilder.append(" LIMIT ").append(s);
        }
    }

    private void buildOrderClause(StringBuilder stringbuilder)
    {
        if (order != null && order.length() > 0)
        {
            stringbuilder.append(" ORDER BY ").append(order.toString());
        }
    }

    private void buildSelectClause(StringBuilder stringbuilder)
    {
        int i = 0;
        stringbuilder.append("SELECT ");
        String as[];
        if (projection == null)
        {
            as = new String[1];
            as[0] = "*";
        } else
        {
            int j = projection.length;
            as = new String[j];
            while (i < j) 
            {
                Object obj = projection[i];
                if (obj instanceof Column)
                {
                    as[i] = ((Column)obj).asFullName();
                } else
                if (obj instanceof ColumnFunction)
                {
                    as[i] = ((ColumnFunction)obj).build();
                } else
                {
                    as[i] = obj.toString();
                }
                i++;
            }
        }
        stringbuilder.append(TextUtils.join(",", as));
        if (tables.length > 0)
        {
            stringbuilder.append(" FROM ").append(TextUtils.join(",", tables));
        }
    }

    private void buildWhereClause(StringBuilder stringbuilder)
    {
        String s = ((Filter)whereDelegate).getSelection();
        if (!TextUtils.isEmpty(s))
        {
            stringbuilder.append(" WHERE ").append(s);
        }
    }

    public static Query count(Table table)
    {
        return count(table.name());
    }

    public static Query count(Table table, Column column)
    {
        return count(table.name(), column.qualifiedName());
    }

    public static Query count(String s)
    {
        return (new Query(new String[] {
            s
        })).select(new Object[] {
            ColumnFunctions.count("*")
        });
    }

    public static Query count(String s, String s1)
    {
        return (new Query(new String[] {
            s
        })).select(new Object[] {
            ColumnFunctions.count(s1)
        });
    }

    public static transient Query from(Table atable[])
    {
        return new Query(atable);
    }

    public static transient Query from(String as[])
    {
        return new Query(as);
    }

    public static Where on(Column column, Column column1)
    {
        return on(column.qualifiedName(), column1.qualifiedName());
    }

    public static Where on(String s, String s1)
    {
        return Filter.filter().whereEq(s, s1);
    }

    private String resolveLimit()
    {
        String s = null;
        if (limit > 0 && offset == -1)
        {
            s = Long.toString(limit);
        } else
        if (limit > 0)
        {
            return String.format(Locale.US, "%d,%d", new Object[] {
                Integer.valueOf(offset), Integer.valueOf(limit)
            });
        }
        return s;
    }

    public final String build()
    {
        StringBuilder stringbuilder = new StringBuilder(256);
        buildSelectClause(stringbuilder);
        buildJoinClause(stringbuilder);
        buildWhereClause(stringbuilder);
        buildGroupByClause(stringbuilder);
        buildOrderClause(stringbuilder);
        buildLimitClause(stringbuilder);
        return stringbuilder.toString();
    }

    public final volatile String[] getArguments()
    {
        return super.getArguments();
    }

    public final Object[] getProjection()
    {
        return projection;
    }

    public final volatile String getSelection()
    {
        return super.getSelection();
    }

    public final transient Query groupBy(Column acolumn[])
    {
        groupBy = new String[acolumn.length];
        for (int i = 0; i < acolumn.length; i++)
        {
            groupBy[i] = acolumn[i].qualifiedName();
        }

        return this;
    }

    public final transient Query groupBy(String as[])
    {
        groupBy = as;
        return this;
    }

    public final Query innerJoin(Table table, Where where1)
    {
        return innerJoin(table.name(), where1);
    }

    public final Query innerJoin(Table table, Column column, Column column1)
    {
        return innerJoin(table.name(), column.qualifiedName(), column1.qualifiedName());
    }

    public final Query innerJoin(String s, Where where1)
    {
        if (where1.getSelection() != null)
        {
            joins.add(new Join(s, "INNER JOIN", where1));
        }
        return this;
    }

    public final Query innerJoin(String s, String s1, String s2)
    {
        joins.add(new Join(s, "INNER JOIN", (new StringBuilder()).append(s1).append(" = ").append(s2).toString()));
        return this;
    }

    public final Query joinOn(String s, String s1)
    {
        where((new StringBuilder()).append(s).append(" = ").append(s1).toString(), new Object[0]);
        return this;
    }

    public final Query leftJoin(Table table, Where where1)
    {
        return leftJoin(table.name(), where1);
    }

    public final Query leftJoin(Table table, Column column, Column column1)
    {
        return leftJoin(table.name(), column.qualifiedName(), column1.qualifiedName());
    }

    public final Query leftJoin(String s, Where where1)
    {
        if (where1.getSelection() != null)
        {
            joins.add(new Join(s, "LEFT JOIN", where1));
        }
        return this;
    }

    public final Query leftJoin(String s, String s1, String s2)
    {
        joins.add(new Join(s, "LEFT JOIN", (new StringBuilder()).append(s1).append(" = ").append(s2).toString()));
        return this;
    }

    public final Query limit(int i)
    {
        limit = i;
        return this;
    }

    public final Query limit(int i, int j)
    {
        limit = i;
        offset = j;
        return this;
    }

    public final Query order(Column column, Order order1)
    {
        return order(column.qualifiedName(), order1);
    }

    public final Query order(String s, Order order1)
    {
        if (order == null)
        {
            order = new StringBuilder();
        } else
        {
            order.append(", ");
        }
        order.append(s);
        order.append(' ');
        order.append(order1);
        return this;
    }

    public final transient Query select(Object aobj[])
    {
        projection = aobj;
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if ((obj instanceof Where) && ((Where)obj).getArguments() != null)
            {
                ((Filter)whereDelegate).appendArguments(((Where)obj).getArguments());
            }
        }

        return this;
    }

    public final String toString()
    {
        return QueryHelper.resolveArguments(build(), getArguments());
    }

    public final Query where(Where where1)
    {
        where(where1.build(), ((Object []) (where1.getArguments())));
        return this;
    }
}
