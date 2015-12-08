// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.database;

import android.content.Context;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONArray;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONObject;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.database:
//            SearchFieldType, DatabaseManager, DatabaseAccessor

public class DatabaseSchema
{

    private TreeMap internalNodes;
    private String name;
    private TreeMap nodes;
    private TreeMap safeNodes;

    public DatabaseSchema(String s)
    {
        name = s;
        nodes = new TreeMap();
        safeNodes = new TreeMap();
        internalNodes = new TreeMap();
        try
        {
            internalNodes.put("_deleted", SearchFieldType.BOOLEAN);
            internalNodes.put("_dirty", SearchFieldType.NUMBER);
            internalNodes.put("_id", SearchFieldType.INTEGER);
            internalNodes.put("json", SearchFieldType.STRING);
            internalNodes.put("_operation", SearchFieldType.STRING);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public DatabaseSchema(String s, Map map)
        throws Throwable
    {
        this(s);
        String s1;
        for (s = map.keySet().iterator(); s.hasNext(); addSearchField(s1, (SearchFieldType)map.get(s1)))
        {
            s1 = (String)s.next();
        }

    }

    private void addSearchField(String s, SearchFieldType searchfieldtype)
        throws Throwable
    {
        if (s == null)
        {
            throw new Throwable("invalid search field (null) specified");
        }
        s = s.trim();
        if (s.equals("") || s.indexOf("..") != -1 || s.startsWith(".") || s.endsWith("."))
        {
            throw new Throwable((new StringBuilder()).append("invalid search field (\"").append(s).append("\") ").append("specified").toString());
        }
        String s1 = s.toLowerCase();
        if (nodes.containsKey(s1) || internalNodes.containsKey(s1))
        {
            throw new Throwable((new StringBuilder()).append("search field with name \"").append(s).append("\" ").append(" is used internally and cannot be reused").toString());
        } else
        {
            nodes.put(s1, searchfieldtype);
            safeNodes.put(JSONStoreUtil.getDatabaseSafeSearchFieldName(s1), searchfieldtype);
            return;
        }
    }

    private String encodeJSONArrayAsString(JSONArray jsonarray, String s)
        throws JSONException
    {
        int j = jsonarray.length();
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < j; i++)
        {
            Object obj1 = jsonarray.get(i);
            Object obj = obj1;
            if (obj1 instanceof JSONObject)
            {
                obj = locateChildInObject((JSONObject)obj1, s);
            }
            if (obj == null)
            {
                continue;
            }
            stringbuilder.append(obj.toString());
            if (i < j - 1)
            {
                stringbuilder.append("-@-");
            }
        }

        return stringbuilder.toString();
    }

    private Object getValueFromObjectCaseInsensitive(JSONObject jsonobject, String s)
    {
        JSONArray jsonarray = jsonobject.names();
        if (jsonarray != null)
        {
            int j = jsonarray.length();
            int i = 0;
            while (i < j) 
            {
                String s1 = jsonarray.optString(i);
                if (s1 != null && s1.toLowerCase().equals(s))
                {
                    return jsonobject.opt(s1);
                }
                i++;
            }
        }
        return null;
    }

    private Object locateChildInObject(JSONObject jsonobject, String s)
    {
        Object obj;
        int i;
        i = s.indexOf('.');
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = jsonobject.opt(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        jsonobject = ((JSONObject) (getValueFromObjectCaseInsensitive(jsonobject, s)));
_L4:
        return jsonobject;
_L2:
        jsonobject = ((JSONObject) (obj));
        if (!(obj instanceof JSONArray)) goto _L4; else goto _L3
_L3:
        try
        {
            jsonobject = encodeJSONArrayAsString((JSONArray)obj, s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
        Object obj1;
        Object obj2;
        try
        {
            obj2 = jsonobject.opt(s.substring(0, i));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj1 = getValueFromObjectCaseInsensitive(jsonobject, s.substring(0, i));
        if (obj1 instanceof JSONObject)
        {
            return locateChildInObject((JSONObject)obj1, s.substring(i + 1));
        }
        if (!(obj1 instanceof JSONArray))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        jsonobject = encodeJSONArrayAsString((JSONArray)obj1, s.substring(i + 1));
        return jsonobject;
        return null;
    }

    private void mergeIntoObject(JSONObject jsonobject, String s, Object obj)
        throws Throwable
    {
        int i = s.indexOf('.');
        if (i == -1)
        {
            mergeValues(jsonobject, s, obj);
            return;
        }
        String s1 = s.substring(0, i);
        JSONObject jsonobject1 = jsonobject.optJSONObject(s1);
        Object obj1 = jsonobject1;
        if (jsonobject1 == null)
        {
            obj1 = new JacksonSerializedJSONObject();
            jsonobject.put(s1, obj1);
        }
        mergeIntoObject(((JSONObject) (obj1)), s.substring(i + 1), obj);
    }

    private void mergeValues(JSONObject jsonobject, String s, Object obj)
        throws Throwable
    {
        Object obj1 = jsonobject.opt(s);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        jsonobject.put(s, obj);
_L4:
        return;
_L2:
        if (!(obj1 instanceof JSONArray))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        jsonobject = (JSONArray)obj1;
        int j = jsonobject.length();
        int i = 0;
        do
        {
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (jsonobject.opt(i) == obj)
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        jsonobject.put(obj);
        return;
        JacksonSerializedJSONArray jacksonserializedjsonarray = new JacksonSerializedJSONArray();
        jacksonserializedjsonarray.put(obj1);
        jacksonserializedjsonarray.put(obj);
        jsonobject.put(s, jacksonserializedjsonarray);
        return;
    }

    private JSONObject normalizeObject(JSONObject jsonobject)
        throws Throwable
    {
        Iterator iterator = jsonobject.keys();
        JacksonSerializedJSONObject jacksonserializedjsonobject = new JacksonSerializedJSONObject();
        if (iterator != null)
        {
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                mergeIntoObject(jacksonserializedjsonobject, s, normalizeOrCopyObject(jsonobject.get(s)));
            }
        }
        return jacksonserializedjsonobject;
    }

    private Object normalizeOrCopyObject(Object obj)
        throws Throwable
    {
        if (!(obj instanceof JSONObject)) goto _L2; else goto _L1
_L1:
        obj = normalizeObject((JSONObject)obj);
_L4:
        return obj;
_L2:
label0:
        {
            if (!(obj instanceof JSONArray))
            {
                break label0;
            }
            JacksonSerializedJSONArray jacksonserializedjsonarray = new JacksonSerializedJSONArray();
            JSONArray jsonarray = (JSONArray)obj;
            int j = jsonarray.length();
            int i = 0;
            do
            {
                obj = jacksonserializedjsonarray;
                if (i >= j)
                {
                    break;
                }
                jacksonserializedjsonarray.put(normalizeOrCopyObject(jsonarray.get(i)));
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return obj;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DatabaseSchema))
        {
            return false;
        } else
        {
            return ((DatabaseSchema)obj).nodes.equals(nodes);
        }
    }

    public boolean equals(TreeMap treemap)
    {
        if (treemap.size() == nodes.size() + internalNodes.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = treemap.keySet().iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                String s = (String)iterator.next();
                String s1 = JSONStoreUtil.getDatabaseSafeSearchFieldName(s);
                SearchFieldType searchfieldtype;
                if (safeNodes.containsKey(s1))
                {
                    SearchFieldType searchfieldtype1 = (SearchFieldType)nodes.get(s1);
                    searchfieldtype = searchfieldtype1;
                    if (searchfieldtype1 == null)
                    {
                        searchfieldtype = (SearchFieldType)safeNodes.get(s1);
                    }
                } else
                {
                    searchfieldtype = (SearchFieldType)internalNodes.get(s1);
                }
                if (searchfieldtype == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!searchfieldtype.getMappedType().equals(treemap.get(s)))
                {
                    return false;
                }
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public String getName()
    {
        return name;
    }

    public Iterator getSearchFieldIterator()
    {
        return nodes.keySet().iterator();
    }

    public SearchFieldType getSearchFieldType(String s)
    {
        return (SearchFieldType)nodes.get(s);
    }

    public boolean isSchemaMismatched(String s, DatabaseSchema databaseschema, Context context)
    {
        DatabaseManager databasemanager = DatabaseManager.getInstance();
        DatabaseAccessor databaseaccessor;
        try
        {
            databaseaccessor = databasemanager.getDatabase(s);
        }
        catch (Exception exception)
        {
            return databasemanager.checkDatabaseAgainstSchema(context, s, databaseschema);
        }
        return !databaseaccessor.getSchema().equals(databaseschema);
    }

    public Map mapObject(JSONObject jsonobject, JSONObject jsonobject1)
        throws Throwable
    {
        Object obj = nodes.keySet();
        TreeMap treemap = new TreeMap();
        jsonobject = normalizeObject(jsonobject);
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            Object obj1 = locateChildInObject(jsonobject, s);
            if (obj1 != null)
            {
                treemap.put(s, obj1);
            }
            if (jsonobject1 != null)
            {
                Object obj2 = locateChildInObject(jsonobject1, s);
                if (obj2 != null)
                {
                    treemap.put(s, obj2);
                }
            }
        } while (true);
        return treemap;
    }
}
