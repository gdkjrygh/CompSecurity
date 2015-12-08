// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.graphics.Color;
import org.json.JSONObject;

public final class gi
{

    public static Integer a(Object obj)
    {
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
            int i = ((JSONObject) (obj)).optInt("r", -1);
            int j = ((JSONObject) (obj)).optInt("g", -1);
            int k = ((JSONObject) (obj)).optInt("b", -1);
            int l = ((JSONObject) (obj)).optInt("a", -1);
            if (i != -1 && j != -1 && k != -1 && l != -1)
            {
                return Integer.valueOf(Color.argb(l * 255, i, j, k));
            }
        }
        return null;
    }
}
