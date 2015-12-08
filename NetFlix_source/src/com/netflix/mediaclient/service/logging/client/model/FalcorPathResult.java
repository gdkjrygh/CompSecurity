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
//            DeepErrorElement

public class FalcorPathResult
    implements JsonSerializer
{

    public static final String PATH = "path";
    public static final String PATH_ERROR = "pathError";
    public static final String SUCCESS = "success";
    private String path;
    private List pathError;
    private boolean success;

    public FalcorPathResult()
    {
        pathError = new ArrayList();
    }

    public FalcorPathResult(String s, boolean flag, List list)
    {
        pathError = new ArrayList();
        path = s;
        success = flag;
        if (list != null)
        {
            pathError.addAll(list);
        }
    }

    public static FalcorPathResult createInstance(String s)
        throws JSONException
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return createInstance(new JSONObject(s));
        }
    }

    public static FalcorPathResult createInstance(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        FalcorPathResult falcorpathresult = new FalcorPathResult();
        falcorpathresult.success = JsonUtils.getBoolean(jsonobject, "success", false);
        falcorpathresult.path = JsonUtils.getString(jsonobject, "path", null);
        JSONArray jsonarray = JsonUtils.getJSONArray(jsonobject, "pathError");
        jsonobject = falcorpathresult;
        if (jsonarray == null)
        {
            continue;
        }
        int i = 0;
        do
        {
            jsonobject = falcorpathresult;
            if (i >= jsonarray.length())
            {
                continue;
            }
            falcorpathresult.pathError.add(DeepErrorElement.createInstance(jsonarray.getJSONObject(i)));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String createJSONArray(List list)
        throws JSONException
    {
        if (list == null || list.size() < 1)
        {
            return null;
        }
        JSONArray jsonarray = new JSONArray();
        for (int i = 0; i < list.size(); i++)
        {
            jsonarray.put(((FalcorPathResult)list.get(i)).toJSONObject());
        }

        return jsonarray.toString();
    }

    public static List createList(String s)
        throws JSONException
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        JSONArray jsonarray = new JSONArray(s);
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            s = arraylist;
            if (i >= jsonarray.length())
            {
                continue;
            }
            arraylist.add(createInstance(jsonarray.getJSONObject(i)));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getPath()
    {
        return path;
    }

    public List getPathError()
    {
        return pathError;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        if (path != null)
        {
            jsonobject.put("path", path);
        }
        jsonobject.put("success", success);
        if (pathError != null)
        {
            JSONArray jsonarray = new JSONArray();
            jsonobject.put("pathError", jsonarray);
            for (Iterator iterator = pathError.iterator(); iterator.hasNext(); jsonarray.put(((DeepErrorElement)iterator.next()).toJSONObject())) { }
        }
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FalcorPathResult [path=").append(path).append(", success=").append(success).append("]").toString();
    }
}
