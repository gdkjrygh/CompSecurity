// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.mdx.message.target:
//            PlayerState

public class PlayerCurrentState extends MdxMessage
{

    private PlayerState mPlayerState;

    public PlayerCurrentState(JSONObject jsonobject)
        throws JSONException
    {
        super("PLAYER_CURRENT_STATE");
        mJson = jsonobject;
        mPlayerState = new PlayerState(jsonobject);
    }

    public PlayerState getPlayerState()
    {
        return mPlayerState;
    }
}
