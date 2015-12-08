// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api.challengehandler;

import com.worklight.wlclient.WLRequest;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api.challengehandler:
//            BaseChallengeHandler

public abstract class WLChallengeHandler extends BaseChallengeHandler
{

    public WLChallengeHandler(String s)
    {
        super(s);
    }

    public abstract void handleFailure(JSONObject jsonobject);

    public abstract void handleSuccess(JSONObject jsonobject);

    public void submitChallengeAnswer(Object obj)
    {
        if (obj == null)
        {
            activeRequest.removeExpectedAnswer(getRealm());
        } else
        {
            activeRequest.submitAnswer(getRealm(), obj);
        }
        activeRequest = null;
    }
}
