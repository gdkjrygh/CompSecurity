// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;
import android.webkit.WebView;
import java.util.HashMap;
import org.apache.cordova.api.CordovaInterface;
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
    protected WebView mView;

    public ContactAccessor()
    {
    }

    protected HashMap buildPopulationSet(JSONArray jsonarray)
    {
        HashMap hashmap = new HashMap();
        if (jsonarray.length() != 1 || !jsonarray.getString(0).equals("*")) goto _L2; else goto _L1
_L1:
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
_L31:
        int i;
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        String s = jsonarray.getString(i);
        if (!s.startsWith("displayName")) goto _L6; else goto _L5
_L5:
        hashmap.put("displayName", Boolean.valueOf(true));
          goto _L7
_L6:
        if (!s.startsWith("name")) goto _L9; else goto _L8
_L8:
        hashmap.put("displayName", Boolean.valueOf(true));
        hashmap.put("name", Boolean.valueOf(true));
          goto _L7
_L9:
        if (!s.startsWith("nickname")) goto _L11; else goto _L10
_L10:
        hashmap.put("nickname", Boolean.valueOf(true));
          goto _L7
_L11:
        if (!s.startsWith("phoneNumbers")) goto _L13; else goto _L12
_L12:
        hashmap.put("phoneNumbers", Boolean.valueOf(true));
          goto _L7
_L13:
        if (!s.startsWith("emails")) goto _L15; else goto _L14
_L14:
        hashmap.put("emails", Boolean.valueOf(true));
          goto _L7
_L15:
        if (!s.startsWith("addresses")) goto _L17; else goto _L16
_L16:
        hashmap.put("addresses", Boolean.valueOf(true));
          goto _L7
_L17:
        if (!s.startsWith("ims")) goto _L19; else goto _L18
_L18:
        hashmap.put("ims", Boolean.valueOf(true));
          goto _L7
_L19:
        if (!s.startsWith("organizations")) goto _L21; else goto _L20
_L20:
        hashmap.put("organizations", Boolean.valueOf(true));
          goto _L7
_L21:
        if (!s.startsWith("birthday")) goto _L23; else goto _L22
_L22:
        hashmap.put("birthday", Boolean.valueOf(true));
          goto _L7
_L23:
        if (!s.startsWith("note")) goto _L25; else goto _L24
_L24:
        hashmap.put("note", Boolean.valueOf(true));
          goto _L7
_L25:
        if (!s.startsWith("urls")) goto _L27; else goto _L26
_L26:
        hashmap.put("urls", Boolean.valueOf(true));
          goto _L7
_L27:
        if (!s.startsWith("photos")) goto _L29; else goto _L28
_L28:
        hashmap.put("photos", Boolean.valueOf(true));
          goto _L7
_L29:
        try
        {
            if (s.startsWith("categories"))
            {
                hashmap.put("categories", Boolean.valueOf(true));
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e("ContactsAccessor", jsonarray.getMessage(), jsonarray);
            return hashmap;
        }
          goto _L7
_L4:
        return hashmap;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L7:
        i++;
        if (true) goto _L31; else goto _L30
_L30:
    }

    public abstract JSONObject getContactById(String s)
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
