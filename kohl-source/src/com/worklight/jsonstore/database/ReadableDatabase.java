// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import android.database.Cursor;
import com.worklight.common.Logger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.database:
//            DatabaseSchema

public class ReadableDatabase
{

    private static final String JSONSTORE_DB = "jsonstore-db";
    private static final String SQL_AND = " AND ";
    private static final String SQL_EQ = " = ?";
    private static final String SQL_FIND = "SELECT {0} FROM {1};";
    private static final String SQL_FIND_BY_ID = "SELECT {0}, {1} FROM {2} WHERE {3} AND _deleted = 0";
    private static final String SQL_FIND_OP = "SELECT {0} FROM {1} WHERE {2} LIKE ?";
    private static final String SQL_FIND_WHERE = "SELECT {0} FROM {1} WHERE {2};";
    private static final String SQL_FIND_WHERE_WITH_LIMIT = "SELECT {0} FROM {1} WHERE {2} LIMIT {3};";
    private static final String SQL_FIND_WHERE_WITH_LIMIT_AND_OFFSET = "SELECT {0} FROM {1} WHERE {2} LIMIT {3} OFFSET {4};";
    private static final String SQL_FIND_WHERE_WITH_LIMIT_AND_OFFSET_AND_ORDER = "SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4} OFFSET {5};";
    private static final String SQL_FIND_WHERE_WITH_LIMIT_AND_ORDER = "SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4};";
    private static final String SQL_FIND_WHERE_WITH_NEGATIVE_LIMIT = "SELECT {0} FROM {1} WHERE {2} ORDER BY {3} DESC LIMIT {4};";
    private static final String SQL_LIKE = " LIKE ?";
    private static final String SQL_OR = " OR ";
    private SQLiteDatabase database;
    protected Logger logger;
    private DatabaseSchema schema;

    protected ReadableDatabase(SQLiteDatabase sqlitedatabase, DatabaseSchema databaseschema)
    {
        database = sqlitedatabase;
        logger = Logger.getInstance("jsonstore-db");
        schema = databaseschema;
    }

    private String buildFindAllQuery(String s, String s1, String s2, StringBuilder stringbuilder, StringBuilder stringbuilder1, int i)
    {
        if (stringbuilder1.length() <= 0) goto _L2; else goto _L1
_L1:
        if (s != null) goto _L4; else goto _L3
_L3:
        s1 = JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2};", new Object[] {
            stringbuilder.toString(), schema.getName(), stringbuilder1.toString()
        });
        s = s1;
        if (hasSortParameter(s2))
        {
            s = (new StringBuilder()).append(s1.substring(0, s1.length() - 1)).append(" ORDER BY ").append(s2).append(";").toString();
        }
_L6:
        return s;
_L4:
        if (s1 != null)
        {
            if (hasSortParameter(s2))
            {
                return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4} OFFSET {5};", new Object[] {
                    stringbuilder.toString(), schema.getName(), stringbuilder1.toString(), s2, s, s1
                });
            } else
            {
                return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} LIMIT {3} OFFSET {4};", new Object[] {
                    stringbuilder.toString(), schema.getName(), stringbuilder1.toString(), s, s1
                });
            }
        }
        if (i < 0)
        {
            i = Math.abs(i);
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} DESC LIMIT {4};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder1.toString(), "_id", String.valueOf(i)
            });
        }
        if (hasSortParameter(s2))
        {
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder1.toString(), s2, s
            });
        } else
        {
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} LIMIT {3};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder1.toString(), s
            });
        }
_L2:
        s1 = JSONStoreUtil.formatString("SELECT {0} FROM {1};", new Object[] {
            stringbuilder.toString(), schema.getName()
        });
        s = s1;
        if (hasSortParameter(s2))
        {
            return (new StringBuilder()).append(s1.substring(0, s1.length() - 1)).append(" ORDER BY ").append(s2).append(";").toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String buildFindQuery(JSONObject jsonobject, String s, String s1, Boolean boolean1, String s2, StringBuilder stringbuilder, ArrayList arraylist, 
            StringBuilder stringbuilder1)
        throws JSONException
    {
        StringBuilder stringbuilder2 = new StringBuilder();
        Iterator iterator = jsonobject.keys();
        int i = getLimit(s);
        handleExact(jsonobject, boolean1, arraylist, stringbuilder2, iterator);
        if (stringbuilder1.length() > 0)
        {
            stringbuilder2.append(" AND ");
            stringbuilder2.append(stringbuilder1);
        }
        if (s == null)
        {
            s = JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder2.toString()
            });
            jsonobject = s;
            if (hasSortParameter(s2))
            {
                jsonobject = (new StringBuilder()).append(s.substring(0, s.length() - 1)).append(" ORDER BY ").append(s2).append(";").toString();
            }
            return jsonobject;
        }
        if (s1 != null)
        {
            if (hasSortParameter(s2))
            {
                return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4} OFFSET {5};", new Object[] {
                    stringbuilder.toString(), schema.getName(), stringbuilder2.toString(), s2, s, s1
                });
            } else
            {
                return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} LIMIT {3} OFFSET {4};", new Object[] {
                    stringbuilder.toString(), schema.getName(), stringbuilder2.toString(), s, s1
                });
            }
        }
        if (i < 0)
        {
            i = Math.abs(i);
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} DESC LIMIT {4};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder2.toString(), "_id", String.valueOf(i)
            });
        }
        if (hasSortParameter(s2))
        {
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} ORDER BY {3} LIMIT {4};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder2.toString(), s2, s
            });
        } else
        {
            return JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} LIMIT {3};", new Object[] {
                stringbuilder.toString(), schema.getName(), stringbuilder2.toString(), s
            });
        }
    }

    private void buildWhereClause(String as[], StringBuilder stringbuilder)
    {
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                stringbuilder.append(as[i]);
                if (i < as.length - 1)
                {
                    stringbuilder.append(" AND ");
                }
            }

        }
    }

    private void getFieldsToSelect(String as[], StringBuilder stringbuilder)
    {
        if (as == null || as.length == 0)
        {
            stringbuilder.append('*');
        } else
        {
            int i = 0;
            while (i < as.length) 
            {
                stringbuilder.append(as[i]);
                if (i < as.length - 1)
                {
                    stringbuilder.append(", ");
                }
                i++;
            }
        }
    }

    private int getLimit(String s)
    {
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0;
        }
        return i;
    }

    private void handleExact(JSONObject jsonobject, Boolean boolean1, ArrayList arraylist, StringBuilder stringbuilder, Iterator iterator)
        throws JSONException
    {
        if (!boolean1.booleanValue())
        {
            while (iterator.hasNext()) 
            {
                boolean1 = (String)iterator.next();
                Object obj = jsonobject.get(boolean1);
                stringbuilder.append((new StringBuilder()).append("[").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(boolean1)).append("]").toString());
                stringbuilder.append(" LIKE ?");
                if (iterator.hasNext())
                {
                    stringbuilder.append(" AND ");
                }
                boolean1 = ((Boolean) (obj));
                if (obj instanceof Boolean)
                {
                    int i;
                    if (((Boolean)obj).booleanValue())
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                    boolean1 = Integer.valueOf(i);
                }
                arraylist.add((new StringBuilder()).append("%").append(boolean1).append("%").toString());
            }
        } else
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                boolean1 = (String)iterator.next();
                Object obj1 = jsonobject.get(boolean1);
                String s = (new StringBuilder()).append("[").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(boolean1)).append("]").toString();
                boolean1 = ((Boolean) (obj1));
                if (obj1 instanceof Boolean)
                {
                    int j;
                    if (((Boolean)obj1).booleanValue())
                    {
                        j = 1;
                    } else
                    {
                        j = 0;
                    }
                    boolean1 = Integer.valueOf(j);
                }
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
                arraylist.add((new StringBuilder()).append("").append(boolean1).toString());
                arraylist.add((new StringBuilder()).append("%-@-").append(boolean1).toString());
                arraylist.add((new StringBuilder()).append("%-@-").append(boolean1).append("-@-%").toString());
                arraylist.add((new StringBuilder()).append(boolean1).append("-@-%").toString());
                stringbuilder.append(" ) ");
                if (iterator.hasNext())
                {
                    stringbuilder.append(" AND ");
                }
            } while (true);
        }
    }

    private boolean hasSortParameter(String s)
    {
        return s != null && s.trim().length() > 0;
    }

    public transient Cursor findByIds(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        String as[] = new String[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            stringbuilder.append("_id");
            stringbuilder.append(" = ?");
            if (i < ai.length - 1)
            {
                stringbuilder.append(" OR ");
            }
            as[i] = (new StringBuilder()).append("").append(ai[i]).toString();
        }

        return rawQuery(JSONStoreUtil.formatString("SELECT {0}, {1} FROM {2} WHERE {3} AND _deleted = 0", new Object[] {
            "_id", "json", schema.getName(), stringbuilder.toString()
        }), as);
    }

    protected String findOperationForObjectById(int i)
    {
        Cursor cursor = rawQuery(JSONStoreUtil.formatString("SELECT {0} FROM {1} WHERE {2} LIKE ?", new Object[] {
            "_operation", schema.getName(), "_id"
        }), new String[] {
            (new StringBuilder()).append("").append(i).toString()
        });
        if (cursor.getCount() < 1)
        {
            cursor.close();
            return null;
        } else
        {
            cursor.moveToNext();
            String s = cursor.getString(0);
            cursor.close();
            return s;
        }
    }

    public Cursor findUsingQueryObject(JSONObject jsonobject, String as[], String as1[], String s, String s1, Boolean boolean1)
        throws JSONException
    {
        return findUsingQueryObject(jsonobject, as, as1, s, s1, boolean1, null);
    }

    public Cursor findUsingQueryObject(JSONObject jsonobject, String as[], String as1[], String s, String s1, Boolean boolean1, String s2)
        throws JSONException
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = jsonobject.length();
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder1 = new StringBuilder();
        getFieldsToSelect(as, stringbuilder);
        buildWhereClause(as1, stringbuilder1);
        if (i == 0)
        {
            jsonobject = buildFindAllQuery(s, s1, s2, stringbuilder, stringbuilder1, getLimit(s));
        } else
        {
            jsonobject = buildFindQuery(jsonobject, s, s1, boolean1, s2, stringbuilder, arraylist, stringbuilder1);
        }
        return rawQuery(jsonobject, (String[])arraylist.toArray(new String[arraylist.size()]));
    }

    protected SQLiteDatabase getDatabase()
    {
        return database;
    }

    protected DatabaseSchema getSchema()
    {
        return schema;
    }

    public Cursor rawQuery(String s, String as[])
    {
        logger.trace((new StringBuilder()).append("executing query on database \"").append(schema.getName()).append("\":").toString());
        logger.trace((new StringBuilder()).append("   ").append(s).toString());
        if (as != null)
        {
            logger.trace("arguments:");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s1 = as[i];
                logger.trace((new StringBuilder()).append("   ").append(s1).toString());
            }

        }
        return database.rawQuery(s, as);
    }
}
