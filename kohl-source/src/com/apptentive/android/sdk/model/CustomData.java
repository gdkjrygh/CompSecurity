// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import com.apptentive.android.sdk.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomData extends JSONObject
{

    public CustomData()
        throws JSONException
    {
    }

    public CustomData(String s)
        throws JSONException
    {
        super(s);
    }

    public CustomData(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject.toString());
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof CustomData)) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        HashMap hashmap1;
        if (this == obj)
        {
            return true;
        }
        obj = (JSONObject)obj;
        if (length() != ((JSONObject) (obj)).length())
        {
            return false;
        }
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        JSONException jsonexception;
        String s;
        for (Iterator iterator = keys(); iterator.hasNext(); hashmap.put(s, getString(s)))
        {
            s = (String)iterator.next();
        }

          goto _L3
_L4:
        return hashmap.equals(hashmap1);
_L3:
        try
        {
            Iterator iterator1 = ((JSONObject) (obj)).keys();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                hashmap1.put(s1, ((JSONObject) (obj)).getString(s1));
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception)
        {
            Log.e("Error comparing two device data entries: \"%s\"  AND  \"%s\"", new Object[] {
                toString(), ((JSONObject) (obj)).toString()
            });
        }
        if (true) goto _L4; else goto _L2
_L2:
        return false;
    }
}
