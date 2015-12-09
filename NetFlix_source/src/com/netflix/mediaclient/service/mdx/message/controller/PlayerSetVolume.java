// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerSetVolume extends MdxMessage
{

    private static final String PROPERTY_previous = "previous";
    public static final String PROPERTY_volume = "volume";
    private Integer mPrevious;
    private int mVolume;
    private String mXid;

    public PlayerSetVolume(String s, int i)
    {
        super("PLAYER_SET_VOLUME");
        mXid = s;
        mVolume = i;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("xid", mXid);
            mJson.put("volume", mVolume);
            if (mPrevious != null)
            {
                mJson.put("previous", mPrevious);
            }
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
