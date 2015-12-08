// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class DialogResponse extends MdxMessage
{

    private static final String PROPERTY_data = "data";
    private static final String PROPERTY_uid = "uid";
    private String mData;
    private String mUid;

    public DialogResponse(String s, String s1)
    {
        super("DIALOG_RESPONSE");
        mUid = s;
        mData = s1;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put("uid", mUid);
            mJson.put("data", mData);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }
}
