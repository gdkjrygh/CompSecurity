// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.da.model;

import com.ibm.eo.model.EOMessage;
import com.ibm.eo.util.LogInternal;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DAModel extends EOMessage
{

    private JSONObject data;
    private boolean dataConstraintSuccess;

    public DAModel()
    {
        dataConstraintSuccess = true;
        data = new JSONObject();
        dataConstraintSuccess = true;
    }

    public DAModel(String s)
    {
        dataConstraintSuccess = true;
        try
        {
            data = new JSONObject(s);
            dataConstraintSuccess = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
        }
        throw new IllegalArgumentException();
    }

    public final JSONObject getJSON()
    {
        return data;
    }

    public final boolean isDataConstraintSuccess()
    {
        return dataConstraintSuccess;
    }

    public final void putData(String s, String s1)
    {
        try
        {
            data.put(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogInternal.logException(s);
        }
        throw new IllegalArgumentException("Invalid JSON being constructed");
    }

    public final void setDataConstraintSuccess(boolean flag)
    {
        dataConstraintSuccess = flag;
    }

    public final String toString()
    {
        return data.toString();
    }

    public final String toTagUrl()
    {
        int i;
        Object obj;
        JSONArray jsonarray;
        String s;
        String s1;
        int j;
        try
        {
            obj = new StringBuilder("?");
            jsonarray = data.names();
            j = jsonarray.length();
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception);
            throw new RuntimeException(exception);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = jsonarray.getString(i);
        s1 = URLEncoder.encode(data.getString(s), "UTF-8");
        ((StringBuilder) (obj)).append((new StringBuilder()).append(s).append("=").append(s1).toString());
        if (i >= j - 1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ((StringBuilder) (obj)).append("&");
        break MISSING_BLOCK_LABEL_125;
        obj = ((StringBuilder) (obj)).toString();
        return ((String) (obj));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
