// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.contacts;

import android.util.Log;
import java.util.HashMap;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ContactAccessor
{
    class WhereOptions
    {

        final ContactAccessor this$0;
        private String where;
        private String whereArgs[];

        public String getWhere()
        {
            return where;
        }

        public String[] getWhereArgs()
        {
            return whereArgs;
        }

        public void setWhere(String s)
        {
            where = s;
        }

        public void setWhereArgs(String as[])
        {
            whereArgs = as;
        }

        WhereOptions()
        {
            this$0 = ContactAccessor.this;
            super();
        }
    }


    protected final String LOG_TAG = "ContactsAccessor";
    protected CordovaInterface mApp;

    public ContactAccessor()
    {
    }

    protected HashMap buildPopulationSet(JSONObject jsonobject)
    {
        HashMap hashmap;
        int i;
        hashmap = new HashMap();
        Object obj = null;
        JSONArray jsonarray = obj;
        if (jsonobject != null)
        {
            jsonarray = obj;
            try
            {
                if (jsonobject.has("desiredFields"))
                {
                    jsonarray = jsonobject.getJSONArray("desiredFields");
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("ContactsAccessor", jsonobject.getMessage(), jsonobject);
                return hashmap;
            }
        }
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        if (jsonarray.length() != 0) goto _L3; else goto _L2
_L2:
        hashmap.put("displayName", Boolean.valueOf(true));
        hashmap.put("name", Boolean.valueOf(true));
        hashmap.put("nickname", Boolean.valueOf(true));
        hashmap.put("phoneNumbers", Boolean.valueOf(true));
        hashmap.put("emails", Boolean.valueOf(true));
        hashmap.put("addresses", Boolean.valueOf(true));
        hashmap.put("ims", Boolean.valueOf(true));
        hashmap.put("organizations", Boolean.valueOf(true));
        hashmap.put("birthday", Boolean.valueOf(true));
        hashmap.put("note", Boolean.valueOf(true));
        hashmap.put("urls", Boolean.valueOf(true));
        hashmap.put("photos", Boolean.valueOf(true));
        hashmap.put("categories", Boolean.valueOf(true));
        return hashmap;
_L32:
        if (i >= jsonarray.length()) goto _L5; else goto _L4
_L4:
        jsonobject = jsonarray.getString(i);
        if (!jsonobject.startsWith("displayName")) goto _L7; else goto _L6
_L6:
        hashmap.put("displayName", Boolean.valueOf(true));
          goto _L8
_L7:
        if (!jsonobject.startsWith("name")) goto _L10; else goto _L9
_L9:
        hashmap.put("displayName", Boolean.valueOf(true));
        hashmap.put("name", Boolean.valueOf(true));
          goto _L8
_L10:
        if (!jsonobject.startsWith("nickname")) goto _L12; else goto _L11
_L11:
        hashmap.put("nickname", Boolean.valueOf(true));
          goto _L8
_L12:
        if (!jsonobject.startsWith("phoneNumbers")) goto _L14; else goto _L13
_L13:
        hashmap.put("phoneNumbers", Boolean.valueOf(true));
          goto _L8
_L14:
        if (!jsonobject.startsWith("emails")) goto _L16; else goto _L15
_L15:
        hashmap.put("emails", Boolean.valueOf(true));
          goto _L8
_L16:
        if (!jsonobject.startsWith("addresses")) goto _L18; else goto _L17
_L17:
        hashmap.put("addresses", Boolean.valueOf(true));
          goto _L8
_L18:
        if (!jsonobject.startsWith("ims")) goto _L20; else goto _L19
_L19:
        hashmap.put("ims", Boolean.valueOf(true));
          goto _L8
_L20:
        if (!jsonobject.startsWith("organizations")) goto _L22; else goto _L21
_L21:
        hashmap.put("organizations", Boolean.valueOf(true));
          goto _L8
_L22:
        if (!jsonobject.startsWith("birthday")) goto _L24; else goto _L23
_L23:
        hashmap.put("birthday", Boolean.valueOf(true));
          goto _L8
_L24:
        if (!jsonobject.startsWith("note")) goto _L26; else goto _L25
_L25:
        hashmap.put("note", Boolean.valueOf(true));
          goto _L8
_L26:
        if (!jsonobject.startsWith("urls")) goto _L28; else goto _L27
_L27:
        hashmap.put("urls", Boolean.valueOf(true));
          goto _L8
_L28:
        if (!jsonobject.startsWith("photos")) goto _L30; else goto _L29
_L29:
        hashmap.put("photos", Boolean.valueOf(true));
          goto _L8
_L30:
        if (jsonobject.startsWith("categories"))
        {
            hashmap.put("categories", Boolean.valueOf(true));
        }
          goto _L8
_L5:
        return hashmap;
_L3:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L8:
        i++;
        if (true) goto _L32; else goto _L31
_L31:
    }

    public abstract JSONObject getContactById(String s)
        throws JSONException;

    public abstract JSONObject getContactById(String s, JSONArray jsonarray)
        throws JSONException;

    protected String getJsonString(JSONObject jsonobject, String s)
    {
        JSONObject jsonobject2 = null;
        JSONObject jsonobject1 = null;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        try
        {
            jsonobject = jsonobject.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.d("ContactsAccessor", (new StringBuilder()).append("Could not get = ").append(jsonobject.getMessage()).toString());
            return jsonobject2;
        }
        jsonobject1 = jsonobject;
        jsonobject2 = jsonobject;
        if (!jsonobject.equals("null"))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        jsonobject2 = jsonobject;
        Log.d("ContactsAccessor", (new StringBuilder()).append(s).append(" is string called 'null'").toString());
        jsonobject1 = null;
        return jsonobject1;
    }

    protected boolean isRequired(String s, HashMap hashmap)
    {
        s = (Boolean)hashmap.get(s);
        if (s == null)
        {
            return false;
        } else
        {
            return s.booleanValue();
        }
    }

    public abstract boolean remove(String s);

    public abstract String save(JSONObject jsonobject);

    public abstract JSONArray search(JSONArray jsonarray, JSONObject jsonobject);
}
