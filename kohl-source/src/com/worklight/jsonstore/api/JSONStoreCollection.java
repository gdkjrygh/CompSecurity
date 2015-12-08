// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import android.content.ContentValues;
import android.database.Cursor;
import com.worklight.jsonstore.database.DatabaseAccessor;
import com.worklight.jsonstore.database.DatabaseManager;
import com.worklight.jsonstore.database.DatabaseSchema;
import com.worklight.jsonstore.database.QueryBuilder;
import com.worklight.jsonstore.database.QueryBuilderSelect;
import com.worklight.jsonstore.database.SearchFieldType;
import com.worklight.jsonstore.database.WritableDatabase;
import com.worklight.jsonstore.exceptions.JSONStoreAddException;
import com.worklight.jsonstore.exceptions.JSONStoreChangeException;
import com.worklight.jsonstore.exceptions.JSONStoreCountException;
import com.worklight.jsonstore.exceptions.JSONStoreDatabaseClosedException;
import com.worklight.jsonstore.exceptions.JSONStoreDirtyCheckException;
import com.worklight.jsonstore.exceptions.JSONStoreException;
import com.worklight.jsonstore.exceptions.JSONStoreFilterException;
import com.worklight.jsonstore.exceptions.JSONStoreFindException;
import com.worklight.jsonstore.exceptions.JSONStoreInvalidSchemaException;
import com.worklight.jsonstore.exceptions.JSONStoreMarkCleanException;
import com.worklight.jsonstore.exceptions.JSONStoreRemoveCollectionException;
import com.worklight.jsonstore.exceptions.JSONStoreRemoveException;
import com.worklight.jsonstore.exceptions.JSONStoreReplaceException;
import com.worklight.jsonstore.exceptions.JSONStoreTransactionFailureException;
import com.worklight.jsonstore.jackson.JacksonSerializedJSONObject;
import com.worklight.jsonstore.jackson.JsonOrgModule;
import com.worklight.jsonstore.util.JSONStoreLogger;
import com.worklight.jsonstore.util.JSONStoreUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.sqlcipher.database.SQLiteDatabase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.jsonstore.api:
//            WLJSONStore, JSONStoreAddOptions, JSONStoreChangeOptions, JSONStoreQueryParts, 
//            JSONStoreQueryPart, JSONStoreReplaceOptions, JSONStoreCountOptions, JSONStoreFindOptions, 
//            JSONStoreRemoveOptions

public class JSONStoreCollection
{

    private static final int FIND_BY_ID_CHUNK_SIZE = 200;
    private Map additionalSearchFields;
    private WLJSONStore initializedJSONStoreInstance;
    private JSONStoreLogger logger;
    private String name;
    private DatabaseSchema schema;
    private Map searchFields;
    private boolean wasReopened;

    public JSONStoreCollection(String s)
        throws JSONStoreInvalidSchemaException
    {
        logger = JSONStoreUtil.getCoreLogger();
        searchFields = new HashMap();
        additionalSearchFields = new HashMap();
        if (s == null || s.isEmpty())
        {
            s = new JSONStoreInvalidSchemaException("Error when creating the collection. Collection name cannot be null.");
            logger.logError("Error when creating the collection. Collection name cannot be null.", s);
            throw s;
        } else
        {
            name = s;
            return;
        }
    }

    private void addNonDuplicates(LinkedHashMap linkedhashmap, List list)
        throws JSONStoreFindException
    {
        if (list != null)
        {
            try
            {
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    JSONObject jsonobject = (JSONObject)list.next();
                    Integer integer = Integer.valueOf(jsonobject.getInt("_id"));
                    if (!linkedhashmap.containsKey(integer))
                    {
                        linkedhashmap.put(integer, jsonobject);
                    }
                } while (true);
            }
            // Misplaced declaration of an exception variable
            catch (LinkedHashMap linkedhashmap)
            {
                linkedhashmap = new JSONStoreFindException("Error when attempting to find a document. A JSONException occurred.", linkedhashmap);
                logger.logError("Error when attempting to find a document. A JSONException occurred.", linkedhashmap);
                throw linkedhashmap;
            }
        }
    }

    private DatabaseAccessor getAccessor()
        throws JSONStoreDatabaseClosedException
    {
        if (initializedJSONStoreInstance == null)
        {
            JSONStoreDatabaseClosedException jsonstoredatabaseclosedexception = new JSONStoreDatabaseClosedException("Collection is not initialized.");
            logger.logError("Collection is not initialized.", jsonstoredatabaseclosedexception);
            throw jsonstoredatabaseclosedexception;
        }
        Object obj = DatabaseManager.getInstance();
        if (obj == null || !((DatabaseManager) (obj)).isDatabaseOpen())
        {
            obj = new JSONStoreDatabaseClosedException("Database manager is null or database not opened.");
            logger.logError("Database manager is null or database not opened.", ((Throwable) (obj)));
            throw obj;
        }
        try
        {
            obj = ((DatabaseManager) (obj)).getDatabase(getName());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = new JSONStoreDatabaseClosedException("Could not get database accessor. Database is not open.");
            logger.logError("Could not get database accessor. Database is not open.", ((Throwable) (obj)));
            throw obj;
        }
        if (obj == null)
        {
            obj = new JSONStoreDatabaseClosedException("Database accessor is not open. The database is not open.");
            logger.logError("Database accessor is not open. The database is not open.", ((Throwable) (obj)));
            throw obj;
        }
        SQLiteDatabase sqlitedatabase = ((DatabaseAccessor) (obj)).getRawDatabase();
        if (sqlitedatabase == null || !sqlitedatabase.isOpen())
        {
            obj = new JSONStoreDatabaseClosedException("Could not get raw collection instance. The database is not open.");
            logger.logError("Could not get raw collection instance. The database is not open.", ((Throwable) (obj)));
            throw obj;
        } else
        {
            return ((DatabaseAccessor) (obj));
        }
    }

    private String getUsername()
    {
        if (initializedJSONStoreInstance != null)
        {
            return initializedJSONStoreInstance.getUsername();
        } else
        {
            return "";
        }
    }

    private boolean isJSONCreatedColumn(String s)
    {
        return s.equals("_deleted") || s.equals("_dirty") || s.equals("_id") || s.equals("json") || s.equals("_operation");
    }

    private List removeFilterDuplicates(List list)
    {
        ArrayList arraylist = new ArrayList();
        HashMap hashmap = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            JSONObject jsonobject = (JSONObject)list.next();
            if (!hashmap.containsKey(jsonobject.toString()))
            {
                hashmap.put(jsonobject.toString(), Boolean.valueOf(true));
                arraylist.add(jsonobject);
            }
        } while (true);
        return arraylist;
    }

    private Cursor runQuery(QueryBuilder querybuilder)
        throws JSONStoreDatabaseClosedException
    {
        if (querybuilder == null)
        {
            return null;
        } else
        {
            DatabaseAccessor databaseaccessor = getAccessor();
            StringBuilder stringbuilder = new StringBuilder();
            LinkedList linkedlist = new LinkedList();
            querybuilder.convertToQueryString(stringbuilder, linkedlist);
            querybuilder = (String[])(String[])linkedlist.toArray(new String[linkedlist.size()]);
            return databaseaccessor.getRawDatabase().rawQuery(stringbuilder.toString(), querybuilder);
        }
    }

    public void addData(List list)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        addData(list, null);
    }

    public void addData(List list, JSONStoreAddOptions jsonstoreaddoptions)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        JSONStoreAddOptions jsonstoreaddoptions1;
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance;
        jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_ADD);
        jsonstoreaddoptions1 = jsonstoreaddoptions;
        if (jsonstoreaddoptions != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        jsonstoreaddoptions1 = new JSONStoreAddOptions();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        int i = list.size();
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        jsonstoreanalyticsloginstance.end();
        return;
        DatabaseAccessor databaseaccessor;
        databaseaccessor = getAccessor();
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            databaseaccessor.getRawDatabase().beginTransaction();
        }
        i = 0;
        Iterator iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        list = (JSONObject)iterator.next();
        if (list == null) goto _L4; else goto _L3
_L3:
        Map map;
        map = schema.mapObject(list, jsonstoreaddoptions1.getAdditionalSearchFieldsAsJSON());
        map.put("json", list.toString());
        if (!jsonstoreaddoptions1.isMarkDirty())
        {
            break MISSING_BLOCK_LABEL_368;
        }
        map.put("_dirty", Long.valueOf((new Date()).getTime()));
        map.put("_operation", "add");
_L6:
        ContentValues contentvalues;
        Iterator iterator1;
        contentvalues = new ContentValues();
        iterator1 = map.keySet().iterator();
_L5:
        String s;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_398;
        }
        s = (String)iterator1.next();
        jsonstoreaddoptions = ((JSONStoreAddOptions) (map.get(s)));
        list = jsonstoreaddoptions;
        if (!(jsonstoreaddoptions instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        int j;
        if (((Boolean)jsonstoreaddoptions).booleanValue())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        list = Integer.valueOf(j);
        contentvalues.put((new StringBuilder()).append("'").append(JSONStoreUtil.getDatabaseSafeSearchFieldName(s)).append("'").toString(), list.toString());
          goto _L5
        list;
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            databaseaccessor.getRawDatabase().endTransaction();
        }
        throw list;
        list;
        jsonstoreanalyticsloginstance.end();
        throw list;
        list;
        list = new JSONStoreAddException("An internal error occurred when trying to store the JSONObject. Error mapping the search fields.", list);
        logger.logError("An internal error occurred when trying to store the JSONObject. Error mapping the search fields.", list);
        throw list;
        map.put("_dirty", Integer.valueOf(0));
        map.put("_operation", "store");
          goto _L6
        if (databaseaccessor.getRawDatabase().insert(getName(), null, contentvalues) == -1L)
        {
            list = new JSONStoreAddException("An internal error occurred when trying to insert a document.", i);
            logger.logError("An internal error occurred when trying to insert a document.", list);
            throw list;
        }
        break MISSING_BLOCK_LABEL_500;
_L2:
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            databaseaccessor.getRawDatabase().setTransactionSuccessful();
        }
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            databaseaccessor.getRawDatabase().endTransaction();
        }
        jsonstoreanalyticsloginstance.end();
        return;
        i++;
          goto _L4
    }

    public void addData(JSONArray jsonarray)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        addData(JSONStoreUtil.convertJSONArrayToJSONObjectList(jsonarray), null);
    }

    public void addData(JSONArray jsonarray, JSONStoreAddOptions jsonstoreaddoptions)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        addData(JSONStoreUtil.convertJSONArrayToJSONObjectList(jsonarray), jsonstoreaddoptions);
    }

    public void addData(JSONObject jsonobject)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(jsonobject);
        addData(((List) (arraylist)), null);
    }

    public void addData(JSONObject jsonobject, JSONStoreAddOptions jsonstoreaddoptions)
        throws JSONStoreAddException, JSONStoreDatabaseClosedException
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(jsonobject);
        addData(((List) (arraylist)), jsonstoreaddoptions);
    }

    public int changeData(List list)
        throws JSONStoreChangeException, JSONStoreDatabaseClosedException, JSONException
    {
        return changeData(list, null);
    }

    public int changeData(List list, JSONStoreChangeOptions jsonstorechangeoptions)
        throws JSONStoreChangeException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_CHANGE);
        getAccessor();
        Object obj;
        obj = jsonstorechangeoptions;
        if (jsonstorechangeoptions != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = new JSONStoreChangeOptions();
        int j;
        if (list == null)
        {
            jsonstoreanalyticsloginstance.end();
            return 0;
        }
        j = 0;
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            synchronized (getAccessor())
            {
                getAccessor().getRawDatabase().beginTransaction();
            }
        }
        Object obj1 = ((JSONStoreChangeOptions) (obj)).getSearchFieldCriteria();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        jsonstorechangeoptions = ((JSONStoreChangeOptions) (obj1));
        if (((List) (obj1)).size() != 0)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        jsonstorechangeoptions = new LinkedList();
        obj1 = jsonstorechangeoptions.iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        Object obj2 = (String)((Iterator) (obj1)).next();
        if (getSearchFields().containsKey(((String) (obj2)).toLowerCase()) || getAdditionalSearchFields().containsKey(((String) (obj2)).toLowerCase()) || getSearchFields().containsKey(obj2) || getAdditionalSearchFields().containsKey(obj2)) goto _L4; else goto _L3
_L3:
        list = (new StringBuilder()).append("Replace criteria '").append(((String) (obj2))).append("' must be a search field or additional search field.").toString();
        jsonstorechangeoptions = new JSONStoreChangeException(list);
        logger.logError(list, jsonstorechangeoptions);
        throw jsonstorechangeoptions;
_L25:
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            synchronized (getAccessor())
            {
                getAccessor().getRawDatabase().endTransaction();
            }
        }
        throw new JSONStoreChangeException(jsonstorechangeoptions);
        list;
        jsonstorechangeoptions;
        JVM INSTR monitorexit ;
        throw list;
_L2:
        Object obj3;
        Iterator iterator;
        obj3 = new LinkedList();
        obj2 = new LinkedList();
        iterator = list.iterator();
_L12:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L5:
        JSONObject jsonobject;
        JSONStoreQueryParts jsonstorequeryparts;
        JSONStoreQueryPart jsonstorequerypart;
        Iterator iterator1;
        jsonobject = (JSONObject)iterator.next();
        jsonstorequeryparts = new JSONStoreQueryParts();
        jsonstorequerypart = new JSONStoreQueryPart();
        iterator1 = jsonstorechangeoptions.iterator();
_L10:
        if (!iterator1.hasNext()) goto _L8; else goto _L7
_L7:
        String s = (String)iterator1.next();
        if (!jsonobject.has(s)) goto _L10; else goto _L9
_L9:
        obj1 = jsonobject.get(s);
        list = ((List) (obj1));
        if (!(obj1 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_452;
        }
        int i;
        if (((Boolean)obj1).booleanValue())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        list = Integer.valueOf(i);
        jsonstorequerypart.addEqual(s, list.toString());
          goto _L10
_L8:
        jsonstorequeryparts.addQueryPart(jsonstorequerypart);
        list = new QueryBuilderSelect(this, jsonstorequeryparts);
        list.addSelectStatement("_id", Boolean.valueOf(false));
        list = runQuery(list);
        if (list == null) goto _L12; else goto _L11
_L11:
        if (list.getCount() > 0 && jsonstorechangeoptions.size() != 0) goto _L14; else goto _L13
_L13:
        ((List) (obj2)).add(jsonobject);
_L16:
        list.close();
          goto _L12
_L14:
        list.moveToFirst();
        i = 0;
_L18:
        if (i >= list.getCount() || list.isAfterLast()) goto _L16; else goto _L15
_L15:
        int k = list.getInt(list.getColumnIndex("_id"));
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("json", jsonobject);
        ((JSONObject) (obj1)).put("_id", k);
        ((List) (obj3)).add(obj1);
        list.moveToNext();
        i++;
        if (true) goto _L18; else goto _L17
_L17:
          goto _L16
_L6:
        list = new JSONStoreReplaceOptions();
        list.setMarkDirty(((JSONStoreChangeOptions) (obj)).isMarkDirty());
        obj1 = ((List) (obj3)).iterator();
        i = j;
_L20:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_745;
        }
        obj3 = (JSONObject)((Iterator) (obj1)).next();
        if (jsonstorechangeoptions.size() == 0) goto _L20; else goto _L19
_L19:
        replaceDocument(((JSONObject) (obj3)), list);
        i++;
          goto _L20
        list;
        list = new JSONStoreChangeException("Failed to replace an existing document.", list);
        logger.logError("Failed to replace an existing document.", list);
        throw list;
        list = new JSONStoreAddOptions();
        list.setMarkDirty(((JSONStoreChangeOptions) (obj)).isMarkDirty());
        j = i;
        if (!((JSONStoreChangeOptions) (obj)).isAddNew()) goto _L22; else goto _L21
_L21:
        jsonstorechangeoptions = ((List) (obj2)).iterator();
_L23:
        j = i;
        if (!jsonstorechangeoptions.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (JSONObject)jsonstorechangeoptions.next();
        addData(((JSONObject) (obj)), list);
        i++;
        if (true) goto _L23; else goto _L22
        list;
        list = new JSONStoreChangeException("Failed to add a new document.", list);
        logger.logError("Failed to add a new document.", list);
        throw list;
_L22:
        if (!initializedJSONStoreInstance.isTransactionInProgress())
        {
            synchronized (getAccessor())
            {
                getAccessor().getRawDatabase().setTransactionSuccessful();
                getAccessor().getRawDatabase().endTransaction();
            }
        }
        jsonstoreanalyticsloginstance.end();
        return j;
        jsonstorechangeoptions;
        list;
        JVM INSTR monitorexit ;
        try
        {
            throw jsonstorechangeoptions;
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreChangeOptions jsonstorechangeoptions) { }
        finally
        {
            jsonstoreanalyticsloginstance.end();
            throw list;
        }
        if (true) goto _L25; else goto _L24
_L24:
        jsonstorechangeoptions;
        list;
        JVM INSTR monitorexit ;
        throw jsonstorechangeoptions;
    }

    public int changeData(JSONObject ajsonobject[])
        throws JSONStoreChangeException, JSONStoreDatabaseClosedException, JSONException
    {
        return changeData(ajsonobject, null);
    }

    public int changeData(JSONObject ajsonobject[], JSONStoreChangeOptions jsonstorechangeoptions)
        throws JSONStoreChangeException, JSONStoreDatabaseClosedException, JSONException
    {
        return changeData(JSONStoreUtil.convertJSONObjectArrayToJSONObjectList(ajsonobject), jsonstorechangeoptions);
    }

    public void clearCollection()
        throws JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_CLEAR);
        getAccessor().getRawDatabase().delete(getName(), "1", new String[0]);
        jsonstoreanalyticsloginstance.end();
        return;
        Exception exception;
        exception;
        jsonstoreanalyticsloginstance.end();
        throw exception;
    }

    public int countAllDirtyDocuments()
        throws JSONStoreDatabaseClosedException, JSONStoreCountException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_COUNT_ALL_DIRTY);
        int i;
        getAccessor();
        JSONStoreQueryParts jsonstorequeryparts = new JSONStoreQueryParts();
        Object obj = new JSONStoreQueryPart();
        ((JSONStoreQueryPart) (obj)).addGreaterThan("_dirty", Integer.valueOf(0));
        jsonstorequeryparts.addQueryPart(((JSONStoreQueryPart) (obj)));
        obj = new JSONStoreCountOptions();
        ((JSONStoreCountOptions) (obj)).includeDeletedDocuments(true);
        i = countDocuments(jsonstorequeryparts, ((JSONStoreCountOptions) (obj)));
        jsonstoreanalyticsloginstance.end();
        return i;
        Exception exception;
        exception;
        jsonstoreanalyticsloginstance.end();
        throw exception;
    }

    public int countAllDocuments()
        throws JSONStoreCountException, JSONStoreDatabaseClosedException
    {
        return countDocuments(null, null);
    }

    public int countDocuments(JSONStoreQueryParts jsonstorequeryparts)
        throws JSONStoreCountException, JSONStoreDatabaseClosedException
    {
        return countDocuments(jsonstorequeryparts, null);
    }

    public int countDocuments(JSONStoreQueryParts jsonstorequeryparts, JSONStoreCountOptions jsonstorecountoptions)
        throws JSONStoreCountException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_COUNT);
        getAccessor();
        JSONStoreQueryParts jsonstorequeryparts1;
        jsonstorequeryparts1 = jsonstorequeryparts;
        if (jsonstorequeryparts != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        jsonstorequeryparts1 = new JSONStoreQueryParts();
        jsonstorequeryparts = jsonstorecountoptions;
        if (jsonstorecountoptions != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        jsonstorequeryparts = new JSONStoreCountOptions();
        jsonstorecountoptions = new JSONStoreFindOptions();
        if (jsonstorequeryparts.shouldIncludeDeletedDocuments())
        {
            jsonstorecountoptions.includeDeletedDocuments(true);
        }
        jsonstorecountoptions.addSearchFilterSpecial("count(*)");
        jsonstorequeryparts = findDocuments(jsonstorequeryparts1, jsonstorecountoptions);
        if (jsonstorequeryparts == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (jsonstorequeryparts.size() != 1)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        jsonstorequeryparts = (JSONObject)jsonstorequeryparts.get(0);
        if (jsonstorequeryparts == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (jsonstorequeryparts.opt("count(*)") != null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        throw new JSONStoreCountException("Could not count the results. Missing count return value internally");
        jsonstorequeryparts;
        throw new JSONStoreCountException("Could not count the results. Filter exception occured internally", jsonstorequeryparts);
        jsonstorequeryparts;
        jsonstoreanalyticsloginstance.end();
        throw jsonstorequeryparts;
        int i = jsonstorequeryparts.getInt("count(*)");
        jsonstoreanalyticsloginstance.end();
        return i;
        throw new JSONStoreCountException("Could not count the results. Missing results from find internally");
        jsonstorequeryparts;
        throw new JSONStoreCountException("Could not count the results. Find exception occured internally", jsonstorequeryparts);
        jsonstorequeryparts;
        throw new JSONStoreCountException("Could not count the results. JSONException occured internally", jsonstorequeryparts);
    }

    void disown()
    {
        disown(null);
    }

    void disown(String s)
    {
        if (s == null || initializedJSONStoreInstance.getUsername().equalsIgnoreCase(s))
        {
            initializedJSONStoreInstance = null;
        }
    }

    public List findAllDirtyDocuments()
        throws JSONStoreFindException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_FIND_ALL_DIRTY);
        Object obj;
        Object obj2;
        getAccessor();
        obj = new JSONStoreQueryParts();
        obj2 = new JSONStoreQueryPart();
        ((JSONStoreQueryPart) (obj2)).addGreaterThan("_dirty", Integer.valueOf(0));
        ((JSONStoreQueryParts) (obj)).addQueryPart(((JSONStoreQueryPart) (obj2)));
        obj2 = new JSONStoreFindOptions();
        ((JSONStoreFindOptions) (obj2)).addSearchFilter("_id");
        ((JSONStoreFindOptions) (obj2)).addSearchFilter("json");
        ((JSONStoreFindOptions) (obj2)).addSearchFilter("_operation");
        ((JSONStoreFindOptions) (obj2)).addSearchFilter("_dirty");
        ((JSONStoreFindOptions) (obj2)).includeDeletedDocuments(true);
        obj = findDocuments(((JSONStoreQueryParts) (obj)), ((JSONStoreFindOptions) (obj2)));
        jsonstoreanalyticsloginstance.end();
        return ((List) (obj));
        Object obj1;
        obj1;
        throw new JSONStoreFindException("Error occured filtering results", ((Throwable) (obj1)));
        obj1;
        jsonstoreanalyticsloginstance.end();
        throw obj1;
    }

    public List findAllDocuments()
        throws JSONStoreFindException, JSONStoreDatabaseClosedException
    {
        return findAllDocuments(null);
    }

    public List findAllDocuments(JSONStoreFindOptions jsonstorefindoptions)
        throws JSONStoreFindException, JSONStoreDatabaseClosedException
    {
        getAccessor();
        try
        {
            jsonstorefindoptions = findDocuments(null, jsonstorefindoptions);
        }
        // Misplaced declaration of an exception variable
        catch (JSONStoreFindOptions jsonstorefindoptions)
        {
            throw new JSONStoreFindException("Error occured filtering results", jsonstorefindoptions);
        }
        return jsonstorefindoptions;
    }

    public JSONObject findDocumentById(int i)
        throws JSONStoreDatabaseClosedException, JSONStoreFindException
    {
        Object obj = new ArrayList(1);
        ((List) (obj)).add(Integer.valueOf(i));
        obj = findDocumentsById(((List) (obj)));
        if (((List) (obj)).size() > 0)
        {
            return (JSONObject)((List) (obj)).get(0);
        } else
        {
            return null;
        }
    }

    public List findDocuments(JSONStoreQueryParts jsonstorequeryparts)
        throws JSONStoreFindException, JSONStoreFilterException, JSONStoreDatabaseClosedException
    {
        return findDocuments(jsonstorequeryparts, null);
    }

    public List findDocuments(JSONStoreQueryParts jsonstorequeryparts, JSONStoreFindOptions jsonstorefindoptions)
        throws JSONStoreFindException, JSONStoreFilterException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_FIND);
        getAccessor();
        JSONStoreFindOptions jsonstorefindoptions1;
        jsonstorefindoptions1 = jsonstorefindoptions;
        if (jsonstorefindoptions != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        jsonstorefindoptions1 = new JSONStoreFindOptions();
        jsonstorefindoptions = jsonstorequeryparts;
        if (jsonstorequeryparts != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        jsonstorefindoptions = new JSONStoreQueryParts();
        LinkedHashMap linkedhashmap;
        ArrayList arraylist;
        jsonstorefindoptions = new QueryBuilderSelect(this, jsonstorefindoptions);
        jsonstorefindoptions.setLimit(jsonstorefindoptions1.getLimit());
        jsonstorefindoptions.setOffset(jsonstorefindoptions1.getOffset());
        jsonstorefindoptions.setSort(jsonstorefindoptions1.getSort());
        if (jsonstorefindoptions1.shouldIncludeDeletedDocuments())
        {
            jsonstorefindoptions.setSearchIncludeDeleted();
        }
        linkedhashmap = new LinkedHashMap();
        arraylist = new ArrayList();
        jsonstorequeryparts = jsonstorefindoptions1.getSearchFilters();
        if (jsonstorequeryparts == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (jsonstorequeryparts.size() > 0)
        {
            String s;
            for (Iterator iterator = jsonstorequeryparts.keySet().iterator(); iterator.hasNext(); jsonstorefindoptions.addSelectStatement(s, Boolean.valueOf(((Boolean)jsonstorequeryparts.get(s)).booleanValue())))
            {
                s = (String)iterator.next();
            }

            break MISSING_BLOCK_LABEL_223;
        }
        break MISSING_BLOCK_LABEL_203;
        jsonstorequeryparts;
        jsonstoreanalyticsloginstance.end();
        throw jsonstorequeryparts;
        jsonstorefindoptions.addSelectStatement("_id", Boolean.valueOf(false));
        jsonstorefindoptions.addSelectStatement("json", Boolean.valueOf(false));
        Object obj;
        LinkedList linkedlist;
        obj = null;
        jsonstorequeryparts = null;
        linkedlist = null;
        jsonstorefindoptions = runQuery(jsonstorefindoptions);
        jsonstorequeryparts = linkedlist;
        if (jsonstorefindoptions == null) goto _L2; else goto _L1
_L1:
        jsonstorequeryparts = jsonstorefindoptions;
        obj = jsonstorefindoptions;
        linkedlist = new LinkedList();
        int i = 0;
_L14:
        if (i >= jsonstorefindoptions.getCount()) goto _L4; else goto _L3
_L3:
        jsonstorequeryparts = new JacksonSerializedJSONObject();
        jsonstorefindoptions.moveToNext();
        int j = 0;
_L20:
        if (j >= jsonstorefindoptions.getColumnNames().length) goto _L6; else goto _L5
_L5:
        if (!jsonstorefindoptions.getColumnName(j).equals("_id")) goto _L8; else goto _L7
_L7:
        jsonstorequeryparts.put(jsonstorefindoptions.getColumnName(j), jsonstorefindoptions.getInt(j));
          goto _L9
_L8:
        if (!jsonstorefindoptions.getColumnName(j).equals("json")) goto _L11; else goto _L10
_L10:
        jsonstorequeryparts.put("json", JsonOrgModule.deserializeJSONObject(jsonstorefindoptions.getString(j)));
          goto _L9
        obj;
_L19:
        jsonstorequeryparts = jsonstorefindoptions;
        obj = new JSONStoreFindException("Error when attempting to find a document. An error occurred when reading from the database.", ((Throwable) (obj)));
        jsonstorequeryparts = jsonstorefindoptions;
        logger.logError("Error when attempting to find a document. An error occurred when reading from the database.", ((Throwable) (obj)));
        jsonstorequeryparts = jsonstorefindoptions;
        throw obj;
        jsonstorefindoptions;
_L21:
        if (jsonstorequeryparts == null)
        {
            break MISSING_BLOCK_LABEL_420;
        }
        jsonstorequeryparts.close();
        throw jsonstorefindoptions;
_L11:
        if (!isJSONCreatedColumn(jsonstorefindoptions.getColumnName(j))) goto _L13; else goto _L12
_L12:
        jsonstorequeryparts.put(jsonstorefindoptions.getColumnName(j), jsonstorefindoptions.getString(j));
          goto _L9
_L13:
        jsonstorequeryparts.put(jsonstorefindoptions.getColumnName(j).replace("_", "."), jsonstorefindoptions.getString(j));
          goto _L9
_L6:
        linkedlist.add(jsonstorequeryparts);
        i++;
          goto _L14
_L4:
        jsonstorequeryparts = linkedlist;
_L2:
        if (jsonstorefindoptions == null)
        {
            break MISSING_BLOCK_LABEL_525;
        }
        jsonstorefindoptions.close();
        if (jsonstorefindoptions1.getSearchFilters() != null)
        {
            for (jsonstorequeryparts = jsonstorequeryparts.iterator(); jsonstorequeryparts.hasNext(); arraylist.add((JSONObject)jsonstorequeryparts.next())) { }
            break MISSING_BLOCK_LABEL_576;
        }
        addNonDuplicates(linkedhashmap, jsonstorequeryparts);
        if (jsonstorefindoptions1.getSearchFilters() == null) goto _L16; else goto _L15
_L15:
        jsonstorequeryparts = removeFilterDuplicates(arraylist);
_L18:
        jsonstoreanalyticsloginstance.end();
        return jsonstorequeryparts;
_L16:
        jsonstorequeryparts = new ArrayList(linkedhashmap.values());
        if (true) goto _L18; else goto _L17
_L17:
        jsonstorequeryparts;
        jsonstorefindoptions = ((JSONStoreFindOptions) (obj));
        obj = jsonstorequeryparts;
          goto _L19
_L9:
        j++;
          goto _L20
        Exception exception;
        exception;
        jsonstorequeryparts = jsonstorefindoptions;
        jsonstorefindoptions = exception;
          goto _L21
    }

    public List findDocumentsById(List list)
        throws JSONStoreDatabaseClosedException, JSONStoreFindException
    {
        LinkedList linkedlist;
        Iterator iterator;
        getAccessor();
        linkedlist = new LinkedList();
        iterator = JSONStoreUtil.splitListIntoChunks(list, 200).iterator();
_L2:
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (List)iterator.next();
        Object obj;
        obj = new JSONStoreQueryParts();
        JSONStoreQueryPart jsonstorequerypart;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((JSONStoreQueryParts) (obj)).addQueryPart(jsonstorequerypart))
        {
            Integer integer = (Integer)((Iterator) (obj1)).next();
            jsonstorequerypart = new JSONStoreQueryPart();
            jsonstorequerypart.addEqual("_id", integer);
        }

        Object obj2 = findDocuments(((JSONStoreQueryParts) (obj)));
        obj = new HashMap();
        JSONObject jsonobject;
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((HashMap) (obj)).put(Integer.valueOf(jsonobject.getInt("_id")), jsonobject))
        {
            jsonobject = (JSONObject)((Iterator) (obj2)).next();
        }

        try
        {
            Iterator iterator1 = list.iterator();
            while (iterator1.hasNext()) 
            {
                Integer integer1 = (Integer)iterator1.next();
                if (((HashMap) (obj)).containsKey(integer1))
                {
                    linkedlist.add(((HashMap) (obj)).get(integer1));
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
        return linkedlist;
    }

    public List findDocumentsById(int ai[])
        throws JSONStoreDatabaseClosedException, JSONStoreFindException
    {
        int ai1[] = ai;
        if (ai == null)
        {
            ai1 = new int[0];
        }
        return findDocumentsById(((List) (new ArrayList(ai1.length))));
    }

    public Map getAdditionalSearchFields()
    {
        return additionalSearchFields;
    }

    protected Map getAllSearchFields()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = searchFields.entrySet().iterator(); iterator.hasNext(); hashmap.put((String)entry.getKey(), (SearchFieldType)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (additionalSearchFields != null)
        {
            java.util.Map.Entry entry1;
            for (Iterator iterator1 = additionalSearchFields.entrySet().iterator(); iterator1.hasNext(); hashmap.put((String)entry1.getKey(), (SearchFieldType)entry1.getValue()))
            {
                entry1 = (java.util.Map.Entry)iterator1.next();
            }

        }
        return hashmap;
    }

    public String getName()
    {
        return name;
    }

    public Map getSearchFields()
    {
        return searchFields;
    }

    public boolean hasAdditionalSearchField(String s)
    {
        return additionalSearchFields.containsKey(s);
    }

    public boolean hasSearchField(String s)
    {
        if (s.equals("_deleted") || s.equals("_id") || s.equals("_dirty") || s.equals("_operation"))
        {
            return true;
        } else
        {
            return searchFields.containsKey(s);
        }
    }

    void initialize(WLJSONStore wljsonstore, DatabaseSchema databaseschema, boolean flag)
    {
        initializedJSONStoreInstance = wljsonstore;
        schema = databaseschema;
        wasReopened = flag;
    }

    public boolean isDocumentDirty(int i)
        throws JSONStoreDirtyCheckException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_IS_DOCUMENT_DIRTY);
        Object obj;
        getAccessor();
        obj = new JSONStoreQueryParts();
        JSONStoreQueryPart jsonstorequerypart = new JSONStoreQueryPart();
        jsonstorequerypart.addEqual("_id", Integer.valueOf(i));
        jsonstorequerypart.addGreaterThan("_dirty", Integer.valueOf(0));
        ((JSONStoreQueryParts) (obj)).addQueryPart(jsonstorequerypart);
        obj = findDocuments(((JSONStoreQueryParts) (obj)));
        i = ((List) (obj)).size();
        Object obj1;
        if (i > 0)
        {
            jsonstoreanalyticsloginstance.end();
            return true;
        } else
        {
            jsonstoreanalyticsloginstance.end();
            return false;
        }
        obj1;
        throw new JSONStoreDirtyCheckException("An error occured finding the document", ((Throwable) (obj1)));
        obj1;
        jsonstoreanalyticsloginstance.end();
        throw obj1;
    }

    public int markDocumentClean(JSONObject jsonobject)
        throws JSONStoreMarkCleanException, JSONStoreDatabaseClosedException
    {
        if (jsonobject == null)
        {
            return 0;
        }
        Object obj;
        int i;
        i = jsonobject.getInt("_id");
        obj = jsonobject.getString("_operation");
        if (obj == null)
        {
            try
            {
                jsonobject = new JSONStoreMarkCleanException("Document does not contain the operation to execute.");
                logger.logError("Document does not contain the operation to execute.", jsonobject);
                throw jsonobject;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject = new JSONStoreMarkCleanException("Could not parse the document.", jsonobject);
            }
            logger.logError("Could not parse the document.", jsonobject);
            throw jsonobject;
        }
        jsonobject = getAccessor().getWritableDatabase();
        if (((String) (obj)).equals("remove"))
        {
            jsonobject.delete(new String[] {
                "_id"
            }, new Object[] {
                Integer.valueOf(i)
            });
        }
        obj = new HashMap();
        ((HashMap) (obj)).put("_id", Integer.valueOf(i));
        jsonobject.update(new String[] {
            "_dirty", "_deleted", "_operation"
        }, new Object[] {
            Integer.valueOf(0), Integer.valueOf(0), ""
        }, ((Map) (obj)));
        return 1;
    }

    public int markDocumentsClean(List list)
        throws JSONStoreMarkCleanException, JSONStoreDatabaseClosedException
    {
        int i = 0;
        for (list = list.iterator(); list.hasNext();)
        {
            i += markDocumentClean((JSONObject)list.next());
        }

        return i;
    }

    public int markDocumentsClean(JSONObject ajsonobject[])
        throws JSONStoreMarkCleanException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_MARK_CLEAN);
        int i = markDocumentsClean(JSONStoreUtil.convertJSONObjectArrayToJSONObjectList(ajsonobject));
        jsonstoreanalyticsloginstance.end();
        return i;
        ajsonobject;
        jsonstoreanalyticsloginstance.end();
        throw ajsonobject;
    }

    public void removeCollection()
        throws JSONStoreRemoveCollectionException, JSONStoreDatabaseClosedException, JSONStoreTransactionFailureException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_REMOVE_COLLECTION);
        Object obj;
        obj = getAccessor();
        if (initializedJSONStoreInstance.isTransactionInProgress())
        {
            throw new JSONStoreTransactionFailureException("Cannot remove collection during a transaction.");
        }
        break MISSING_BLOCK_LABEL_48;
        obj;
        jsonstoreanalyticsloginstance.end();
        throw obj;
        ((DatabaseAccessor) (obj)).dropTable();
        initializedJSONStoreInstance.removeCollectionReference(this);
        jsonstoreanalyticsloginstance.end();
        return;
    }

    public int removeDocumentById(Integer integer)
        throws JSONStoreRemoveException, JSONStoreDatabaseClosedException
    {
        return removeDocumentById(integer, null);
    }

    public int removeDocumentById(Integer integer, JSONStoreRemoveOptions jsonstoreremoveoptions)
        throws JSONStoreRemoveException, JSONStoreDatabaseClosedException
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(integer);
        return removeDocumentsById(arraylist, jsonstoreremoveoptions);
    }

    public int removeDocumentsById(List list)
        throws JSONStoreRemoveException, JSONStoreDatabaseClosedException
    {
        return removeDocumentsById(list, null);
    }

    public int removeDocumentsById(List list, JSONStoreRemoveOptions jsonstoreremoveoptions)
        throws JSONStoreRemoveException, JSONStoreDatabaseClosedException
    {
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_REMOVE);
        DatabaseAccessor databaseaccessor = getAccessor();
        JSONStoreRemoveOptions jsonstoreremoveoptions1;
        jsonstoreremoveoptions1 = jsonstoreremoveoptions;
        if (jsonstoreremoveoptions != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        jsonstoreremoveoptions1 = new JSONStoreRemoveOptions();
        new LinkedList();
        jsonstoreremoveoptions = findDocumentsById(list);
        list = new LinkedList();
        int i = 0;
        boolean flag = initializedJSONStoreInstance.isTransactionInProgress();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        databaseaccessor.getRawDatabase().beginTransaction();
        jsonstoreremoveoptions = jsonstoreremoveoptions.iterator();
_L1:
        JSONObject jsonobject;
        do
        {
            if (!jsonstoreremoveoptions.hasNext())
            {
                break MISSING_BLOCK_LABEL_277;
            }
            jsonobject = (JSONObject)jsonstoreremoveoptions.next();
        } while (jsonobject == null);
        WritableDatabase writabledatabase = databaseaccessor.getWritableDatabase();
        Throwable throwable;
        int j;
        if (!jsonstoreremoveoptions1.isMarkDirty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = writabledatabase.deleteIfRequired(jsonobject, flag, true);
        i += j;
          goto _L1
        list;
        throw new JSONStoreRemoveException("Could not execute find on document ids", list);
        list;
        jsonstoreanalyticsloginstance.end();
        throw list;
        list;
        throw new JSONStoreRemoveException(list);
        throwable;
        String s = (new StringBuilder()).append("Error while removing/deleting document in collection \"").append(getName()).append("\".").toString();
        logger.logTrace(s);
        list.add(jsonobject);
        flag = initializedJSONStoreInstance.isTransactionInProgress();
        if (!flag) goto _L1; else goto _L2
_L2:
        databaseaccessor.getRawDatabase().endTransaction();
          goto _L1
        list;
        throw new JSONStoreRemoveException(list);
        if (list.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        flag = initializedJSONStoreInstance.isTransactionInProgress();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        databaseaccessor.getRawDatabase().endTransaction();
        list = new JSONStoreRemoveException("At least one document could not be removed.", list);
        logger.logError("At least one document could not be removed.", list);
        throw list;
        list;
        throw new JSONStoreRemoveException(list);
        flag = initializedJSONStoreInstance.isTransactionInProgress();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        databaseaccessor.getRawDatabase().setTransactionSuccessful();
        databaseaccessor.getRawDatabase().endTransaction();
        jsonstoreanalyticsloginstance.end();
        return i;
        list;
        throw new JSONStoreRemoveException(list);
    }

    public int replaceDocument(JSONObject jsonobject)
        throws JSONStoreReplaceException, JSONStoreDatabaseClosedException
    {
        return replaceDocument(jsonobject, null);
    }

    public int replaceDocument(JSONObject jsonobject, JSONStoreReplaceOptions jsonstorereplaceoptions)
        throws JSONStoreReplaceException, JSONStoreDatabaseClosedException
    {
        if (jsonobject == null)
        {
            return 0;
        } else
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(jsonobject);
            return replaceDocuments(arraylist, jsonstorereplaceoptions);
        }
    }

    public int replaceDocuments(List list)
        throws JSONStoreDatabaseClosedException, JSONStoreReplaceException
    {
        return replaceDocuments(list, null);
    }

    public int replaceDocuments(List list, JSONStoreReplaceOptions jsonstorereplaceoptions)
        throws JSONStoreDatabaseClosedException, JSONStoreReplaceException
    {
        JSONStoreReplaceOptions jsonstorereplaceoptions1;
        com.worklight.jsonstore.util.JSONStoreLogger.JSONStoreAnalyticsLogInstance jsonstoreanalyticsloginstance;
        int i;
        i = 0;
        jsonstoreanalyticsloginstance = JSONStoreLogger.startAnalyticsInstance(getUsername(), getName(), JSONStoreLogger.OPERATION_REPLACE);
        if (list == null)
        {
            jsonstoreanalyticsloginstance.end();
            return 0;
        }
        jsonstorereplaceoptions1 = jsonstorereplaceoptions;
        if (jsonstorereplaceoptions != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        jsonstorereplaceoptions1 = new JSONStoreReplaceOptions();
        LinkedList linkedlist;
        jsonstorereplaceoptions = getAccessor();
        linkedlist = new LinkedList();
        jsonstorereplaceoptions.getRawDatabase().beginTransaction();
        list = list.iterator();
_L1:
        JSONObject jsonobject;
        int j;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_219;
            }
            jsonobject = (JSONObject)list.next();
        } while (jsonobject == null);
        j = i + 1;
        jsonstorereplaceoptions.getWritableDatabase().update(jsonobject, jsonstorereplaceoptions1.isMarkDirty());
        i = j;
          goto _L1
        Throwable throwable;
        throwable;
        String s = (new StringBuilder()).append("Error while updating document on collection \"").append(schema.getName()).append("\".").toString();
        logger.logTrace(s);
        i = j;
        if (jsonobject == null) goto _L1; else goto _L2
_L2:
        linkedlist.add(jsonobject);
        i = j;
          goto _L1
        list;
        jsonstorereplaceoptions.getRawDatabase().endTransaction();
        throw list;
        list;
        jsonstoreanalyticsloginstance.end();
        throw list;
        if (linkedlist.size() != 0)
        {
            list = new JSONStoreReplaceException("At least one document failed to be replaced.", linkedlist);
            logger.logError("At least one document failed to be replaced.", list);
            throw list;
        }
        jsonstorereplaceoptions.getRawDatabase().setTransactionSuccessful();
        jsonstorereplaceoptions.getRawDatabase().endTransaction();
        jsonstoreanalyticsloginstance.end();
        return i;
    }

    public void setAdditionalSearchField(String s, SearchFieldType searchfieldtype)
    {
        if (searchfieldtype == null)
        {
            searchfieldtype = SearchFieldType.STRING;
        }
        additionalSearchFields.put(s, searchfieldtype);
    }

    public void setSearchField(String s, SearchFieldType searchfieldtype)
    {
        if (s == null || s.isEmpty())
        {
            return;
        }
        if (searchfieldtype == null)
        {
            searchfieldtype = SearchFieldType.STRING;
        }
        searchFields.put(s, searchfieldtype);
    }

    public boolean wasReopened()
    {
        return wasReopened;
    }
}
