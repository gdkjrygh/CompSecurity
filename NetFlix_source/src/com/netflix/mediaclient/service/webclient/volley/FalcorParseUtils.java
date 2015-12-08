// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.volley;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.service.webclient.volley:
//            FalcorParseException, FalcorServerException

public class FalcorParseUtils
{

    public static final String FIELD_CURRENT = "current";
    public static final String FIELD_EPISODES = "episodes";
    private static final String FIELD_PATH = "path";
    private static final String FIELD_VALUE = "value";
    public static final String FIELD_VIDEOS = "videos";
    private static final String METHOD_TYPE_CALL = "call";
    private static final String METHOD_TYPE_GET = "get";
    private static final String PARAM_NAME_CALLPATH = "callPath";
    private static final String PARAM_NAME_PARAM = "param";
    private static final String PARAM_NAME_PATH = "path";
    private static final Gson gson = new Gson();

    public FalcorParseUtils()
    {
    }

    public static String buildEmptyValueMessage()
    {
        return new String("{\"value\":{},\"paths\":[[\"topGenres\",\"null\"]]}");
    }

    public static String buildErrorMessage()
    {
        return new String("{\"value\":{},\"error\":{\"message\":\"For input string: null\",\"pql\":[\"topGenre\",[\"null\"]]}}");
    }

    public static String buildInnerErrorMessage()
    {
        return new String("{ \"value\": {},  \"error\": { \"innerErrors\": [{\"message\": \"Not authorized.\",\"pql\": [\"topGenre\", [\"7462\"]],\"unauthorized\": true }, {\"message\": \"Not authorized.\",\"pql\": [\"topGenre\", [\"7462\"]], \"unauthorized\": true }]}}");
    }

    public static String buildMapErrorMessage()
    {
        return new String("");
    }

    public static String buildNotAuthorizedMessage()
    {
        return new String("{\"value\":{},\"error\":{\"message\":\"Not authorized.\",\"pql\":[\"topGenre\",[\"null\"]],\"unauthorized\":true}}");
    }

    public static String buildNullPointerMessage()
    {
        return new String("{\"value\":{},\"error\":{\"innerErrors\":[{\"error\":\"java.lang.NullPointerException\"},{\"error\":\"java.lang.NullPointerException\"}]}}");
    }

    public static boolean containsErrors(JsonObject jsonobject)
    {
        return jsonobject.has("error") || jsonobject.has("innerErrors");
    }

    public static JsonObject getDataObj(String s, String s1)
        throws FalcorParseException, FalcorServerException
    {
        Object obj;
        try
        {
            obj = (new JsonParser()).parse(s1).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v(s, (new StringBuilder()).append("String response to parse = ").append(s1).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        if (containsErrors(((JsonObject) (obj))))
        {
            throw new FalcorServerException(getErrorMessage(((JsonObject) (obj))));
        } else
        {
            return ((JsonObject) (obj)).getAsJsonObject("value");
        }
    }

    public static String getErrorMessage(JsonObject jsonobject)
    {
        if (containsErrors(jsonobject))
        {
            jsonobject = jsonobject.getAsJsonObject("error");
            if (jsonobject.has("message"))
            {
                return jsonobject.get("message").toString();
            }
            if (jsonobject.has("innerErrors"))
            {
                return jsonobject.get("innerErrors").toString();
            }
        }
        return null;
    }

    public static JsonObject getFirstJsonObject(JsonObject jsonobject)
    {
        if (jsonobject != null)
        {
            Object obj = null;
            Iterator iterator = jsonobject.entrySet().iterator();
            jsonobject = obj;
            if (iterator.hasNext())
            {
                jsonobject = (JsonElement)((java.util.Map.Entry)iterator.next()).getValue();
            }
            if (jsonobject != null)
            {
                return jsonobject.getAsJsonObject();
            }
        }
        return null;
    }

    public static Gson getGson()
    {
        return gson;
    }

    public static String getIdFromPath(String s, JsonObject jsonobject)
        throws FalcorParseException, FalcorServerException
    {
        String s1;
        try
        {
            s1 = jsonobject.getAsJsonArray("path").get(1).getAsString();
        }
        catch (Exception exception)
        {
            Log.v(s, (new StringBuilder()).append("String jsonObj to parse = ").append(jsonobject.toString()).toString());
            throw new FalcorParseException("Missing path/id in jsonObj", exception);
        }
        return s1;
    }

    public static String getMethodNameCall()
    {
        return "call";
    }

    public static String getMethodNameGet()
    {
        return "get";
    }

    public static String getParamNameCallPath()
    {
        return "callPath";
    }

    public static String getParamNameParam()
    {
        return "param";
    }

    public static String getParamNamePath()
    {
        return "path";
    }

    public static Object getPropertyObject(JsonObject jsonobject, String s, Class class1)
    {
        if (jsonobject.has(s))
        {
            jsonobject = jsonobject.get(s);
            return gson.fromJson(jsonobject, class1);
        } else
        {
            return null;
        }
    }

    public static VideoType getTypeFromPath(String s, JsonObject jsonobject)
        throws FalcorParseException, FalcorServerException
    {
        String s1;
        try
        {
            s1 = jsonobject.getAsJsonArray("path").get(0).getAsString();
        }
        catch (Exception exception)
        {
            Log.v(s, (new StringBuilder()).append("String jsonObj to parse = ").append(jsonobject.toString()).toString());
            throw new FalcorParseException("Missing path/type in jsonObj", exception);
        }
        return VideoType.create(s1);
    }

    public static boolean isEmpty(JsonObject jsonobject)
    {
        return jsonobject.isJsonNull() || jsonobject.toString().equals("{}");
    }

    public static boolean isMapCacheError(String s)
    {
        return s.contains("cache miss") || s.contains("mapgetcachedlistclient failed") || s.contains("cachemiss");
    }

    public static boolean isMapError(String s)
    {
        return s.contains("map error");
    }

    public static boolean isNotAuthorized(String s)
    {
        return s.contains("Not authorized") || s.contains("unauthorized");
    }

    public static boolean isNullPointerException(String s)
    {
        return s.contains("NullPointerException");
    }

    public static boolean isWrongState(String s)
    {
        return s.contains("wrong state");
    }

}
