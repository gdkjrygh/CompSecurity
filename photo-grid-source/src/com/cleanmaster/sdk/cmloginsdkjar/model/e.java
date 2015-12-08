// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class e
{

    static Set a(JSONObject jsonobject)
    {
        HashSet hashset = new HashSet();
        for (jsonobject = jsonobject.keys(); jsonobject.hasNext(); hashset.add(jsonobject.next())) { }
        return hashset;
    }

    static void a(JSONObject jsonobject, Map map)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.putOpt((String)entry.getKey(), entry.getValue());
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new IllegalArgumentException(jsonobject);
            }
        }

    }

    static Collection b(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); arraylist.add(jsonobject.opt((String)iterator.next()))) { }
        return arraylist;
    }
}
