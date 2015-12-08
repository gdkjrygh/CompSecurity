// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.google.gson.e;
import com.tinder.model.Badge;
import org.json.JSONObject;

public final class a
{

    public static Badge a(String s)
    {
        return (Badge)(new e()).a(s, com/tinder/model/Badge);
    }

    public static Badge a(JSONObject jsonobject)
    {
        try
        {
            jsonobject = new Badge(jsonobject.optString("type", null), jsonobject.optString("description", null), jsonobject.optString("color", null));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return new Badge();
        }
        return jsonobject;
    }
}
