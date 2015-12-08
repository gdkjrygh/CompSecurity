// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class kdk
{

    public static boolean a(Object obj, Object obj1)
    {
        boolean flag1 = false;
        if (obj != null || obj1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((obj instanceof JSONObject) && (obj1 instanceof JSONObject))
        {
            obj = (JSONObject)obj;
            obj1 = (JSONObject)obj1;
            flag = flag1;
            if (((JSONObject) (obj)).length() != ((JSONObject) (obj1)).length())
            {
                continue; /* Loop/switch isn't completed */
            }
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                flag = flag1;
                if (!((JSONObject) (obj1)).has(s))
                {
                    continue; /* Loop/switch isn't completed */
                }
                int i;
                boolean flag2;
                try
                {
                    flag = a(((JSONObject) (obj)).get(s), ((JSONObject) (obj1)).get(s));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return false;
                }
                if (!flag)
                {
                    return false;
                }
            }

            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj1 instanceof JSONArray))
        {
            break MISSING_BLOCK_LABEL_220;
        }
        obj = (JSONArray)obj;
        obj1 = (JSONArray)obj1;
        flag = flag1;
        if (((JSONArray) (obj)).length() != ((JSONArray) (obj1)).length())
        {
            continue; /* Loop/switch isn't completed */
        }
        i = 0;
        do
        {
            if (i >= ((JSONArray) (obj)).length())
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                flag2 = a(((JSONArray) (obj)).get(i), ((JSONArray) (obj1)).get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (!flag2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
        return obj.equals(obj1);
    }

    static 
    {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }
}
