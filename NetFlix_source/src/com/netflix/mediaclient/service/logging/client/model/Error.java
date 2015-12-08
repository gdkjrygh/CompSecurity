// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.client.model;

import com.netflix.mediaclient.service.logging.JsonSerializer;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging.client.model:
//            RootCause, DeepErrorElement, UIError

public class Error
    implements JsonSerializer
{

    public static final String DEEP_ERROR = "deepError";
    public static final String ROOT_CAUSE = "rootCause";
    private final List deepError;
    private RootCause rootCause;

    public Error()
    {
        deepError = new ArrayList();
    }

    public Error(RootCause rootcause, List list)
    {
        deepError = new ArrayList();
        rootCause = rootcause;
        if (list != null)
        {
            deepError.addAll(list);
        }
    }

    public Error(JSONObject jsonobject)
        throws JSONException
    {
        deepError = new ArrayList();
        String s = JsonUtils.getString(jsonobject, "rootCause", null);
        if (s != null)
        {
            rootCause = RootCause.valueOf(s);
        }
        jsonobject = JsonUtils.getJSONArray(jsonobject, "deepError");
        if (jsonobject != null)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                deepError.add(DeepErrorElement.createInstance(jsonobject.getJSONObject(i)));
            }

        }
    }

    public static Error createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject == null)
        {
            return null;
        } else
        {
            return new Error(jsonobject);
        }
    }

    public static UIError createInstance(String s)
        throws JSONException
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return new UIError(new JSONObject(s));
        }
    }

    public void addDeepError(DeepErrorElement deeperrorelement)
    {
        deepError.add(deeperrorelement);
    }

    public void addDeepErrors(List list)
    {
        deepError.addAll(list);
    }

    public List getDeepError()
    {
        return deepError;
    }

    public RootCause getRootCause()
    {
        return rootCause;
    }

    public void setRootCause(RootCause rootcause)
    {
        rootCause = rootcause;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (rootCause != null)
        {
            jsonobject.put("rootCause", rootCause.name());
        }
        if (deepError != null && deepError.size() > 0)
        {
            JSONArray jsonarray = new JSONArray();
            for (Iterator iterator = deepError.iterator(); iterator.hasNext(); jsonarray.put(((DeepErrorElement)iterator.next()).toJSONObject())) { }
            jsonobject.put("deepError", jsonarray);
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Error [rootCause=").append(rootCause).append("]").toString();
    }
}
