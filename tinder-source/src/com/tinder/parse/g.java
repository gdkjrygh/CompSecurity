// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.tinder.model.SuperlikeStatus;
import org.json.JSONObject;

public final class g
{

    public static SuperlikeStatus a(JSONObject jsonobject)
    {
        SuperlikeStatus superlikestatus = new SuperlikeStatus();
        jsonobject = jsonobject.optJSONObject("super_likes");
        if (jsonobject != null)
        {
            int i = jsonobject.optInt("remaining");
            int j = jsonobject.optInt("allotment");
            jsonobject = jsonobject.optString("resets_at");
            superlikestatus.numRemaining = i;
            superlikestatus.numAllotted = j;
            superlikestatus.resetDate = jsonobject;
        }
        return superlikestatus;
    }
}
