// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.auditude.ads.util:
//            StringUtil

public class ObjectUtil
{

    public ObjectUtil()
    {
    }

    public static boolean convertToBoolean(Object obj)
    {
        if (obj != null)
        {
            return Boolean.parseBoolean(obj.toString());
        } else
        {
            return false;
        }
    }

    public static float convertToFloat(Object obj, float f)
    {
        float f1 = f;
        if (obj != null)
        {
            try
            {
                f1 = Float.parseFloat(obj.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return f;
            }
        }
        return f1;
    }

    public static int convertToInt(Object obj, int i)
    {
        int j = i;
        if (obj != null)
        {
            try
            {
                j = Integer.parseInt(obj.toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return i;
            }
        }
        return j;
    }

    public static String convertToString(Object obj, String s)
    {
        if (obj != null)
        {
            s = obj.toString();
        }
        return s;
    }

    public static HashMap merge(HashMap hashmap, HashMap hashmap1)
    {
        if (hashmap != null || hashmap1 != null) goto _L2; else goto _L1
_L1:
        HashMap hashmap2 = new HashMap();
_L4:
        return hashmap2;
_L2:
        if (hashmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap2 = hashmap;
        if (hashmap1 == null) goto _L4; else goto _L3
_L3:
        if (hashmap1 != null && hashmap == null)
        {
            return hashmap1;
        }
        hashmap2 = new HashMap();
        hashmap = hashmap.entrySet().iterator();
_L7:
        if (hashmap.hasNext()) goto _L6; else goto _L5
_L5:
        hashmap = hashmap1.entrySet().iterator();
_L8:
        if (!hashmap.hasNext())
        {
            return hashmap2;
        }
        break MISSING_BLOCK_LABEL_137;
_L6:
        java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.next();
        if (StringUtil.isNotNullOrEmpty((String)entry.getKey()))
        {
            hashmap2.put((String)entry.getKey(), (String)entry.getValue());
        }
          goto _L7
        hashmap1 = (java.util.Map.Entry)hashmap.next();
        if (StringUtil.isNotNullOrEmpty((String)hashmap1.getKey()))
        {
            hashmap2.put((String)hashmap1.getKey(), (String)hashmap1.getValue());
        }
          goto _L8
    }
}
