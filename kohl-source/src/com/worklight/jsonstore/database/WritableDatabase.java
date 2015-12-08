// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.worklight.common.Logger;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONObject;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.database:
//            ReadableDatabase, DatabaseSchema

public class WritableDatabase extends ReadableDatabase
{

    private static final String SQL_AND = " AND";
    private static final String SQL_DELETE = "DELETE FROM {0} WHERE {1};";
    private static final String SQL_INSERT = "INSERT INTO {0} ({1}) VALUES ({2});";
    private static final String SQL_UPDATE = "UPDATE {0} SET {1}{2};";
    private static final String SQL_WHERE = " WHERE";

    protected WritableDatabase(SQLiteDatabase sqlitedatabase, DatabaseSchema databaseschema)
    {
        super(sqlitedatabase, databaseschema);
    }

    private void logDeleteQuery(Object aobj[], String s, StringBuilder stringbuilder)
    {
        stringbuilder = JSONStoreUtil.formatString("DELETE FROM {0} WHERE {1};", new Object[] {
            s, stringbuilder.toString()
        });
        logger.trace((new StringBuilder()).append("executing delete on database \"").append(s).append("\":").toString());
        logger.trace((new StringBuilder()).append("   ").append(stringbuilder).toString());
        logger.trace("   args:");
        for (int i = 0; i < aobj.length; i++)
        {
            logger.trace((new StringBuilder()).append("      ").append(aobj[i]).toString());
        }

    }

    private void logUpdateQuery(String as[], Object aobj[], String s, StringBuilder stringbuilder, String as1[])
    {
        StringBuilder stringbuilder1 = new StringBuilder();
        for (int i = 0; i < as.length; i++)
        {
            stringbuilder1.append(as[i]);
            stringbuilder1.append(" = ");
            stringbuilder1.append(aobj[i]);
            if (i < as.length - 1)
            {
                stringbuilder1.append(", ");
            }
        }

        aobj = stringbuilder1.toString();
        int k;
        if (stringbuilder == null)
        {
            as = "";
        } else
        {
            as = (new StringBuilder()).append(" WHERE").append(stringbuilder.toString()).toString();
        }
        as = JSONStoreUtil.formatString("UPDATE {0} SET {1}{2};", new Object[] {
            s, aobj, as
        });
        logger.trace((new StringBuilder()).append("executing update on database \"").append(s).append("\":").toString());
        logger.trace((new StringBuilder()).append("   sql: ").append(as).toString());
        logger.trace("   arguments:");
        k = as1.length;
        for (int j = 0; j < k; j++)
        {
            as = as1[j];
            logger.trace((new StringBuilder()).append("      ").append(as).toString());
        }

    }

    public int delete(String as[], Object aobj[])
    {
        String s = getSchema().getName();
        StringBuilder stringbuilder = new StringBuilder();
        if (as == null || as.length < 1)
        {
            stringbuilder.append("1");
        } else
        {
            int j = 0;
            while (j < as.length) 
            {
                stringbuilder.append(as[j]);
                stringbuilder.append(" = ?");
                if (j < as.length - 1)
                {
                    stringbuilder.append(" AND");
                }
                j++;
            }
        }
        logDeleteQuery(aobj, s, stringbuilder);
        as = new String[aobj.length];
        for (int i = 0; i < aobj.length; i++)
        {
            as[i] = aobj[i].toString();
        }

        return getDatabase().delete(s, stringbuilder.toString(), as);
    }

    public int deleteIfRequired(JSONObject jsonobject, boolean flag, boolean flag1)
        throws JSONException
    {
        String s;
        int i;
        boolean flag2;
        boolean flag3;
        flag3 = flag;
        flag2 = true;
        i = 0;
        s = null;
        int k = jsonobject.getInt("_id");
        i = k;
        String s1 = findOperationForObjectById(k);
        s = s1;
        i = k;
_L1:
        if (flag2)
        {
            flag = flag3;
            if (s != null)
            {
                flag = flag3;
                if (s.equals("add"))
                {
                    flag = true;
                }
            }
            JSONException jsonexception;
            if (flag)
            {
                i = jsonobject.getInt("_id");
                return delete(new String[] {
                    "_id"
                }, new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                long l1 = (new Date()).getTime();
                return update(new String[] {
                    "_deleted", "_dirty", "_operation"
                }, new Object[] {
                    Integer.valueOf(1), Long.valueOf(l1), "remove"
                }, i);
            }
        }
        break MISSING_BLOCK_LABEL_176;
        jsonexception;
        flag2 = false;
          goto _L1
        int l = 0;
        jsonobject = findUsingQueryObject(jsonobject, new String[] {
            "_id", "_operation"
        }, new String[] {
            "_deleted = 0"
        }, null, null, Boolean.valueOf(flag1));
        int j1 = jsonobject.getCount();
        int j = 0;
        while (j < j1) 
        {
            new JacksonSerializedJSONObject();
            jsonobject.moveToNext();
            int i1 = jsonobject.getInt(0);
            if ("add".compareToIgnoreCase(jsonobject.getString(1)) == 0 || flag)
            {
                i1 = delete(new String[] {
                    "_id"
                }, new Object[] {
                    Integer.valueOf(i1)
                });
            } else
            {
                long l2 = (new Date()).getTime();
                i1 = update(new String[] {
                    "_deleted", "_dirty", "_operation"
                }, new Object[] {
                    Integer.valueOf(1), Long.valueOf(l2), "remove"
                }, i1);
            }
            l += i1;
            j++;
        }
        jsonobject.close();
        return l;
    }

    public int update(Map map, Map map1)
    {
        String as[] = new String[map.size()];
        Object aobj[] = new Object[map.size()];
        int i = 0;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            as[i] = (new StringBuilder()).append("[").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(s)).append("]").toString();
            aobj[i] = map.get(s);
            i++;
        }

        return update(as, aobj, map1);
    }

    public int update(JSONObject jsonobject, boolean flag)
        throws Throwable
    {
        HashMap hashmap;
        Object obj;
        int i;
        long l;
        if (flag)
        {
            l = (new Date()).getTime();
        } else
        {
            l = 0L;
        }
        i = jsonobject.getInt("_id");
        hashmap = new HashMap();
        obj = jsonobject.getJSONObject("json");
        jsonobject = getSchema().mapObject(((JSONObject) (obj)), null);
        jsonobject.put("_dirty", Long.valueOf(l));
        jsonobject.put("_id", Integer.valueOf(i));
        jsonobject.put("json", ((JSONObject) (obj)).toString());
        obj = findOperationForObjectById(i);
        if (obj == null || ((String) (obj)).equals("remove"))
        {
            throw new Throwable();
        }
        if (!((String) (obj)).equals("add"))
        {
            jsonobject.put("_operation", "replace");
        }
        hashmap.put("_id", Integer.valueOf(i));
        return update(((Map) (jsonobject)), ((Map) (hashmap)));
    }

    public int update(String as[], Object aobj[], int i)
        throws JSONException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("_id", Integer.valueOf(i));
        return update(as, aobj, ((Map) (hashmap)));
    }

    public int update(String as[], Object aobj[], Map map)
    {
        String s = getSchema().getName();
        ContentValues contentvalues = new ContentValues();
        Object obj = null;
        Object obj1 = null;
        StringBuilder stringbuilder = obj;
        String as1[] = obj1;
        if (map != null)
        {
            stringbuilder = obj;
            as1 = obj1;
            if (map.size() > 0)
            {
                int i = 0;
                Iterator iterator = map.keySet().iterator();
                StringBuilder stringbuilder1 = new StringBuilder();
                String as2[] = new String[map.size()];
                do
                {
                    stringbuilder = stringbuilder1;
                    as1 = as2;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    as1 = (String)iterator.next();
                    stringbuilder1.append(' ');
                    stringbuilder1.append(as1);
                    stringbuilder1.append(" = ?");
                    if (iterator.hasNext())
                    {
                        stringbuilder1.append(" AND");
                    }
                    as2[i] = map.get(as1).toString();
                    i++;
                } while (true);
            }
        }
        logUpdateQuery(as, aobj, s, stringbuilder, as1);
        for (int j = 0; j < as.length; j++)
        {
            contentvalues.put(as[j], aobj[j].toString());
        }

        aobj = getDatabase();
        if (stringbuilder == null)
        {
            as = null;
        } else
        {
            as = stringbuilder.toString();
        }
        return ((SQLiteDatabase) (aobj)).update(s, contentvalues, as, as1);
    }
}
