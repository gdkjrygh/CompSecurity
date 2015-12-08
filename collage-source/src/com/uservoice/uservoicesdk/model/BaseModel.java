// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import android.content.SharedPreferences;
import android.text.Html;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.RestMethod;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            Suggestion, Article, ClientConfig

public class BaseModel
{

    protected int id;

    public BaseModel()
    {
    }

    protected static transient String apiPath(String s, Object aobj[])
    {
        return (new StringBuilder()).append("/api/v1").append(String.format(s, aobj)).toString();
    }

    protected static List deserializeHeterogenousList(JSONObject jsonobject, String s)
        throws JSONException
    {
        ArrayList arraylist;
        int i;
        if (!jsonobject.has(s))
        {
            return null;
        }
        s = jsonobject.getJSONArray(s);
        arraylist = new ArrayList(s.length());
        i = 0;
_L9:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject1;
        jsonobject1 = s.getJSONObject(i);
        jsonobject = jsonobject1.getString("type");
        if (!jsonobject.equals("suggestion")) goto _L4; else goto _L3
_L3:
        jsonobject = new Suggestion();
_L7:
        jsonobject.load(jsonobject1);
        arraylist.add(jsonobject);
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!jsonobject.equals("article")) goto _L6; else goto _L5
_L5:
        jsonobject = new Article();
        if (true) goto _L7; else goto _L2
_L2:
        return arraylist;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected static List deserializeList(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        if (!jsonobject.has(s))
        {
            return null;
        }
        BaseModel basemodel;
        int i;
        try
        {
            jsonobject = jsonobject.getJSONArray(s);
            s = new ArrayList(jsonobject.length());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to instantiate ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        i = 0;
        if (i >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        basemodel = (BaseModel)class1.newInstance();
        basemodel.load(jsonobject.getJSONObject(i));
        s.add(basemodel);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_31;
_L1:
        return s;
    }

    protected static BaseModel deserializeObject(JSONObject jsonobject, String s, Class class1)
        throws JSONException
    {
        if (!jsonobject.has(s))
        {
            return null;
        }
        try
        {
            s = jsonobject.getJSONObject(s);
            BaseModel basemodel = (BaseModel)class1.newInstance();
            basemodel.load(s);
            s = (BaseModel)class1.cast(basemodel);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException((new StringBuilder()).append("JSON deserialization failure for ").append(class1).append(" ").append(s.getMessage()).append(" JSON: ").append(jsonobject.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to call load on ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new JSONException((new StringBuilder()).append("Reflection failed trying to instantiate ").append(class1).append(" ").append(jsonobject.getMessage()).toString());
        }
        return s;
    }

    protected static RestTask doDelete(String s, RestTaskCallback resttaskcallback)
    {
        return doDelete(s, null, resttaskcallback);
    }

    protected static RestTask doDelete(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.DELETE, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doGet(String s, RestTaskCallback resttaskcallback)
    {
        return doGet(s, null, resttaskcallback);
    }

    protected static RestTask doGet(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.GET, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doPost(String s, RestTaskCallback resttaskcallback)
    {
        return doPost(s, null, resttaskcallback);
    }

    protected static RestTask doPost(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.POST, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static RestTask doPut(String s, RestTaskCallback resttaskcallback)
    {
        return doPut(s, null, resttaskcallback);
    }

    protected static RestTask doPut(String s, Map map, RestTaskCallback resttaskcallback)
    {
        s = new RestTask(RestMethod.PUT, s, map, resttaskcallback);
        s.execute(new String[0]);
        return s;
    }

    protected static ClientConfig getClientConfig()
    {
        return getSession().getClientConfig();
    }

    protected static Config getConfig()
    {
        return getSession().getConfig();
    }

    protected static Session getSession()
    {
        return Session.getInstance();
    }

    public static BaseModel load(SharedPreferences sharedpreferences, String s, String s1, Class class1)
    {
        try
        {
            sharedpreferences = deserializeObject(new JSONObject(sharedpreferences.getString(s, "{}")), s1, class1);
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return null;
        }
        return sharedpreferences;
    }

    protected Map deserializeMap(JSONObject jsonobject)
        throws JSONException
    {
        Iterator iterator = jsonobject.keys();
        HashMap hashmap = new HashMap(jsonobject.length());
        Object obj;
        String s;
        for (; iterator.hasNext(); hashmap.put(s, obj))
        {
            s = (String)iterator.next();
            Object obj1 = jsonobject.get(s);
            obj = obj1;
            if (obj1 instanceof JSONObject)
            {
                obj = deserializeMap((JSONObject)obj1);
            }
        }

        return hashmap;
    }

    protected Map deserializeStringMap(JSONObject jsonobject)
        throws JSONException
    {
        Iterator iterator = jsonobject.keys();
        HashMap hashmap = new HashMap(jsonobject.length());
        String s;
        for (; iterator.hasNext(); hashmap.put(s, jsonobject.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    protected Date getDate(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = getString(jsonobject, s);
        s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z");
        try
        {
            s = s.parse(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new JSONException((new StringBuilder()).append("Could not parse date: ").append(jsonobject).toString());
        }
        return s;
    }

    protected String getHtml(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return jsonobject.getString(s);
        }
    }

    public int getId()
    {
        return id;
    }

    protected String getString(JSONObject jsonobject, String s)
        throws JSONException
    {
        if (jsonobject.isNull(s))
        {
            return null;
        } else
        {
            return Html.fromHtml(jsonobject.getString(s)).toString().trim();
        }
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        id = jsonobject.getInt("id");
    }

    public boolean persist(SharedPreferences sharedpreferences, String s, String s1)
    {
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject = new JSONObject();
        try
        {
            save(jsonobject1);
            jsonobject.put(s1, jsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (SharedPreferences sharedpreferences)
        {
            return false;
        }
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.putString(s, jsonobject.toString());
        return sharedpreferences.commit();
    }

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("id", id);
    }

    protected JSONArray serializeList(List list)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (list = list.iterator(); list.hasNext(); jsonarray.put(serializeObject((BaseModel)list.next()))) { }
        return jsonarray;
    }

    protected JSONObject serializeMap(Map map)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        Object obj;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, obj))
        {
            s = (String)iterator.next();
            Object obj1 = map.get(s);
            obj = obj1;
            if (obj1 instanceof Map)
            {
                obj = serializeMap((Map)obj1);
            }
        }

        return jsonobject;
    }

    protected JSONObject serializeObject(BaseModel basemodel)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        basemodel.save(jsonobject);
        return jsonobject;
    }

    protected JSONObject serializeStringMap(Map map)
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject.put(s, map.get(s)))
        {
            s = (String)iterator.next();
        }

        return jsonobject;
    }
}
