// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerSetAutoAdvance extends MdxMessage
{

    private static final String PROPERTY_autoAdvanceMaxIncrement = "autoAdvanceMaxIncrement";
    private int mAutoAdvanceMaxIncrement;
    private String mXid;

    public PlayerSetAutoAdvance(String s, int i)
    {
        super("PLAYER_SET_AUTO_ADVANCE");
        mXid = s;
        mAutoAdvanceMaxIncrement = i;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("xid", mXid);
            mJson.put("autoAdvanceMaxIncrement", mAutoAdvanceMaxIncrement);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
