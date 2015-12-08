// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.d;

import org.json.JSONException;
import org.json.JSONObject;

public interface b
{

    public abstract void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException;

    public abstract JSONObject toPublicApiJsonObject()
        throws JSONException;
}
