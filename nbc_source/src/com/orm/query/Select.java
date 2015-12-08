// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm.query;

import com.orm.SugarRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.orm.query:
//            Condition

public class Select
    implements Iterable
{

    private List args;
    private String arguments[];
    private String groupBy;
    private String limit;
    private String offset;
    private String orderBy;
    private Class record;
    private String whereClause;

    public Select(Class class1)
    {
        whereClause = "";
        args = new ArrayList();
        record = class1;
    }

    private String[] convertArgs(List list1)
    {
        String as[] = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++)
        {
            as[i] = list1.get(i).toString();
        }

        return as;
    }

    public static Select from(Class class1)
    {
        return new Select(class1);
    }

    private void mergeConditions(Condition acondition[], Condition.Type type)
    {
        int j = acondition.length;
        int i = 0;
        while (i < j) 
        {
            Condition condition = acondition[i];
            if (!"".equals(whereClause))
            {
                whereClause = (new StringBuilder()).append(whereClause).append(" ").append(type.name()).append(" ").toString();
            }
            if (Condition.Check.LIKE.equals(condition.getCheck()) || Condition.Check.NOT_LIKE.equals(condition.getCheck()))
            {
                whereClause = (new StringBuilder()).append(whereClause).append(condition.getProperty()).append(condition.getCheckSymbol()).append("'").append(condition.getValue().toString()).append("'").toString();
            } else
            {
                whereClause = (new StringBuilder()).append(whereClause).append(condition.getProperty()).append(condition.getCheckSymbol()).append("? ").toString();
                args.add(condition.getValue());
            }
            i++;
        }
    }

    public transient Select and(Condition acondition[])
    {
        mergeConditions(acondition, Condition.Type.AND);
        return this;
    }

    public long count()
    {
        if (arguments == null)
        {
            arguments = convertArgs(args);
        }
        return SugarRecord.count(record, whereClause, arguments, groupBy, orderBy, limit);
    }

    public SugarRecord first()
    {
        if (arguments == null)
        {
            arguments = convertArgs(args);
        }
        List list1 = SugarRecord.find(record, whereClause, arguments, groupBy, orderBy, "1");
        if (list1.size() > 0)
        {
            return (SugarRecord)list1.get(0);
        } else
        {
            return null;
        }
    }

    String[] getArgs()
    {
        return convertArgs(args);
    }

    String getWhereCond()
    {
        return whereClause;
    }

    public Select groupBy(String s)
    {
        groupBy = s;
        return this;
    }

    public Iterator iterator()
    {
        if (arguments == null)
        {
            arguments = convertArgs(args);
        }
        return SugarRecord.findAsIterator(record, whereClause, arguments, groupBy, orderBy, limit);
    }

    public Select limit(String s)
    {
        limit = s;
        return this;
    }

    public List list()
    {
        if (arguments == null)
        {
            arguments = convertArgs(args);
        }
        return SugarRecord.find(record, whereClause, arguments, groupBy, orderBy, limit);
    }

    public transient Select or(Condition acondition[])
    {
        mergeConditions(acondition, Condition.Type.OR);
        return this;
    }

    public Select orderBy(String s)
    {
        orderBy = s;
        return this;
    }

    String toSql()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SELECT * FROM");
        stringbuilder.append("FROM ");
        stringbuilder.append((new StringBuilder()).append(SugarRecord.getTableName(record)).append(" ").toString());
        if (whereClause != null)
        {
            stringbuilder.append((new StringBuilder()).append("WHERE ").append(whereClause).append(" ").toString());
        }
        if (orderBy != null)
        {
            stringbuilder.append((new StringBuilder()).append("ORDER BY ").append(orderBy).append(" ").toString());
        }
        if (limit != null)
        {
            stringbuilder.append((new StringBuilder()).append("LIMIT ").append(limit).append(" ").toString());
        }
        if (offset != null)
        {
            stringbuilder.append((new StringBuilder()).append("OFFSET ").append(offset).append(" ").toString());
        }
        return stringbuilder.toString();
    }

    public Select where(String s)
    {
        whereClause = s;
        return this;
    }

    public Select where(String s, String as[])
    {
        whereClause = s;
        arguments = as;
        return this;
    }

    public transient Select where(Condition acondition[])
    {
        mergeConditions(acondition, Condition.Type.AND);
        return this;
    }

    public transient Select whereOr(Condition acondition[])
    {
        mergeConditions(acondition, Condition.Type.OR);
        return this;
    }
}
