// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

public class WLProcedureInvocationData
{

    private String adapter;
    private Object parameters[];
    private String procedure;

    public WLProcedureInvocationData(String s, String s1)
    {
        adapter = s;
        procedure = s1;
    }

    public Map getInvocationDataMap()
    {
        HashMap hashmap;
        JSONArray jsonarray;
        hashmap = new HashMap();
        jsonarray = new JSONArray();
        if (parameters == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < parameters.length) goto _L3; else goto _L2
_L2:
        hashmap.put("adapter", adapter);
        hashmap.put("procedure", procedure);
        hashmap.put("parameters", jsonarray.toString());
        return hashmap;
_L3:
        try
        {
            jsonarray.put(i, parameters[i]);
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException(jsonexception);
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setParameters(Object aobj[])
    {
        parameters = aobj;
    }
}
