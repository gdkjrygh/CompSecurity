// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreQueryParts;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.worklight.jsonstore.database:
//            QueryBuilder, SortDirection

public class QueryBuilderSelect extends QueryBuilder
{

    private Integer limit;
    private Integer offset;
    private Map selectStatements;
    private LinkedHashMap sort;

    public QueryBuilderSelect(JSONStoreCollection jsonstorecollection, JSONStoreQueryParts jsonstorequeryparts)
    {
        super(jsonstorecollection, jsonstorequeryparts);
        generalInit();
    }

    private void generalInit()
    {
        limit = null;
        offset = null;
        selectStatements = new LinkedHashMap();
        sort = new LinkedHashMap();
    }

    public void addSelectStatement(String s, Boolean boolean1)
        throws IllegalArgumentException
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("statement parameter is null or empty");
        }
        if (boolean1 == null)
        {
            throw new IllegalArgumentException("is_special parameter is null");
        } else
        {
            selectStatements.put(s, boolean1);
            return;
        }
    }

    protected void buildModifiers(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException
    {
        if (stringbuilder == null)
        {
            throw new IllegalArgumentException("queryString parameter is null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("selectionArgs parameter is null");
        }
        list = getLimit();
        Integer integer = getOffset();
        if (sort == null)
        {
            sort = new LinkedHashMap();
        }
        if (list != null && list.intValue() < 0)
        {
            sort.clear();
            sort.put("_id", SortDirection.DESCENDING);
        }
        if (sort.size() > 0)
        {
            Iterator iterator = sort.entrySet().iterator();
            StringBuilder stringbuilder1 = new StringBuilder();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = (SortDirection)((java.util.Map.Entry) (obj)).getValue();
                if (obj == SortDirection.ASCENDING)
                {
                    stringbuilder1.append(",");
                    stringbuilder1.append((new StringBuilder()).append(" [").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(s)).append("] ASC ").toString());
                } else
                if (obj == SortDirection.DESCENDING)
                {
                    stringbuilder1.append(",");
                    stringbuilder1.append((new StringBuilder()).append(" [").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(s)).append("] DESC ").toString());
                }
            } while (true);
            if (stringbuilder1.length() > 1)
            {
                stringbuilder1.deleteCharAt(0);
                stringbuilder.append("  ORDER BY  ");
                stringbuilder.append(stringbuilder1);
            }
        }
        if (list != null)
        {
            int j = list.intValue();
            int i = j;
            if (j < 0)
            {
                i = -j;
            }
            stringbuilder.append((new StringBuilder()).append("  LIMIT  ").append(i).append(" ").toString());
        }
        if (integer != null && list != null)
        {
            stringbuilder.append((new StringBuilder()).append("  OFFSET  ").append(integer).append(" ").toString());
        }
    }

    protected void buildSelectStatement(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException
    {
        if (stringbuilder == null)
        {
            throw new IllegalArgumentException("query_string parameter is null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("selection_args parameter is null");
        }
        if (selectStatements.isEmpty())
        {
            selectStatements.put("*", Boolean.valueOf(true));
        }
        Iterator iterator = selectStatements.keySet().iterator();
        stringbuilder.append(" ");
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            list = (String)iterator.next();
            Boolean boolean1 = (Boolean)selectStatements.get(list);
            Object obj = list;
            if (!boolean1.booleanValue())
            {
                obj = (new StringBuilder()).append("[").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(list)).append("]").toString();
            }
            stringbuilder.append(((String) (obj)));
            if (iterator.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        stringbuilder.append(" ");
    }

    public void clearAllModifiers()
    {
        limit = null;
        offset = null;
        if (sort != null)
        {
            sort.clear();
        }
    }

    public void clearAllSelectStatements()
    {
        selectStatements.clear();
    }

    public void convertToQueryString(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException
    {
        stringbuilder.append(" SELECT ");
        buildSelectStatement(stringbuilder, list);
        stringbuilder.append(" FROM ");
        buildFromClause(stringbuilder, list);
        stringbuilder.append(" WHERE ");
        buildWhereClause(stringbuilder, list);
        buildModifiers(stringbuilder, list);
    }

    public Integer getLimit()
    {
        return limit;
    }

    public Integer getOffset()
    {
        return offset;
    }

    protected Map getSelectStatements()
    {
        return selectStatements;
    }

    public LinkedHashMap getSort()
    {
        return sort;
    }

    public void setLimit(Integer integer)
        throws IllegalArgumentException
    {
        limit = integer;
    }

    public void setOffset(Integer integer)
        throws IllegalArgumentException
    {
        offset = integer;
    }

    public void setSort(LinkedHashMap linkedhashmap)
    {
        sort = linkedhashmap;
    }
}
