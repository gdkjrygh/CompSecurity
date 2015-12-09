// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class MessageIgnored extends MdxMessage
{

    private static String PROPERTY_errorCode = "errorCode";
    private static String PROPERTY_errorDesc = "errorDesc";
    private static String PROPERTY_transactionId = "transactionId";
    private String mErrorCode;
    private String mErrorDesc;
    private String mTransactionId;

    public MessageIgnored(JSONObject jsonobject)
        throws JSONException
    {
        super("MESSAGE_IGNORED");
        mJson = jsonobject;
        mTransactionId = jsonobject.getString(PROPERTY_transactionId);
        mErrorCode = jsonobject.getString(PROPERTY_errorCode);
        mErrorDesc = JsonUtils.getString(jsonobject, PROPERTY_errorDesc, null);
    }

    public String getErrorCode()
    {
        return mErrorCode;
    }

    public String getErrorDesc()
    {
        return mErrorDesc;
    }

    public String getTransactionId()
    {
        return mTransactionId;
    }

}
