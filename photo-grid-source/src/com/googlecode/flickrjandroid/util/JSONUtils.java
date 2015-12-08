// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.util;

import org.json.JSONObject;

public final class JSONUtils
{

    private JSONUtils()
    {
    }

    public static String getChildValue(JSONObject jsonobject, String s)
    {
        if (jsonobject.has(s))
        {
            return jsonobject.getJSONObject(s).optString("_content");
        } else
        {
            return null;
        }
    }
}
