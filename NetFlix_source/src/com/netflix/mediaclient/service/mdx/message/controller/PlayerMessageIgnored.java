// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.controller;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlayerMessageIgnored extends MdxMessage
{

    private static String PROPERTY_errorCode = "errorCode";
    private static String PROPERTY_errorDesc = "errorDesc";
    private static String PROPERTY_transactionId = "transactionId";
    private String mErrorCode;
    private String mErrorDesc;
    private String mTransactionId;

    public PlayerMessageIgnored(String s, String s1, String s2)
    {
        super("MESSAGE_IGNORED");
        mTransactionId = s;
        mErrorCode = s1;
        mErrorDesc = s2;
        createObj();
    }

    private void createObj()
    {
        try
        {
            mJson.put(PROPERTY_transactionId, mTransactionId);
            mJson.put(PROPERTY_errorCode, mErrorCode);
            mJson.put(PROPERTY_errorDesc, mErrorDesc);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_mdx", (new StringBuilder()).append(messageName()).append(" createObj failed ").append(jsonexception).toString());
        }
    }

}
