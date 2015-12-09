// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.android;

import com.netflix.mediaclient.event.nrdp.media.NccpError;
import org.json.JSONException;
import org.json.JSONObject;

public class NetworkError extends NccpError
{

    public NetworkError()
    {
    }

    public String getObject()
    {
        return "nrdp.android";
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
    }
}
