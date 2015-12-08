// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PinNotRequired extends MdxMessage
{

    private static String PROPERTY_isPinVerified = "isPinVerified";
    private boolean isPinVerified;

    public PinNotRequired(JSONObject jsonobject)
        throws JSONException
    {
        super("PIN_VERIFICATION_NOT_REQUIRED");
        isPinVerified = jsonobject.optBoolean(PROPERTY_isPinVerified);
    }

    public boolean getIsPinVerified()
    {
        return isPinVerified;
    }

}
