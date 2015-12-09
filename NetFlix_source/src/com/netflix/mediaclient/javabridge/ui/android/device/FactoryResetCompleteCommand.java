// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android.device;

import com.netflix.mediaclient.javabridge.ui.BaseCommandCompletedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class FactoryResetCompleteCommand extends BaseCommandCompletedEvent
{

    public static final String NAME = "factoryReset";
    public static final String OBJECT = "nrdp.device";

    public FactoryResetCompleteCommand(JSONObject jsonobject)
        throws JSONException
    {
        super("factoryReset", jsonobject);
    }

    public String getObject()
    {
        return "nrdp.device";
    }
}
