// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import java.util.HashMap;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

class NinaAnimConstants
{

    private final HashMap globalConstantMap = new HashMap();
    private final HashMap localConstantMap = new HashMap();
    private final float scaleFactor;
    private final int timeAdj;
    private final float timeMult;

    NinaAnimConstants(float f, int i, JSONObject jsonobject)
    {
        scaleFactor = f;
        timeMult = (float)i * 0.001F;
        int k = 1000 / i;
        int j = k;
        if (1000 % i == 0)
        {
            j = k - 1;
        }
        timeAdj = j;
        populateMapFromJson(globalConstantMap, jsonobject);
    }

    private void populateMapFromJson(HashMap hashmap, JSONObject jsonobject)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        return;
_L2:
        if ((jsonarray = jsonobject.names()) != null)
        {
            int j = jsonarray.length();
            int i = 0;
            while (i < j) 
            {
                String s = jsonarray.getString(i);
                hashmap.put(s, jsonobject.getString(s));
                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private String resolveConstant(String s)
    {
        String s1 = (String)localConstantMap.get(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return (String)globalConstantMap.get(s);
        }
    }

    int resolveColor(String s)
    {
        String s1 = s;
        if (!s.startsWith("#"))
        {
            s = resolveConstant(s);
            s1 = s;
            if (s == null)
            {
                throw new NoSuchElementException((new StringBuilder("Constant ")).append(s).append(" does not exist in constants table").toString());
            }
        }
        if (!s1.startsWith("#"))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid color specification: ")).append(s1).append(" -- Color specifications must start with hash (#) character").toString());
        }
        int j = 0;
        for (int i = 1; i < s1.length(); i++)
        {
            int k = Character.digit(s1.charAt(i), 16);
            if (-1 == k)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid color specification: ")).append(s1).append(" -- Color components must be composed of hex digits").toString());
            }
            j = j << 4 | k;
        }

        return j;
    }

    float resolveFloat(String s)
    {
        return resolveFloat(s, false);
    }

    float resolveFloat(String s, boolean flag)
    {
        String s1 = resolveConstant(s);
        if (s1 != null)
        {
            s = s1;
        }
        float f1 = Float.valueOf(s).floatValue();
        float f = f1;
        if (flag)
        {
            f = f1 * scaleFactor;
        }
        return f;
    }

    int resolveTime(int i)
    {
        return (int)((float)(timeAdj + i) * timeMult);
    }

    void setLocalMap(JSONObject jsonobject)
    {
        localConstantMap.clear();
        populateMapFromJson(localConstantMap, jsonobject);
    }
}
