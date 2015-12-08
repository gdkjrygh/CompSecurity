// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            lb

public final class la
{

    public static Object a(String s)
    {
        if (s.trim().startsWith("{"))
        {
            return new JSONObject(s);
        }
        if (s.trim().startsWith("["))
        {
            return new JSONArray(s);
        }
        if (s.trim().startsWith("\"") || s.trim().matches("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?"))
        {
            return new lb(s);
        } else
        {
            throw new JSONException((new StringBuilder("Unparsable JSON string: ")).append(s).toString());
        }
    }
}
