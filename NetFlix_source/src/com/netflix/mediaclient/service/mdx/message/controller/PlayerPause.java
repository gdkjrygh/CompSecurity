// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerPause extends MdxMessage
{

    private String mXid;

    public PlayerPause(String s)
    {
        super("PLAYER_PAUSE");
        mXid = s;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("xid", mXid);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
