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
    private boolean compressResponse;
    private boolean isCacheableRequest;
    private Object parameters[];
    private String procedure;

    public WLProcedureInvocationData(String s, String s1)
    {
        compressResponse = false;
        isCacheableRequest = false;
        adapter = s;
        procedure = s1;
    }

    public WLProcedureInvocationData(String s, String s1, boolean flag)
    {
        compressResponse = false;
        isCacheableRequest = false;
        adapter = s;
        procedure = s1;
        compressResponse = flag;
    }

    Map getInvocationDataMap()
    {
        Object obj = new HashMap();
        JSONArray jsonarray = new JSONArray();
        if (parameters != null)
        {
            int i = 0;
            while (i < parameters.length) 
            {
                try
                {
                    jsonarray.put(i, parameters[i]);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new RuntimeException(((Throwable) (obj)));
                }
                i++;
            }
        }
        ((Map) (obj)).put("adapter", adapter);
        ((Map) (obj)).put("procedure", procedure);
        ((Map) (obj)).put("parameters", jsonarray.toString());
        ((Map) (obj)).put("compressResponse", Boolean.toString(compressResponse));
        return ((Map) (obj));
    }

    public boolean isCacheableRequest()
    {
        return isCacheableRequest;
    }

    public void setCacheableRequest(boolean flag)
    {
        isCacheableRequest = flag;
    }

    public void setCompressResponse(boolean flag)
    {
        compressResponse = flag;
    }

    public void setParameters(Object aobj[])
    {
        parameters = aobj;
    }
}
