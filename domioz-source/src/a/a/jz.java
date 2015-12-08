// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            ka

public final class jz
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
            return new ka(s);
        } else
        {
            throw new JSONException((new StringBuilder("Unparsable JSON string: ")).append(s).toString());
        }
    }
}
