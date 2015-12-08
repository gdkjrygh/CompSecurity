// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.challengehandler;

import com.worklight.wlclient.api.challengehandler.BaseProvisioningChallengeHandler;
import org.json.JSONObject;

public class AutoProvisioningChallengeHandler extends BaseProvisioningChallengeHandler
{

    public AutoProvisioningChallengeHandler(String s)
    {
        super(s);
    }

    protected void createCustomCsr(JSONObject jsonobject)
    {
        submitCustomCsr(new JSONObject(), jsonobject);
    }

    public void handleSuccess(JSONObject jsonobject)
    {
    }
}
