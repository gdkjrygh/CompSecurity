// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import com.worklight.jsonstore.api.JSONStoreCollection;
import com.worklight.jsonstore.api.JSONStoreQueryPart;
import com.worklight.jsonstore.api.JSONStoreQueryPartItem;
import com.worklight.jsonstore.api.JSONStoreQueryParts;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.worklight.jsonstore.database:
//            QueryPartOperation

public abstract class QueryBuilder
{
    public static final class DeletedInclusion extends Enum
    {

        private static final DeletedInclusion $VALUES[];
        public static final DeletedInclusion DELETED_AND_NOT_DELETED;
        public static final DeletedInclusion DELETED_ONLY;
        public static final DeletedInclusion NON_DELETED_ONLY;

        public static DeletedInclusion valueOf(String s)
        {
            return (DeletedInclusion)Enum.valueOf(com/worklight/jsonstore/database/QueryBuilder$DeletedInclusion, s);
        }

        public static DeletedInclusion[] values()
        {
            return (DeletedInclusion[])$VALUES.clone();
        }

        static 
        {
            DELETED_AND_NOT_DELETED = new DeletedInclusion("DELETED_AND_NOT_DELETED", 0);
            NON_DELETED_ONLY = new DeletedInclusion("NON_DELETED_ONLY", 1);
            DELETED_ONLY = new DeletedInclusion("DELETED_ONLY", 2);
            $VALUES = (new DeletedInclusion[] {
                DELETED_AND_NOT_DELETED, NON_DELETED_ONLY, DELETED_ONLY
            });
        }

        private DeletedInclusion(String s, int i)
        {
            super(s, i);
        }
    }


    private JSONStoreCollection collectionToSearch;
    private DeletedInclusion deletedInclusion;
    private JSONStoreQueryParts queryContent;

    public QueryBuilder(JSONStoreCollection jsonstorecollection, JSONStoreQueryParts jsonstorequeryparts)
        throws IllegalArgumentException
    {
        if (jsonstorecollection == null)
        {
            throw new IllegalArgumentException("collection parameter is null");
        }
        if (jsonstorequeryparts == null)
        {
            throw new IllegalArgumentException("content parameter cannot be null");
        } else
        {
            collectionToSearch = jsonstorecollection;
            deletedInclusion = DeletedInclusion.NON_DELETED_ONLY;
            queryContent = jsonstorequeryparts;
            return;
        }
    }

    private Object convertObjectIfBoolean(Object obj)
    {
        int i = 1;
        Object obj1 = obj;
        if (obj instanceof Boolean)
        {
            if (!((Boolean)obj).booleanValue())
            {
                i = 0;
            }
            obj1 = Integer.valueOf(i);
        }
        return obj1;
    }

    private void handleBetweenCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.BETWEEN)
        {
            return;
        } else
        {
            obj = (List)obj;
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(((List) (obj)).get(0))));
            obj = convertObjectIfBoolean(((List) (obj)).get(1));
            stringbuilder.append(s);
            stringbuilder.append(" BETWEEN ? AND ? ");
            list.add(querypartoperation.toString());
            list.add(obj.toString());
            return;
        }
    }

    private void handleExactEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.EXACT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" = ?");
            stringbuilder.append(" OR ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" OR ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" OR ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).append("-@-%").toString());
            list.add((new StringBuilder()).append(querypartoperation).append("-@-%").toString());
            return;
        }
    }

    private void handleExactNotEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.EXACT_NOT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" != ?");
            stringbuilder.append(" AND ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" AND ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" AND ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).append("-@-%").toString());
            list.add((new StringBuilder()).append(querypartoperation).append("-@-%").toString());
            return;
        }
    }

    private void handleFuzzyEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            list.add((new StringBuilder()).append("%").append(querypartoperation).append("%").toString());
            return;
        }
    }

    private void handleFuzzyLeftEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_LEFT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" OR ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append("%").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%").append(querypartoperation).append("-@-%").toString());
            return;
        }
    }

    private void handleFuzzyNotEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_NOT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            list.add((new StringBuilder()).append("%").append(querypartoperation).append("%").toString());
            return;
        }
    }

    private void handleFuzzyNotLeftEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_NOT_LEFT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" AND ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append("%").append(querypartoperation).toString());
            list.add((new StringBuilder()).append("%").append(querypartoperation).append("-@-%").toString());
            return;
        }
    }

    private void handleFuzzyNotRightEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_NOT_RIGHT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" AND ");
            stringbuilder.append(s);
            stringbuilder.append(" NOT LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append(querypartoperation).append("%").toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).append("%").toString());
            return;
        }
    }

    private void handleFuzzyRightEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.FUZZY_RIGHT_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(" ( ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" OR ");
            stringbuilder.append(s);
            stringbuilder.append(" LIKE ?");
            stringbuilder.append(" ) ");
            list.add((new StringBuilder()).append(querypartoperation).append("%").toString());
            list.add((new StringBuilder()).append("%-@-").append(querypartoperation).append("%").toString());
            return;
        }
    }

    private void handleGreaterThanCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.GREATER_THAN)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" > ?");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            return;
        }
    }

    private void handleGreaterThanEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.GREATER_THAN_OR_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" >= ?");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            return;
        }
    }

    private void handleInCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.IN)
        {
            return;
        }
        querypartoperation = (List)obj;
        stringbuilder.append(s);
        stringbuilder.append(" IN ");
        stringbuilder.append(" ( ");
        querypartoperation = querypartoperation.iterator();
        do
        {
            if (!querypartoperation.hasNext())
            {
                break;
            }
            stringbuilder.append(" ?");
            list.add(convertObjectIfBoolean(querypartoperation.next()).toString());
            if (querypartoperation.hasNext())
            {
                stringbuilder.append(",");
            }
        } while (true);
        stringbuilder.append(" )");
    }

    private void handleLessThanCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.LESS_THAN)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" < ?");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            return;
        }
    }

    private void handleLessThanEqualsCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.LESS_THAN_OR_EQUALS)
        {
            return;
        } else
        {
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(obj)));
            stringbuilder.append(s);
            stringbuilder.append(" <= ?");
            list.add((new StringBuilder()).append("").append(querypartoperation).toString());
            return;
        }
    }

    private void handleNotBetweenCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.NOT_BETWEEN)
        {
            return;
        } else
        {
            obj = (List)obj;
            querypartoperation = ((QueryPartOperation) (convertObjectIfBoolean(((List) (obj)).get(0))));
            obj = convertObjectIfBoolean(((List) (obj)).get(1));
            stringbuilder.append(s);
            stringbuilder.append(" NOT BETWEEN ? AND ? ");
            list.add(querypartoperation.toString());
            list.add(obj.toString());
            return;
        }
    }

    private void handleNotInCase(StringBuilder stringbuilder, List list, QueryPartOperation querypartoperation, String s, Object obj)
    {
        if (querypartoperation != QueryPartOperation.NOT_IN)
        {
            return;
        }
        querypartoperation = (List)obj;
        stringbuilder.append(s);
        stringbuilder.append(" NOT IN ");
        stringbuilder.append(" ( ");
        querypartoperation = querypartoperation.iterator();
        do
        {
            if (!querypartoperation.hasNext())
            {
                break;
            }
            stringbuilder.append(" ?");
            list.add(convertObjectIfBoolean(querypartoperation.next()).toString());
            if (querypartoperation.hasNext())
            {
                stringbuilder.append(",");
            }
        } while (true);
        stringbuilder.append(" )");
    }

    protected void buildFromClause(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException
    {
        stringbuilder.append((new StringBuilder()).append(" ").append(collectionToSearch.getName()).append(" ").toString());
    }

    protected void buildWhereClause(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException
    {
        StringBuilder stringbuilder1;
        if (stringbuilder == null)
        {
            throw new IllegalArgumentException("query_string parameter is null");
        }
        if (list == null)
        {
            throw new IllegalArgumentException("selection_args parameter is null");
        }
        stringbuilder1 = new StringBuilder();
        StringBuilder stringbuilder2 = new StringBuilder();
        Iterator iterator = queryContent.getAllQueryParts().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Iterator iterator1 = ((JSONStoreQueryPart)iterator.next()).getQueryBlockItems().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = (JSONStoreQueryPartItem)iterator1.next();
                QueryPartOperation querypartoperation = ((JSONStoreQueryPartItem) (obj)).getOperation();
                String s;
                StringBuilder stringbuilder3;
                if (((JSONStoreQueryPartItem) (obj)).isKeySpecial())
                {
                    s = ((JSONStoreQueryPartItem) (obj)).getKey();
                } else
                {
                    s = (new StringBuilder()).append("[").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(((JSONStoreQueryPartItem) (obj)).getKey())).append("]").toString();
                }
                obj = ((JSONStoreQueryPartItem) (obj)).getValue();
                stringbuilder3 = new StringBuilder();
                handleExactEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleExactNotEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyNotEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyLeftEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyNotLeftEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyRightEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleFuzzyNotRightEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleBetweenCase(stringbuilder3, list, querypartoperation, s, obj);
                handleNotBetweenCase(stringbuilder3, list, querypartoperation, s, obj);
                handleInCase(stringbuilder3, list, querypartoperation, s, obj);
                handleNotInCase(stringbuilder3, list, querypartoperation, s, obj);
                handleGreaterThanCase(stringbuilder3, list, querypartoperation, s, obj);
                handleGreaterThanEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                handleLessThanCase(stringbuilder3, list, querypartoperation, s, obj);
                handleLessThanEqualsCase(stringbuilder3, list, querypartoperation, s, obj);
                if (stringbuilder3.length() > 0)
                {
                    stringbuilder2.append(" ( ");
                    stringbuilder2.append(stringbuilder3);
                    stringbuilder2.append(" ) ");
                }
                if (iterator1.hasNext())
                {
                    stringbuilder2.append(" AND ");
                }
            } while (true);
            if (iterator.hasNext())
            {
                stringbuilder2.append(" OR ");
            }
        } while (true);
        if (stringbuilder2.length() > 0)
        {
            stringbuilder1.append("(");
            stringbuilder1.append(stringbuilder2);
            stringbuilder1.append(")");
        }
        if (deletedInclusion != DeletedInclusion.NON_DELETED_ONLY) goto _L2; else goto _L1
_L1:
        if (stringbuilder1.length() > 0)
        {
            stringbuilder1.append(" AND ");
        }
        stringbuilder1.append(" _deleted = 0 ");
_L4:
        if (stringbuilder1.length() == 0)
        {
            stringbuilder1.append(1);
        }
        stringbuilder.append(stringbuilder1);
        return;
_L2:
        if (deletedInclusion == DeletedInclusion.DELETED_ONLY)
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(" AND ");
            }
            stringbuilder1.append("_deleted = 1");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract void convertToQueryString(StringBuilder stringbuilder, List list)
        throws IllegalArgumentException;

    public void setSearchDeletedOnly()
    {
        deletedInclusion = DeletedInclusion.DELETED_ONLY;
    }

    public void setSearchIncludeDeleted()
    {
        deletedInclusion = DeletedInclusion.DELETED_AND_NOT_DELETED;
    }

    public void setSearchStandard()
    {
        deletedInclusion = DeletedInclusion.NON_DELETED_ONLY;
    }
}
