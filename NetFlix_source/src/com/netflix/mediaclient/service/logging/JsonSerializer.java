// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import org.json.JSONException;
import org.json.JSONObject;

public interface JsonSerializer
{

    public abstract JSONObject toJSONObject()
        throws JSONException;
}
