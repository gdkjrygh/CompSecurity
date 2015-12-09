// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android.registration;

import com.netflix.mediaclient.javabridge.ui.BaseCommandCompletedEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class DeactivateCompleteCommand extends BaseCommandCompletedEvent
{

    public static final String NAME = "deactivate";
    public static final String OBJECT = "nrdp.registration";

    public DeactivateCompleteCommand(JSONObject jsonobject)
        throws JSONException
    {
        super("deactivate", jsonobject);
    }

    public String getObject()
    {
        return "nrdp.registration";
    }
}
