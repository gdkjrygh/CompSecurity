// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;
import com.netflix.mediaclient.javabridge.ui.Storage;
import com.netflix.mediaclient.util.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeNrdObject

public final class NativeStorage extends NativeNrdObject
    implements Storage
{
    private class KeyValuePair
    {

        public String key;
        final NativeStorage this$0;
        public String value;

        public JSONObject toJson()
            throws JSONException
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("key", key);
            jsonobject.put("value", value);
            return jsonobject;
        }

        public KeyValuePair(String s, String s1)
        {
            this$0 = NativeStorage.this;
            super();
            key = s;
            value = s1;
        }

        public KeyValuePair(JSONObject jsonobject)
            throws JSONException
        {
            this$0 = NativeStorage.this;
            super();
            key = JsonUtils.getString(jsonobject, "key", null);
            value = JsonUtils.getString(jsonobject, "value", null);
        }
    }


    private Map itemMapsByAccount;

    public NativeStorage(Bridge bridge)
    {
        super(bridge);
        itemMapsByAccount = new HashMap();
    }

    private int handlePropertyUpdate(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = getJSONObject(jsonobject, "properties", null);
        if (jsonobject == null)
        {
            Log.w("nf_object", "handlePropertyUpdate:: properties does not exist");
            return 0;
        } else
        {
            load(JsonUtils.getString(jsonobject, "data", null));
            return 1;
        }
    }

    private void load(String s)
        throws JSONException
    {
        itemMapsByAccount.clear();
        if (s != null && !s.equals("")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = new JSONObject(s)).has("accounts") && (s = s.getJSONArray("accounts")) != null)
        {
            int i = 0;
            while (i < s.length()) 
            {
                Object obj = s.getJSONObject(i);
                String s1 = JsonUtils.getString(((JSONObject) (obj)), "dak", null);
                ArrayList arraylist = new ArrayList();
                itemMapsByAccount.put(s1, arraylist);
                obj = JsonUtils.getJSONArray(((JSONObject) (obj)), "items");
                for (int j = 0; i < ((JSONArray) (obj)).length(); j++)
                {
                    arraylist.add(new KeyValuePair(((JSONArray) (obj)).getJSONObject(j)));
                }

                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void save()
    {
        Object obj;
        JSONArray jsonarray;
        Iterator iterator;
        obj = new JSONObject();
        jsonarray = new JSONArray();
        ((JSONObject) (obj)).put("accounts", jsonarray);
        iterator = itemMapsByAccount.keySet().iterator();
_L1:
        Object obj1;
        List list;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        String s = (String)iterator.next();
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("dak", s);
        jsonarray.put(obj1);
        list = (List)itemMapsByAccount.get(s);
        if (list != null)
        {
            try
            {
                JSONArray jsonarray1 = new JSONArray();
                ((JSONObject) (obj1)).put("items", jsonarray1);
                obj1 = list.iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    jsonarray1.put(((KeyValuePair)((Iterator) (obj1)).next()).toJson());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("nf_object", "Failed to save data", ((Throwable) (obj)));
                return;
            }
        }
          goto _L1
        bridge.getNrdProxy().setProperty("storage", "data", ((JSONObject) (obj)).toString());
        return;
    }

    public void clear(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if ((List)itemMapsByAccount.remove(s) != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        Log.w("nf_object", "Items not found! Nothing to clear!");
          goto _L1
        s;
        throw s;
        save();
          goto _L1
    }

    public void clearAll()
    {
        this;
        JVM INSTR monitorenter ;
        itemMapsByAccount.clear();
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("accounts", "");
        bridge.getNrdProxy().setProperty("storage", "data", jsonobject.toString());
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("nf_object", "Failed to save data", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public String getItem(String s, String s1)
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj = obj1;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L2:
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L4:
        s = (List)itemMapsByAccount.get(s);
        obj = obj1;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s.iterator();
_L6:
        obj = obj1;
        if (!s.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (KeyValuePair)s.next();
        if (!s1.equals(((KeyValuePair) (obj)).key)) goto _L6; else goto _L5
_L5:
        obj = ((KeyValuePair) (obj)).value;
        if (true) goto _L2; else goto _L7
_L7:
        s;
        throw s;
    }

    public String getName()
    {
        return "storage";
    }

    public String getPath()
    {
        return "nrdp.storage";
    }

    public String key(String s, int i)
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj = (List)itemMapsByAccount.get(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = (KeyValuePair)((List) (obj)).get(i);
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = ((KeyValuePair) (s)).key;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = obj1;
        if (!Log.isLoggable("nf_object", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d("nf_object", (new StringBuilder()).append("Map not found for account key ").append(s).toString());
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public int length(String s)
    {
        return 0;
    }

    public int processUpdate(JSONObject jsonobject)
    {
        String s = getString(jsonobject, "type", null);
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("processUpdate: handle type ").append(s).toString());
        }
        if (!"PropertyUpdate".equalsIgnoreCase(s))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        if (Log.isLoggable("nf_object", 3))
        {
            Log.d("nf_object", (new StringBuilder()).append("processUpdate: handle prop update ").append(jsonobject.toString()).toString());
        }
        int i = handlePropertyUpdate(jsonobject);
        return i;
        jsonobject;
        Log.e("nf_object", "Failed with JSON", jsonobject);
        return 1;
    }

    public void removeItem(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        List list = (List)itemMapsByAccount.get(s);
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Log.w("nf_object", "Items not found! We can not remove item!");
          goto _L1
        s;
        throw s;
        Object obj = null;
        Iterator iterator = list.iterator();
_L4:
        KeyValuePair keyvaluepair = obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        keyvaluepair = (KeyValuePair)iterator.next();
        if (!s1.equals(keyvaluepair.key)) goto _L4; else goto _L3
_L3:
        if (keyvaluepair == null) goto _L6; else goto _L5
_L5:
        list.remove(keyvaluepair);
_L8:
        save();
          goto _L1
_L6:
        if (!Log.isLoggable("nf_object", 3)) goto _L8; else goto _L7
_L7:
        Log.d("nf_object", (new StringBuilder()).append("Item was not found for key ").append(s1).append(" and account ").append(s).toString());
          goto _L8
    }

    public void setItem(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        List list = (List)itemMapsByAccount.get(s);
        Object obj;
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = new ArrayList();
        itemMapsByAccount.put(s, obj);
        ((List) (obj)).add(new KeyValuePair(s1, s2));
        save();
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public int size()
    {
        return 0;
    }
}
