// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONException;
import org.json.JSONObject;

public final class bc extends JSONObject
{

    public bc(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject.toString());
    }

    public final boolean a(String s)
    {
        return has(s) && !isNull(s);
    }

    public final bc b(String s)
        throws JSONException
    {
        return new bc(getJSONObject(s));
    }
}
