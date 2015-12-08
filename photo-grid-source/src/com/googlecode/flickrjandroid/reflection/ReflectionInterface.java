// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.reflection;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.util.JSONUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.reflection:
//            Method, Argument, Error

public class ReflectionInterface
{

    public static final String METHOD_GET_METHODS = "flickr.reflection.getMethods";
    public static final String METHOD_GET_METHOD_INFO = "flickr.reflection.getMethodInfo";
    private String apiKey;
    private String sharedSecret;
    private Transport transport;

    public ReflectionInterface(String s, String s1, Transport transport1)
    {
        apiKey = s;
        sharedSecret = s1;
        transport = transport1;
    }

    public Method getMethodInfo(String s)
    {
        Object obj;
        Object obj1;
        JSONArray jsonarray;
        int i;
        boolean flag;
        flag = false;
        obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.reflection.getMethodInfo"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        ((List) (obj)).add(new Parameter("method_name", s));
        obj = transport.get(transport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        obj1 = ((Response) (obj)).getData().getJSONObject("method");
        s = new Method();
        s.setName(((JSONObject) (obj1)).getString("name"));
        s.setNeedsLogin("1".equals(((JSONObject) (obj1)).getString("needslogin")));
        s.setNeedsSigning("1".equals(((JSONObject) (obj1)).getString("needssigning")));
        s.setRequiredPerms(((JSONObject) (obj1)).optInt("requiredperms"));
        s.setDescription(JSONUtils.getChildValue(((JSONObject) (obj1)), "description"));
        s.setResponse(JSONUtils.getChildValue(((JSONObject) (obj1)), "response"));
        s.setExplanation(JSONUtils.getChildValue(((JSONObject) (obj1)), "explanation"));
        obj1 = new ArrayList();
        jsonarray = ((Response) (obj)).getData().getJSONObject("arguments").optJSONArray("argument");
        i = 0;
_L3:
        if (jsonarray != null && i < jsonarray.length()) goto _L2; else goto _L1
_L1:
        s.setArguments(((Collection) (obj1)));
        obj1 = ((Response) (obj)).getData().getJSONObject("errors");
        obj = new ArrayList();
        obj1 = ((JSONObject) (obj1)).optJSONArray("error");
        i = ((flag) ? 1 : 0);
_L4:
        if (obj1 == null || i >= ((JSONArray) (obj1)).length())
        {
            s.setErrors(((Collection) (obj)));
            return s;
        }
        break MISSING_BLOCK_LABEL_388;
_L2:
        Argument argument = new Argument();
        JSONObject jsonobject1 = jsonarray.getJSONObject(i);
        argument.setName(jsonobject1.getString("name"));
        argument.setOptional("1".equals(jsonobject1.getString("optional")));
        argument.setDescription(jsonobject1.getString("_content"));
        ((List) (obj1)).add(argument);
        i++;
          goto _L3
        Error error = new Error();
        JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(i);
        error.setCode(jsonobject.getString("code"));
        error.setMessage(jsonobject.getString("message"));
        error.setExplaination(jsonobject.getString("_content"));
        ((List) (obj)).add(error);
        i++;
          goto _L4
    }

    public Collection getMethods()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.reflection.getMethods"));
        ((List) (obj)).add(new Parameter("api_key", apiKey));
        obj = transport.get(transport.getPath(), ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        }
        Object obj1 = ((Response) (obj)).getData().getJSONObject("methods");
        obj = new ArrayList();
        obj1 = ((JSONObject) (obj1)).optJSONArray("method");
        int i = 0;
        do
        {
            if (obj1 == null || i >= ((JSONArray) (obj1)).length())
            {
                return ((Collection) (obj));
            }
            ((List) (obj)).add(((JSONArray) (obj1)).getJSONObject(i).getString("_content"));
            i++;
        } while (true);
    }
}
